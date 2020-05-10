package typingsSlinky.jupyterlabUiComponents.tabbarsvgMod.TabBarSvg

import typingsSlinky.jupyterlabUiComponents.styleIconMod.IconKindType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions[T]
  extends typingsSlinky.phosphorWidgets.tabbarMod.TabBar.IOptions[T] {
  /**
    * The kind of icon this tab bar widget should render.
    * Adds preset styling to the icons.
    */
  var kind: js.UndefOr[IconKindType] = js.native
}

object IOptions {
  @scala.inline
  def apply[T](): IOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions[T]]
  }
  @scala.inline
  implicit class IOptionsOps[Self[t] <: IOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withKind(value: IconKindType): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

