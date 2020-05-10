package typingsSlinky.ejWebAll.ej.RTE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasteCleanupSettings extends js.Object {
  /** This API is used to clean the unwanted css in the elements pasted from word document to editor.
    * @Default {false}
    */
  var cleanCSS: js.UndefOr[Boolean] = js.native
  /** This API is used to clean the unwanted elements pasted from word document to editor.
    * @Default {false}
    */
  var cleanElements: js.UndefOr[Boolean] = js.native
  /** This API is used to convert the list elements pasted from word document to editor.
    * @Default {false}
    */
  var listConversion: js.UndefOr[Boolean] = js.native
  /** This API is used to remove all styles in the elements pasted from word document to editor.
    * @Default {false}
    */
  var removeStyles: js.UndefOr[Boolean] = js.native
}

object PasteCleanupSettings {
  @scala.inline
  def apply(): PasteCleanupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasteCleanupSettings]
  }
  @scala.inline
  implicit class PasteCleanupSettingsOps[Self <: PasteCleanupSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCleanCSS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanCSS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanCSS")(js.undefined)
        ret
    }
    @scala.inline
    def withCleanElements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanElements")(js.undefined)
        ret
    }
    @scala.inline
    def withListConversion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listConversion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListConversion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listConversion")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeStyles")(js.undefined)
        ret
    }
  }
  
}

