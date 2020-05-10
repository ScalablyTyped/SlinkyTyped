package typingsSlinky.classValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlways extends js.Object {
  /**
    * Indicates if validation must be performed always, no matter of validation groups used.
    */
  var always: js.UndefOr[Boolean] = js.native
  /**
    * Constraints set by validation type.
    */
  var constraints: js.UndefOr[js.Array[_]] = js.native
  /**
    * Specifies if validated value is an array and each of its item must be validated.
    */
  var each: js.UndefOr[Boolean] = js.native
  /**
    * Validation groups used for this validation.
    */
  var groups: js.UndefOr[js.Array[String]] = js.native
  /**
    * Error message used to be used on validation fail.
    * You can use "$value" to use value that was failed by validation.
    * You can use "$constraint1" and "$constraint2" keys in the message string,
    * and they will be replaced with constraint values if they exist.
    * Message can be either string, either a function that returns a string.
    * Second option allows to use values and custom messages depend of them.
    */
  var message: js.UndefOr[
    String | (js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* constraint1 */ js.UndefOr[js.Any], 
      /* constraint2 */ js.UndefOr[js.Any], 
      String
    ])
  ] = js.native
  /**
    * Specific validation type options.
    */
  var options: js.UndefOr[js.Any] = js.native
  /**
    * Validation type. Should be one of the ValidationTypes value.
    */
  var `type`: String = js.native
}

object AnonAlways {
  @scala.inline
  def apply(`type`: String): AnonAlways = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlways]
  }
  @scala.inline
  implicit class AnonAlwaysOps[Self <: AnonAlways] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlways(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlways: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always")(js.undefined)
        ret
    }
    @scala.inline
    def withConstraints(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(js.undefined)
        ret
    }
    @scala.inline
    def withEach(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageFunction3(
      value: (/* value */ js.UndefOr[js.Any], /* constraint1 */ js.UndefOr[js.Any], /* constraint2 */ js.UndefOr[js.Any]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMessage(
      value: String | (js.Function3[
          /* value */ js.UndefOr[js.Any], 
          /* constraint1 */ js.UndefOr[js.Any], 
          /* constraint2 */ js.UndefOr[js.Any], 
          String
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

