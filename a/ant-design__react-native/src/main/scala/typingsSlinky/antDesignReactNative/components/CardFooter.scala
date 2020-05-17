package typingsSlinky.antDesignReactNative.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.anon.PickCardStylefooterConten
import typingsSlinky.antDesignReactNative.cardFooterMod.CardFooterProps
import typingsSlinky.antDesignReactNative.cardFooterMod.default
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardFooter {
  @JSImport("@ant-design/react-native/lib/card/CardFooter", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def content(value: TagMod[Any]): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def extraReactElement(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def extra(value: TagMod[Any]): this.type = set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def styles(value: Partial[PickCardStylefooterConten]): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CardFooterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CardFooter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

