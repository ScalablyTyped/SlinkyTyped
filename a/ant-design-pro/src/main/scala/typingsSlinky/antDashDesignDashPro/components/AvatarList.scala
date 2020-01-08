package typingsSlinky.antDashDesignDashPro.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.antDashDesignDashPro.libAvatarListAvatarItemMod.SizeType
import typingsSlinky.antDashDesignDashPro.libAvatarListMod.AvatarListProps
import typingsSlinky.antDashDesignDashPro.libAvatarListMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AvatarList
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("ant-design-pro/lib/AvatarList", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    Item: ReactElement = null,
    excessItemsStyle: CSSProperties = null,
    maxLength: Int | Double = null,
    size: SizeType = null,
    style: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (excessItemsStyle != null) __obj.updateDynamic("excessItemsStyle")(excessItemsStyle.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.antDashDesignDashPro.libAvatarListMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = AvatarListProps
}

