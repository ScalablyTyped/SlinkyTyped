package typingsSlinky.antDesignReactNative.cardHeaderMod

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.anon.PickCardStyleheaderConten
import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardHeaderPropsType extends WithThemeStyles[PickCardStyleheaderConten] {
  var extra: js.UndefOr[ReactElement] = js.native
  /** need url of img, if this is string. */
  var thumb: js.UndefOr[ReactElement] = js.native
  var title: js.UndefOr[ReactElement] = js.native
}

object CardHeaderPropsType {
  @scala.inline
  def apply(): CardHeaderPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardHeaderPropsType]
  }
  @scala.inline
  implicit class CardHeaderPropsTypeOps[Self <: CardHeaderPropsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExtraReactElement(value: ReactElement): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtra(value: ReactElement): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    @scala.inline
    def setThumbReactElement(value: ReactElement): Self = this.set("thumb", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumb(value: ReactElement): Self = this.set("thumb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumb: Self = this.set("thumb", js.undefined)
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

