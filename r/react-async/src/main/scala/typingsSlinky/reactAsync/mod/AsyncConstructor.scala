package typingsSlinky.reactAsync.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.GetDerivedStateFromError
import typingsSlinky.react.mod.GetDerivedStateFromProps
import typingsSlinky.react.mod.ValidationMap
import typingsSlinky.react.mod.WeakValidationMap
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ComponentClass<react-async.react-async.AsyncProps<T>, react.react.ComponentState> & {  Initial :react.react.FC<react-async.react-async.InitialProps<T>>,   Pending :react.react.FC<react-async.react-async.PendingProps<T>>,   Loading :react.react.FC<react-async.react-async.PendingProps<T>>,   Fulfilled :react.react.FC<react-async.react-async.FulfilledProps<T>>,   Resolved :react.react.FC<react-async.react-async.FulfilledProps<T>>,   Rejected :react.react.FC<react-async.react-async.RejectedProps<T>>,   Settled :react.react.FC<react-async.react-async.SettledProps<T>>} */
@js.native
trait AsyncConstructor[T]
  extends Instantiable1[/* props */ AsyncProps[T], ReactComponentClass[AsyncProps[T]]]
     with Instantiable2[/* props */ AsyncProps[T], /* context */ js.Any, ReactComponentClass[AsyncProps[T]]] {
  var Fulfilled: ReactComponentClass[FulfilledProps[T]] = js.native
  var Initial: ReactComponentClass[InitialProps[T]] = js.native
  var Loading: ReactComponentClass[PendingProps[T]] = js.native
  var Pending: ReactComponentClass[PendingProps[T]] = js.native
  var Rejected: ReactComponentClass[RejectedProps[T]] = js.native
  var Resolved: ReactComponentClass[FulfilledProps[T]] = js.native
  var Settled: ReactComponentClass[SettledProps[T]] = js.native
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var contextType: js.UndefOr[Context[_]] = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[Partial[AsyncProps[T]]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[AsyncProps[T], js.Object]] = js.native
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[AsyncProps[T], js.Object]] = js.native
  var propTypes: js.UndefOr[WeakValidationMap[AsyncProps[T]]] = js.native
}

