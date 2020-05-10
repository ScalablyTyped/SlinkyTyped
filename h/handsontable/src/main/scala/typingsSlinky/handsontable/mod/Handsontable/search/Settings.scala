package typingsSlinky.handsontable.mod.Handsontable.search

import typingsSlinky.handsontable.mod.Handsontable
import typingsSlinky.handsontable.mod.Handsontable.CellProperties
import typingsSlinky.handsontable.mod.Handsontable.CellValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var callback: js.UndefOr[SearchCallback] = js.native
  var queryMethod: js.UndefOr[SearchQueryMethod] = js.native
  var searchResultClass: js.UndefOr[String] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(
      value: (/* instance */ Handsontable, /* row */ Double, /* column */ Double, /* value */ CellValue, /* result */ Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryMethod(
      value: (/* queryStr */ String, /* value */ CellValue, /* cellProperties */ CellProperties) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryMethod")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutQueryMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchResultClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchResultClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchResultClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchResultClass")(js.undefined)
        ret
    }
  }
  
}

