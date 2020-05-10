package typingsSlinky.emberData.mod.DS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttrOptions[T] extends js.Object {
  var allowNull: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[T | js.Function0[T]] = js.native
}

object AttrOptions {
  @scala.inline
  def apply[T](): AttrOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttrOptions[T]]
  }
  @scala.inline
  implicit class AttrOptionsOps[Self[t] <: AttrOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAllowNull(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNull")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueFunction0(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDefaultValue(value: T | js.Function0[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
  }
  
}

