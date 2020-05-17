package typingsSlinky.k6.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.k6.k6Strings.hex
  - typingsSlinky.k6.k6Strings.base64
  - typingsSlinky.k6.k6Strings.base64url
  - typingsSlinky.k6.k6Strings.base64rawurl
*/
trait StringEncoding extends OutputEncoding

object StringEncoding {
  @scala.inline
  def base64: typingsSlinky.k6.k6Strings.base64 = "base64".asInstanceOf[typingsSlinky.k6.k6Strings.base64]
  @scala.inline
  def base64rawurl: typingsSlinky.k6.k6Strings.base64rawurl = "base64rawurl".asInstanceOf[typingsSlinky.k6.k6Strings.base64rawurl]
  @scala.inline
  def base64url: typingsSlinky.k6.k6Strings.base64url = "base64url".asInstanceOf[typingsSlinky.k6.k6Strings.base64url]
  @scala.inline
  def hex: typingsSlinky.k6.k6Strings.hex = "hex".asInstanceOf[typingsSlinky.k6.k6Strings.hex]
}

