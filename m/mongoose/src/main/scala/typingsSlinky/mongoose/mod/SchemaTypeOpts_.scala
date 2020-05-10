package typingsSlinky.mongoose.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mongoose.mod.SchemaTypeOpts.AsyncPromiseValidationFn
import typingsSlinky.mongoose.mod.SchemaTypeOpts.AsyncPromiseValidationOpts
import typingsSlinky.mongoose.mod.SchemaTypeOpts.AsyncValidateOpts
import typingsSlinky.mongoose.mod.SchemaTypeOpts.DefaultFn
import typingsSlinky.mongoose.mod.SchemaTypeOpts.EnumOpts
import typingsSlinky.mongoose.mod.SchemaTypeOpts.IndexOpts
import typingsSlinky.mongoose.mod.SchemaTypeOpts.RequiredFn
import typingsSlinky.mongoose.mod.SchemaTypeOpts.ValidateFn
import typingsSlinky.mongoose.mod.SchemaTypeOpts.ValidateOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * The standard options available when configuring a schema type:
  * new Schema({
  *   name: {
  *     type: String,
  *     required: true,
  *     ...
  *   }
  * });
  *
  * Note: the properties have Object as a fallback type: | Object
  *   because this interface does not apply to a schematype that
  *   does not have a type property. Ex:
  * new Schema({
  *   name: {
  *     first: String,    // since name does not have a "type" property
  *     last: String      //   first and last can have any valid type
  *     ...
  *   }
  * });
  *
  * References:
  * - http://mongoosejs.com/docs/schematypes.html
  * - http://mongoosejs.com/docs/api.html#schema_Schema.Types
  */
@js.native
trait SchemaTypeOpts_[T]
  extends /* other */ StringDictionary[js.Any] {
  var alias: js.UndefOr[String] = js.native
  /** ObjectId only - Adds an auto-generated ObjectId default if turnOn is true. */
  var auto: js.UndefOr[Boolean | js.Any] = js.native
  /** Sets a default value for this SchemaType. */
  var default: js.UndefOr[DefaultFn[T] | T] = js.native
  /* Options for specific schema types (String, Number, Date, etc.) */
  /** String only - Adds an enum validator */
  var enum: js.UndefOr[js.Array[T] | EnumOpts[T] | js.Any] = js.native
  /**
    * Date only - Declares a TTL index (rounded to the nearest second)
    * for Date types only.
    */
  var expires: js.UndefOr[Double | String | js.Any] = js.native
  /**
    * Getters allow you to transform the representation of the data as it travels
    * from the raw mongodb document to the value that you see.
    */
  var get: js.UndefOr[js.Function2[/* value */ T, /* schematype */ js.UndefOr[this.type], T | _]] = js.native
  /** Declares the index options for this schematype. */
  var index: js.UndefOr[IndexOpts | Boolean | String] = js.native
  /** String only - Adds a lowercase setter. */
  var lowercase: js.UndefOr[Boolean | js.Any] = js.native
  /** String only - Sets a regexp validator. */
  var `match`: js.UndefOr[js.RegExp | (js.Tuple2[js.RegExp, String]) | js.Any] = js.native
  /**
    * Date, Number only - Sets a maximum number validator.
    * Sets a maximum date validator.
    */
  var max: js.UndefOr[Double | (js.Tuple2[js.Date | Double, String]) | js.Date | js.Any] = js.native
  /** String only - Sets a maximum length validator. */
  var maxlength: js.UndefOr[Double | (js.Tuple2[Double, String]) | js.Any] = js.native
  /**
    * Date, Number only - Sets a minimum number validator.
    * Sets a minimum date validator.
    */
  var min: js.UndefOr[Double | (js.Tuple2[js.Date | Double, String]) | js.Date | js.Any] = js.native
  /** String only - Sets a minimum length validator. */
  var minlength: js.UndefOr[Double | (js.Tuple2[Double, String]) | js.Any] = js.native
  /** Map only - Specifies the type of the map's attributes */
  var of: js.UndefOr[js.Any] = js.native
  /**
    * Adds a required validator to this SchemaType. The validator gets added
    * to the front of this SchemaType's validators array using unshift().
    */
  var required: js.UndefOr[
    RequiredFn[T] | Boolean | (js.Tuple2[Boolean | String, String]) | String | js.Any
  ] = js.native
  /**
    * Sets default select() behavior for this path.
    * Set to true if this path should always be included in the results, false
    * if it should be excluded by default. This setting can be overridden at
    * the query level.
    */
  var select: js.UndefOr[Boolean | js.Any] = js.native
  /**
    * Setters allow you to transform the data before it gets to the raw mongodb
    * document and is set as a value on an actual key.
    */
  var set: js.UndefOr[js.Function2[/* value */ T, /* schematype */ js.UndefOr[this.type], T | _]] = js.native
  /** Declares a sparse index. */
  var sparse: js.UndefOr[Boolean | js.Any] = js.native
  /** Declares a full text index. */
  var text: js.UndefOr[Boolean | js.Any] = js.native
  /** String only - Adds a trim setter. */
  var trim: js.UndefOr[Boolean | js.Any] = js.native
  /* Common Options for all schema types */
  var `type`: js.UndefOr[T] = js.native
  /** Declares an unique index. */
  var unique: js.UndefOr[Boolean | js.Any] = js.native
  /** String only - Adds an uppercase setter. */
  var uppercase: js.UndefOr[Boolean | js.Any] = js.native
  /**
    * Adds validator(s) for this document path.
    * Validators always receive the value to validate as their first argument
    * and must return Boolean. Returning false means validation failed.
    */
  var validate: js.UndefOr[
    js.RegExp | (js.Tuple2[AsyncPromiseValidationFn[T] | js.RegExp | ValidateFn[T], String]) | ValidateFn[T] | ValidateOpts | AsyncValidateOpts | AsyncPromiseValidationFn[T] | AsyncPromiseValidationOpts | (js.Array[
      ValidateOpts | AsyncValidateOpts | AsyncPromiseValidationFn[T] | AsyncPromiseValidationOpts
    ])
  ] = js.native
}

object SchemaTypeOpts_ {
  @scala.inline
  def apply[T](): SchemaTypeOpts_[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTypeOpts_[T]]
  }
  @scala.inline
  implicit class SchemaTypeOpts_Ops[Self[t] <: SchemaTypeOpts_[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAlias(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlias: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(js.undefined)
        ret
    }
    @scala.inline
    def withAuto(value: Boolean | js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuto: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultFunction1(value: /* repeated */ js.Any => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDefault(value: DefaultFn[T] | T): Self[T] = {
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
    def withEnum(value: js.Array[T] | EnumOpts[T] | js.Any): Self[T] = {
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
    def withExpires(value: Double | String | js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(js.undefined)
        ret
    }
    @scala.inline
    def withGet(value: (/* value */ T, /* schematype */ js.UndefOr[SchemaTypeOpts_[T]]) => T | _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGet: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: IndexOpts | Boolean | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withLowercase(value: Boolean | js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowercase: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowercase")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchRegExp(value: js.RegExp): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatch(value: js.RegExp | (js.Tuple2[js.RegExp, String]) | js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatch: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDate(value: js.Date): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double | (js.Tuple2[js.Date | Double, String]) | js.Date | js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxlength(value: Double | (js.Tuple2[Double, String]) | js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxlength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxlength: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxlength")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double | (js.Tuple2[js.Date | Double, String]) | js.Date | js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withMinlength(value: Double | (js.Tuple2[Double, String]) | js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minlength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinlength: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minlength")(js.undefined)
        ret
    }
    @scala.inline
    def withOf(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("of")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOf: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("of")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredFunction2(value: (/* required */ Boolean, /* message */ js.UndefOr[String]) => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRequired(value: RequiredFn[T] | Boolean | (js.Tuple2[Boolean | String, String]) | String | js.Any): Self[T] = {
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
    def withSelect(value: Boolean | js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelect: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSet(value: (/* value */ T, /* schematype */ js.UndefOr[SchemaTypeOpts_[T]]) => T | _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSet: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.undefined)
        ret
    }
    @scala.inline
    def withSparse(value: Boolean | js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sparse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSparse: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sparse")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: Boolean | js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTrim(value: Boolean | js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrim: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUnique(value: Boolean | js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnique: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(js.undefined)
        ret
    }
    @scala.inline
    def withUppercase(value: Boolean | js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uppercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUppercase: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uppercase")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateFunction1(value: T => Boolean | js.Promise[Boolean]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidateRegExp(value: js.RegExp): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidate(
      value: js.RegExp | (js.Tuple2[AsyncPromiseValidationFn[T] | js.RegExp | ValidateFn[T], String]) | ValidateFn[T] | ValidateOpts | AsyncValidateOpts | AsyncPromiseValidationFn[T] | AsyncPromiseValidationOpts | (js.Array[
          ValidateOpts | AsyncValidateOpts | AsyncPromiseValidationFn[T] | AsyncPromiseValidationOpts
        ])
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
  }
  
}

