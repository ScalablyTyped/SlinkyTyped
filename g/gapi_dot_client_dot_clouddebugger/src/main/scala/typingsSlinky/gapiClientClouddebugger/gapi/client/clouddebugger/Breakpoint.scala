package typingsSlinky.gapiClientClouddebugger.gapi.client.clouddebugger

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Breakpoint extends js.Object {
  /**
    * Action that the agent should perform when the code at the
    * breakpoint location is hit.
    */
  var action: js.UndefOr[String] = js.native
  /**
    * Condition that triggers the breakpoint.
    * The condition is a compound boolean expression composed using expressions
    * in a programming language at the source location.
    */
  var condition: js.UndefOr[String] = js.native
  /** Time this breakpoint was created by the server in seconds resolution. */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Values of evaluated expressions at breakpoint time.
    * The evaluated expressions appear in exactly the same order they
    * are listed in the `expressions` field.
    * The `name` field holds the original expression text, the `value` or
    * `members` field holds the result of the evaluated expression.
    * If the expression cannot be evaluated, the `status` inside the `Variable`
    * will indicate an error and contain the error text.
    */
  var evaluatedExpressions: js.UndefOr[js.Array[Variable]] = js.native
  /**
    * List of read-only expressions to evaluate at the breakpoint location.
    * The expressions are composed using expressions in the programming language
    * at the source location. If the breakpoint action is `LOG`, the evaluated
    * expressions are included in log statements.
    */
  var expressions: js.UndefOr[js.Array[String]] = js.native
  /**
    * Time this breakpoint was finalized as seen by the server in seconds
    * resolution.
    */
  var finalTime: js.UndefOr[String] = js.native
  /** Breakpoint identifier, unique in the scope of the debuggee. */
  var id: js.UndefOr[String] = js.native
  /**
    * When true, indicates that this is a final result and the
    * breakpoint state will not change from here on.
    */
  var isFinalState: js.UndefOr[Boolean] = js.native
  /**
    * A set of custom breakpoint properties, populated by the agent, to be
    * displayed to the user.
    */
  var labels: js.UndefOr[Record[String, String]] = js.native
  /** Breakpoint source location. */
  var location: js.UndefOr[SourceLocation] = js.native
  /** Indicates the severity of the log. Only relevant when action is `LOG`. */
  var logLevel: js.UndefOr[String] = js.native
  /**
    * Only relevant when action is `LOG`. Defines the message to log when
    * the breakpoint hits. The message may include parameter placeholders `$0`,
    * `$1`, etc. These placeholders are replaced with the evaluated value
    * of the appropriate expression. Expressions not referenced in
    * `log_message_format` are not logged.
    *
    * Example: `Message received, id = $0, count = $1` with
    * `expressions` = `[ message.id, message.count ]`.
    */
  var logMessageFormat: js.UndefOr[String] = js.native
  /** The stack at breakpoint time. */
  var stackFrames: js.UndefOr[js.Array[StackFrame]] = js.native
  /**
    * Breakpoint status.
    *
    * The status includes an error flag and a human readable message.
    * This field is usually unset. The message can be either
    * informational or an error message. Regardless, clients should always
    * display the text message back to the user.
    *
    * Error status indicates complete failure of the breakpoint.
    *
    * Example (non-final state): `Still loading symbols...`
    *
    * Examples (final state):
    *
    * &#42;   `Invalid line number` referring to location
    * &#42;   `Field f not found in class C` referring to condition
    */
  var status: js.UndefOr[StatusMessage] = js.native
  /** E-mail address of the user that created this breakpoint */
  var userEmail: js.UndefOr[String] = js.native
  /**
    * The `variable_table` exists to aid with computation, memory and network
    * traffic optimization.  It enables storing a variable once and reference
    * it from multiple variables, including variables stored in the
    * `variable_table` itself.
    * For example, the same `this` object, which may appear at many levels of
    * the stack, can have all of its data stored once in this table.  The
    * stack frame variables then would hold only a reference to it.
    *
    * The variable `var_table_index` field is an index into this repeated field.
    * The stored objects are nameless and get their name from the referencing
    * variable. The effective variable is a merge of the referencing variable
    * and the referenced variable.
    */
  var variableTable: js.UndefOr[js.Array[Variable]] = js.native
}

object Breakpoint {
  @scala.inline
  def apply(): Breakpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Breakpoint]
  }
  @scala.inline
  implicit class BreakpointOps[Self <: Breakpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withCondition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEvaluatedExpressions(value: js.Array[Variable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluatedExpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluatedExpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluatedExpressions")(js.undefined)
        ret
    }
    @scala.inline
    def withExpressions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressions")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalTime")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFinalState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFinalState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFinalState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFinalState")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: SourceLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLogMessageFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logMessageFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogMessageFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logMessageFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withStackFrames(value: js.Array[StackFrame]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackFrames")(js.undefined)
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
    def withUserEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withVariableTable(value: js.Array[Variable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariableTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableTable")(js.undefined)
        ret
    }
  }
  
}

