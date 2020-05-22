package typingsSlinky.materialMenu.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.materialBase.foundationMod.MDCNumbers
import typingsSlinky.materialMenu.materialMenuNumbers.`0`
import typingsSlinky.materialMenu.materialMenuNumbers.`12`
import typingsSlinky.materialMenu.materialMenuNumbers.`13`
import typingsSlinky.materialMenu.materialMenuNumbers.`1`
import typingsSlinky.materialMenu.materialMenuNumbers.`4`
import typingsSlinky.materialMenu.materialMenuNumbers.`5`
import typingsSlinky.materialMenu.materialMenuNumbers.`8`
import typingsSlinky.materialMenu.materialMenuNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Corner extends MDCNumbers {
  var BOTTOM_END: `13`
  var BOTTOM_LEFT: `1`
  var BOTTOM_RIGHT: `5`
  var BOTTOM_START: `9`
  var TOP_END: `12`
  var TOP_LEFT: `0`
  var TOP_RIGHT: `4`
  var TOP_START: `8`
}

object Corner {
  @scala.inline
  def apply(
    BOTTOM_END: `13`,
    BOTTOM_LEFT: `1`,
    BOTTOM_RIGHT: `5`,
    BOTTOM_START: `9`,
    TOP_END: `12`,
    TOP_LEFT: `0`,
    TOP_RIGHT: `4`,
    TOP_START: `8`,
    StringDictionary: StringDictionary[Double] = null
  ): Corner = {
    val __obj = js.Dynamic.literal(BOTTOM_END = BOTTOM_END.asInstanceOf[js.Any], BOTTOM_LEFT = BOTTOM_LEFT.asInstanceOf[js.Any], BOTTOM_RIGHT = BOTTOM_RIGHT.asInstanceOf[js.Any], BOTTOM_START = BOTTOM_START.asInstanceOf[js.Any], TOP_END = TOP_END.asInstanceOf[js.Any], TOP_LEFT = TOP_LEFT.asInstanceOf[js.Any], TOP_RIGHT = TOP_RIGHT.asInstanceOf[js.Any], TOP_START = TOP_START.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Corner]
  }
}

