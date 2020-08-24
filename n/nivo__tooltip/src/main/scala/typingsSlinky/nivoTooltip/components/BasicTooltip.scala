package typingsSlinky.nivoTooltip.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nivoTooltip.mod.BasicTooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BasicTooltip {
  @JSImport("@nivo/tooltip", "BasicTooltip")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.nivoTooltip.mod.BasicTooltip] {
    @scala.inline
    def enableChip(value: Boolean): this.type = set("enableChip", value.asInstanceOf[js.Any])
    @scala.inline
    def format(value: /* value */ Double | String => Double | String): this.type = set("format", js.Any.fromFunction1(value))
    @scala.inline
    def id(value: ReactElement): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def renderContent(value: () => ReactElement): this.type = set("renderContent", js.Any.fromFunction0(value))
    @scala.inline
    def value(value: String | Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BasicTooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(color: String): Builder = {
    val __props = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BasicTooltipProps]))
  }
}

