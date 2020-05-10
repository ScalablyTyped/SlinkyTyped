package typingsSlinky.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ======================================================================
  * Rax Component Specs and Lifecycle
  * ======================================================================
  */
// This should actually be something like `Lifecycle<P, S> | DeprecatedLifecycle<P, S>`,
// as Rax will _not_ call the deprecated lifecycle methods if any of the new lifecycle
// methods are present.
@js.native
trait ComponentLifecycle[P, S, SS] extends js.Object {
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
  implicit class ComponentLifecycleOps[Self[p, s, ss] <: ComponentLifecycle[p, s, ss], P, S, SS] (val x: Self[P, S, SS]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P, S, SS] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P, S, SS]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[P, S, SS]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[P, S, SS]) with Other]
    @scala.inline
    def withComponentDidCatch(value: (/* error */ js.Error, /* errorInfo */ ErrorInfo) => Unit): Self[P, S, SS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentDidCatch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutComponentDidCatch: Self[P, S, SS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentDidCatch")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentDidMount(value: () => Unit): Self[P, S, SS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentDidMount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComponentDidMount: Self[P, S, SS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentDidMount")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentDidUpdate(value: (/* prevProps */ P, /* prevState */ S, /* snapshot */ js.UndefOr[SS]) => Unit): Self[P, S, SS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentDidUpdate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutComponentDidUpdate: Self[P, S, SS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentDidUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentWillMount(value: () => Unit): Self[P, S, SS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWillMount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComponentWillMount: Self[P, S, SS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWillMount")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentWillReceiveProps(value: (/* nextProps */ P, /* nextContext */ js.Any) => Unit): Self[P, S, SS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWillReceiveProps")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutComponentWillReceiveProps: Self[P, S, SS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWillReceiveProps")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentWillUnmount(value: () => Unit): Self[P, S, SS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWillUnmount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComponentWillUnmount: Self[P, S, SS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWillUnmount")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentWillUpdate(value: (/* nextProps */ P, /* nextState */ S, /* nextContext */ js.Any) => Unit): Self[P, S, SS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWillUpdate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutComponentWillUpdate: Self[P, S, SS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWillUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSnapshotBeforeUpdate(value: (/* prevProps */ P, /* prevState */ S) => SS | Null): Self[P, S, SS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSnapshotBeforeUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetSnapshotBeforeUpdate: Self[P, S, SS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSnapshotBeforeUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldComponentUpdate(value: (/* nextProps */ P, /* nextState */ S, /* nextContext */ js.Any) => Boolean): Self[P, S, SS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldComponentUpdate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutShouldComponentUpdate: Self[P, S, SS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldComponentUpdate")(js.undefined)
        ret
    }
  }
  
}

