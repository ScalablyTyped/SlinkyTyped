package typingsSlinky.mockjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Mockjs.Random - Image
// see https://github.com/nuysoft/Mock/wiki/Image
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mockjs.mockjsStrings.png
  - typingsSlinky.mockjs.mockjsStrings.gif
  - typingsSlinky.mockjs.mockjsStrings.jpg
*/
trait RandomImageFormatString extends js.Object

object RandomImageFormatString {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def gif: typingsSlinky.mockjs.mockjsStrings.gif = this.cast("gif")
  @scala.inline
  def jpg: typingsSlinky.mockjs.mockjsStrings.jpg = this.cast("jpg")
  @scala.inline
  def png: typingsSlinky.mockjs.mockjsStrings.png = this.cast("png")
}

