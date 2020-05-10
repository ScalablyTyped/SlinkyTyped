package typingsSlinky.officeUiFabricReact.commandBarTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommandBarStyles extends js.Object {
  var primarySet: js.UndefOr[IStyle] = js.native
  var root: js.UndefOr[IStyle] = js.native
  var secondarySet: js.UndefOr[IStyle] = js.native
}

object ICommandBarStyles {
  @scala.inline
  def apply(): ICommandBarStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICommandBarStyles]
  }
  @scala.inline
  implicit class ICommandBarStylesOps[Self <: ICommandBarStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrimarySet(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primarySet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimarySet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primarySet")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimarySetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primarySet")(null)
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
    @scala.inline
    def withSecondarySet(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondarySet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondarySet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondarySet")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondarySetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondarySet")(null)
        ret
    }
  }
  
}

