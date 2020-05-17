package typingsSlinky.reactBootstrapTable.mod

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertModalFooterProps extends js.Object {
  /**
  	 * Callback function to call prior to closing the Insert Modal window.
  	 */
  var beforeClose: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Event, _], Unit]] = js.native
  /**
  	 * Callback function to be called prior to saving the new row.
  	 */
  var beforeSave: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Event, _], Unit]] = js.native
  /**
  	 * Header class name.
  	 */
  var className: js.UndefOr[String] = js.native
  /**
  	 * Custom class name for the close button.
  	 */
  var closeBtnClass: js.UndefOr[String] = js.native
  /**
  	 * Bootstrap css class name for the close button, example: 'btn-warning'
  	 */
  var closeBtnContextual: js.UndefOr[String] = js.native
  /**
  	 * Text to display on the Close button
  	 */
  var closeBtnText: js.UndefOr[String] = js.native
  /**
  	 * Callback function to call to close the Insert Modal window.
  	 */
  var onModalClose: js.UndefOr[js.Function1[/* closeModal */ js.Function0[Unit], Unit]] = js.native
  /**
  	 * Callback function to be called to save the new row.
  	 */
  var onSave: js.UndefOr[js.Function1[/* save */ js.Function0[Unit], Unit]] = js.native
  /**
  	 * Custom class name for the save button.
  	 */
  var saveBtnClass: js.UndefOr[String] = js.native
  /**
  	 * Bootstrap css class name for the save button, example: 'btn-success'
  	 */
  var saveBtnContextual: js.UndefOr[String] = js.native
  /**
  	 * Text to display on the Save button
  	 */
  var saveBtnText: js.UndefOr[String] = js.native
}

object InsertModalFooterProps {
  @scala.inline
  def apply(): InsertModalFooterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertModalFooterProps]
  }
  @scala.inline
  implicit class InsertModalFooterPropsOps[Self <: InsertModalFooterProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeforeClose(value: /* e */ SyntheticEvent[Event, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeClose")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSave(value: /* e */ SyntheticEvent[Event, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSave")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseBtnClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeBtnClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseBtnClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeBtnClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseBtnContextual(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeBtnContextual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseBtnContextual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeBtnContextual")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseBtnText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeBtnText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseBtnText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeBtnText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnModalClose(value: /* closeModal */ js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModalClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnModalClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModalClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSave(value: /* save */ js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSave")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveBtnClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveBtnClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveBtnClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveBtnClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveBtnContextual(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveBtnContextual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveBtnContextual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveBtnContextual")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveBtnText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveBtnText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveBtnText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveBtnText")(js.undefined)
        ret
    }
  }
  
}

