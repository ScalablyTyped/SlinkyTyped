package typingsSlinky.officeUiFabricReact.detailsListTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsListStyles extends js.Object {
  var contentWrapper: IStyle = js.native
  var focusZone: IStyle = js.native
  var headerWrapper: IStyle = js.native
  var root: IStyle = js.native
}

object IDetailsListStyles {
  @scala.inline
  def apply(): IDetailsListStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetailsListStyles]
  }
  @scala.inline
  implicit class IDetailsListStylesOps[Self <: IDetailsListStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentWrapper(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withContentWrapperNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentWrapper")(null)
        ret
    }
    @scala.inline
    def withFocusZone(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusZone")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusZoneNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusZone")(null)
        ret
    }
    @scala.inline
    def withHeaderWrapper(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderWrapperNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerWrapper")(null)
        ret
    }
    @scala.inline
    def withRoot(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(null)
        ret
    }
  }
  
}

