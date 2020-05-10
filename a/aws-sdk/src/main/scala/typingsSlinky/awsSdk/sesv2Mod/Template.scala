package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Template extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the template.
    */
  var TemplateArn: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.TemplateArn] = js.native
  /**
    * An object that defines the values to use for message variables in the template. This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding value defines the value to use for that variable.
    */
  var TemplateData: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.TemplateData] = js.native
}

object Template {
  @scala.inline
  def apply(): Template = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Template]
  }
  @scala.inline
  implicit class TemplateOps[Self <: Template] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTemplateArn(value: TemplateArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateData(value: TemplateData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateData")(js.undefined)
        ret
    }
  }
  
}

