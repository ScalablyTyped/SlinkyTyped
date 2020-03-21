package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipStyleProps
import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipStyles
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.ipointMod.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object KeytipContent
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("office-ui-fabric-react/lib/components/Keytip/KeytipContent", "KeytipContent")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    content: String,
    keySequences: js.Array[String],
    calloutProps: ICalloutProps = null,
    hasDynamicChildren: js.UndefOr[Boolean] = js.undefined,
    hasMenu: js.UndefOr[Boolean] = js.undefined,
    offset: IPoint = null,
    onExecute: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Unit = null,
    onReturn: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Unit = null,
    overflowSetSequence: js.Array[String] = null,
    styles: IStyleFunctionOrObject[IKeytipStyleProps, IKeytipStyles] = null,
    theme: ITheme = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], keySequences = keySequences.asInstanceOf[js.Any])
    if (calloutProps != null) __obj.updateDynamic("calloutProps")(calloutProps.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDynamicChildren)) __obj.updateDynamic("hasDynamicChildren")(hasDynamicChildren.asInstanceOf[js.Any])
    if (!js.isUndefined(hasMenu)) __obj.updateDynamic("hasMenu")(hasMenu.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onExecute != null) __obj.updateDynamic("onExecute")(js.Any.fromFunction2(onExecute))
    if (onReturn != null) __obj.updateDynamic("onReturn")(js.Any.fromFunction2(onReturn))
    if (overflowSetSequence != null) __obj.updateDynamic("overflowSetSequence")(overflowSetSequence.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IKeytipProps
}

