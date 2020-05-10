package typingsSlinky.reduxPromiseMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var promiseTypeDelimiter: js.UndefOr[String] = js.native
  var promiseTypeSuffixes: js.UndefOr[js.Tuple3[PendingActionType, FulfilledActionType, RejectedActionType]] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPromiseTypeDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseTypeDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromiseTypeDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseTypeDelimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withPromiseTypeSuffixes(value: js.Tuple3[PendingActionType, FulfilledActionType, RejectedActionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseTypeSuffixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromiseTypeSuffixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseTypeSuffixes")(js.undefined)
        ret
    }
  }
  
}

