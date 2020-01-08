package typingsSlinky.reactDashDnd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashDnd.libCommonDragPreviewImageMod.DragPreviewImageProps
import typingsSlinky.reactDashDnd.libInterfacesConnectorsMod.ConnectableElement
import typingsSlinky.reactDashDnd.libInterfacesOptionsMod.DragPreviewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DragPreviewImage
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-dnd/lib/common", "DragPreviewImage")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    connect: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => ReactElement | Null,
    src: String,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction2(connect), src = src.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DragPreviewImageProps
}

