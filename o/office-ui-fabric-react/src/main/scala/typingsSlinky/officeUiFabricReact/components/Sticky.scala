package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.stickyTypesMod.IStickyProps
import typingsSlinky.officeUiFabricReact.stickyTypesMod.StickyPositionType
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Sticky
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.officeUiFabricReact.mod.Sticky] {
  @JSImport("office-ui-fabric-react", "Sticky")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    componentRef: IRefObject[IStickyProps] = null,
    isScrollSynced: js.UndefOr[Boolean] = js.undefined,
    stickyBackgroundColor: String = null,
    stickyClassName: String = null,
    stickyPosition: StickyPositionType = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.Sticky] = {
    val __obj = js.Dynamic.literal()
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isScrollSynced)) __obj.updateDynamic("isScrollSynced")(isScrollSynced.asInstanceOf[js.Any])
    if (stickyBackgroundColor != null) __obj.updateDynamic("stickyBackgroundColor")(stickyBackgroundColor.asInstanceOf[js.Any])
    if (stickyClassName != null) __obj.updateDynamic("stickyClassName")(stickyClassName.asInstanceOf[js.Any])
    if (stickyPosition != null) __obj.updateDynamic("stickyPosition")(stickyPosition.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.Sticky] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.officeUiFabricReact.mod.Sticky](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IStickyProps
}

