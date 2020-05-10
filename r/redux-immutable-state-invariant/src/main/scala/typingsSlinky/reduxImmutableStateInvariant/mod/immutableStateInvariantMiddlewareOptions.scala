package typingsSlinky.reduxImmutableStateInvariant.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait immutableStateInvariantMiddlewareOptions extends js.Object {
  var ignore: js.UndefOr[js.Array[String]] = js.native
  var isImmutable: js.UndefOr[js.Function1[/* value */ js.Any, Boolean]] = js.native
}

object immutableStateInvariantMiddlewareOptions {
  @scala.inline
  def apply(): immutableStateInvariantMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[immutableStateInvariantMiddlewareOptions]
  }
  @scala.inline
  implicit class immutableStateInvariantMiddlewareOptionsOps[Self <: immutableStateInvariantMiddlewareOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnore(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withIsImmutable(value: /* value */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isImmutable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsImmutable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isImmutable")(js.undefined)
        ret
    }
  }
  
}

