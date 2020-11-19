package typingsSlinky.mobx.mod

import typingsSlinky.mobx.interceptReadMod.ReadInterceptor
import typingsSlinky.mobx.observablearrayMod.IObservableArray
import typingsSlinky.mobx.observablevalueMod.IObservableValue
import typingsSlinky.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx", "_interceptReads")
@js.native
object interceptReads extends js.Object {
  
  def apply(`object`: js.Object, property: String, handler: ReadInterceptor[_]): Lambda = js.native
  def apply[T](observableArray: IObservableArray[T], handler: ReadInterceptor[T]): Lambda = js.native
  def apply[V](observableSet: typingsSlinky.mobx.internalMod.ObservableSet[V], handler: ReadInterceptor[V]): Lambda = js.native
  def apply[T](value: IObservableValue[T], handler: ReadInterceptor[T]): Lambda = js.native
  def apply[K, V](observableMap: typingsSlinky.mobx.internalMod.ObservableMap[K, V], handler: ReadInterceptor[V]): Lambda = js.native
}
