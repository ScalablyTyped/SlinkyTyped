package typingsSlinky.mobservable.coreMod

import typingsSlinky.mobservable.interfacesMod.IObservableValue
import typingsSlinky.mobservable.observablevalueMod.ObservableValue
import typingsSlinky.mobservable.observableviewMod.ObservableView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobservable/lib/core", "toGetterSetterFunction")
@js.native
object toGetterSetterFunction extends js.Object {
  
  def apply[T](observable: ObservableValue[T]): IObservableValue[T] = js.native
  def apply[T](observable: ObservableView[T]): IObservableValue[T] = js.native
}
