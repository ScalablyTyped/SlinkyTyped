package typingsSlinky.mobservable.coreMod

import typingsSlinky.mobservable.interfacesMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobservable/lib/core", "autorunAsync")
@js.native
object autorunAsync extends js.Object {
  
  def apply(func: Lambda): Lambda = js.native
  def apply(func: Lambda, delay: js.UndefOr[scala.Nothing], scope: js.Any): Lambda = js.native
  def apply(func: Lambda, delay: Double): Lambda = js.native
  def apply(func: Lambda, delay: Double, scope: js.Any): Lambda = js.native
  def apply[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit]): Lambda = js.native
  def apply[T](
    view: js.Function0[T],
    effect: js.Function1[/* latestValue */ T, Unit],
    delay: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): Lambda = js.native
  def apply[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit], delay: Double): Lambda = js.native
  def apply[T](
    view: js.Function0[T],
    effect: js.Function1[/* latestValue */ T, Unit],
    delay: Double,
    scope: js.Any
  ): Lambda = js.native
}
