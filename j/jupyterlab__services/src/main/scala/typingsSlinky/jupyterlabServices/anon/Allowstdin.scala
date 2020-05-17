package typingsSlinky.jupyterlabServices.anon

import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Allowstdin extends js.Object {
  /**
    * Whether to allow stdin requests.
    * The default is `true`.
    */
  var allow_stdin: js.UndefOr[Boolean] = js.native
  /**
    * The code to execute.
    */
  var code: String = js.native
  /**
    * Whether to execute the code as quietly as possible.
    * The default is `false`.
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * Whether to the abort execution queue on an error.
    * The default is `false`.
    */
  var stop_on_error: js.UndefOr[Boolean] = js.native
  /**
    * Whether to store history of the execution.
    * The default `true` if silent is False.
    * It is forced to  `false ` if silent is `true`.
    */
  var store_history: js.UndefOr[Boolean] = js.native
  /**
    * A mapping of names to expressions to be evaluated in the
    * kernel's interactive namespace.
    */
  var user_expressions: js.UndefOr[JSONObject] = js.native
}

object Allowstdin {
  @scala.inline
  def apply(code: String): Allowstdin = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allowstdin]
  }
  @scala.inline
  implicit class AllowstdinOps[Self <: Allowstdin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllow_stdin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_stdin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_stdin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_stdin")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withStop_on_error(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop_on_error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStop_on_error: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop_on_error")(js.undefined)
        ret
    }
    @scala.inline
    def withStore_history(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store_history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore_history: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store_history")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_expressions(value: JSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_expressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_expressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_expressions")(js.undefined)
        ret
    }
  }
  
}

