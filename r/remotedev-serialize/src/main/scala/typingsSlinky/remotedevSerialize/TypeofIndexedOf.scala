package typingsSlinky.remotedevSerialize

import typingsSlinky.immutable.Immutable.Seq.Indexed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofIndexedOf extends js.Object {
  def apply(): Indexed[_] = js.native
  def apply[T](collection: js.Iterable[T]): Indexed[T] = js.native
  /**
    * Provides an Seq.Indexed of the values provided.
    */
  def of[T](values: T*): Indexed[T] = js.native
}

