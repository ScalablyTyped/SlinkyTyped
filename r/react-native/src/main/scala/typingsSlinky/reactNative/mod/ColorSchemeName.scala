package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNative.reactNativeStrings.light
  - typingsSlinky.reactNative.reactNativeStrings.dark
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait ColorSchemeName extends js.Object

object ColorSchemeName {
  @scala.inline
  def light: typingsSlinky.reactNative.reactNativeStrings.light = "light".asInstanceOf[typingsSlinky.reactNative.reactNativeStrings.light]
  @scala.inline
  def dark: typingsSlinky.reactNative.reactNativeStrings.dark = "dark".asInstanceOf[typingsSlinky.reactNative.reactNativeStrings.dark]
  @scala.inline
  implicit def apply(value: Null): ColorSchemeName = value.asInstanceOf[ColorSchemeName]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => ColorSchemeName): ColorSchemeName = value.asInstanceOf[ColorSchemeName]
}

