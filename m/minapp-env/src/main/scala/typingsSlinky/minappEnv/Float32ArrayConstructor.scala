package typingsSlinky.minappEnv

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Float32ArrayConstructor
  extends Instantiable1[
      (/* arrayOrArrayBuffer */ ArrayBufferLike) | (/* arrayOrArrayBuffer */ ArrayLike[Double]) | (/* length */ Double) | (/* elements */ Iterable[Double]), 
      Float32Array
    ]
     with Instantiable2[/* buffer */ ArrayBufferLike, /* byteOffset */ Double, Float32Array]
     with Instantiable3[
      /* buffer */ ArrayBufferLike, 
      /* byteOffset */ Double, 
      /* length */ Double, 
      Float32Array
    ] {
  
  /**
    * The size in bytes of each element in the array.
    */
  val BYTES_PER_ELEMENT: Double = js.native
  
  /**
    * Creates an array from an array-like or iterable object.
    * @param arrayLike An array-like or iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of 'this' used to invoke the mapfn.
    */
  def from(arrayLike: ArrayLike[Double]): Float32Array = js.native
  def from(arrayLike: ArrayLike[Double], mapfn: js.UndefOr[scala.Nothing], thisArg: js.Any): Float32Array = js.native
  def from(arrayLike: ArrayLike[Double], mapfn: js.Function2[/* v */ Double, /* k */ Double, Double]): Float32Array = js.native
  def from(
    arrayLike: ArrayLike[Double],
    mapfn: js.Function2[/* v */ Double, /* k */ Double, Double],
    thisArg: js.Any
  ): Float32Array = js.native
  /**
    * Creates an array from an array-like or iterable object.
    * @param arrayLike An array-like or iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of 'this' used to invoke the mapfn.
    */
  def from(arrayLike: Iterable[Double]): Float32Array = js.native
  def from(arrayLike: Iterable[Double], mapfn: js.UndefOr[scala.Nothing], thisArg: js.Any): Float32Array = js.native
  def from(arrayLike: Iterable[Double], mapfn: js.Function2[/* v */ Double, /* k */ Double, Double]): Float32Array = js.native
  def from(
    arrayLike: Iterable[Double],
    mapfn: js.Function2[/* v */ Double, /* k */ Double, Double],
    thisArg: js.Any
  ): Float32Array = js.native
  
  /**
    * Returns a new array from a set of elements.
    * @param items A set of elements to include in the new array object.
    */
  def of(items: Double*): Float32Array = js.native
}
