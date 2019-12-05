package typingsSlinky.atAntDashDesignReactDashNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atAntDashDesignReactDashNative.libStyleMod.Theme
import typingsSlinky.atAntDashDesignReactDashNative.libStyleMod.WithThemeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WithTheme
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.atAntDashDesignReactDashNative.libStyleMod.WithTheme[js.Any, js.Any]
    ] {
  @JSImport("@ant-design/react-native/lib/style", "WithTheme")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[T, S](themeStyles: Theme => T, styles: S = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[
    tag.type, 
    typingsSlinky.atAntDashDesignReactDashNative.libStyleMod.WithTheme[js.Any, js.Any]
  ] = {
    val __obj = js.Dynamic.literal(themeStyles = js.Any.fromFunction1(themeStyles))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atAntDashDesignReactDashNative.libStyleMod.WithTheme[js.Any, js.Any]]]
  }
  type Props = WithThemeProps[js.Any, js.Any]
}

