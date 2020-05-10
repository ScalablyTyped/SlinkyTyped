package typingsSlinky.commandLineUsage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a command-line option. Additionally, if generating a usage guide with command-line-usage you could optionally add description and typeLabel properties to each definition. */
@js.native
trait OptionDefinition extends js.Object {
  /** getopt-style short option names. Can be any single character (unicode included) except a digit or hyphen. */
  var alias: js.UndefOr[String] = js.native
  /** Any values unaccounted for by an option definition will be set on the defaultOption. This flag is typically set on the most commonly-used option to make for more concise usage. */
  var defaultOption: js.UndefOr[Boolean] = js.native
  /** An initial value for the option. */
  var defaultValue: js.UndefOr[js.Any] = js.native
  /** A string describing the option. */
  var description: js.UndefOr[String] = js.native
  /**
    * When your app has a large amount of options it makes sense to organise them in groups.
    *
    * There are two automatic groups: _all (contains all options) and _none (contains options without a group specified in their definition).
    */
  var group: js.UndefOr[String | js.Array[String]] = js.native
  /** Identical to multiple but with greedy parsing disabled. */
  var lazyMultiple: js.UndefOr[Boolean] = js.native
  /** Set this flag if the option takes a list of values. You will receive an array of values, each passed through the type function (if specified). */
  var multiple: js.UndefOr[Boolean] = js.native
  var name: String = js.native
  /**
    * The type value is a setter function (you receive the output from this), enabling you to be specific about the type and value received.
    *
    * The most common values used are String (the default), Number and Boolean but you can use a custom function.
    */
  var `type`: js.UndefOr[js.Any] = js.native
  /** A string to replace the default type string (e.g. <string>). It's often more useful to set a more descriptive type label, like <ms>, <files>, <command>, etc.. */
  var typeLabel: js.UndefOr[String] = js.native
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
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
    def withType(value: js.Any): Self = {
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
    def withTypeLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeLabel")(js.undefined)
        ret
    }
  }
  
}

