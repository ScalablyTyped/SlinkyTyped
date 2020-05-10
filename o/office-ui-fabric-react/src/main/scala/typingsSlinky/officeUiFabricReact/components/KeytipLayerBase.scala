package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.ikeytiptransitionkeyMod.IKeytipTransitionKey
import typingsSlinky.officeUiFabricReact.keytipLayerTypesMod.IKeytipLayer
import typingsSlinky.officeUiFabricReact.keytipLayerTypesMod.IKeytipLayerProps
import typingsSlinky.officeUiFabricReact.keytipLayerTypesMod.IKeytipLayerStyleProps
import typingsSlinky.officeUiFabricReact.keytipLayerTypesMod.IKeytipLayerStyles
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object KeytipLayerBase {
  @JSImport("office-ui-fabric-react", "KeytipLayerBase")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.KeytipLayerBase] {
    @scala.inline
    def componentRefFunction1(value: /* ref */ IKeytipLayer | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def componentRefRefObject(value: ReactRef[IKeytipLayer]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRef(value: IRefObject[IKeytipLayer]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def keytipExitSequences(value: js.Array[IKeytipTransitionKey]): this.type = set("keytipExitSequences", value.asInstanceOf[js.Any])
    @scala.inline
    def keytipReturnSequences(value: js.Array[IKeytipTransitionKey]): this.type = set("keytipReturnSequences", value.asInstanceOf[js.Any])
    @scala.inline
    def keytipStartSequences(value: js.Array[IKeytipTransitionKey]): this.type = set("keytipStartSequences", value.asInstanceOf[js.Any])
    @scala.inline
    def onEnterKeytipMode(value: () => Unit): this.type = set("onEnterKeytipMode", js.Any.fromFunction0(value))
    @scala.inline
    def onExitKeytipMode(
      value: /* ev */ js.UndefOr[SyntheticKeyboardEvent[HTMLElement] | SyntheticMouseEvent[HTMLElement]] => Unit
    ): this.type = set("onExitKeytipMode", js.Any.fromFunction1(value))
    @scala.inline
    def stylesFunction1(value: IKeytipLayerStyleProps => Partial[IKeytipLayerStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IKeytipLayerStyleProps, IKeytipLayerStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IKeytipLayerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(content: String): Builder = {
    val __props = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IKeytipLayerProps]))
  }
}

