package typingsSlinky.postmark.mod.Models

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Models.CreateTemplateRequest")
@js.native
class CreateTemplateRequest protected ()
  extends typingsSlinky.postmark.modelsMod.CreateTemplateRequest {
  def this(
    Name: String,
    Subject: js.UndefOr[String],
    HtmlBody: js.UndefOr[String],
    TextBody: js.UndefOr[String],
    Alias: js.UndefOr[Null | String],
    TemplateType: js.UndefOr[typingsSlinky.postmark.templateMod.TemplateTypes],
    LayoutTemplate: js.UndefOr[String]
  ) = this()
}

