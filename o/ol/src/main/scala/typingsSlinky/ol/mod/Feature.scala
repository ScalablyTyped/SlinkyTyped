package typingsSlinky.ol.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ol.geometryMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "Feature")
@js.native
class Feature[GeomType /* <: default */] ()
  extends typingsSlinky.ol.olFeatureMod.default[GeomType] {
  def this(opt_geometryOrProperties: GeomType) = this()
  def this(opt_geometryOrProperties: StringDictionary[js.Any]) = this()
}

