package typingsSlinky.antDesignReactNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.libStyleMod.Theme
import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WithTheme {
  @JSImport("@ant-design/react-native/lib/style", "WithTheme")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T, S] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignReactNative.libStyleMod.WithTheme[T, S]] {
    @scala.inline
    def styles(value: S): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  def withProps[T, S](p: WithThemeProps[T, S]): Builder[T, S] = new Builder[T, S](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T, S](children: (T with StringDictionary[js.Any], Theme) => ReactElement, themeStyles: Theme => T): Builder[T, S] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children), themeStyles = js.Any.fromFunction1(themeStyles))
    new Builder[T, S](js.Array(this.component, __props.asInstanceOf[WithThemeProps[T, S]]))
  }
}

