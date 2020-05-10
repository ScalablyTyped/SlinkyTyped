package typingsSlinky.officeUiFabricReact.documentCardImageTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDocumentCardImageStyles extends js.Object {
  var centeredIcon: IStyle = js.native
  var centeredIconWrapper: IStyle = js.native
  var cornerIcon: IStyle = js.native
  var root: IStyle = js.native
}

object IDocumentCardImageStyles {
  @scala.inline
  def apply(): IDocumentCardImageStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDocumentCardImageStyles]
  }
  @scala.inline
  implicit class IDocumentCardImageStylesOps[Self <: IDocumentCardImageStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenteredIcon(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centeredIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenteredIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centeredIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withCenteredIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centeredIcon")(null)
        ret
    }
    @scala.inline
    def withCenteredIconWrapper(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centeredIconWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenteredIconWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centeredIconWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withCenteredIconWrapperNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centeredIconWrapper")(null)
        ret
    }
    @scala.inline
    def withCornerIcon(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withCornerIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerIcon")(null)
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

