package typingsSlinky.blueprintjsTable.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsTable.contextMenuTargetWrapperMod.IContextMenuTargetWrapper
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ContextMenuTargetWrapper
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.blueprintjsTable.contextMenuTargetWrapperMod.ContextMenuTargetWrapper
    ] {
  @JSImport("@blueprintjs/table/lib/esm/common/contextMenuTargetWrapper", "ContextMenuTargetWrapper")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    renderContextMenu: SyntheticMouseEvent[HTMLElement] => ReactElement,
    style: CSSProperties,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.blueprintjsTable.contextMenuTargetWrapperMod.ContextMenuTargetWrapper
  ] = {
    val __obj = js.Dynamic.literal(renderContextMenu = js.Any.fromFunction1(renderContextMenu), style = style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IContextMenuTargetWrapper
}

