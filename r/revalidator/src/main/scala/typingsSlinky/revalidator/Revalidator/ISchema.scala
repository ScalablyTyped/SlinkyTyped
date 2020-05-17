package typingsSlinky.revalidator.Revalidator

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISchema[T] extends js.Object {
  /**If false, the value must not be an empty string */
  var allowEmpty: js.UndefOr[Boolean] = js.native
  /**Value must conform to constraint denoted by expected value */
  var conform: js.UndefOr[js.Function2[/* value */ js.Any, /* data */ js.UndefOr[T], Boolean]] = js.native
  /**Default value */
  var default: js.UndefOr[js.Any] = js.native
  /**Value is valid only if the dependent value is valid */
  var dependencies: js.UndefOr[String] = js.native
  /**Description for this object */
  var description: js.UndefOr[String] = js.native
  /**Value must be divisible by expected value */
  var divisibleBy: js.UndefOr[Double] = js.native
  /**Value must be present in the array of expected values */
  var enum: js.UndefOr[js.Array[_]] = js.native
  /**Value must be lesser than expected value */
  var exclusiveMaximum: js.UndefOr[Double] = js.native
  /**Value must be greater than expected value */
  var exclusiveMinimum: js.UndefOr[Double] = js.native
  /**Value must be a valid format */
  var format: js.UndefOr[Formats] = js.native
  /**Property to describe items for type: 'array' */
  var items: js.UndefOr[ISchema[T] | JSONSchema[T]] = js.native
  /**Value must contain fewer than expected number of items */
  var maxItems: js.UndefOr[Double] = js.native
  /**The length of value must be greater than or equal to expected value */
  var maxLength: js.UndefOr[Double] = js.native
  /**Value must be lesser than or equal to the expected value */
  var maximum: js.UndefOr[Double] = js.native
  /**Custom messages for different constraints */
  var message: js.UndefOr[String] = js.native
  /**Custom messages for different constraints */
  var messages: js.UndefOr[StringDictionary[String]] = js.native
  /**Value must contain more than expected number of items */
  var minItems: js.UndefOr[Double] = js.native
  /**The length of value must be lesser than or equal to expected value */
  var minLength: js.UndefOr[Double] = js.native
  /**Value must be greater than or equal to the expected value */
  var minimum: js.UndefOr[Double] = js.native
  /**The expected value regex needs to be satisfied by the value */
  var pattern: js.UndefOr[js.RegExp | String] = js.native
  /**If true, the value should not be undefined */
  var required: js.UndefOr[Boolean] = js.native
  /**The type of value should be equal to the expected value */
  var `type`: Types | js.Array[Types] = js.native
  /**Value must hold a unique set of values */
  var uniqueItems: js.UndefOr[Boolean] = js.native
}

object ISchema {
  @scala.inline
  def apply[T](`type`: Types | js.Array[Types]): ISchema[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISchema[T]]
  }
  @scala.inline
  implicit class ISchemaOps[Self[t] <: ISchema[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withType(value: Types | js.Array[Types]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowEmpty(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEmpty: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withConform(value: (/* value */ js.Any, /* data */ js.UndefOr[T]) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conform")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutConform: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conform")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withDependencies(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependencies: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDivisibleBy(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divisibleBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDivisibleBy: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divisibleBy")(js.undefined)
        ret
    }
    @scala.inline
    def withEnum(value: js.Array[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnum: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enum")(js.undefined)
        ret
    }
    @scala.inline
    def withExclusiveMaximum(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusiveMaximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusiveMaximum: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusiveMaximum")(js.undefined)
        ret
    }
    @scala.inline
    def withExclusiveMinimum(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusiveMinimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusiveMinimum: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusiveMinimum")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: Formats): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: ISchema[T] | JSONSchema[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxItems(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxItems: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItems")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximum(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximum: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: StringDictionary[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withMinItems(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinItems: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minItems")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLength(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLength: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimum(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimum: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(js.undefined)
        ret
    }
    @scala.inline
    def withPatternRegExp(value: js.RegExp): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPattern(value: js.RegExp | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withUniqueItems(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniqueItems: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueItems")(js.undefined)
        ret
    }
  }
  
}

