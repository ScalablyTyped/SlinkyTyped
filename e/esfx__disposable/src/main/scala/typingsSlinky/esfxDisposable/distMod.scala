package typingsSlinky.esfxDisposable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@esfx/disposable/dist", JSImport.Namespace)
@js.native
object distMod extends js.Object {
  
  @js.native
  trait AsyncDisposable extends js.Object
  @js.native
  object AsyncDisposable extends js.Object {
    
    /**
      * A well-known symbol used to define an async explicit resource disposal method on an object.
      */
    val asyncDispose: js.Symbol = js.native
    
    /**
      * Creates an `AsyncDisposable` wrapper around a callback used to dispose resources.
      */
    def create(dispose: js.Function0[Unit | js.Thenable[Unit]]): AsyncDisposable = js.native
    
    /**
      * Creates an `AsyncDisposable` wrapper around a set of other disposables.
      * @param resources An `Iterable` of `AsyncDisposable` or `Disposable` objects.
      */
    def from(resources: js.Iterable[js.UndefOr[AsyncDisposable | Disposable | Null]]): AsyncDisposable = js.native
    
    /**
      * Determines whether a value is [[AsyncDisposable]].
      */
    def hasInstance(value: js.Any): /* is @esfx/disposable.@esfx/disposable/dist.AsyncDisposable */ Boolean = js.native
    
    /**
      * Determines whether a value is [[AsyncDisposable]].
      * @deprecated Use `AsyncDisposable.hasInstance` instead.
      */
    def isAsyncDisposable(value: js.Any): /* is @esfx/disposable.@esfx/disposable/dist.AsyncDisposable */ Boolean = js.native
    
    val name: /* "AsyncDisposable" */ String = js.native
    
    def use[U](
      resource: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* resource */ js.UndefOr[scala.Nothing], U | js.Thenable[U]]
    ): js.Promise[U] = js.native
    def use[U](resource: Null, callback: js.Function1[/* resource */ Null, U | js.Thenable[U]]): js.Promise[U] = js.native
    /**
      * Executes a callback with the provided `AsyncDisposable` resource, disposing the resource when the callback completes asynchronously.
      */
    def use[U](
      resource: AsyncDisposable,
      callback: js.Function1[/* resource */ AsyncDisposable, U | js.Thenable[U]]
    ): js.Promise[U] = js.native
    def use[U](resource: Disposable, callback: js.Function1[/* resource */ Disposable, U | js.Thenable[U]]): js.Promise[U] = js.native
  }
  
  @js.native
  trait Disposable extends js.Object
  @js.native
  object Disposable extends js.Object {
    
    /**
      * Creates a `Disposable` wrapper around a callback used to dispose of a resource.
      */
    def create(dispose: js.Function0[Unit]): Disposable = js.native
    
    /**
      * A well-known symbol used to define an explicit resource disposal method on an object.
      */
    val dispose: js.Symbol = js.native
    
    /**
      * Creates a `Disposable` wrapper around a set of other disposables.
      * @param disposables An `Iterable` of `Disposable` objects.
      */
    def from(disposables: js.Iterable[js.UndefOr[Disposable | Null]]): Disposable = js.native
    
    /**
      * Determines whether a value is Disposable.
      */
    def hasInstance(value: js.Any): /* is @esfx/disposable.@esfx/disposable/dist.Disposable */ Boolean = js.native
    
    /**
      * Determines whether a value is Disposable.
      * @deprecated Use `Disposable.hasInstance` instead.
      */
    def isDisposable(value: js.Any): /* is @esfx/disposable.@esfx/disposable/dist.Disposable */ Boolean = js.native
    
    val name: /* "Disposable" */ String = js.native
    
    /**
      * Executes a callback with the provided `Disposable` resource, disposing the resource when the callback completes.
      */
    def use[T /* <: js.UndefOr[Disposable | Null] */, U](resource: T, callback: js.Function1[/* resource */ T, U]): U = js.native
  }
}
