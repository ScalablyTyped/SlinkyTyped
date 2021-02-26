package typingsSlinky.mobx

import typingsSlinky.mobx.internalMod.ObservableMap
import typingsSlinky.mobx.internalMod.ObservableSet
import typingsSlinky.mobx.observablearrayMod.IObservableArray
import typingsSlinky.mobx.observablevalueMod.IObservableValue
import typingsSlinky.mobx.utilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interceptReadMod {
  
  @JSImport("mobx/lib/api/intercept-read", "interceptReads")
  @js.native
  def interceptReads(`object`: js.Object, property: String, handler: ReadInterceptor[_]): Lambda = js.native
  @JSImport("mobx/lib/api/intercept-read", "interceptReads")
  @js.native
  def interceptReads[T](observableArray: IObservableArray[T], handler: ReadInterceptor[T]): Lambda = js.native
  @JSImport("mobx/lib/api/intercept-read", "interceptReads")
  @js.native
  def interceptReads[V](observableSet: ObservableSet[V], handler: ReadInterceptor[V]): Lambda = js.native
  @JSImport("mobx/lib/api/intercept-read", "interceptReads")
  @js.native
  def interceptReads[T](value: IObservableValue[T], handler: ReadInterceptor[T]): Lambda = js.native
  @JSImport("mobx/lib/api/intercept-read", "interceptReads")
  @js.native
  def interceptReads[K, V](observableMap: ObservableMap[K, V], handler: ReadInterceptor[V]): Lambda = js.native
  
  type ReadInterceptor[T] = js.Function1[/* value */ js.Any, T]
}
