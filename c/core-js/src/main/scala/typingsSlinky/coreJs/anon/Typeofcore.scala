package typingsSlinky.coreJs.anon

import typingsSlinky.coreJs.Dict
import typingsSlinky.coreJs.DictConstructor
import typingsSlinky.coreJs.SymbolConstructor
import typingsSlinky.coreJs.`for`
import typingsSlinky.coreJs.core.Locale
import typingsSlinky.std.MapConstructor
import typingsSlinky.std.PromiseConstructor
import typingsSlinky.std.SetConstructor
import typingsSlinky.std.WeakMapConstructor
import typingsSlinky.std.WeakSetConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcore extends js.Object {
  val Array: Concat = js.native
  val Date: Format = js.native
  @JSName("Dict")
  val Dict_Original: DictConstructor = js.native
  val Function: Bind = js.native
  val Map: MapConstructor = js.native
  val Math: Asinh = js.native
  val Number: Acosh = js.native
  val Object: Assign = js.native
  val Promise: PromiseConstructor = js.native
  val Reflect: TypeofReflect = js.native
  val RegExp: Escape = js.native
  val Set: SetConstructor = js.native
  val String: At = js.native
  val Symbol: SymbolConstructor = js.native
  val WeakMap: WeakMapConstructor = js.native
  val WeakSet: WeakSetConstructor = js.native
  @JSName("_")
  val _underscore: Boolean = js.native
  val global: js.Any = js.native
  val version: java.lang.String = js.native
  @JSName("$for")
  def $for[T](iterable: js.Iterable[T]): `for`[T] = js.native
  def Dict(): typingsSlinky.coreJs.Dict[_] = js.native
  def Dict(value: js.Any): typingsSlinky.coreJs.Dict[_] = js.native
  def Dict[T](value: typingsSlinky.coreJs.Dict[T]): typingsSlinky.coreJs.Dict[T] = js.native
  @JSName("Dict")
  def Dict_T[T](): Dict[T] = js.native
  def addLocale(lang: java.lang.String, locale: Locale): /* import warning: importer.ImportType#apply Failed type conversion: typeof core */ js.Any = js.native
  def clearImmediate(handle: Double): Unit = js.native
  def delay(msec: Double): js.Promise[Unit] = js.native
  def getIterator[T](iterable: js.Iterable[T]): js.Iterator[T] = js.native
  def isIterable(value: js.Any): Boolean = js.native
  def locale(): java.lang.String = js.native
  def locale(lang: java.lang.String): java.lang.String = js.native
  def setImmediate(expression: js.Any, args: js.Any*): Double = js.native
  def setInterval(handler: js.Any, timeout: js.UndefOr[scala.Nothing], args: js.Any*): Double = js.native
  def setInterval(handler: js.Any, timeout: js.Any, args: js.Any*): Double = js.native
  def setTimeout(handler: js.Any, timeout: js.UndefOr[scala.Nothing], args: js.Any*): Double = js.native
  def setTimeout(handler: js.Any, timeout: js.Any, args: js.Any*): Double = js.native
}

