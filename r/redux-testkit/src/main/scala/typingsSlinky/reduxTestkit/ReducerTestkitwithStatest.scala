package typingsSlinky.reduxTestkit

import typingsSlinky.redux.mod.Action
import typingsSlinky.reduxTestkit.mod.ReducerTestkit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined redux-testkit.redux-testkit.ReducerTestkit & {withState (state : any): redux-testkit.redux-testkit.ReducerTestkit} */
@js.native
trait ReducerTestkitwithStatest extends js.Object {
  def execute(action: Action[_]): js.Any = js.native
  def expect(action: Action[_]): AnonToChangeInState = js.native
  def withState(state: js.Any): ReducerTestkit = js.native
}

object ReducerTestkitwithStatest {
  @scala.inline
  def apply(
    execute: Action[_] => js.Any,
    expect: Action[_] => AnonToChangeInState,
    withState: js.Any => ReducerTestkit
  ): ReducerTestkitwithStatest = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), expect = js.Any.fromFunction1(expect), withState = js.Any.fromFunction1(withState))
    __obj.asInstanceOf[ReducerTestkitwithStatest]
  }
  @scala.inline
  implicit class ReducerTestkitwithStatestOps[Self <: ReducerTestkitwithStatest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecute(value: Action[_] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExpect(value: Action[_] => AnonToChangeInState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithState(value: js.Any => ReducerTestkit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withState")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

