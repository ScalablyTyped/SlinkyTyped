package typingsSlinky.catalog.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.catalog.catalogNumbers.`1`
import typingsSlinky.catalog.catalogNumbers.`2`
import typingsSlinky.catalog.catalogNumbers.`3`
import typingsSlinky.catalog.catalogNumbers.`4`
import typingsSlinky.catalog.catalogNumbers.`5`
import typingsSlinky.catalog.catalogNumbers.`6`
import typingsSlinky.catalog.mod.SpecimenProps
import typingsSlinky.catalog.mod.TypeSpecimenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TypeSpecimen {
  @JSImport("catalog", "TypeSpecimen")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.catalog.mod.TypeSpecimen] {
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def rawBody(value: String): this.type = set("rawBody", value.asInstanceOf[js.Any])
    @scala.inline
    def rawOptions(value: String): this.type = set("rawOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def span(value: `1` | `2` | `3` | `4` | `5` | `6`): this.type = set("span", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: String): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SpecimenProps with TypeSpecimenProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(font: String, headings: js.Array[Double | String], weight: String): Builder = {
    val __props = js.Dynamic.literal(font = font.asInstanceOf[js.Any], headings = headings.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SpecimenProps with TypeSpecimenProps]))
  }
}

