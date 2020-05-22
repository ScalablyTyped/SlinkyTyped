package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipStyleProps
import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipStyles
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object KeytipContent {
  @JSImport("office-ui-fabric-react/lib/components/Keytip/KeytipContent", "KeytipContent")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def calloutProps(value: ICalloutProps): this.type = set("calloutProps", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def hasDynamicChildren(value: Boolean): this.type = set("hasDynamicChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def hasMenu(value: Boolean): this.type = set("hasMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def offset(value: Point): this.type = set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def onExecute(value: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Unit): this.type = set("onExecute", js.Any.fromFunction2(value))
    @scala.inline
    def onReturn(value: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Unit): this.type = set("onReturn", js.Any.fromFunction2(value))
    @scala.inline
    def overflowSetSequence(value: js.Array[String]): this.type = set("overflowSetSequence", value.asInstanceOf[js.Any])
    @scala.inline
    def stylesFunction1(value: IKeytipStyleProps => DeepPartial[IKeytipStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IKeytipStyleProps, IKeytipStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IKeytipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(content: String, keySequences: js.Array[String]): Builder = {
    val __props = js.Dynamic.literal(content = content.asInstanceOf[js.Any], keySequences = keySequences.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IKeytipProps]))
  }
}

