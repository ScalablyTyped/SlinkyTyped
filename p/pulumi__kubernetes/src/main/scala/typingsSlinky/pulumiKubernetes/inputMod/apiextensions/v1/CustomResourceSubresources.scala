package typingsSlinky.pulumiKubernetes.inputMod.apiextensions.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceSubresources defines the status and scale subresources for CustomResources.
  */
@js.native
trait CustomResourceSubresources extends js.Object {
  /**
    * scale indicates the custom resource should serve a `/scale` subresource that returns an
    * `autoscaling/v1` Scale object.
    */
  var scale: js.UndefOr[Input[CustomResourceSubresourceScale]] = js.native
}

object CustomResourceSubresources {
  @scala.inline
  def apply(): CustomResourceSubresources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomResourceSubresources]
  }
  @scala.inline
  implicit class CustomResourceSubresourcesOps[Self <: CustomResourceSubresources] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScale(value: Input[CustomResourceSubresourceScale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
  }
  
}

