package typingsSlinky.promiseAllsettled.mod

import typingsSlinky.promiseAllsettled.anon.FnCall
import typingsSlinky.promiseAllsettled.implementationMod.PromiseTuple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {None (): std.Promise<[]>, None <T extends [unknown, ...std.Array<unknown>]>(iterable : promise.allsettled.promise.allsettled/implementation.PromiseTuple<T>): std.Promise<promise.allsettled.promise.allsettled/implementation.PromiseResultTuple<T>>, None <T>(iterable : std.Iterable<std.Promise<T> | T>): std.Promise<std.Array<promise.allsettled.promise.allsettled/types.PromiseResult<T, unknown>>>} & {  getPolyfill :(): typeof implementation,   implementation :{None (): std.Promise<[]>, None <T extends [unknown, ...std.Array<unknown>]>(iterable : promise.allsettled.promise.allsettled/implementation.PromiseTuple<T>): std.Promise<promise.allsettled.promise.allsettled/implementation.PromiseResultTuple<T>>, None <T>(iterable : std.Iterable<std.Promise<T> | T>): std.Promise<std.Array<promise.allsettled.promise.allsettled/types.PromiseResult<T, unknown>>>},   shim :(): typeof implementation} */
@js.native
trait ExportedImplementationType extends js.Object {
  
  def apply(): js.Promise[js.Array[js.Any]] = js.native
  def apply[T /* <: Array[js.Any] */](iterable: PromiseTuple[T]): js.Promise[typingsSlinky.promiseAllsettled.implementationMod.PromiseResultTuple[T]] = js.native
  def apply[T](iterable: js.Iterable[js.Promise[T] | T]): js.Promise[js.Array[typingsSlinky.promiseAllsettled.typesMod.PromiseResult[T, _]]] = js.native
  
  def getPolyfill(): /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any = js.native
  @JSName("getPolyfill")
  var getPolyfill_Original: js.Function0[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any
  ] = js.native
  
  def implementation(): js.Promise[js.Array[js.Any]] = js.native
  def implementation[T /* <: Array[js.Any] */](iterable: PromiseTuple[T]): js.Promise[typingsSlinky.promiseAllsettled.implementationMod.PromiseResultTuple[T]] = js.native
  def implementation[T](iterable: js.Iterable[js.Promise[T] | T]): js.Promise[js.Array[typingsSlinky.promiseAllsettled.typesMod.PromiseResult[T, _]]] = js.native
  @JSName("implementation")
  var implementation_Original: FnCall = js.native
  
  def shim(): /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any = js.native
  @JSName("shim")
  var shim_Original: js.Function0[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any
  ] = js.native
}
