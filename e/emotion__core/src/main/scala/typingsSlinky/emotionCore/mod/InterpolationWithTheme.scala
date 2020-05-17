package typingsSlinky.emotionCore.mod

import typingsSlinky.emotionSerialize.mod.Interpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.emotionSerialize.mod.Interpolation[js.UndefOr[scala.Nothing]]
  - js.Function1[
/ * theme * / Theme, 
typingsSlinky.emotionSerialize.mod.Interpolation[js.UndefOr[scala.Nothing]]]
*/
trait InterpolationWithTheme[Theme] extends js.Object

object InterpolationWithTheme {
  @scala.inline
  implicit def apply[Theme](value: js.Function1[/* theme */ Theme, Interpolation[js.UndefOr[scala.Nothing]]]): InterpolationWithTheme[Theme] = value.asInstanceOf[InterpolationWithTheme[Theme]]
  @scala.inline
  implicit def apply[Theme](value: Interpolation[js.UndefOr[scala.Nothing]]): InterpolationWithTheme[Theme] = value.asInstanceOf[InterpolationWithTheme[Theme]]
}

