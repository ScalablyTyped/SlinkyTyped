package typingsSlinky.officeJs.Visio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the page that raised the PageLoadComplete event.
  *
  * [Api set:  1.1]
  */
@js.native
trait PageLoadCompleteEventArgs extends js.Object {
  /**
    *
    * Gets the name of the page that raised the PageLoad event.
    *
    * [Api set:  1.1]
    */
  var pageName: String = js.native
  /**
    *
    * Gets the success or failure of the PageLoadComplete event.
    *
    * [Api set:  1.1]
    */
  var success: Boolean = js.native
}

object PageLoadCompleteEventArgs {
  @scala.inline
  def apply(pageName: String, success: Boolean): PageLoadCompleteEventArgs = {
    val __obj = js.Dynamic.literal(pageName = pageName.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageLoadCompleteEventArgs]
  }
  @scala.inline
  implicit class PageLoadCompleteEventArgsOps[Self <: PageLoadCompleteEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

