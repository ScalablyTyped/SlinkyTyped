package typingsSlinky.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ======================================================================
  * Rax Component Specs and Lifecycle
  * ======================================================================
  */
// This should actually be something like `Lifecycle<P, S> | DeprecatedLifecycle<P, S>`,
// as Rax will _not_ call the deprecated lifecycle methods if any of the new lifecycle
// methods are present.
@js.native
trait ComponentLifecycle[P, S, SS] extends StObject {
  
  /**
    * Catches exceptions generated in descendant components. Unhandled exceptions will cause
    * the entire component tree to unmount.
    */
  var componentDidCatch: js.UndefOr[js.Function2[/* error */ js.Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
  
  /**
    * Called immediately after a component is mounted. Setting state here will trigger re-rendering.
    */
  var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Called immediately after updating occurs. Not called for the initial render.
    *
    * The snapshot is only present if getSnapshotBeforeUpdate is present and returns non-null.
    */
  var componentDidUpdate: js.UndefOr[
    js.Function3[/* prevProps */ P, /* prevState */ S, /* snapshot */ js.UndefOr[SS], Unit]
  ] = js.native
  
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ P, /* nextContext */ js.Any, Unit]] = js.native
  
  /**
    * Called immediately before a component is destroyed. Perform any necessary cleanup in this method, such as
    * cancelled network requests, or cleaning up any DOM elements created in `componentDidMount`.
    */
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ P, /* nextState */ S, /* nextContext */ js.Any, Unit]
  ] = js.native
  
  /**
    * Runs before Rax applies the result of `render` to the document, and
    * returns an object to be given to componentDidUpdate. Useful for saving
    * things such as scroll position before `render` causes changes to it.
    *
    * Note: the presence of getSnapshotBeforeUpdate prevents any of the deprecated
    * lifecycle events from running.
    */
  var getSnapshotBeforeUpdate: js.UndefOr[js.Function2[/* prevProps */ P, /* prevState */ S, SS | Null]] = js.native
  
  /**
    * Called to determine whether the change in props and state should trigger a re-render.
    *
    * `Component` always returns true.
    * `PureComponent` implements a shallow comparison on props and state and returns true if any
    * props or states have changed.
    *
    * If false is returned, `Component#render`, `componentWillUpdate`
    * and `componentDidUpdate` will not be called.
    */
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[/* nextProps */ P, /* nextState */ S, /* nextContext */ js.Any, Boolean]
  ] = js.native
}
object ComponentLifecycle {
  
  @scala.inline
  def apply[P, S, SS](): ComponentLifecycle[P, S, SS] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentLifecycle[P, S, SS]]
  }
  
  @scala.inline
  implicit class ComponentLifecycleMutableBuilder[Self <: ComponentLifecycle[_, _, _], P, S, SS] (val x: Self with (ComponentLifecycle[P, S, SS])) extends AnyVal {
    
    @scala.inline
    def setComponentDidCatch(value: (/* error */ js.Error, /* errorInfo */ ErrorInfo) => Unit): Self = StObject.set(x, "componentDidCatch", js.Any.fromFunction2(value))
    
    @scala.inline
    def setComponentDidCatchUndefined: Self = StObject.set(x, "componentDidCatch", js.undefined)
    
    @scala.inline
    def setComponentDidMount(value: () => Unit): Self = StObject.set(x, "componentDidMount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComponentDidMountUndefined: Self = StObject.set(x, "componentDidMount", js.undefined)
    
    @scala.inline
    def setComponentDidUpdate(value: (/* prevProps */ P, /* prevState */ S, /* snapshot */ js.UndefOr[SS]) => Unit): Self = StObject.set(x, "componentDidUpdate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setComponentDidUpdateUndefined: Self = StObject.set(x, "componentDidUpdate", js.undefined)
    
    @scala.inline
    def setComponentWillMount(value: () => Unit): Self = StObject.set(x, "componentWillMount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComponentWillMountUndefined: Self = StObject.set(x, "componentWillMount", js.undefined)
    
    @scala.inline
    def setComponentWillReceiveProps(value: (/* nextProps */ P, /* nextContext */ js.Any) => Unit): Self = StObject.set(x, "componentWillReceiveProps", js.Any.fromFunction2(value))
    
    @scala.inline
    def setComponentWillReceivePropsUndefined: Self = StObject.set(x, "componentWillReceiveProps", js.undefined)
    
    @scala.inline
    def setComponentWillUnmount(value: () => Unit): Self = StObject.set(x, "componentWillUnmount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComponentWillUnmountUndefined: Self = StObject.set(x, "componentWillUnmount", js.undefined)
    
    @scala.inline
    def setComponentWillUpdate(value: (/* nextProps */ P, /* nextState */ S, /* nextContext */ js.Any) => Unit): Self = StObject.set(x, "componentWillUpdate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setComponentWillUpdateUndefined: Self = StObject.set(x, "componentWillUpdate", js.undefined)
    
    @scala.inline
    def setGetSnapshotBeforeUpdate(value: (/* prevProps */ P, /* prevState */ S) => SS | Null): Self = StObject.set(x, "getSnapshotBeforeUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetSnapshotBeforeUpdateUndefined: Self = StObject.set(x, "getSnapshotBeforeUpdate", js.undefined)
    
    @scala.inline
    def setShouldComponentUpdate(value: (/* nextProps */ P, /* nextState */ S, /* nextContext */ js.Any) => Boolean): Self = StObject.set(x, "shouldComponentUpdate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setShouldComponentUpdateUndefined: Self = StObject.set(x, "shouldComponentUpdate", js.undefined)
  }
}
