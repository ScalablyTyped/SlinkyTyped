package typingsSlinky.reactMosaicComponent.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.blueprintjsCoreBooleans.`false`
import typingsSlinky.blueprintjsCore.iconMod.IIconProps
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactMosaicComponent.optionalBlueprintMod.OptionalBlueprint.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OptionalBlueprintIcon {
  @JSImport("react-mosaic-component/lib/util/OptionalBlueprint", "OptionalBlueprint.Icon")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Icon] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def htmlTitle(value: String): this.type = set("htmlTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def icon(value: IconName | MaybeElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def iconNull: this.type = set("icon", null)
    @scala.inline
    def iconSize(value: Double): this.type = set("iconSize", value.asInstanceOf[js.Any])
    @scala.inline
    def intent(value: Intent): this.type = set("intent", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def tagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): this.type = set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String | `false`): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def titleNull: this.type = set("title", null)
  }
  
  def withProps(p: IIconProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: OptionalBlueprintIcon.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

