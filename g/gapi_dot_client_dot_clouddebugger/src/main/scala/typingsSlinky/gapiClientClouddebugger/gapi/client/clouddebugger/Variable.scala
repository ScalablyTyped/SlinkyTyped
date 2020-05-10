package typingsSlinky.gapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Variable extends js.Object {
  /** Members contained or pointed to by the variable. */
  var members: js.UndefOr[js.Array[Variable]] = js.native
  /** Name of the variable, if any. */
  var name: js.UndefOr[String] = js.native
  /**
    * Status associated with the variable. This field will usually stay
    * unset. A status of a single variable only applies to that variable or
    * expression. The rest of breakpoint data still remains valid. Variables
    * might be reported in error state even when breakpoint is not in final
    * state.
    *
    * The message may refer to variable name with `refers_to` set to
    * `VARIABLE_NAME`. Alternatively `refers_to` will be set to `VARIABLE_VALUE`.
    * In either case variable value and members will be unset.
    *
    * Example of error message applied to name: `Invalid expression syntax`.
    *
    * Example of information message applied to value: `Not captured`.
    *
    * Examples of error message applied to value:
    *
    * &#42;   `Malformed string`,
    * &#42;   `Field f not found in class C`
    * &#42;   `Null pointer dereference`
    */
  var status: js.UndefOr[StatusMessage] = js.native
  /**
    * Variable type (e.g. `MyClass`). If the variable is split with
    * `var_table_index`, `type` goes next to `value`. The interpretation of
    * a type is agent specific. It is recommended to include the dynamic type
    * rather than a static type of an object.
    */
  var `type`: js.UndefOr[String] = js.native
  /** Simple value of the variable. */
  var value: js.UndefOr[String] = js.native
  /**
    * Reference to a variable in the shared variable table. More than
    * one variable can reference the same variable in the table. The
    * `var_table_index` field is an index into `variable_table` in Breakpoint.
    */
  var varTableIndex: js.UndefOr[Double] = js.native
}

object Variable {
  @scala.inline
  def apply(): Variable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Variable]
  }
  @scala.inline
  implicit class VariableOps[Self <: Variable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMembers(value: js.Array[Variable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: StatusMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
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
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withVarTableIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varTableIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVarTableIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varTableIndex")(js.undefined)
        ret
    }
  }
  
}

