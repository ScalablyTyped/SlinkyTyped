package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a set of pods (namely those matching the labelSelector relative to the given
  * namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity)
  * with, where co-located is defined as running on a node whose value of the label with key
  * <topologyKey> matches that of any node on which a pod of the set of pods is running
  */
@js.native
trait PodAffinityTerm extends js.Object {
  /**
    * A label query over a set of resources, in this case pods.
    */
  val labelSelector: LabelSelector = js.native
  /**
    * namespaces specifies which namespaces the labelSelector applies to (matches against); null
    * or empty list means "this pod's namespace"
    */
  val namespaces: js.Array[String] = js.native
  /**
    * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods
    * matching the labelSelector in the specified namespaces, where co-located is defined as
    * running on a node whose value of the label with key topologyKey matches that of any node on
    * which any of the selected pods is running. Empty topologyKey is not allowed.
    */
  val topologyKey: String = js.native
}

object PodAffinityTerm {
  @scala.inline
  def apply(labelSelector: LabelSelector, namespaces: js.Array[String], topologyKey: String): PodAffinityTerm = {
    val __obj = js.Dynamic.literal(labelSelector = labelSelector.asInstanceOf[js.Any], namespaces = namespaces.asInstanceOf[js.Any], topologyKey = topologyKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodAffinityTerm]
  }
  @scala.inline
  implicit class PodAffinityTermOps[Self <: PodAffinityTerm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelSelector(value: LabelSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespaces(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopologyKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topologyKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

