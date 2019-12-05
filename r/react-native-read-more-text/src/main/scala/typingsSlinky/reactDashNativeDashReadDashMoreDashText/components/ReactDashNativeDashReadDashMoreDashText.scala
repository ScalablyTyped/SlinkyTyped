package typingsSlinky.reactDashNativeDashReadDashMoreDashText.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashReadDashMoreDashText.reactDashNativeDashReadDashMoreDashTextMod.ReadMoreProps
import typingsSlinky.reactDashNativeDashReadDashMoreDashText.reactDashNativeDashReadDashMoreDashTextMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNativeDashReadDashMoreDashText
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-read-more-text", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    numberOfLines: Double,
    renderRevealedFooter: js.Function0[Unit] => TagMod[Any],
    renderTruncatedFooter: js.Function0[Unit] => TagMod[Any],
    onReady: () => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(numberOfLines = numberOfLines.asInstanceOf[js.Any], renderRevealedFooter = js.Any.fromFunction1(renderRevealedFooter), renderTruncatedFooter = js.Any.fromFunction1(renderTruncatedFooter))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction0(onReady))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReadMoreProps
}

