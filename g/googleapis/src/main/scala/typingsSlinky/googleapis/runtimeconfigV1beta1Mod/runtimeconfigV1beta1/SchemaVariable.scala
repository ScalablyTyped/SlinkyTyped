package typingsSlinky.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a single variable within a RuntimeConfig resource. The name
  * denotes the hierarchical variable name. For example, `ports/serving_port`
  * is a valid variable name. The variable value is an opaque string and only
  * leaf variables can have values (that is, variables that do not have any
  * child variables).
  */
@js.native
trait SchemaVariable extends js.Object {
  /**
    * The name of the variable resource, in the format:
    * projects/[PROJECT_ID]/configs/[CONFIG_NAME]/variables/[VARIABLE_NAME] The
    * `[PROJECT_ID]` must be a valid project ID, `[CONFIG_NAME]` must be a
    * valid RuntimeConfig resource and `[VARIABLE_NAME]` follows Unix file
    * system file path naming.  The `[VARIABLE_NAME]` can contain ASCII
    * letters, numbers, slashes and dashes. Slashes are used as path element
    * separators and are not part of the `[VARIABLE_NAME]` itself, so
    * `[VARIABLE_NAME]` must contain at least one non-slash character. Multiple
    * slashes are coalesced into single slash character. Each path segment
    * should match [0-9A-Za-z](?:[_.A-Za-z0-9-]{0,62}[_.A-Za-z0-9])? regular
    * expression. The length of a `[VARIABLE_NAME]` must be less than 256
    * characters.  Once you create a variable, you cannot change the variable
    * name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The current state of the variable. The variable state
    * indicates the outcome of the `variables().watch` call and is visible
    * through the `get` and `list` calls.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The string value of the variable. The length of the value must be less
    * than 4096 bytes. Empty values are also accepted. For example, `text:
    * &quot;my text value&quot;`. The string must be valid UTF-8.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Output only. The time of the last variable update. Timestamp will be UTC
    * timestamp.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * The binary value of the variable. The length of the value must be less
    * than 4096 bytes. Empty values are also accepted. The value must be base64
    * encoded, and must comply with IETF RFC4648
    * (https://www.ietf.org/rfc/rfc4648.txt). Only one of `value` or `text` can
    * be set.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaVariable {
  @scala.inline
  def apply(): SchemaVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVariable]
  }
  @scala.inline
  implicit class SchemaVariableOps[Self <: SchemaVariable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
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
  }
  
}

