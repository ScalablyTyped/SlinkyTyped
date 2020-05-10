package typingsSlinky.luaparse.astMod

import typingsSlinky.luaparse.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base[TType /* <: String */] extends js.Object {
  var loc: js.UndefOr[AnonEnd] = js.native
  var `type`: TType = js.native
}

object Base {
  @scala.inline
  def apply[TType](`type`: TType): Base[TType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base[TType]]
  }
  @scala.inline
  implicit class BaseOps[Self[ttype] <: Base[ttype], TType] (val x: Self[TType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TType] with Other]
    @scala.inline
    def withType(value: TType): Self[TType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoc(value: AnonEnd): Self[TType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoc: Self[TType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(js.undefined)
        ret
    }
  }
  
}

