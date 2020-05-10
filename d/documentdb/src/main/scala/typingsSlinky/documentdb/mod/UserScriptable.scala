package typingsSlinky.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserScriptable extends UniqueId {
  /** The user function. Must set one of body or serverscript */
  var body: js.UndefOr[UserFunction] = js.native
  /** The user function. Must set one of body or serverscript */
  var serverScript: js.UndefOr[UserFunction] = js.native
}

object UserScriptable {
  @scala.inline
  def apply(id: String): UserScriptable = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserScriptable]
  }
  @scala.inline
  implicit class UserScriptableOps[Self <: UserScriptable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyFunction1(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBody(value: UserFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withServerScriptFunction1(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverScript")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withServerScript(value: UserFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverScript")(js.undefined)
        ret
    }
  }
  
}

