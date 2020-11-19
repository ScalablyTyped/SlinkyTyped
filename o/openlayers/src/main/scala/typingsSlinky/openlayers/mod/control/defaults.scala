package typingsSlinky.openlayers.mod.control

import typingsSlinky.openlayers.mod.Collection
import typingsSlinky.openlayers.mod.olx.control.DefaultsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openlayers", "control.defaults")
@js.native
object defaults extends js.Object {
  
  /**
    * Set of controls included in maps by default. Unless configured otherwise,
    * this returns a collection containing an instance of each of the following
    * controls:
    * * {@link ol.control.Zoom}
    * * {@link ol.control.Rotate}
    * * {@link ol.control.Attribution}
    *
    * @param opt_options Defaults options.
    * @return Controls.
    * @api stable
    */
  def apply(): Collection[Control] = js.native
  def apply(opt_options: DefaultsOptions): Collection[Control] = js.native
}
