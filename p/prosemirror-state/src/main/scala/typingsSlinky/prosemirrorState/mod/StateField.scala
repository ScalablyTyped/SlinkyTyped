package typingsSlinky.prosemirrorState.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateField[T, S /* <: Schema[_, _] */] extends js.Object {
  /**
    * Deserialize the JSON representation of this field. Note that the
    * `state` argument is again a half-initialized state.
    */
  var fromJSON: js.UndefOr[
    (js.Function3[
      /* config */ StringDictionary[js.Any], 
      /* value */ js.Any, 
      /* state */ EditorState[S], 
      T
    ]) | Null
  ] = js.native
  /**
    * Convert this field to JSON. Optional, can be left off to disable
    * JSON serialization for the field.
    */
  var toJSON: js.UndefOr[(js.Function1[/* value */ T, _]) | Null] = js.native
  /**
    * Apply the given transaction to this state field, producing a new
    * field value. Note that the `newState` argument is again a partially
    * constructed state does not yet contain the state from plugins
    * coming after this one.
    */
  @JSName("apply")
  def apply(tr: Transaction[S], value: T, oldState: EditorState[S], newState: EditorState[S]): T = js.native
  /**
    * Initialize the value of the field. `config` will be the object
    * passed to [`EditorState.create`](#state.EditorState^create). Note
    * that `instance` is a half-initialized state instance, and will
    * not have values for plugin fields initialized after this one.
    */
  def init(config: StringDictionary[js.Any], instance: EditorState[S]): T = js.native
}

object StateField {
  @scala.inline
  def apply[T, S](
    apply: (Transaction[S], T, EditorState[S], EditorState[S]) => T,
    init: (StringDictionary[js.Any], EditorState[S]) => T
  ): StateField[T, S] = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction4(apply), init = js.Any.fromFunction2(init))
    __obj.asInstanceOf[StateField[T, S]]
  }
  @scala.inline
  implicit class StateFieldOps[Self[t, s] <: StateField[t, s], T, S] (val x: Self[T, S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, S]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, S]) with Other]
    @scala.inline
    def withApply(value: (Transaction[S], T, EditorState[S], EditorState[S]) => T): Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withInit(value: (StringDictionary[js.Any], EditorState[S]) => T): Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFromJSON(
      value: (/* config */ StringDictionary[js.Any], /* value */ js.Any, /* state */ EditorState[S]) => T
    ): Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromJSON")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFromJSON: Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromJSON")(js.undefined)
        ret
    }
    @scala.inline
    def withFromJSONNull: Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromJSON")(null)
        ret
    }
    @scala.inline
    def withToJSON(value: /* value */ T => _): Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToJSON: Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.undefined)
        ret
    }
    @scala.inline
    def withToJSONNull: Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(null)
        ret
    }
  }
  
}

