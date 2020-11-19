package typingsSlinky.mobx.internalMod

import typingsSlinky.mobx.comparerMod.IEqualsComparer
import typingsSlinky.mobx.modifiersMod.IEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/internal", "ObservableValue")
@js.native
class ObservableValue[T] protected ()
  extends typingsSlinky.mobx.observablevalueMod.ObservableValue[T] {
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
}
