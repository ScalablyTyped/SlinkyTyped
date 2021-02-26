package typingsSlinky.promiseAllsettled

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.promiseAllsettled.typesMod.PromiseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object implementationMod {
  
  @JSImport("promise.allsettled/implementation", JSImport.Namespace)
  @js.native
  def apply(): js.Promise[js.Array[js.Any]] = js.native
  @JSImport("promise.allsettled/implementation", JSImport.Namespace)
  @js.native
  def apply[T](iterable: js.Iterable[js.Promise[T] | T]): js.Promise[js.Array[PromiseResult[T, _]]] = js.native
  @JSImport("promise.allsettled/implementation", JSImport.Namespace)
  @js.native
  def apply[T /* <: Array[js.Any] */](iterable: PromiseTuple[T]): js.Promise[PromiseResultTuple[T]] = js.native
  
  type PromiseResultTuple[T /* <: Array[js.Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: promise.allsettled.promise.allsettled/types.PromiseResult<T[P], unknown>}
    */ typingsSlinky.promiseAllsettled.promiseAllsettledStrings.PromiseResultTuple with TopLevel[T]
  
  type PromiseTuple[T /* <: Array[js.Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: std.Promise<T[P]> | T[P]}
    */ typingsSlinky.promiseAllsettled.promiseAllsettledStrings.PromiseTuple with TopLevel[js.Any]
}
