package typingsSlinky.pulumiKubernetes.inputMod.apps.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ScaleSpec describes the attributes of a scale subresource
  */
@js.native
trait ScaleSpec extends js.Object {
  /**
    * desired number of instances for the scaled object.
    */
  var replicas: js.UndefOr[Input[Double]] = js.native
}

object ScaleSpec {
  @scala.inline
  def apply(): ScaleSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleSpec]
  }
  @scala.inline
  implicit class ScaleSpecOps[Self <: ScaleSpec] (val x: Self) extends AnyVal {
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
    def withoutReplicas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicas")(js.undefined)
        ret
    }
  }
  
}

