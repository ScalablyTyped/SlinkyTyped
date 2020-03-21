package typingsSlinky.ioTs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "StrictType")
@js.native
class StrictType[P, A, O, I] protected () extends Type_[A, O, I] {
  def this(name: String, is: Is[A], validate: Validate[I, A], encode: Encode[A, O], props: P) = this()
  val _tag: typingsSlinky.ioTs.ioTsStrings.StrictType = js.native
  val props: P = js.native
}

