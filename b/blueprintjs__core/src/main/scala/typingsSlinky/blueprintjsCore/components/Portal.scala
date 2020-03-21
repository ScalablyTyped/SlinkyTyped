package typingsSlinky.blueprintjsCore.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsCore.portalMod.IPortalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Portal
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsCore.mod.Portal] {
  @JSImport("@blueprintjs/core", "Portal")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    container: HTMLElement = null,
    onChildrenMount: () => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.Portal] = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (onChildrenMount != null) __obj.updateDynamic("onChildrenMount")(js.Any.fromFunction0(onChildrenMount))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.Portal] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.blueprintjsCore.mod.Portal](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IPortalProps
}

