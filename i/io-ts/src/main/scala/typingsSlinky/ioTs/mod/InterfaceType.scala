package typingsSlinky.ioTs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "InterfaceType")
@js.native
class InterfaceType[P, A, O, I] protected ()
  extends Type_[A, O, I]
     with HasProps
     with Tagged[js.Any, A, O] {
  def this(name: String, is: Is[A], validate: Validate[I, A], encode: Encode[A, O], props: P) = this()
  val _tag: typingsSlinky.ioTs.ioTsStrings.InterfaceType = js.native
  val props: P = js.native
}

