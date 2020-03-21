package typingsSlinky.reactHotLoader.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactHotLoader.mod.AppChildren
import typingsSlinky.reactHotLoader.mod.AppContainerProps
import typingsSlinky.reactHotLoader.mod.ErrorReporterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AppContainer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactHotLoader.mod.AppContainer] {
  @JSImport("react-hot-loader", "AppContainer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    errorBoundary: js.UndefOr[Boolean] = js.undefined,
    errorReporter: ReactComponentClass[ErrorReporterProps] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactHotLoader.mod.AppContainer] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(errorBoundary)) __obj.updateDynamic("errorBoundary")(errorBoundary.asInstanceOf[js.Any])
    if (errorReporter != null) __obj.updateDynamic("errorReporter")(errorReporter.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactHotLoader.mod.AppContainer] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactHotLoader.mod.AppContainer](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = AppContainerProps with AppChildren
}

