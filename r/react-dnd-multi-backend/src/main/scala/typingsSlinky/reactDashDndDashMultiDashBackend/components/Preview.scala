package typingsSlinky.reactDashDndDashMultiDashBackend.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashDndDashMultiDashBackend.reactDashDndDashMultiDashBackendMod.PreviewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Preview
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashDndDashMultiDashBackend.reactDashDndDashMultiDashBackendMod.Preview
    ] {
  @JSImport("react-dnd-multi-backend", "Preview")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    generator: (String, js.Any, CSSProperties) => typingsSlinky.react.reactMod._Global_.JSX.Element,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashDndDashMultiDashBackend.reactDashDndDashMultiDashBackendMod.Preview
  ] = {
    val __obj = js.Dynamic.literal(generator = js.Any.fromFunction3(generator))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PreviewProps
}

