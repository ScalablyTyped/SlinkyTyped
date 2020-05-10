package typingsSlinky.blueprintjsCore.overlayMod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackdropProps extends js.Object {
  /** CSS class names to apply to backdrop element. */
  var backdropClassName: js.UndefOr[String] = js.native
  /** HTML props for the backdrop element. */
  var backdropProps: js.UndefOr[HTMLProps[HTMLDivElement]] = js.native
  /**
    * Whether clicking outside the overlay element (either on backdrop when present or on document)
    * should invoke `onClose`.
    * @default true
    */
  var canOutsideClickClose: js.UndefOr[Boolean] = js.native
  /**
    * Whether a container-spanning backdrop element should be rendered behind the contents.
    * @default true
    */
  var hasBackdrop: js.UndefOr[Boolean] = js.native
}

object IBackdropProps {
  @scala.inline
  def apply(): IBackdropProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBackdropProps]
  }
  @scala.inline
  implicit class IBackdropPropsOps[Self <: IBackdropProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackdropClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withBackdropProps(value: HTMLProps[HTMLDivElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropProps")(js.undefined)
        ret
    }
    @scala.inline
    def withCanOutsideClickClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canOutsideClickClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanOutsideClickClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canOutsideClickClose")(js.undefined)
        ret
    }
    @scala.inline
    def withHasBackdrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBackdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasBackdrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBackdrop")(js.undefined)
        ret
    }
  }
  
}

