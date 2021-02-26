package typingsSlinky.reactNativeJoi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ExtensionBoundSchema = typingsSlinky.reactNativeJoi.mod.Schema with typingsSlinky.reactNativeJoi.anon.CreateError
  
  type LanguageOptions = java.lang.String | scala.Boolean | scala.Null | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-native-joi.react-native-joi.LanguageOptions */ js.Object
  ])
  
  type LazySchema = typingsSlinky.reactNativeJoi.mod.AnySchema
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeJoi.mod.AnySchema
    - typingsSlinky.reactNativeJoi.mod.ArraySchema
    - typingsSlinky.reactNativeJoi.mod.AlternativesSchema
    - typingsSlinky.reactNativeJoi.mod.BinarySchema
    - typingsSlinky.reactNativeJoi.mod.BooleanSchema
    - typingsSlinky.reactNativeJoi.mod.DateSchema
    - typingsSlinky.reactNativeJoi.mod.FunctionSchema
    - typingsSlinky.reactNativeJoi.mod.NumberSchema
    - typingsSlinky.reactNativeJoi.mod.ObjectSchema
    - typingsSlinky.reactNativeJoi.mod.StringSchema
    - typingsSlinky.reactNativeJoi.mod.LazySchema
  */
  type Schema = typingsSlinky.reactNativeJoi.mod._Schema | typingsSlinky.reactNativeJoi.mod.LazySchema
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - js.Object
    - scala.Null
    - typingsSlinky.reactNativeJoi.mod.Schema
    - typingsSlinky.reactNativeJoi.mod.SchemaMap
  */
  type SchemaLike = typingsSlinky.reactNativeJoi.mod._SchemaLike | java.lang.String | scala.Double | scala.Boolean | js.Object | scala.Null | typingsSlinky.reactNativeJoi.mod.LazySchema
  
  type ValidationErrorFunction = js.Function1[
    /* errors */ js.Array[typingsSlinky.reactNativeJoi.mod.ValidationErrorItem], 
    java.lang.String | typingsSlinky.reactNativeJoi.mod.ValidationErrorItem | js.Array[typingsSlinky.reactNativeJoi.mod.ValidationErrorItem] | js.Error
  ]
  
  @scala.inline
  def allow(value: js.Any, values: js.Any*): typingsSlinky.reactNativeJoi.mod.Schema = (typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("allow")(value.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  @scala.inline
  def allow(values: js.Array[_]): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("allow")(values.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def alt(types: typingsSlinky.reactNativeJoi.mod.SchemaLike*): typingsSlinky.reactNativeJoi.mod.AlternativesSchema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("alt")(types.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.AlternativesSchema]
  @scala.inline
  def alt(types: js.Array[typingsSlinky.reactNativeJoi.mod.SchemaLike]): typingsSlinky.reactNativeJoi.mod.AlternativesSchema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("alt")(types.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.AlternativesSchema]
  
  @scala.inline
  def alternatives(types: typingsSlinky.reactNativeJoi.mod.SchemaLike*): typingsSlinky.reactNativeJoi.mod.AlternativesSchema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("alternatives")(types.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.AlternativesSchema]
  @scala.inline
  def alternatives(types: js.Array[typingsSlinky.reactNativeJoi.mod.SchemaLike]): typingsSlinky.reactNativeJoi.mod.AlternativesSchema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("alternatives")(types.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.AlternativesSchema]
  
  @scala.inline
  def any(): typingsSlinky.reactNativeJoi.mod.AnySchema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("any")().asInstanceOf[typingsSlinky.reactNativeJoi.mod.AnySchema]
  
  @scala.inline
  def array(): typingsSlinky.reactNativeJoi.mod.ArraySchema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("array")().asInstanceOf[typingsSlinky.reactNativeJoi.mod.ArraySchema]
  
  @scala.inline
  def assert(value: js.Any, schema: typingsSlinky.reactNativeJoi.mod.SchemaLike): scala.Unit = (typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def assert(value: js.Any, schema: typingsSlinky.reactNativeJoi.mod.SchemaLike, message: java.lang.String): scala.Unit = (typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def assert(value: js.Any, schema: typingsSlinky.reactNativeJoi.mod.SchemaLike, message: js.Error): scala.Unit = (typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def attempt[T](value: T, schema: typingsSlinky.reactNativeJoi.mod.SchemaLike): T = (typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attempt")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def attempt[T](value: T, schema: typingsSlinky.reactNativeJoi.mod.SchemaLike, message: java.lang.String): T = (typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attempt")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def attempt[T](value: T, schema: typingsSlinky.reactNativeJoi.mod.SchemaLike, message: js.Error): T = (typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attempt")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def binary(): typingsSlinky.reactNativeJoi.mod.BinarySchema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("binary")().asInstanceOf[typingsSlinky.reactNativeJoi.mod.BinarySchema]
  
  @scala.inline
  def bool(): typingsSlinky.reactNativeJoi.mod.BooleanSchema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("bool")().asInstanceOf[typingsSlinky.reactNativeJoi.mod.BooleanSchema]
  
  @scala.inline
  def boolean(): typingsSlinky.reactNativeJoi.mod.BooleanSchema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("boolean")().asInstanceOf[typingsSlinky.reactNativeJoi.mod.BooleanSchema]
  
  @scala.inline
  def compile(schema: typingsSlinky.reactNativeJoi.mod.SchemaLike): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compile")(schema.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def concat[T](schema: T): T = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("concat")(schema.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def date(): typingsSlinky.reactNativeJoi.mod.DateSchema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("date")().asInstanceOf[typingsSlinky.reactNativeJoi.mod.DateSchema]
  
  @scala.inline
  def describe(schema: typingsSlinky.reactNativeJoi.mod.Schema): typingsSlinky.reactNativeJoi.mod.Description_ = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("describe")(schema.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Description_]
  
  @scala.inline
  def description(desc: java.lang.String): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("description")(desc.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def disallow(value: js.Any, values: js.Any*): typingsSlinky.reactNativeJoi.mod.Schema = (typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("disallow")(value.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  @scala.inline
  def disallow(values: js.Array[_]): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("disallow")(values.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def empty(): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  @scala.inline
  def empty(schema: js.Any): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("empty")(schema.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def equal(value: js.Any, values: js.Any*): typingsSlinky.reactNativeJoi.mod.Schema = (typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("equal")(value.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  @scala.inline
  def equal(values: js.Array[_]): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("equal")(values.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def example(value: js.Any): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("example")(value.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def exist(): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("exist")().asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def extend(
    extension: js.Array[typingsSlinky.reactNativeJoi.mod.Extension],
    extensions: (typingsSlinky.reactNativeJoi.mod.Extension | js.Array[typingsSlinky.reactNativeJoi.mod.Extension])*
  ): js.Any = (typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extend")(extension.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def extend(
    extension: typingsSlinky.reactNativeJoi.mod.Extension,
    extensions: (typingsSlinky.reactNativeJoi.mod.Extension | js.Array[typingsSlinky.reactNativeJoi.mod.Extension])*
  ): js.Any = (typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extend")(extension.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def forbidden(): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("forbidden")().asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def func(): typingsSlinky.reactNativeJoi.mod.FunctionSchema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("func")().asInstanceOf[typingsSlinky.reactNativeJoi.mod.FunctionSchema]
  
  @scala.inline
  def invalid(value: js.Any, values: js.Any*): typingsSlinky.reactNativeJoi.mod.Schema = (typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(value.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  @scala.inline
  def invalid(values: js.Array[_]): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(values.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def isRef(ref: js.Any): /* is react-native-joi.react-native-joi.Reference */ scala.Boolean = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isRef")(ref.asInstanceOf[js.Any]).asInstanceOf[/* is react-native-joi.react-native-joi.Reference */ scala.Boolean]
  
  @scala.inline
  def label(name: java.lang.String): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("label")(name.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def `lazy`(cb: js.Function0[typingsSlinky.reactNativeJoi.mod.Schema]): typingsSlinky.reactNativeJoi.mod.LazySchema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(cb.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.LazySchema]
  @scala.inline
  def `lazy`(
    cb: js.Function0[typingsSlinky.reactNativeJoi.mod.Schema],
    options: typingsSlinky.reactNativeJoi.mod.LazyOptions
  ): typingsSlinky.reactNativeJoi.mod.LazySchema = (typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(cb.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNativeJoi.mod.LazySchema]
  
  @scala.inline
  def meta(meta: js.Object): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("meta")(meta.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def not(value: js.Any, values: js.Any*): typingsSlinky.reactNativeJoi.mod.Schema = (typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("not")(value.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  @scala.inline
  def not(values: js.Array[_]): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("not")(values.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def notes(notes: java.lang.String): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("notes")(notes.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  @scala.inline
  def notes(notes: js.Array[java.lang.String]): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("notes")(notes.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def number(): typingsSlinky.reactNativeJoi.mod.NumberSchema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("number")().asInstanceOf[typingsSlinky.reactNativeJoi.mod.NumberSchema]
  
  @scala.inline
  def `object`(): typingsSlinky.reactNativeJoi.mod.ObjectSchema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("object")().asInstanceOf[typingsSlinky.reactNativeJoi.mod.ObjectSchema]
  @scala.inline
  def `object`(schema: typingsSlinky.reactNativeJoi.mod.SchemaMap): typingsSlinky.reactNativeJoi.mod.ObjectSchema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("object")(schema.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.ObjectSchema]
  
  @scala.inline
  def only(value: js.Any, values: js.Any*): typingsSlinky.reactNativeJoi.mod.Schema = (typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("only")(value.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  @scala.inline
  def only(values: js.Array[_]): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("only")(values.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def optional(): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("optional")().asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def options(options: typingsSlinky.reactNativeJoi.mod.ValidationOptions): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("options")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def raw(): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("raw")().asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  @scala.inline
  def raw(isRaw: scala.Boolean): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("raw")(isRaw.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def reach(schema: typingsSlinky.reactNativeJoi.mod.ObjectSchema, path: java.lang.String): typingsSlinky.reactNativeJoi.mod.Schema = (typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reach")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  @scala.inline
  def reach(schema: typingsSlinky.reactNativeJoi.mod.ObjectSchema, path: js.Array[java.lang.String]): typingsSlinky.reactNativeJoi.mod.Schema = (typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reach")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def ref(key: java.lang.String): typingsSlinky.reactNativeJoi.mod.Reference = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ref")(key.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Reference]
  @scala.inline
  def ref(key: java.lang.String, options: typingsSlinky.reactNativeJoi.mod.ReferenceOptions): typingsSlinky.reactNativeJoi.mod.Reference = (typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ref")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Reference]
  
  @scala.inline
  def required(): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("required")().asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def strict(): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("strict")().asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  @scala.inline
  def strict(isStrict: scala.Boolean): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("strict")(isStrict.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def string(): typingsSlinky.reactNativeJoi.mod.StringSchema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("string")().asInstanceOf[typingsSlinky.reactNativeJoi.mod.StringSchema]
  
  @scala.inline
  def strip(): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("strip")().asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def symbol(): typingsSlinky.reactNativeJoi.mod.SymbolSchema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("symbol")().asInstanceOf[typingsSlinky.reactNativeJoi.mod.SymbolSchema]
  
  @scala.inline
  def tags(notes: java.lang.String): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tags")(notes.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  @scala.inline
  def tags(notes: js.Array[java.lang.String]): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tags")(notes.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def unit(name: java.lang.String): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unit")(name.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def valid(value: js.Any, values: js.Any*): typingsSlinky.reactNativeJoi.mod.Schema = (typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("valid")(value.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  @scala.inline
  def valid(values: js.Array[_]): typingsSlinky.reactNativeJoi.mod.Schema = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("valid")(values.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def validate[T](value: T, schema: typingsSlinky.reactNativeJoi.mod.SchemaLike): typingsSlinky.reactNativeJoi.mod.ValidationResult[T] = (typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNativeJoi.mod.ValidationResult[T]]
  @scala.inline
  def validate[T](
    value: T,
    schema: typingsSlinky.reactNativeJoi.mod.SchemaLike,
    options: typingsSlinky.reactNativeJoi.mod.ValidationOptions
  ): typingsSlinky.reactNativeJoi.mod.ValidationResult[T] = (typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNativeJoi.mod.ValidationResult[T]]
  @scala.inline
  def validate[T, R](
    value: T,
    schema: typingsSlinky.reactNativeJoi.mod.SchemaLike,
    callback: js.Function2[/* err */ typingsSlinky.reactNativeJoi.mod.ValidationError, /* value */ T, R]
  ): R = (typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[R]
  @scala.inline
  def validate[T, R](
    value: T,
    schema: typingsSlinky.reactNativeJoi.mod.SchemaLike,
    options: typingsSlinky.reactNativeJoi.mod.ValidationOptions,
    callback: js.Function2[/* err */ typingsSlinky.reactNativeJoi.mod.ValidationError, /* value */ T, R]
  ): R = (typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[R]
  
  @scala.inline
  def version: java.lang.String = typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
  
  @scala.inline
  def when(ref: java.lang.String, options: typingsSlinky.reactNativeJoi.mod.WhenOptions): typingsSlinky.reactNativeJoi.mod.AlternativesSchema = (typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("when")(ref.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNativeJoi.mod.AlternativesSchema]
  @scala.inline
  def when(
    ref: typingsSlinky.reactNativeJoi.mod.Reference,
    options: typingsSlinky.reactNativeJoi.mod.WhenOptions
  ): typingsSlinky.reactNativeJoi.mod.AlternativesSchema = (typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("when")(ref.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNativeJoi.mod.AlternativesSchema]
  @scala.inline
  def when(
    ref: typingsSlinky.reactNativeJoi.mod.Schema,
    options: typingsSlinky.reactNativeJoi.mod.WhenSchemaOptions
  ): typingsSlinky.reactNativeJoi.mod.AlternativesSchema = (typingsSlinky.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("when")(ref.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNativeJoi.mod.AlternativesSchema]
}
