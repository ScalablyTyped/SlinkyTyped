package typingsSlinky.catalog.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.catalog.catalogNumbers.`1`
import typingsSlinky.catalog.catalogNumbers.`2`
import typingsSlinky.catalog.catalogNumbers.`3`
import typingsSlinky.catalog.catalogNumbers.`4`
import typingsSlinky.catalog.catalogNumbers.`5`
import typingsSlinky.catalog.catalogNumbers.`6`
import typingsSlinky.catalog.mod.HtmlSpecimenProps
import typingsSlinky.catalog.mod.SpecimenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HtmlSpecimen {
  @JSImport("catalog", "HtmlSpecimen")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.catalog.mod.HtmlSpecimen] {
    @scala.inline
    def dark(value: Boolean): this.type = set("dark", value.asInstanceOf[js.Any])
    @scala.inline
    def frame(value: Boolean): this.type = set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def light(value: Boolean): this.type = set("light", value.asInstanceOf[js.Any])
    @scala.inline
    def noSource(value: Boolean): this.type = set("noSource", value.asInstanceOf[js.Any])
    @scala.inline
    def plain(value: Boolean): this.type = set("plain", value.asInstanceOf[js.Any])
    @scala.inline
    def rawBody(value: String): this.type = set("rawBody", value.asInstanceOf[js.Any])
    @scala.inline
    def rawOptions(value: String): this.type = set("rawOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def responsive(value: Boolean | String | js.Array[String]): this.type = set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def showSource(value: Boolean): this.type = set("showSource", value.asInstanceOf[js.Any])
    @scala.inline
    def span(value: `1` | `2` | `3` | `4` | `5` | `6`): this.type = set("span", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SpecimenProps with HtmlSpecimenProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: HtmlSpecimen.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

