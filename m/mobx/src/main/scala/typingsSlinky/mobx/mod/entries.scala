package typingsSlinky.mobx.mod

import typingsSlinky.mobx.observablearrayMod.IObservableArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx", "entries")
@js.native
object entries extends js.Object {
  
  def apply[T](ar: IObservableArray[T]): js.Array[js.Tuple2[Double, T]] = js.native
  def apply[T](obj: T): js.Array[
    js.Tuple2[
      String, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def apply[T](set: typingsSlinky.mobx.internalMod.ObservableSet[T]): js.Array[js.Tuple2[T, T]] = js.native
  def apply[K, T](map: typingsSlinky.mobx.internalMod.ObservableMap[K, T]): js.Array[js.Tuple2[K, T]] = js.native
}
