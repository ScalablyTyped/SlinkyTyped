package typingsSlinky.jose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jose.joseStrings.RSA
  - typingsSlinky.jose.joseStrings.EC
  - typingsSlinky.jose.joseStrings.OKP
  - typingsSlinky.jose.joseStrings.oct
*/
trait keyType extends js.Object

object keyType {
  @scala.inline
  def EC: typingsSlinky.jose.joseStrings.EC = "EC".asInstanceOf[typingsSlinky.jose.joseStrings.EC]
  @scala.inline
  def OKP: typingsSlinky.jose.joseStrings.OKP = "OKP".asInstanceOf[typingsSlinky.jose.joseStrings.OKP]
  @scala.inline
  def RSA: typingsSlinky.jose.joseStrings.RSA = "RSA".asInstanceOf[typingsSlinky.jose.joseStrings.RSA]
  @scala.inline
  def oct: typingsSlinky.jose.joseStrings.oct = "oct".asInstanceOf[typingsSlinky.jose.joseStrings.oct]
}

