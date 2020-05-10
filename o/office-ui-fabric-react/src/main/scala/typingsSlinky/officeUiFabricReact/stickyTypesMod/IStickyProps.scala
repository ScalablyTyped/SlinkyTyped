package typingsSlinky.officeUiFabricReact.stickyTypesMod

import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.stickyStickyMod.Sticky
import typingsSlinky.react.mod.Props
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStickyProps extends Props[Sticky] {
  /**
    * Gets ref to component interface.
    */
  var componentRef: js.UndefOr[IRefObject[IStickyProps]] = js.native
  /**
    * If true, then match scrolling position of placeholder element in Sticky.
    * @defaultvalue true
    */
  var isScrollSynced: js.UndefOr[Boolean] = js.native
  /**
    * color to apply as 'background-color' style for sticky element.
    */
  var stickyBackgroundColor: js.UndefOr[String] = js.native
  /**
    * Class name to apply to the sticky element if component is sticky.
    */
  var stickyClassName: js.UndefOr[String] = js.native
  /**
    * Region to render sticky component in.
    * @defaultvalue Both
    */
  var stickyPosition: js.UndefOr[StickyPositionType] = js.native
}

object IStickyProps {
  @scala.inline
  def apply(): IStickyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStickyProps]
  }
  @scala.inline
  implicit class IStickyPropsOps[Self <: IStickyProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ IStickyProps | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IStickyProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IStickyProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withIsScrollSynced(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScrollSynced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsScrollSynced: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScrollSynced")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyPosition(value: StickyPositionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyPosition")(js.undefined)
        ret
    }
  }
  
}

