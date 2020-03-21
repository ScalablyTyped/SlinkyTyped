package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.auto
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.baseline
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.center
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.end
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.inherit
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.initial
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.start
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.stretch
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.unset
import typingsSlinky.officeUiFabricReact.stackItemTypesMod.IStackItemProps
import typingsSlinky.officeUiFabricReact.stackItemTypesMod.IStackItemStyles
import typingsSlinky.officeUiFabricReact.stackItemTypesMod.IStackItemTokens
import typingsSlinky.uifabricFoundation.ihtmlslotsMod.IHTMLSlot
import typingsSlinky.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject
import typingsSlinky.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StackItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("office-ui-fabric-react/lib/components/Stack/StackItem/StackItem", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    align: auto | stretch | baseline | start | center | end = null,
    disableShrink: js.UndefOr[Boolean] = js.undefined,
    grow: Boolean | Double | inherit | initial | unset = null,
    order: Double | String = null,
    root: IHTMLSlot = null,
    shrink: Boolean | Double | inherit | initial | unset = null,
    styles: IStylesFunctionOrObject[IStackItemProps, IStackItemTokens, IStackItemStyles] = null,
    theme: ITheme = null,
    tokens: ITokenFunctionOrObject[IStackItemProps, IStackItemTokens] = null,
    verticalFill: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(disableShrink)) __obj.updateDynamic("disableShrink")(disableShrink.asInstanceOf[js.Any])
    if (grow != null) __obj.updateDynamic("grow")(grow.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (shrink != null) __obj.updateDynamic("shrink")(shrink.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tokens != null) __obj.updateDynamic("tokens")(tokens.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalFill)) __obj.updateDynamic("verticalFill")(verticalFill.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IStackItemProps
}

