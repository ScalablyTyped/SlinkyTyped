package typingsSlinky.pulumiAws.inputMod.sagemaker

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelContainer extends js.Object {
  var containerHostname: js.UndefOr[Input[String]] = js.native
  var environment: js.UndefOr[Input[StringDictionary[_]]] = js.native
  var image: Input[String] = js.native
  var modelDataUrl: js.UndefOr[Input[String]] = js.native
}

object ModelContainer {
  @scala.inline
  def apply(image: Input[String]): ModelContainer = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelContainer]
  }
  @scala.inline
  implicit class ModelContainerOps[Self <: ModelContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImage(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerHostname(value: Input[String]): Self = {
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
    def withEnvironment(value: Input[StringDictionary[_]]): Self = {
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
    def withModelDataUrl(value: Input[String]): Self = {
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

