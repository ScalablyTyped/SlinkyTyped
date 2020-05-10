package typingsSlinky.mysticateaSpy.mod.Spy_

import typingsSlinky.mysticateaSpy.mod.This
import typingsSlinky.mysticateaSpy.mysticateaSpyStrings.`throw`
import typingsSlinky.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information for each thrown call. */
@js.native
trait ThrownCall[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends Call[T] {
  var arguments: Parameters[T] = js.native
  var `this`: This[T] = js.native
  var `throw`: js.Any = js.native
  var `type`: `throw` = js.native
}

object ThrownCall {
  @scala.inline
  def apply[T](arguments: Parameters[T], `throw`: js.Any, `type`: `throw`): ThrownCall[T] = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("throw")(`throw`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrownCall[T]]
  }
  @scala.inline
  implicit class ThrownCallOps[Self[t] <: ThrownCall[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withArguments(value: Parameters[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThrow(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: `throw`): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThis(value: This[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("this")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThis: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("this")(js.undefined)
        ret
    }
  }
  
}

