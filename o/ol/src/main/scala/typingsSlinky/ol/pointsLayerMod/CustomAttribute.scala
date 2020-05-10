package typingsSlinky.ol.pointsLayerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomAttribute extends js.Object {
  var name: String = js.native
  def callback(
    p0: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default],
    p1: StringDictionary[js.Any]
  ): Double = js.native
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
  @scala.inline
  implicit class CustomAttributeOps[Self <: CustomAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(
      value: (typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default], StringDictionary[js.Any]) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

