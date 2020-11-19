package typingsSlinky.mobx.observablearrayMod

import typingsSlinky.mobx.modifiersMod.IEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/types/observablearray", "createObservableArray")
@js.native
object createObservableArray extends js.Object {
  
  def apply[T](initialValues: js.UndefOr[scala.Nothing], enhancer: IEnhancer[T]): IObservableArray[T] = js.native
  def apply[T](
    initialValues: js.UndefOr[scala.Nothing],
    enhancer: IEnhancer[T],
    name: js.UndefOr[scala.Nothing],
    owned: Boolean
  ): IObservableArray[T] = js.native
  def apply[T](initialValues: js.UndefOr[scala.Nothing], enhancer: IEnhancer[T], name: String): IObservableArray[T] = js.native
  def apply[T](initialValues: js.UndefOr[scala.Nothing], enhancer: IEnhancer[T], name: String, owned: Boolean): IObservableArray[T] = js.native
  def apply[T](initialValues: js.Array[_], enhancer: IEnhancer[T]): IObservableArray[T] = js.native
  def apply[T](
    initialValues: js.Array[_],
    enhancer: IEnhancer[T],
    name: js.UndefOr[scala.Nothing],
    owned: Boolean
  ): IObservableArray[T] = js.native
  def apply[T](initialValues: js.Array[_], enhancer: IEnhancer[T], name: String): IObservableArray[T] = js.native
  def apply[T](initialValues: js.Array[_], enhancer: IEnhancer[T], name: String, owned: Boolean): IObservableArray[T] = js.native
}
