package typingsSlinky.officeUiFabricReact.iconTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIconStyles extends js.Object {
  /**
    * Deprecated. Use `root`.
    * @deprecated Use `root`.
    */
  var imageContainer: js.UndefOr[IStyle] = js.native
  var root: js.UndefOr[IStyle] = js.native
}

object IIconStyles {
  @scala.inline
  def apply(): IIconStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIconStyles]
  }
  @scala.inline
  implicit class IIconStylesOps[Self <: IIconStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageContainer(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withImageContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageContainer")(null)
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

