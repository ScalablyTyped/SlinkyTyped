package typingsSlinky.materialUi.MaterialUI.Card

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardMediaProps extends js.Object {
  var actAsExpander: js.UndefOr[Boolean] = js.undefined
  var expandable: js.UndefOr[Boolean] = js.undefined
  var mediaStyle: js.UndefOr[CSSProperties] = js.undefined
  var overlay: js.UndefOr[TagMod[Any]] = js.undefined
  var overlayContainerStyle: js.UndefOr[CSSProperties] = js.undefined
  var overlayContentStyle: js.UndefOr[CSSProperties] = js.undefined
  var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object CardMediaProps {
  @scala.inline
  def apply(): CardMediaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardMediaProps]
  }
  @scala.inline
  implicit class CardMediaPropsOps[Self <: CardMediaProps] (val x: Self) extends AnyVal {
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
    def setActAsExpander(value: Boolean): Self = this.set("actAsExpander", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActAsExpander: Self = this.set("actAsExpander", js.undefined)
    @scala.inline
    def setExpandable(value: Boolean): Self = this.set("expandable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandable: Self = this.set("expandable", js.undefined)
    @scala.inline
    def setMediaStyle(value: CSSProperties): Self = this.set("mediaStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaStyle: Self = this.set("mediaStyle", js.undefined)
    @scala.inline
    def setOverlayReactElement(value: ReactElement): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlay(value: TagMod[Any]): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    @scala.inline
    def setOverlayContainerStyle(value: CSSProperties): Self = this.set("overlayContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayContainerStyle: Self = this.set("overlayContainerStyle", js.undefined)
    @scala.inline
    def setOverlayContentStyle(value: CSSProperties): Self = this.set("overlayContentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayContentStyle: Self = this.set("overlayContentStyle", js.undefined)
    @scala.inline
    def setOverlayStyle(value: CSSProperties): Self = this.set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayStyle: Self = this.set("overlayStyle", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

