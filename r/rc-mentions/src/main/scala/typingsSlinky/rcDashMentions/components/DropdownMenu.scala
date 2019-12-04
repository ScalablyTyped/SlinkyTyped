package typingsSlinky.rcDashMentions.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.rcDashMentions.libDropdownMenuMod.DropdownMenuProps
import typingsSlinky.rcDashMentions.libDropdownMenuMod.default
import typingsSlinky.rcDashMentions.libOptionMod.OptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DropdownMenu
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("rc-mentions/lib/DropdownMenu", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    options: js.Array[OptionProps],
    prefixCls: String = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DropdownMenuProps
}

