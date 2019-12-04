package typingsSlinky.reactDashNavigationDashDrawer.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNavigationDashDrawer.libTypescriptSrcViewsResourceSavingSceneMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResourceSavingScene
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-navigation-drawer/lib/typescript/src/views/ResourceSavingScene", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(isVisible: Boolean, style: js.Any = null, overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactDashNavigationDashDrawer.libTypescriptSrcViewsResourceSavingSceneMod.Props
}

