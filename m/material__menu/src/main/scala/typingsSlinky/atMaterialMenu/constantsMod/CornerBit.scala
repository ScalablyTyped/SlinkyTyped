package typingsSlinky.atMaterialMenu.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atMaterialBase.foundationMod.MDCNumbers
import typingsSlinky.atMaterialMenu.atMaterialMenuNumbers.`1`
import typingsSlinky.atMaterialMenu.atMaterialMenuNumbers.`2`
import typingsSlinky.atMaterialMenu.atMaterialMenuNumbers.`4`
import typingsSlinky.atMaterialMenu.atMaterialMenuNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CornerBit extends MDCNumbers {
  var BOTTOM: `1`
  var CENTER: `2`
  var FLIP_RTL: `8`
  var RIGHT: `4`
}

object CornerBit {
  @scala.inline
  def apply(
    BOTTOM: `1`,
    CENTER: `2`,
    FLIP_RTL: `8`,
    RIGHT: `4`,
    StringDictionary: StringDictionary[Double] = null
  ): CornerBit = {
    val __obj = js.Dynamic.literal(BOTTOM = BOTTOM.asInstanceOf[js.Any], CENTER = CENTER.asInstanceOf[js.Any], FLIP_RTL = FLIP_RTL.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CornerBit]
  }
}

