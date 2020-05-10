package typingsSlinky.dva.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EffectsCommandMap
  extends /* key */ StringDictionary[js.Any] {
  var call: js.Function = js.native
  var cancel: js.Function = js.native
  var select: js.Function = js.native
  var take: js.Function = js.native
  def put[A /* <: AnyAction */](action: A): js.Any = js.native
}

object EffectsCommandMap {
  @scala.inline
  def apply(
    call: js.Function,
    cancel: js.Function,
    put: js.Any => js.Any,
    select: js.Function,
    take: js.Function
  ): EffectsCommandMap = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], put = js.Any.fromFunction1(put), select = select.asInstanceOf[js.Any], take = take.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectsCommandMap]
  }
  @scala.inline
  implicit class EffectsCommandMapOps[Self <: EffectsCommandMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCall(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancel(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPut(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelect(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTake(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("take")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

