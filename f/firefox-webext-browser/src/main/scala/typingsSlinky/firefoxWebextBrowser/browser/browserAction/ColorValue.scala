package typingsSlinky.firefoxWebextBrowser.browser.browserAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An array of four integers in the range [0,255] that make up the RGBA color of the badge. For example, opaque red
  * is `[255, 0, 0, 255]`. Can also be a string with a CSS value, with opaque red being `#FF0000` or `#F00`.
  */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.firefoxWebextBrowser.browser.browserAction.ColorArray
  - scala.Null
*/
trait ColorValue extends js.Object

object ColorValue {
  @scala.inline
  implicit def apply(value: ColorArray): ColorValue = value.asInstanceOf[ColorValue]
  @scala.inline
  implicit def apply(value: Null): ColorValue = value.asInstanceOf[ColorValue]
  @scala.inline
  implicit def apply(value: String): ColorValue = value.asInstanceOf[ColorValue]
}

