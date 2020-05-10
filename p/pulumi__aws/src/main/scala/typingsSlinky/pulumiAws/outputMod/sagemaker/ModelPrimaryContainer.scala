package typingsSlinky.pulumiAws.outputMod.sagemaker

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelPrimaryContainer extends js.Object {
  var containerHostname: js.UndefOr[String] = js.native
  var environment: js.UndefOr[StringDictionary[js.Any]] = js.native
  var image: String = js.native
  var modelDataUrl: js.UndefOr[String] = js.native
}

object ModelPrimaryContainer {
  @scala.inline
  def apply(image: String): ModelPrimaryContainer = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPrimaryContainer]
  }
  @scala.inline
  implicit class ModelPrimaryContainerOps[Self <: ModelPrimaryContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerHostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerHostname")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withModelDataUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelDataUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelDataUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelDataUrl")(js.undefined)
        ret
    }
  }
  
}

