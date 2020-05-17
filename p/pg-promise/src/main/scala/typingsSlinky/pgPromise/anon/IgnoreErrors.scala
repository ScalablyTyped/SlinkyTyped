package typingsSlinky.pgPromise.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgnoreErrors extends js.Object {
  var ignoreErrors: js.UndefOr[Boolean] = js.native
  var recursive: js.UndefOr[Boolean] = js.native
}

object IgnoreErrors {
  @scala.inline
  def apply(): IgnoreErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreErrors]
  }
  @scala.inline
  implicit class IgnoreErrorsOps[Self <: IgnoreErrors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withRecursive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecursive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursive")(js.undefined)
        ret
    }
  }
  
}

