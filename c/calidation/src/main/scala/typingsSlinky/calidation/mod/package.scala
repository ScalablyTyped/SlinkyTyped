package typingsSlinky.calidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BlacklistValidator = typingsSlinky.calidation.mod.BlacklistValidatorConfig | (js.Function1[
    /* context */ typingsSlinky.calidation.mod.ValidatorContext, 
    typingsSlinky.calidation.mod.BlacklistValidatorConfig
  ])
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Dirty = typingsSlinky.calidation.mod.Dictionary[scala.Boolean]
  type Errors = typingsSlinky.calidation.mod.Dictionary[java.lang.String | scala.Null]
  type Fields = typingsSlinky.calidation.mod.Dictionary[js.Any]
  type FieldsConfig = typingsSlinky.calidation.mod.Dictionary[typingsSlinky.calidation.mod.FieldConfig]
  type LengthValidator = typingsSlinky.calidation.mod.LengthValidatorConfig | (js.Function1[
    /* context */ typingsSlinky.calidation.mod.ValidatorContext, 
    typingsSlinky.calidation.mod.LengthValidatorConfig
  ])
  type RegexValidator = typingsSlinky.calidation.mod.RegexValidatorConfig | (js.Function1[
    /* context */ typingsSlinky.calidation.mod.ValidatorContext, 
    typingsSlinky.calidation.mod.RegexValidatorConfig
  ])
  type SimpleValidator = java.lang.String | typingsSlinky.calidation.mod.SimpleValidatorConfig | (js.Function1[
    /* context */ typingsSlinky.calidation.mod.ValidatorContext, 
    typingsSlinky.calidation.mod.SimpleValidatorConfig
  ])
  type Transforms = typingsSlinky.calidation.mod.Dictionary[js.Function1[/* value */ js.Any, js.Any]]
  type Validator = typingsSlinky.calidation.mod.SimpleValidator | typingsSlinky.calidation.mod.BlacklistValidator | typingsSlinky.calidation.mod.ValueValidator[js.Any] | typingsSlinky.calidation.mod.RegexValidator | typingsSlinky.calidation.mod.WhitelistValidator | typingsSlinky.calidation.mod.LengthValidator
  type ValueValidator[T] = typingsSlinky.calidation.mod.ValueValidatorConfig[T] | (js.Function1[
    /* context */ typingsSlinky.calidation.mod.ValidatorContext, 
    typingsSlinky.calidation.mod.ValueValidatorConfig[T]
  ])
  type WhitelistValidator = typingsSlinky.calidation.mod.WhitelistValidatorConfig | (js.Function1[
    /* context */ typingsSlinky.calidation.mod.ValidatorContext, 
    typingsSlinky.calidation.mod.RegexValidatorConfig
  ])
}
