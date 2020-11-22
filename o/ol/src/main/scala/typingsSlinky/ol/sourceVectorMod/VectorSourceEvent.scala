package typingsSlinky.ol.sourceVectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/source/Vector", "VectorSourceEvent")
@js.native
class VectorSourceEvent[GeomType /* <: typingsSlinky.ol.geometryMod.default */] protected ()
  extends typingsSlinky.ol.eventMod.default {
  def this(`type`: String) = this()
  def this(`type`: String, opt_feature: typingsSlinky.ol.olFeatureMod.default[GeomType]) = this()
  
  /**
    * The feature being added or removed.
    */
  var feature: typingsSlinky.ol.olFeatureMod.default[GeomType] = js.native
}
