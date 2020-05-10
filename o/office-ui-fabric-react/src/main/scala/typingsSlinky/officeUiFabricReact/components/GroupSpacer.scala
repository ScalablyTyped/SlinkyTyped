package typingsSlinky.officeUiFabricReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.groupSpacerTypesMod.IGroupSpacerProps
import typingsSlinky.officeUiFabricReact.groupSpacerTypesMod.IGroupSpacerStyleProps
import typingsSlinky.officeUiFabricReact.groupSpacerTypesMod.IGroupSpacerStyles
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GroupSpacer {
  @JSImport("office-ui-fabric-react", "GroupSpacer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def indentWidth(value: Double): this.type = set("indentWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def stylesFunction1(value: IGroupSpacerStyleProps => Partial[IGroupSpacerStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IGroupSpacerStyleProps, IGroupSpacerStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IGroupSpacerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(count: Double): Builder = {
    val __props = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IGroupSpacerProps]))
  }
}

