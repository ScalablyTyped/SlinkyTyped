package typingsSlinky.jsrsasign.global.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.ECPointFp")
@js.native
class ECPointFp protected ()
  extends typingsSlinky.jsrsasign.jsrsasign.ECPointFp {
  def this(
    curve: typingsSlinky.jsrsasign.jsrsasign.ECFieldElementFp,
    x: typingsSlinky.jsrsasign.jsrsasign.ECFieldElementFp,
    y: typingsSlinky.jsrsasign.jsrsasign.ECFieldElementFp
  ) = this()
  def this(
    curve: typingsSlinky.jsrsasign.jsrsasign.ECFieldElementFp,
    x: typingsSlinky.jsrsasign.jsrsasign.ECFieldElementFp,
    y: typingsSlinky.jsrsasign.jsrsasign.ECFieldElementFp,
    z: typingsSlinky.jsrsasign.jsrsasign.BigInteger
  ) = this()
  /* CompleteClass */
  override var curve: typingsSlinky.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  /* CompleteClass */
  override var x: typingsSlinky.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  /* CompleteClass */
  override var y: typingsSlinky.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  /* CompleteClass */
  override var z: typingsSlinky.jsrsasign.jsrsasign.BigInteger = js.native
  /* CompleteClass */
  override var zinv: typingsSlinky.jsrsasign.jsrsasign.BigInteger | Null = js.native
}

