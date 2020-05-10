package typingsSlinky.jupyterlabUiComponents.styleIconMod

import typingsSlinky.typestyle.typesMod.NestedCSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIconStyle extends NestedCSSProperties {
  /**
    * center the icon svg in its container
    */
  var center: js.UndefOr[Boolean] = js.native
  /**
    * the kind of the icon, associated with a default stylesheet
    */
  var kind: js.UndefOr[IconKindType] = js.native
}

object IIconStyle {
  @scala.inline
  def apply(): IIconStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIconStyle]
  }
  @scala.inline
  implicit class IIconStyleOps[Self <: IIconStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: IconKindType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

