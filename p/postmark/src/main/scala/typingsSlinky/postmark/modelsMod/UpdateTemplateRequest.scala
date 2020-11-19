package typingsSlinky.postmark.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models", "UpdateTemplateRequest")
@js.native
class UpdateTemplateRequest protected ()
  extends typingsSlinky.postmark.templateMod.UpdateTemplateRequest {
  def this(
    Name: js.UndefOr[String],
    Subject: js.UndefOr[String],
    HtmlBody: js.UndefOr[String],
    TextBody: js.UndefOr[String],
    Alias: js.UndefOr[String | Null],
    TemplateType: js.UndefOr[typingsSlinky.postmark.templateMod.TemplateTypes],
    LayoutTemplate: js.UndefOr[String]
  ) = this()
}
