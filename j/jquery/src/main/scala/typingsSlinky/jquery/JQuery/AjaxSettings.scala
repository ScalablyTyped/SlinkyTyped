package typingsSlinky.jquery.JQuery

import typingsSlinky.jquery.JQuery.Ajax.AjaxSettingsBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// region Ajax
// #region Ajax
@js.native
trait AjaxSettings[TContext] extends AjaxSettingsBase[TContext] {
  /**
    * A string containing the URL to which the request is sent.
    */
  var url: js.UndefOr[String] = js.native
}

object AjaxSettings {
  @scala.inline
  def apply[TContext](): AjaxSettings[TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AjaxSettings[TContext]]
  }
  @scala.inline
  implicit class AjaxSettingsOps[Self[tcontext] <: AjaxSettings[tcontext], TContext] (val x: Self[TContext]) extends AnyVal {
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
    @scala.inline
    def withoutUrl: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

