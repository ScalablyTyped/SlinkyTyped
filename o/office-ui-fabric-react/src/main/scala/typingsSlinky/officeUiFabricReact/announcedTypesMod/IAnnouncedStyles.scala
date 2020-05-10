package typingsSlinky.officeUiFabricReact.announcedTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnnouncedStyles extends js.Object {
  /**
    * Style override for the root element.
    */
  var root: IStyle = js.native
  /**
    * Style override for the screen reader text.
    */
  var screenReaderText: IStyle = js.native
}

object IAnnouncedStyles {
  @scala.inline
  def apply(): IAnnouncedStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnnouncedStyles]
  }
  @scala.inline
  implicit class IAnnouncedStylesOps[Self <: IAnnouncedStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withScreenReaderText(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenReaderText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderText")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenReaderTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderText")(null)
        ret
    }
  }
  
}

