package typingsSlinky.proj4leaflet.mod.leafletAugmentingMod.Proj

import typingsSlinky.leaflet.mod.Projection
import typingsSlinky.leaflet.mod.Transformation
import typingsSlinky.proj4.mod.InterfaceProjection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Proj.CRS")
@js.native
class CRS protected ()
  extends typingsSlinky.leaflet.mod.CRS {
  def this(projection: InterfaceProjection) = this()
  def this(code: String, proj4def: String) = this()
  def this(projection: InterfaceProjection, options: ProjCRSOptions) = this()
  def this(code: String, proj4def: String, options: ProjCRSOptions) = this()
  
  var projection: Projection = js.native
  
  var transformation: Transformation = js.native
}
