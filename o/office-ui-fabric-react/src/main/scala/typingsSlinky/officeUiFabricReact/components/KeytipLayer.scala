package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.ikeytiptransitionkeyMod.IKeytipTransitionKey
import typingsSlinky.officeUiFabricReact.keytipLayerTypesMod.IKeytipLayer
import typingsSlinky.officeUiFabricReact.keytipLayerTypesMod.IKeytipLayerProps
import typingsSlinky.officeUiFabricReact.keytipLayerTypesMod.IKeytipLayerStyleProps
import typingsSlinky.officeUiFabricReact.keytipLayerTypesMod.IKeytipLayerStyles
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object KeytipLayer
  extends ExternalComponentWithAttributesWithRefType[tag.type, LegacyRef[js.Any] with js.Object] {
  @JSImport("office-ui-fabric-react", "KeytipLayer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    content: String,
    componentRef: IRefObject[IKeytipLayer] = null,
    keytipExitSequences: js.Array[IKeytipTransitionKey] = null,
    keytipReturnSequences: js.Array[IKeytipTransitionKey] = null,
    keytipStartSequences: js.Array[IKeytipTransitionKey] = null,
    onEnterKeytipMode: () => Unit = null,
    onExitKeytipMode: /* ev */ js.UndefOr[SyntheticKeyboardEvent[HTMLElement] | SyntheticMouseEvent[HTMLElement]] => Unit = null,
    styles: IStyleFunctionOrObject[IKeytipLayerStyleProps, IKeytipLayerStyles] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, LegacyRef[js.Any] with js.Object] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (keytipExitSequences != null) __obj.updateDynamic("keytipExitSequences")(keytipExitSequences.asInstanceOf[js.Any])
    if (keytipReturnSequences != null) __obj.updateDynamic("keytipReturnSequences")(keytipReturnSequences.asInstanceOf[js.Any])
    if (keytipStartSequences != null) __obj.updateDynamic("keytipStartSequences")(keytipStartSequences.asInstanceOf[js.Any])
    if (onEnterKeytipMode != null) __obj.updateDynamic("onEnterKeytipMode")(js.Any.fromFunction0(onEnterKeytipMode))
    if (onExitKeytipMode != null) __obj.updateDynamic("onExitKeytipMode")(js.Any.fromFunction1(onExitKeytipMode))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IKeytipLayerProps
}

