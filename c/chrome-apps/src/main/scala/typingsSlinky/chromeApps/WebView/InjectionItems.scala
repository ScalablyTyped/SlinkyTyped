package typingsSlinky.chromeApps.WebView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of injection item: code or a set of files. */
@js.native
trait InjectionItems extends js.Object {
  /** JavaScript code or CSS to be injected into matching pages. */
  var code: js.UndefOr[String] = js.native
  /**
    * The list of JavaScript or CSS files to be injected into matching pages.
    * These are injected in the order they appear in this array.
    */
  var files: js.UndefOr[js.Array[_]] = js.native
}

object InjectionItems {
  @scala.inline
  def apply(): InjectionItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InjectionItems]
  }
  @scala.inline
  implicit class InjectionItemsOps[Self <: InjectionItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withFiles(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
  }
  
}

