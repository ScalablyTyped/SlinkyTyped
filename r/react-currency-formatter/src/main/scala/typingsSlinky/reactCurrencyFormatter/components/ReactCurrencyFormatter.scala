package typingsSlinky.reactCurrencyFormatter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactCurrencyFormatter.mod.CurrencyFormatterProps
import typingsSlinky.reactCurrencyFormatter.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCurrencyFormatter {
  @JSImport("react-currency-formatter", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def currency(value: String): this.type = set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def decimal(value: String): this.type = set("decimal", value.asInstanceOf[js.Any])
    @scala.inline
    def group(value: String): this.type = set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def pattern(value: String): this.type = set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def symbol(value: String): this.type = set("symbol", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CurrencyFormatterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(quantity: Double): Builder = {
    val __props = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CurrencyFormatterProps]))
  }
}

