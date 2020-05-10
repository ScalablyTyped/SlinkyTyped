package typingsSlinky.recompose.mod

import typingsSlinky.react.mod.ErrorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// lifecycle: https://github.com/acdlite/recompose/blob/master/docs/API.md#lifecycle
@js.native
trait ReactLifeCycleFunctions[TProps, TState, TInstance] extends js.Object {
  var UNSAFE_componentWillMount: js.UndefOr[
    js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
  ] = js.native
  var UNSAFE_componentWillReceiveProps: js.UndefOr[
    js.ThisFunction1[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* nextProps */ TProps, 
      Unit
    ]
  ] = js.native
  var UNSAFE_componentWillUpdate: js.UndefOr[
    js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* nextProps */ TProps, 
      /* nextState */ TState, 
      Unit
    ]
  ] = js.native
  var componentDidCatch: js.UndefOr[
    js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* error */ js.Error, 
      /* info */ ErrorInfo, 
      Unit
    ]
  ] = js.native
  var componentDidMount: js.UndefOr[
    js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
  ] = js.native
  var componentDidUpdate: js.UndefOr[
    js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* prevProps */ TProps, 
      /* prevState */ TState, 
      Unit
    ]
  ] = js.native
  var componentWillMount: js.UndefOr[
    js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
  ] = js.native
  var componentWillReceiveProps: js.UndefOr[
    js.ThisFunction1[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* nextProps */ TProps, 
      Unit
    ]
  ] = js.native
  var componentWillUnmount: js.UndefOr[
    js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
  ] = js.native
  var componentWillUpdate: js.UndefOr[
    js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* nextProps */ TProps, 
      /* nextState */ TState, 
      Unit
    ]
  ] = js.native
  var shouldComponentUpdate: js.UndefOr[
    js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* nextProps */ TProps, 
      /* nextState */ TState, 
      Boolean
    ]
  ] = js.native
}

object ReactLifeCycleFunctions {
  @scala.inline
  def apply[TProps, TState, TInstance](): ReactLifeCycleFunctions[TProps, TState, TInstance] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactLifeCycleFunctions[TProps, TState, TInstance]]
  }
  @scala.inline
  implicit class ReactLifeCycleFunctionsOps[Self[tprops, tstate, tinstance] <: ReactLifeCycleFunctions[tprops, tstate, tinstance], TProps, TState, TInstance] (val x: Self[TProps, TState, TInstance]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TProps, TState, TInstance] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TProps, TState, TInstance]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TProps, TState, TInstance]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TProps, TState, TInstance]) with Other]
    @scala.inline
    def withUNSAFE_componentWillMount(
      value: js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
    ): Self[TProps, TState, TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNSAFE_componentWillMount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUNSAFE_componentWillMount: Self[TProps, TState, TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNSAFE_componentWillMount")(js.undefined)
        ret
    }
    @scala.inline
    def withUNSAFE_componentWillReceiveProps(
      value: js.ThisFunction1[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* nextProps */ TProps, 
          Unit
        ]
    ): Self[TProps, TState, TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNSAFE_componentWillReceiveProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUNSAFE_componentWillReceiveProps: Self[TProps, TState, TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNSAFE_componentWillReceiveProps")(js.undefined)
        ret
    }
    @scala.inline
    def withUNSAFE_componentWillUpdate(
      value: js.ThisFunction2[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* nextProps */ TProps, 
          /* nextState */ TState, 
          Unit
        ]
    ): Self[TProps, TState, TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNSAFE_componentWillUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUNSAFE_componentWillUpdate: Self[TProps, TState, TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNSAFE_componentWillUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentDidCatch(
      value: js.ThisFunction2[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* error */ js.Error, 
          /* info */ ErrorInfo, 
          Unit
        ]
    ): Self[TProps, TState, TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentDidCatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentDidCatch: Self[TProps, TState, TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentDidCatch")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentDidMount(
      value: js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
    ): Self[TProps, TState, TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentDidMount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentDidMount: Self[TProps, TState, TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentDidMount")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentDidUpdate(
      value: js.ThisFunction2[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* prevProps */ TProps, 
          /* prevState */ TState, 
          Unit
        ]
    ): Self[TProps, TState, TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentDidUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentDidUpdate: Self[TProps, TState, TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentDidUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentWillMount(
      value: js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
    ): Self[TProps, TState, TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWillMount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentWillMount: Self[TProps, TState, TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWillMount")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentWillReceiveProps(
      value: js.ThisFunction1[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* nextProps */ TProps, 
          Unit
        ]
    ): Self[TProps, TState, TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWillReceiveProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentWillReceiveProps: Self[TProps, TState, TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWillReceiveProps")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentWillUnmount(
      value: js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
    ): Self[TProps, TState, TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWillUnmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentWillUnmount: Self[TProps, TState, TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWillUnmount")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentWillUpdate(
      value: js.ThisFunction2[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* nextProps */ TProps, 
          /* nextState */ TState, 
          Unit
        ]
    ): Self[TProps, TState, TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWillUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentWillUpdate: Self[TProps, TState, TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWillUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldComponentUpdate(
      value: js.ThisFunction2[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* nextProps */ TProps, 
          /* nextState */ TState, 
          Boolean
        ]
    ): Self[TProps, TState, TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldComponentUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldComponentUpdate: Self[TProps, TState, TInstance] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldComponentUpdate")(js.undefined)
        ret
    }
  }
  
}

