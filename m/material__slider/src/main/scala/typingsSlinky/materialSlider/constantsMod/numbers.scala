package typingsSlinky.materialSlider.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.materialBase.foundationMod.MDCNumbers
import typingsSlinky.materialSlider.materialSliderNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait numbers extends MDCNumbers {
  var PAGE_FACTOR: `4`
}

object numbers {
  @scala.inline
  def apply(PAGE_FACTOR: `4`, StringDictionary: StringDictionary[Double] = null): numbers = {
    val __obj = js.Dynamic.literal(PAGE_FACTOR = PAGE_FACTOR.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[numbers]
  }
}

