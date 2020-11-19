package typingsSlinky.baseui.cardMod

import org.scalajs.dom.raw.HTMLImageElement
import slinky.core.facade.ReactElement
import typingsSlinky.baseui.anon.Thumbnail
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.ImgHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardProps extends js.Object {
  
  val action: js.UndefOr[ReactElement] = js.native
  
  val children: js.UndefOr[ReactElement] = js.native
  
  val hasThumbnail: js.UndefOr[js.Function1[/* props */ Thumbnail, Boolean]] = js.native
  
  val headerImage: js.UndefOr[
    String | (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement])
  ] = js.native
  
  val overrides: js.UndefOr[CardOverrides] = js.native
  
  val thumbnail: js.UndefOr[String] = js.native
  
  val title: js.UndefOr[ReactElement] = js.native
}
object CardProps {
  
  @scala.inline
  def apply(): CardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardProps]
  }
  
  @scala.inline
  implicit class CardPropsOps[Self <: CardProps] (val x: Self) extends AnyVal {
    
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
    def setActionReactElement(value: ReactElement): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAction(value: ReactElement): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setHasThumbnail(value: /* props */ Thumbnail => Boolean): Self = this.set("hasThumbnail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHasThumbnail: Self = this.set("hasThumbnail", js.undefined)
    
    @scala.inline
    def setHeaderImage(value: String | (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement])): Self = this.set("headerImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderImage: Self = this.set("headerImage", js.undefined)
    
    @scala.inline
    def setOverrides(value: CardOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setThumbnail(value: String): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
