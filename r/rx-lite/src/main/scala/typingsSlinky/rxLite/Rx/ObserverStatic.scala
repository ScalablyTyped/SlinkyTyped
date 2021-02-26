package typingsSlinky.rxLite.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObserverStatic extends StObject {
  
  def create[T](): Observer[T] = js.native
  def create[T](
    onNext: js.UndefOr[scala.Nothing],
    onError: js.UndefOr[scala.Nothing],
    onCompleted: js.Function0[Unit]
  ): Observer[T] = js.native
  def create[T](onNext: js.UndefOr[scala.Nothing], onError: js.Function1[/* exception */ js.Any, Unit]): Observer[T] = js.native
  def create[T](
    onNext: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* exception */ js.Any, Unit],
    onCompleted: js.Function0[Unit]
  ): Observer[T] = js.native
  def create[T](onNext: js.Function1[/* value */ T, Unit]): Observer[T] = js.native
  def create[T](
    onNext: js.Function1[/* value */ T, Unit],
    onError: js.UndefOr[scala.Nothing],
    onCompleted: js.Function0[Unit]
  ): Observer[T] = js.native
  def create[T](onNext: js.Function1[/* value */ T, Unit], onError: js.Function1[/* exception */ js.Any, Unit]): Observer[T] = js.native
  def create[T](
    onNext: js.Function1[/* value */ T, Unit],
    onError: js.Function1[/* exception */ js.Any, Unit],
    onCompleted: js.Function0[Unit]
  ): Observer[T] = js.native
  
  def fromNotifier[T](handler: js.Function2[/* notification */ Notification[T], /* thisArg */ js.UndefOr[js.Any], Unit]): Observer[T] = js.native
}
