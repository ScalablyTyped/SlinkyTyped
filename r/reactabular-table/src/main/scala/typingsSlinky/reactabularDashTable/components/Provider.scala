package typingsSlinky.reactabularDashTable.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CSSStyleDeclaration
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactabularDashTable.reactabularDashTableMod.Column
import typingsSlinky.reactabularDashTable.reactabularDashTableMod.ProviderProps
import typingsSlinky.reactabularDashTable.reactabularDashTableMod.Renderers
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Provider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactabularDashTable.reactabularDashTableMod.Provider] {
  @JSImport("reactabular-table", "Provider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    columns: js.Array[Column],
    renderers: Renderers = null,
    style: Partial[CSSStyleDeclaration] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactabularDashTable.reactabularDashTableMod.Provider] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    if (renderers != null) __obj.updateDynamic("renderers")(renderers.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ProviderProps
}

