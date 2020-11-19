package typingsSlinky.kindOf

import typingsSlinky.kindOf.kindOfStrings.`null`
import typingsSlinky.kindOf.kindOfStrings.array
import typingsSlinky.kindOf.kindOfStrings.arrayiterator
import typingsSlinky.kindOf.kindOfStrings.boolean
import typingsSlinky.kindOf.kindOfStrings.buffer
import typingsSlinky.kindOf.kindOfStrings.date
import typingsSlinky.kindOf.kindOfStrings.error
import typingsSlinky.kindOf.kindOfStrings.float32array
import typingsSlinky.kindOf.kindOfStrings.float64array
import typingsSlinky.kindOf.kindOfStrings.function
import typingsSlinky.kindOf.kindOfStrings.generator
import typingsSlinky.kindOf.kindOfStrings.generatorfunction
import typingsSlinky.kindOf.kindOfStrings.int16array
import typingsSlinky.kindOf.kindOfStrings.int32array
import typingsSlinky.kindOf.kindOfStrings.int8array
import typingsSlinky.kindOf.kindOfStrings.map
import typingsSlinky.kindOf.kindOfStrings.mapiterator
import typingsSlinky.kindOf.kindOfStrings.number
import typingsSlinky.kindOf.kindOfStrings.promise
import typingsSlinky.kindOf.kindOfStrings.regexp
import typingsSlinky.kindOf.kindOfStrings.set
import typingsSlinky.kindOf.kindOfStrings.setiterator
import typingsSlinky.kindOf.kindOfStrings.string
import typingsSlinky.kindOf.kindOfStrings.stringiterator
import typingsSlinky.kindOf.kindOfStrings.symbol
import typingsSlinky.kindOf.kindOfStrings.uint16array
import typingsSlinky.kindOf.kindOfStrings.uint32array
import typingsSlinky.kindOf.kindOfStrings.uint8array
import typingsSlinky.kindOf.kindOfStrings.uint8clampedarray
import typingsSlinky.kindOf.kindOfStrings.undefined
import typingsSlinky.kindOf.kindOfStrings.weakmap
import typingsSlinky.kindOf.kindOfStrings.weakset
import typingsSlinky.node.Buffer
import typingsSlinky.std.Map
import typingsSlinky.std.Set
import typingsSlinky.std.WeakMap
import typingsSlinky.std.WeakSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kind-of", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(thing: js.UndefOr[scala.Nothing]): undefined = js.native
  def apply(thing: String): string = js.native
  def apply(thing: js.Any): String = js.native
  def apply(thing: js.Array[_]): array = js.native
  def apply(thing: js.Function1[/* repeated */ js.Any, _]): function | generatorfunction = js.native
  def apply(thing: js.Promise[_]): promise = js.native
  def apply(thing: js.Symbol): symbol = js.native
  def apply(thing: Boolean): boolean = js.native
  def apply(thing: Double): number = js.native
  def apply(thing: Null): `null` = js.native
  def apply(thing: Buffer): buffer = js.native
  def apply(thing: js.Date): date = js.native
  def apply(thing: js.Error): error = js.native
  def apply(thing: js.typedarray.Float32Array): float32array = js.native
  def apply(thing: js.typedarray.Float64Array): float64array = js.native
  def apply(thing: js.typedarray.Int16Array): int16array = js.native
  def apply(thing: js.typedarray.Int32Array): int32array = js.native
  def apply(thing: js.typedarray.Int8Array): int8array = js.native
  def apply(thing: js.Iterator[_]): generator | stringiterator | arrayiterator | mapiterator | setiterator = js.native
  def apply(thing: Map[_, _]): map = js.native
  def apply(thing: js.RegExp): regexp = js.native
  def apply(thing: Set[_]): set = js.native
  def apply(thing: js.typedarray.Uint16Array): uint16array = js.native
  def apply(thing: js.typedarray.Uint32Array): uint32array = js.native
  def apply(thing: js.typedarray.Uint8Array): uint8array = js.native
  def apply(thing: js.typedarray.Uint8ClampedArray): uint8clampedarray = js.native
  def apply(thing: WeakMap[_, _]): weakmap = js.native
  def apply(thing: WeakSet[_]): weakset = js.native
}
