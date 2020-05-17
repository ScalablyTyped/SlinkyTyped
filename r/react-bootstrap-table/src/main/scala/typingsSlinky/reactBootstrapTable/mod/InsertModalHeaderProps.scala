package typingsSlinky.reactBootstrapTable.mod

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertModalHeaderProps extends js.Object {
  /**
  	 * Callback function to call prior to closing the Insert Modal window.
  	 */
  var beforeClose: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Event, _], Unit]] = js.native
  /**
  	 * Header class name.
  	 */
  var className: js.UndefOr[String] = js.native
  /**
  	 * Set to true to hide the close button. Default is false.
  	 */
  var hideClose: js.UndefOr[Boolean] = js.native
  /**
  	 * Callback function to call to close the Insert Modal window.
  	 */
  var onModalClose: js.UndefOr[js.Function1[/* closeModal */ js.Function0[Unit], Unit]] = js.native
  /**
  	 * Title to display in the header.
  	 */
  var title: js.UndefOr[String] = js.native
  /**
  	 * Bootstrap version.
  	 */
  var version: js.UndefOr[BootstrapVersion] = js.native
}

object InsertModalHeaderProps {
  @scala.inline
  def apply(): InsertModalHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertModalHeaderProps]
  }
  @scala.inline
  implicit class InsertModalHeaderPropsOps[Self <: InsertModalHeaderProps] (val x: Self) extends AnyVal {
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
    def withHideClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideClose")(js.undefined)
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
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: BootstrapVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

