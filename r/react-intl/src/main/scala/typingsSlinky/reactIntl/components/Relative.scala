package typingsSlinky.reactIntl.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.formatjsIntlRelativetimeformat.mod.Unit
import typingsSlinky.reactIntl.relativeMod.Props
import typingsSlinky.reactIntl.relativeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Relative {
  @JSImport("react-intl/lib/components/relative", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def unit(value: Unit): this.type = set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def updateIntervalInSeconds(value: Double): this.type = set("updateIntervalInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Relative.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

