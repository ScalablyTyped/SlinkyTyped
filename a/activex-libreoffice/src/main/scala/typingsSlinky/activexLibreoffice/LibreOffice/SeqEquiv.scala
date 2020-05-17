package typingsSlinky.activexLibreoffice.LibreOffice

import typingsSlinky.activexLibreoffice.sequence
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.SafeArray[T]
  - typingsSlinky.activexLibreoffice.sequence[T]
  - js.Array[T]
*/
trait SeqEquiv[T] extends js.Object

object SeqEquiv {
  @scala.inline
  implicit def apply[T](value: js.Array[T]): SeqEquiv[T] = value.asInstanceOf[SeqEquiv[T]]
  @scala.inline
  implicit def apply[T](value: SafeArray[T]): SeqEquiv[T] = value.asInstanceOf[SeqEquiv[T]]
  @scala.inline
  implicit def apply[T](value: sequence[T]): SeqEquiv[T] = value.asInstanceOf[SeqEquiv[T]]
}

