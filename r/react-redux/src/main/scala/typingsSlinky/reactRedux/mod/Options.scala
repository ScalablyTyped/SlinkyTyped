package typingsSlinky.reactRedux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[State, TStateProps, TOwnProps, TMergedProps] extends ConnectOptions {
  /**
    * When pure, compares the result of mergeProps to its previous value.
    * @default shallowEqual
    */
  var areMergedPropsEqual: js.UndefOr[
    js.Function2[/* nextMergedProps */ TMergedProps, /* prevMergedProps */ TMergedProps, Boolean]
  ] = js.native
  /**
    * When pure, compares incoming props to its previous value.
    * @default shallowEqual
    */
  var areOwnPropsEqual: js.UndefOr[
    js.Function2[/* nextOwnProps */ TOwnProps, /* prevOwnProps */ TOwnProps, Boolean]
  ] = js.native
  /**
    * When pure, compares the result of mapStateToProps to its previous value.
    * @default shallowEqual
    */
  var areStatePropsEqual: js.UndefOr[
    js.Function2[/* nextStateProps */ TStateProps, /* prevStateProps */ TStateProps, Boolean]
  ] = js.native
  /**
    * When pure, compares incoming store state to its previous value.
    * @default strictEqual
    */
  var areStatesEqual: js.UndefOr[js.Function2[/* nextState */ State, /* prevState */ State, Boolean]] = js.native
  /**
    * If true, use React's forwardRef to expose a ref of the wrapped component
    *
    * @default false
    */
  var forwardRef: js.UndefOr[Boolean] = js.native
  /**
    * If true, implements shouldComponentUpdate and shallowly compares the result of mergeProps,
    * preventing unnecessary updates, assuming that the component is a “pure” component
    * and does not rely on any input or state other than its props and the selected Redux store’s state.
    * Defaults to true.
    * @default true
    */
  var pure: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply[State, TStateProps, TOwnProps, TMergedProps](): Options[State, TStateProps, TOwnProps, TMergedProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[State, TStateProps, TOwnProps, TMergedProps]]
  }
  @scala.inline
  implicit class OptionsOps[Self[state, tstateprops, townprops, tmergedprops] <: Options[state, tstateprops, townprops, tmergedprops], State, TStateProps, TOwnProps, TMergedProps] (val x: Self[State, TStateProps, TOwnProps, TMergedProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self[State, TStateProps, TOwnProps, TMergedProps] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[State, TStateProps, TOwnProps, TMergedProps]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[State, TStateProps, TOwnProps, TMergedProps]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[State, TStateProps, TOwnProps, TMergedProps]) with Other]
    @scala.inline
    def withAreMergedPropsEqual(value: (/* nextMergedProps */ TMergedProps, /* prevMergedProps */ TMergedProps) => Boolean): Self[State, TStateProps, TOwnProps, TMergedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areMergedPropsEqual")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAreMergedPropsEqual: Self[State, TStateProps, TOwnProps, TMergedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areMergedPropsEqual")(js.undefined)
        ret
    }
    @scala.inline
    def withAreOwnPropsEqual(value: (/* nextOwnProps */ TOwnProps, /* prevOwnProps */ TOwnProps) => Boolean): Self[State, TStateProps, TOwnProps, TMergedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areOwnPropsEqual")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAreOwnPropsEqual: Self[State, TStateProps, TOwnProps, TMergedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areOwnPropsEqual")(js.undefined)
        ret
    }
    @scala.inline
    def withAreStatePropsEqual(value: (/* nextStateProps */ TStateProps, /* prevStateProps */ TStateProps) => Boolean): Self[State, TStateProps, TOwnProps, TMergedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areStatePropsEqual")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAreStatePropsEqual: Self[State, TStateProps, TOwnProps, TMergedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areStatePropsEqual")(js.undefined)
        ret
    }
    @scala.inline
    def withAreStatesEqual(value: (/* nextState */ State, /* prevState */ State) => Boolean): Self[State, TStateProps, TOwnProps, TMergedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areStatesEqual")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAreStatesEqual: Self[State, TStateProps, TOwnProps, TMergedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areStatesEqual")(js.undefined)
        ret
    }
    @scala.inline
    def withForwardRef(value: Boolean): Self[State, TStateProps, TOwnProps, TMergedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardRef: Self[State, TStateProps, TOwnProps, TMergedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardRef")(js.undefined)
        ret
    }
    @scala.inline
    def withPure(value: Boolean): Self[State, TStateProps, TOwnProps, TMergedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPure: Self[State, TStateProps, TOwnProps, TMergedProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pure")(js.undefined)
        ret
    }
  }
  
}

