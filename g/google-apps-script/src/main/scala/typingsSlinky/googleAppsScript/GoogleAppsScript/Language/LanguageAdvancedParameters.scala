package typingsSlinky.googleAppsScript.GoogleAppsScript.Language

import typingsSlinky.googleAppsScript.googleAppsScriptStrings.html
import typingsSlinky.googleAppsScript.googleAppsScriptStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageAdvancedParameters extends js.Object {
  /** the content type of the text; supported values are 'text' (default) and 'html' */
  var contentType: js.UndefOr[html | text] = js.native
}

object LanguageAdvancedParameters {
  @scala.inline
  def apply(): LanguageAdvancedParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageAdvancedParameters]
  }
  @scala.inline
  implicit class LanguageAdvancedParametersOps[Self <: LanguageAdvancedParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentType(value: html | text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
  }
  
}

