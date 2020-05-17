package typingsSlinky.cypress.JQuery

import typingsSlinky.cypress.JQuery.Ajax.AjaxSettingsBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlAjaxSettings[TContext] extends AjaxSettingsBase[TContext] {
  /**
    * A string containing the URL to which the request is sent.
    */
  var url: String = js.native
}

object UrlAjaxSettings {
  @scala.inline
  def apply[TContext](url: String): UrlAjaxSettings[TContext] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlAjaxSettings[TContext]]
  }
  @scala.inline
  implicit class UrlAjaxSettingsOps[Self[tcontext] <: UrlAjaxSettings[tcontext], TContext] (val x: Self[TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TContext] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TContext] with Other]
    @scala.inline
    def withUrl(value: String): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

