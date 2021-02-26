package typingsSlinky.reactAsync.anon

import slinky.core.facade.ReactElement
import typingsSlinky.reactAsync.mod.FulfilledProps
import typingsSlinky.reactAsync.mod.InitialProps
import typingsSlinky.reactAsync.mod.PendingProps
import typingsSlinky.reactAsync.mod.RejectedProps
import typingsSlinky.reactAsync.mod.SettledProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fulfilled extends StObject {
  
  def Fulfilled[T](props: FulfilledProps[T]): ReactElement = js.native
  
  def Initial[T](props: InitialProps[T]): ReactElement = js.native
  
  def Loading[T](props: PendingProps[T]): ReactElement = js.native
  
  def Pending[T](props: PendingProps[T]): ReactElement = js.native
  
  def Rejected[T](props: RejectedProps[T]): ReactElement = js.native
  
  def Resolved[T](props: FulfilledProps[T]): ReactElement = js.native
  
  def Settled[T](props: SettledProps[T]): ReactElement = js.native
}
object Fulfilled {
  
  @scala.inline
  def apply(
    Fulfilled: FulfilledProps[js.Any] => ReactElement,
    Initial: InitialProps[js.Any] => ReactElement,
    Loading: PendingProps[js.Any] => ReactElement,
    Pending: PendingProps[js.Any] => ReactElement,
    Rejected: RejectedProps[js.Any] => ReactElement,
    Resolved: FulfilledProps[js.Any] => ReactElement,
    Settled: SettledProps[js.Any] => ReactElement
  ): Fulfilled = {
    val __obj = js.Dynamic.literal(Fulfilled = js.Any.fromFunction1(Fulfilled), Initial = js.Any.fromFunction1(Initial), Loading = js.Any.fromFunction1(Loading), Pending = js.Any.fromFunction1(Pending), Rejected = js.Any.fromFunction1(Rejected), Resolved = js.Any.fromFunction1(Resolved), Settled = js.Any.fromFunction1(Settled))
    __obj.asInstanceOf[Fulfilled]
  }
  
  @scala.inline
  implicit class FulfilledMutableBuilder[Self <: Fulfilled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFulfilled(value: FulfilledProps[js.Any] => ReactElement): Self = StObject.set(x, "Fulfilled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitial(value: InitialProps[js.Any] => ReactElement): Self = StObject.set(x, "Initial", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoading(value: PendingProps[js.Any] => ReactElement): Self = StObject.set(x, "Loading", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPending(value: PendingProps[js.Any] => ReactElement): Self = StObject.set(x, "Pending", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRejected(value: RejectedProps[js.Any] => ReactElement): Self = StObject.set(x, "Rejected", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolved(value: FulfilledProps[js.Any] => ReactElement): Self = StObject.set(x, "Resolved", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSettled(value: SettledProps[js.Any] => ReactElement): Self = StObject.set(x, "Settled", js.Any.fromFunction1(value))
  }
}
