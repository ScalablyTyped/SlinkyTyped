package typingsSlinky.ioTs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "LiteralType")
@js.native
class LiteralType[V /* <: LiteralValue */] protected ()
  extends Type_[V, V, js.Any] {
  def this(name: String, is: Is[V], validate: Validate[_, V], encode: Encode[V, V], value: V) = this()
  val _tag: typingsSlinky.ioTs.ioTsStrings.LiteralType = js.native
  val value: V = js.native
}

