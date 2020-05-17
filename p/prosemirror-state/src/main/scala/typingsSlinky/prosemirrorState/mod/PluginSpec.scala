package typingsSlinky.prosemirrorState.mod

import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorState.anon.Destroy
import typingsSlinky.prosemirrorView.mod.EditorProps
import typingsSlinky.prosemirrorView.mod.EditorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginSpec[T, S /* <: Schema[_, _] */] extends js.Object {
  /**
    * Allows the plugin to append another transaction to be applied
    * after the given array of transactions. When another plugin
    * appends a transaction after this was called, it is called again
    * with the new state and new transactions—but only the new
    * transactions, i.e. it won't be passed transactions that it
    * already saw.
    */
  var appendTransaction: js.UndefOr[
    (js.Function3[
      /* transactions */ js.Array[Transaction[S]], 
      /* oldState */ EditorState[S], 
      /* newState */ EditorState[S], 
      js.UndefOr[Transaction[S] | Null | Unit]
    ]) | Null
  ] = js.native
  /**
    * When present, this will be called before a transaction is
    * applied by the state, allowing the plugin to cancel it (by
    * returning false).
    */
  var filterTransaction: js.UndefOr[(js.Function2[/* p1 */ Transaction[S], /* p2 */ EditorState[S], Boolean]) | Null] = js.native
  /**
    * Can be used to make this a keyed plugin. You can have only one
    * plugin with a given key in a given state, but it is possible to
    * access the plugin's configuration and state through the key,
    * without having access to the plugin instance object.
    */
  var key: js.UndefOr[(PluginKey[T, S]) | Null] = js.native
  /**
    * The [view props](#view.EditorProps) added by this plugin. Props
    * that are functions will be bound to have the plugin instance as
    * their `this` binding.
    */
  var props: js.UndefOr[EditorProps[S] | Null] = js.native
  /**
    * Allows a plugin to define a [state field](#state.StateField), an
    * extra slot in the state object in which it can keep its own data.
    */
  var state: js.UndefOr[(StateField[T, S]) | Null] = js.native
  /**
    * When the plugin needs to interact with the editor view, or
    * set something up in the DOM, use this field. The function
    * will be called when the plugin's state is associated with an
    * editor view.
    */
  var view: js.UndefOr[(js.Function1[/* p */ EditorView[S], Destroy[S]]) | Null] = js.native
}

object PluginSpec {
  @scala.inline
  def apply[T, S](): PluginSpec[T, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginSpec[T, S]]
  }
  @scala.inline
  implicit class PluginSpecOps[Self[t, s] <: PluginSpec[t, s], T, S] (val x: Self[T, S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, S]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, S]) with Other]
    @scala.inline
    def withAppendTransaction(
      value: (/* transactions */ js.Array[Transaction[S]], /* oldState */ EditorState[S], /* newState */ EditorState[S]) => js.UndefOr[Transaction[S] | Null | Unit]
    ): Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTransaction")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAppendTransaction: Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTransaction")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendTransactionNull: Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTransaction")(null)
        ret
    }
    @scala.inline
    def withFilterTransaction(value: (/* p1 */ Transaction[S], /* p2 */ EditorState[S]) => Boolean): Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTransaction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterTransaction: Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTransaction")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterTransactionNull: Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTransaction")(null)
        ret
    }
    @scala.inline
    def withKey(value: PluginKey[T, S]): Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyNull: Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(null)
        ret
    }
    @scala.inline
    def withProps(value: EditorProps[S]): Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProps: Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(js.undefined)
        ret
    }
    @scala.inline
    def withPropsNull: Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(null)
        ret
    }
    @scala.inline
    def withState(value: StateField[T, S]): Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withStateNull: Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(null)
        ret
    }
    @scala.inline
    def withView(value: /* p */ EditorView[S] => Destroy[S]): Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutView: Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
    @scala.inline
    def withViewNull: Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(null)
        ret
    }
  }
  
}

