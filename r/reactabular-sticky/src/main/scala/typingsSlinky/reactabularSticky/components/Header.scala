package typingsSlinky.reactabularSticky.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactabularSticky.PartialUIEvent
import typingsSlinky.reactabularSticky.mod.StickyHeaderProps
import typingsSlinky.reactabularTable.PartialCSSStyleDeclaratio
import typingsSlinky.reactabularTable.mod.Column
import typingsSlinky.reactabularTable.mod.HeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Header
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactabularSticky.mod.Header] {
  @JSImport("reactabular-sticky", "Header")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    headerRows: js.Array[Column] = null,
    onScroll: /* e */ PartialUIEvent => Unit = null,
    style: PartialCSSStyleDeclaratio = null,
    tableBody: HTMLElement = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactabularSticky.mod.Header] = {
    val __obj = js.Dynamic.literal()
    if (headerRows != null) __obj.updateDynamic("headerRows")(headerRows.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tableBody != null) __obj.updateDynamic("tableBody")(tableBody.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactabularSticky.mod.Header] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactabularSticky.mod.Header](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = StickyHeaderProps with HeaderProps
}

