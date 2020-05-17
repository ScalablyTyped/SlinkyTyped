package typingsSlinky.flexmonster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type extends js.Object {
  var prepareDataFunction: js.UndefOr[js.Function1[/* rawData */ js.Any, _]] = js.native
  var slice: js.UndefOr[typingsSlinky.flexmonster.mod.Slice] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Type {
  @scala.inline
  def apply(): Type = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrepareDataFunction(value: /* rawData */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareDataFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPrepareDataFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareDataFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withSlice(value: typingsSlinky.flexmonster.mod.Slice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slice")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

