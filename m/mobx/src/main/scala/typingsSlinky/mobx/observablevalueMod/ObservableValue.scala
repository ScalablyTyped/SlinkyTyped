package typingsSlinky.mobx.observablevalueMod

import typingsSlinky.mobx.comparerMod.IEqualsComparer
import typingsSlinky.mobx.interceptUtilsMod.IInterceptable
import typingsSlinky.mobx.interceptUtilsMod.IInterceptor
import typingsSlinky.mobx.internalMod.Atom
import typingsSlinky.mobx.listenUtilsMod.IListenable
import typingsSlinky.mobx.modifiersMod.IEnhancer
import typingsSlinky.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/types/observablevalue", "ObservableValue")
@js.native
class ObservableValue[T] protected ()
  extends Atom
     with IObservableValue[T]
     with IInterceptable[IValueWillChange[T]]
     with IListenable {
  def this(value: T, enhancer: IEnhancer[T]) = this()
  def this(value: T, enhancer: IEnhancer[T], name: String) = this()
  def this(value: T, enhancer: IEnhancer[T], name: js.UndefOr[scala.Nothing], notifySpy: Boolean) = this()
  def this(value: T, enhancer: IEnhancer[T], name: String, notifySpy: Boolean) = this()
  def this(
    value: T,
    enhancer: IEnhancer[T],
    name: js.UndefOr[scala.Nothing],
    notifySpy: js.UndefOr[scala.Nothing],
    equals: IEqualsComparer[_]
  ) = this()
  def this(
    value: T,
    enhancer: IEnhancer[T],
    name: js.UndefOr[scala.Nothing],
    notifySpy: Boolean,
    equals: IEqualsComparer[_]
  ) = this()
  def this(
    value: T,
    enhancer: IEnhancer[T],
    name: String,
    notifySpy: js.UndefOr[scala.Nothing],
    equals: IEqualsComparer[_]
  ) = this()
  def this(value: T, enhancer: IEnhancer[T], name: String, notifySpy: Boolean, equals: IEqualsComparer[_]) = this()
  
  var dehanceValue: js.Any = js.native
  
  var dehancer: js.Any = js.native
  
  def enhancer(newValue: T, oldValue: T, name: String): T = js.native
  def enhancer(newValue: T, oldValue: js.UndefOr[scala.Nothing], name: String): T = js.native
  @JSName("enhancer")
  var enhancer_Original: IEnhancer[T] = js.native
  
  @JSName("equals")
  var equals_FObservableValue: js.Any = js.native
  
  var hasUnreportedChange: Boolean = js.native
  
  /* InferMemberOverrides */
  override def intercept(handler: IInterceptor[IValueWillChange[T]]): Lambda = js.native
  
  var prepareNewValue: js.Any = js.native
  
  def setNewValue(newValue: T): Unit = js.native
  
  def toJSON(): T = js.native
  
  @JSName(js.Symbol.toPrimitive)
  var toPrimitive: js.Function0[T] = js.native
  
  var value: js.Any = js.native
}
