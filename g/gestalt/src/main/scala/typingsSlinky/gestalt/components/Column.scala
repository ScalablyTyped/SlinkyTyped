package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.mod.ColumnProps
import typingsSlinky.gestalt.mod.UnsignedUpTo12
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Column {
  @JSImport("gestalt", "Column")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.Column] {
    @scala.inline
    def lgSpan(value: UnsignedUpTo12): this.type = set("lgSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def mdSpan(value: UnsignedUpTo12): this.type = set("mdSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def smSpan(value: UnsignedUpTo12): this.type = set("smSpan", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ColumnProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(span: UnsignedUpTo12): Builder = {
    val __props = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ColumnProps]))
  }
}

