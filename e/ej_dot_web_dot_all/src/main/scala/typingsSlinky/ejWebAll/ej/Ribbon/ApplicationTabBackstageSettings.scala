package typingsSlinky.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationTabBackstageSettings extends js.Object {
  /** Specifies the width of backstage page header that contains tabs and buttons.
    * @Default {null}
    */
  var headerWidth: js.UndefOr[String | Double] = js.native
  /** Specifies the height of ribbon backstage page.
    * @Default {null}
    */
  var height: js.UndefOr[String | Double] = js.native
  /** Specifies the ribbon backstage page with its tab and button elements.
    * @Default {Array}
    */
  var pages: js.UndefOr[js.Array[ApplicationTabBackstageSettingsPage]] = js.native
  /** Specifies the display text of application tab.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
  /** Specifies the width of ribbon backstage page.
    * @Default {null}
    */
  var width: js.UndefOr[String | Double] = js.native
}

object ApplicationTabBackstageSettings {
  @scala.inline
  def apply(): ApplicationTabBackstageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationTabBackstageSettings]
  }
  @scala.inline
  implicit class ApplicationTabBackstageSettingsOps[Self <: ApplicationTabBackstageSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaderWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withPages(value: js.Array[ApplicationTabBackstageSettingsPage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

