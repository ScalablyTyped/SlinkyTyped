package typingsSlinky.kdbush.mod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.std.ArrayConstructor
import typingsSlinky.std.Float32ArrayConstructor
import typingsSlinky.std.Float64ArrayConstructor
import typingsSlinky.std.Int16ArrayConstructor
import typingsSlinky.std.Int32ArrayConstructor
import typingsSlinky.std.Int8ArrayConstructor
import typingsSlinky.std.global.Array
import typingsSlinky.std.global.Float32Array
import typingsSlinky.std.global.Float64Array
import typingsSlinky.std.global.Int16Array
import typingsSlinky.std.global.Int32Array
import typingsSlinky.std.global.Int8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Int8ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[
/ * elements * / typingsSlinky.std.Iterable[scala.Double], 
typingsSlinky.std.global.Int8Array])
  - typingsSlinky.std.Int16ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[
/ * elements * / typingsSlinky.std.Iterable[scala.Double], 
typingsSlinky.std.global.Int16Array])
  - typingsSlinky.std.Int32ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[
/ * elements * / typingsSlinky.std.Iterable[scala.Double], 
typingsSlinky.std.global.Int32Array])
  - typingsSlinky.std.Float32ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[
/ * elements * / typingsSlinky.std.Iterable[scala.Double], 
typingsSlinky.std.global.Float32Array])
  - typingsSlinky.std.Float64ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[
/ * elements * / typingsSlinky.std.Iterable[scala.Double], 
typingsSlinky.std.global.Float64Array])
  - typingsSlinky.std.ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[/ * arrayLength * / scala.Double, typingsSlinky.std.global.Array[js.Object]])
*/
trait ArrayType extends js.Object

object ArrayType {
  @scala.inline
  implicit def apply(value: ArrayConstructor with (Instantiable1[/* arrayLength */ Double, Array[js.Object]])): ArrayType = value.asInstanceOf[ArrayType]
  @scala.inline
  implicit def apply(
    value: Float64ArrayConstructor with (Instantiable1[/* elements */ js.Iterable[Double], Float64Array])
  ): ArrayType = value.asInstanceOf[ArrayType]
  @scala.inline
  implicit def apply(value: Int8ArrayConstructor with (Instantiable1[/* elements */ js.Iterable[Double], Int8Array])): ArrayType = value.asInstanceOf[ArrayType]
  @scala.inline
  implicit def apply(value: Int16ArrayConstructor with (Instantiable1[/* elements */ js.Iterable[Double], Int16Array])): ArrayType = value.asInstanceOf[ArrayType]
  @scala.inline
  implicit def apply(value: Int32ArrayConstructor with (Instantiable1[/* elements */ js.Iterable[Double], Int32Array])): ArrayType = value.asInstanceOf[ArrayType]
  @scala.inline
  implicit def apply(
    value: Float32ArrayConstructor with (Instantiable1[/* elements */ js.Iterable[Double], Float32Array])
  ): ArrayType = value.asInstanceOf[ArrayType]
}

