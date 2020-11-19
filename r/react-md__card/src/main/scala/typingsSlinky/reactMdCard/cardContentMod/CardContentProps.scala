package typingsSlinky.reactMdCard.cardContentMod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardContentProps extends HTMLAttributes[HTMLDivElement] {
  
  /**
    * Boolean if the extra `padding-bottom` that gets applied when the
    * `CardContent` is the last component within the `Card`. If the
    * `disablePadding` prop is enabled, this prop will be ignored and the extra
    * padding will not be applied.
    */
  var disableExtraPadding: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the padding should be removed from the content. This is really
    * only useful if your child elements have their own padding.
    */
  var disablePadding: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if any `<p>` tags that appear as children of this component should
    * no longer have their `margin-top` and `margin-bottom` removed. The default
    * behavior is to remove all `margin-top` and remove the `margin-bottom` if
    * the `<p>` is the last child.
    */
  var disableParagraphMargin: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the current secondary text color should be disabled from the
    * content.
    */
  var disableSecondaryColor: js.UndefOr[Boolean] = js.native
}
object CardContentProps {
  
  @scala.inline
  def apply(): CardContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardContentProps]
  }
  
  @scala.inline
  implicit class CardContentPropsOps[Self <: CardContentProps] (val x: Self) extends AnyVal {
    
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
    def setDisableExtraPadding(value: Boolean): Self = this.set("disableExtraPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableExtraPadding: Self = this.set("disableExtraPadding", js.undefined)
    
    @scala.inline
    def setDisablePadding(value: Boolean): Self = this.set("disablePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePadding: Self = this.set("disablePadding", js.undefined)
    
    @scala.inline
    def setDisableParagraphMargin(value: Boolean): Self = this.set("disableParagraphMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableParagraphMargin: Self = this.set("disableParagraphMargin", js.undefined)
    
    @scala.inline
    def setDisableSecondaryColor(value: Boolean): Self = this.set("disableSecondaryColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSecondaryColor: Self = this.set("disableSecondaryColor", js.undefined)
  }
}
