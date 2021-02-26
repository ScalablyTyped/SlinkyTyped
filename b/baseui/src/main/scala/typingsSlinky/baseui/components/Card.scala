package typingsSlinky.baseui.components

import org.scalajs.dom.raw.HTMLImageElement
import slinky.core.facade.ReactElement
import slinky.web.html.img.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.Thumbnail
import typingsSlinky.baseui.cardMod.CardOverrides
import typingsSlinky.baseui.cardMod.CardProps
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.ImgHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Card {
  
  @JSImport("baseui/card", "Card")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def action(value: ReactElement): this.type = set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def actionReactElement(value: ReactElement): this.type = set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hasThumbnail(value: /* props */ Thumbnail => Boolean): this.type = set("hasThumbnail", js.Any.fromFunction1(value))
    
    @scala.inline
    def headerImage(value: String | (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement])): this.type = set("headerImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overrides(value: CardOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thumbnail(value: String): this.type = set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Card.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
