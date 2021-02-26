package typingsSlinky.antDesignReactNative.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.anon.PickCardStyleheaderConten
import typingsSlinky.antDesignReactNative.cardHeaderMod.CardHeaderProps
import typingsSlinky.antDesignReactNative.cardHeaderMod.default
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CardHeader {
  
  @JSImport("@ant-design/react-native/lib/card/CardHeader", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def extra(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extraReactElement(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def styles(value: Partial[PickCardStyleheaderConten]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thumb(value: ReactElement): this.type = set("thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thumbReactElement(value: ReactElement): this.type = set("thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thumbStyle(value: StyleProp[ImageStyle]): this.type = set("thumbStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thumbStyleNull: this.type = set("thumbStyle", null)
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: CardHeader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CardHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
