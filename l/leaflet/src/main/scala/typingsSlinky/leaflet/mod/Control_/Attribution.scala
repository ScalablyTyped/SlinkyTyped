package typingsSlinky.leaflet.mod.Control_

import typingsSlinky.leaflet.leafletBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Control.Attribution")
@js.native
class Attribution ()
  extends typingsSlinky.leaflet.mod.Control_ {
  def this(options: AttributionOptions) = this()
  @JSName("options")
  var options_Attribution: AttributionOptions = js.native
  def addAttribution(text: String): this.type = js.native
  def removeAttribution(text: String): this.type = js.native
  def setPrefix(prefix: String): this.type = js.native
  @JSName("setPrefix")
  def setPrefix_false(prefix: `false`): this.type = js.native
}

