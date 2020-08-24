package typingsSlinky.calidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BlacklistValidator[T /* <: js.Object */] = typingsSlinky.calidation.mod.BlacklistValidatorConfig[T] | (js.Function1[
    /* context */ typingsSlinky.calidation.mod.ValidatorContext[T], 
    typingsSlinky.calidation.mod.BlacklistValidatorConfig[T]
  ])
  type CustomValidatorFunction[T /* <: js.Object */] = js.Function2[
    /* config */ typingsSlinky.calidation.mod.SimpleValidatorConfig[T], 
    /* context */ typingsSlinky.calidation.mod.ValidatorContext[T], 
    js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      java.lang.String | scala.Null
    ]
  ]
  type Dirty[T /* <: js.Object */] = typingsSlinky.std.Record[/* keyof T */ java.lang.String, scala.Boolean]
  type Errors[T /* <: js.Object */] = typingsSlinky.std.Record[/* keyof T */ java.lang.String, java.lang.String | scala.Null]
  type Fields[T /* <: js.Object */] = T
  type FieldsConfig[T /* <: js.Object */] = typingsSlinky.std.Record[
    java.lang.String, 
    typingsSlinky.calidation.mod.FieldConfig[T] | (typingsSlinky.std.Record[
      java.lang.String, 
      typingsSlinky.calidation.mod.SimpleValidator[T] | (typingsSlinky.calidation.mod.ValueValidator[js.Any, T])
    ])
  ]
  type LengthValidator[T /* <: js.Object */] = typingsSlinky.calidation.mod.LengthValidatorConfig[T] | (js.Function1[
    /* context */ typingsSlinky.calidation.mod.ValidatorContext[T], 
    typingsSlinky.calidation.mod.LengthValidatorConfig[T]
  ])
  type RegexValidator[T /* <: js.Object */] = typingsSlinky.calidation.mod.RegexValidatorConfig[T] | (js.Function1[
    /* context */ typingsSlinky.calidation.mod.ValidatorContext[T], 
    typingsSlinky.calidation.mod.RegexValidatorConfig[T]
  ])
  type SimpleValidator[T /* <: js.Object */] = java.lang.String | typingsSlinky.calidation.mod.SimpleValidatorConfig[T] | (js.Function1[
    /* context */ typingsSlinky.calidation.mod.ValidatorContext[T], 
    typingsSlinky.calidation.mod.SimpleValidatorConfig[T]
  ])
  type Transform[T /* <: js.Object */] = typingsSlinky.std.Record[
    /* keyof T */ java.lang.String, 
    js.Function1[
      /* value */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ]
  type Transforms[T /* <: js.Object */] = typingsSlinky.std.Partial[typingsSlinky.calidation.mod.Transform[T]]
  type Validator[T /* <: js.Object */] = typingsSlinky.calidation.mod.SimpleValidator[T] | typingsSlinky.calidation.mod.BlacklistValidator[T] | (typingsSlinky.calidation.mod.ValueValidator[js.Any, T]) | typingsSlinky.calidation.mod.RegexValidator[T] | typingsSlinky.calidation.mod.WhitelistValidator[T] | typingsSlinky.calidation.mod.LengthValidator[T]
  type ValueValidator[P, T /* <: js.Object */] = (typingsSlinky.calidation.mod.ValueValidatorConfig[P, T]) | (js.Function1[
    /* context */ typingsSlinky.calidation.mod.ValidatorContext[T], 
    typingsSlinky.calidation.mod.ValueValidatorConfig[P, T]
  ])
  type WhitelistValidator[T /* <: js.Object */] = typingsSlinky.calidation.mod.WhitelistValidatorConfig[T] | (js.Function1[
    /* context */ typingsSlinky.calidation.mod.ValidatorContext[T], 
    typingsSlinky.calidation.mod.RegexValidatorConfig[T]
  ])
}
