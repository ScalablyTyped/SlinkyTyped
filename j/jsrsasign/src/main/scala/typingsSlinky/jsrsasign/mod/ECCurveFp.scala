package typingsSlinky.jsrsasign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsrsasign", "ECCurveFp")
@js.native
class ECCurveFp protected ()
  extends typingsSlinky.jsrsasign.jsrsasign.ECCurveFp {
  def this(
    q: typingsSlinky.jsrsasign.jsrsasign.BigInteger,
    a: typingsSlinky.jsrsasign.jsrsasign.BigInteger,
    b: typingsSlinky.jsrsasign.jsrsasign.BigInteger
  ) = this()
  /* CompleteClass */
  override var a: typingsSlinky.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  /* CompleteClass */
  override var b: typingsSlinky.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  /* CompleteClass */
  override var infinity: typingsSlinky.jsrsasign.jsrsasign.ECPointFp = js.native
  /* CompleteClass */
  override var q: typingsSlinky.jsrsasign.jsrsasign.BigInteger = js.native
  /* CompleteClass */
  override def decodePointHex(): typingsSlinky.jsrsasign.jsrsasign.ECPointFp | Null = js.native
  /* CompleteClass */
  override def equals(): Boolean = js.native
  /* CompleteClass */
  override def fromBigInteger(): typingsSlinky.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  /* CompleteClass */
  override def getA(): typingsSlinky.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  /* CompleteClass */
  override def getB(): typingsSlinky.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  /* CompleteClass */
  override def getInfinity(): typingsSlinky.jsrsasign.jsrsasign.ECPointFp = js.native
  /* CompleteClass */
  override def getQ(): typingsSlinky.jsrsasign.jsrsasign.BigInteger = js.native
}

