package typingsSlinky.inkBox.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.inkBox.anon.BottomLeft
import typingsSlinky.inkBox.inkBoxStrings.classic
import typingsSlinky.inkBox.inkBoxStrings.double
import typingsSlinky.inkBox.inkBoxStrings.doubleSingle
import typingsSlinky.inkBox.inkBoxStrings.round
import typingsSlinky.inkBox.inkBoxStrings.single
import typingsSlinky.inkBox.inkBoxStrings.singleDouble
import typingsSlinky.inkBox.mod.Alignment
import typingsSlinky.inkBox.mod.BoxProps
import typingsSlinky.inkBox.mod.Spacing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InkBox {
  @JSImport("ink-box", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def align(value: Alignment): this.type = set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def borderColor(value: String): this.type = set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def borderStyle(value: single | double | round | singleDouble | doubleSingle | classic | BottomLeft): this.type = set("borderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def dimBorder(value: Boolean): this.type = set("dimBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def float(value: Alignment): this.type = set("float", value.asInstanceOf[js.Any])
    @scala.inline
    def margin(value: Spacing): this.type = set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def padding(value: Spacing): this.type = set("padding", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BoxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: InkBox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

