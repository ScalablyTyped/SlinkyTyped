package typingsSlinky.commandLineArgs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionDefinition extends js.Object {
  /**
    * A getopt-style short option name. Can be any single character except a digit or hyphen.
    */
  var alias: js.UndefOr[String] = js.native
  /**
    * Any values unaccounted for by an option definition will be set on the `defaultOption`. This flag is typically set
    * on the most commonly-used option to enable more concise usage.
    */
  var defaultOption: js.UndefOr[Boolean] = js.native
  /**
    * An initial value for the option.
    */
  var defaultValue: js.UndefOr[js.Any] = js.native
  /**
    * One or more group names the option belongs to.
    */
  var group: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Identical to `multiple` but with greedy parsing disabled.
    */
  var lazyMultiple: js.UndefOr[Boolean] = js.native
  /**
    * Set this flag if the option accepts multiple values. In the output, you will receive an array of values each passed through the `type` function.
    */
  var multiple: js.UndefOr[Boolean] = js.native
  /**
    * The long option name.
    */
  var name: String = js.native
  /**
    * A setter function (you receive the output from this) enabling you to be specific about the type and value received. Typical values
    * are `String` (the default), `Number` and `Boolean` but you can use a custom function. If no option value was set you will receive `null`.
    */
  var `type`: js.UndefOr[js.Function1[/* input */ String, _]] = js.native
}

object OptionDefinition {
  @scala.inline
  def apply(name: String): OptionDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionDefinition]
  }
  @scala.inline
  implicit class OptionDefinitionOps[Self <: OptionDefinition] (val x: Self) extends AnyVal {
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
    def withAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultOption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOption")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyMultiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazyMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyMultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: /* input */ String => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.Any.fromFunction1(value))
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

