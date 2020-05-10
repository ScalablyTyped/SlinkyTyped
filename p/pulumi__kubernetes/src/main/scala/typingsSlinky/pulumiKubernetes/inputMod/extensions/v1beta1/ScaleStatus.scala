package typingsSlinky.pulumiKubernetes.inputMod.extensions.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents the current status of a scale subresource.
  */
@js.native
trait ScaleStatus extends js.Object {
  /**
    * actual number of observed instances of the scaled object.
    */
  var replicas: Input[Double] = js.native
  /**
    * label query over pods that should match the replicas count. More info:
    * http://kubernetes.io/docs/user-guide/labels#label-selectors
    */
  var selector: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * label selector for pods that should match the replicas count. This is a serializated
    * version of both map-based and more expressive set-based selectors. This is done to avoid
    * introspection in the clients. The string will be in the same format as the query-param
    * syntax. If the target type only supports map-based selectors, both this field and map-based
    * selector field are populated. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
    */
  var targetSelector: js.UndefOr[Input[String]] = js.native
}

object ScaleStatus {
  @scala.inline
  def apply(replicas: Input[Double]): ScaleStatus = {
    val __obj = js.Dynamic.literal(replicas = replicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleStatus]
  }
  @scala.inline
  implicit class ScaleStatusOps[Self <: ScaleStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicas(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: Input[StringDictionary[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetSelector(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSelector")(js.undefined)
        ret
    }
  }
  
}

