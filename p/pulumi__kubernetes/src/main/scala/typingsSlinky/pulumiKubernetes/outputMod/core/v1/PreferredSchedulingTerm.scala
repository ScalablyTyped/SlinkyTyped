package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it's a
  * no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).
  */
@js.native
trait PreferredSchedulingTerm extends js.Object {
  /**
    * A node selector term, associated with the corresponding weight.
    */
  val preference: NodeSelectorTerm = js.native
  /**
    * Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
    */
  val weight: Double = js.native
}

object PreferredSchedulingTerm {
  @scala.inline
  def apply(preference: NodeSelectorTerm, weight: Double): PreferredSchedulingTerm = {
    val __obj = js.Dynamic.literal(preference = preference.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreferredSchedulingTerm]
  }
  @scala.inline
  implicit class PreferredSchedulingTermOps[Self <: PreferredSchedulingTerm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreference(value: NodeSelectorTerm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

