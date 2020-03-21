package typingsSlinky.ol.pointsLayerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomAttribute extends js.Object {
  var name: String
  def callback(
    p0: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default],
    p1: StringDictionary[js.Any]
  ): Double
}

object CustomAttribute {
  @scala.inline
  def apply(
    callback: (typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default], StringDictionary[js.Any]) => Double,
    name: String
  ): CustomAttribute = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomAttribute]
  }
}

