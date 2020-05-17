package typingsSlinky.jsonSchemaMergeAllof.mod

import typingsSlinky.jsonSchemaMergeAllof.anon.AdditionalProperties
import typingsSlinky.jsonSchemaMergeAllof.jsonSchemaMergeAllofStrings.additionalProperties
import typingsSlinky.jsonSchemaMergeAllof.jsonSchemaMergeAllofStrings.patternProperties
import typingsSlinky.jsonSchemaMergeAllof.jsonSchemaMergeAllofStrings.properties
import typingsSlinky.std.NonNullable
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolvers[Schema /* <: JSONSchema */] extends js.Object {
  @JSName("$id")
  def $id_id(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Id>['$id'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Id>['$id'] */ js.Any
  ] = js.native
  @JSName("$ref")
  def $ref_ref(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['$ref'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['$ref'] */ js.Any
  ] = js.native
  @JSName("$schema")
  def $schema_schema(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['$schema'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['$schema'] */ js.Any
  ] = js.native
  @JSName("additionalItems")
  def additionalItems_additionalItems(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalItems'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalItems'] */ js.Any
  ] = js.native
  @JSName("additionalProperties")
  def additionalProperties_additionalProperties(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalProperties'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalProperties'] */ js.Any
  ] = js.native
  @JSName("anyOf")
  def anyOf_anyOf(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['anyOf'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['anyOf'] */ js.Any
  ] = js.native
  @JSName("contains")
  def contains_contains(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Contains>['contains'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Contains>['contains'] */ js.Any
  ] = js.native
  @JSName("default")
  def default_default(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['default'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['default'] */ js.Any
  ] = js.native
  @JSName("definitions")
  def definitions_definitions(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['definitions'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['definitions'] */ js.Any
  ] = js.native
  @JSName("dependencies")
  def dependencies_dependencies(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['dependencies'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['dependencies'] */ js.Any
  ] = js.native
  @JSName("description")
  def description_description(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['description'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['description'] */ js.Any
  ] = js.native
  @JSName("enum")
  def enum_enum(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['enum'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['enum'] */ js.Any
  ] = js.native
  @JSName("examples")
  def examples_examples(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Examples>['examples'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Examples>['examples'] */ js.Any
  ] = js.native
  @JSName("exclusiveMaximum")
  def exclusiveMaximum_exclusiveMaximum(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMaximum'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMaximum'] */ js.Any
  ] = js.native
  @JSName("exclusiveMinimum")
  def exclusiveMinimum_exclusiveMinimum(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMinimum'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMinimum'] */ js.Any
  ] = js.native
  @JSName("items")
  def items_items(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['items'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['items'] */ js.Any
  ] = js.native
  @JSName("maxItems")
  def maxItems_maxItems(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxItems'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxItems'] */ js.Any
  ] = js.native
  @JSName("maxLength")
  def maxLength_maxLength(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxLength'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxLength'] */ js.Any
  ] = js.native
  @JSName("maxProperties")
  def maxProperties_maxProperties(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxProperties'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxProperties'] */ js.Any
  ] = js.native
  @JSName("maximum")
  def maximum_maximum(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['maximum'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['maximum'] */ js.Any
  ] = js.native
  @JSName("minItems")
  def minItems_minItems(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['minItems'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['minItems'] */ js.Any
  ] = js.native
  @JSName("minLength")
  def minLength_minLength(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['minLength'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['minLength'] */ js.Any
  ] = js.native
  @JSName("minProperties")
  def minProperties_minProperties(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['minProperties'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['minProperties'] */ js.Any
  ] = js.native
  @JSName("minimum")
  def minimum_minimum(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['minimum'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['minimum'] */ js.Any
  ] = js.native
  @JSName("multipleOf")
  def multipleOf_multipleOf(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['multipleOf'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['multipleOf'] */ js.Any
  ] = js.native
  @JSName("not")
  def not_not(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['not'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['not'] */ js.Any
  ] = js.native
  @JSName("oneOf")
  def oneOf_oneOf(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['oneOf'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['oneOf'] */ js.Any
  ] = js.native
  @JSName("pattern")
  def pattern_pattern(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['pattern'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['pattern'] */ js.Any
  ] = js.native
  /**
    * ### Combined resolvers
    * No separate resolver is called for patternProperties and
    * additionalProperties, only the properties resolver is called. Same
    * for additionalItems, only items resolver is called. This is because
    * those keywords need to be resolved together as they affect each
    * other.
    *
    * Those two resolvers are expected to return an object containing the
    * resolved values of all the associated keywords. The keys must be the
    * name of the keywords. So the properties resolver need to return an
    * object like this containing the resolved values for each keyword:
    *
    * ```js
    * {
    *     properties: ...,
    *     patternProperties: ...,
    *     additionalProperties: ...,
    * }
    * ```
    *
    * Also the resolve function is not passed **mergeSchemas**, but an
    * object **mergers** that contains mergers for each of the related
    * keywords. So properties get passed an object like this:
    *
    * ```js
    * var mergers = {
    *     properties: function mergeSchemas(schemas, childSchemaName){...},
    *     patternProperties: function mergeSchemas(schemas, childSchemaName){...},
    *     additionalProperties: function mergeSchemas(schemas){...},
    * }
    * ```
    *
    * Some of the mergers requires you to supply a string of the name or
    * index of the subschema you are currently merging. This is to make
    * sure the path passed to child resolvers are correct.
    */
  def properties(
    values: js.Array[Schema],
    path: js.Array[String],
    mergers: AdditionalProperties,
    options: Options_[Schema]
  ): Pick[
    Schema, 
    typingsSlinky.jsonSchemaMergeAllof.jsonSchemaMergeAllofStrings.properties | patternProperties | additionalProperties
  ] = js.native
  @JSName("propertyNames")
  def propertyNames_propertyNames(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.PropertyNames>['propertyNames'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.PropertyNames>['propertyNames'] */ js.Any
  ] = js.native
  @JSName("required")
  def required_required(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['required'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['required'] */ js.Any
  ] = js.native
  @JSName("title")
  def title_title(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['title'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['title'] */ js.Any
  ] = js.native
  @JSName("type")
  def type_type(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['type'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['type'] */ js.Any
  ] = js.native
  @JSName("uniqueItems")
  def uniqueItems_uniqueItems(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['uniqueItems'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['uniqueItems'] */ js.Any
  ] = js.native
}

object Resolvers {
  @scala.inline
  def apply[Schema](
    $id: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Id>['$id'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Id>['$id'] */ js.Any
    ],
    $ref: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['$ref'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['$ref'] */ js.Any
    ],
    $schema: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['$schema'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['$schema'] */ js.Any
    ],
    additionalItems: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalItems'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalItems'] */ js.Any
    ],
    additionalProperties: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalProperties'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalProperties'] */ js.Any
    ],
    anyOf: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['anyOf'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['anyOf'] */ js.Any
    ],
    contains: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Contains>['contains'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Contains>['contains'] */ js.Any
    ],
    default: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['default'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['default'] */ js.Any
    ],
    definitions: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['definitions'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['definitions'] */ js.Any
    ],
    dependencies: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['dependencies'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['dependencies'] */ js.Any
    ],
    description: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['description'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['description'] */ js.Any
    ],
    enum: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['enum'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['enum'] */ js.Any
    ],
    examples: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Examples>['examples'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Examples>['examples'] */ js.Any
    ],
    exclusiveMaximum: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMaximum'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMaximum'] */ js.Any
    ],
    exclusiveMinimum: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMinimum'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMinimum'] */ js.Any
    ],
    items: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['items'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['items'] */ js.Any
    ],
    maxItems: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxItems'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxItems'] */ js.Any
    ],
    maxLength: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxLength'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxLength'] */ js.Any
    ],
    maxProperties: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxProperties'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxProperties'] */ js.Any
    ],
    maximum: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['maximum'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['maximum'] */ js.Any
    ],
    minItems: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['minItems'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['minItems'] */ js.Any
    ],
    minLength: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['minLength'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['minLength'] */ js.Any
    ],
    minProperties: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['minProperties'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['minProperties'] */ js.Any
    ],
    minimum: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['minimum'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['minimum'] */ js.Any
    ],
    multipleOf: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['multipleOf'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['multipleOf'] */ js.Any
    ],
    not: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['not'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['not'] */ js.Any
    ],
    oneOf: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['oneOf'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['oneOf'] */ js.Any
    ],
    pattern: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['pattern'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['pattern'] */ js.Any
    ],
    properties: (js.Array[Schema], js.Array[String], AdditionalProperties, Options_[Schema]) => Pick[Schema, properties | patternProperties | additionalProperties],
    propertyNames: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.PropertyNames>['propertyNames'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.PropertyNames>['propertyNames'] */ js.Any
    ],
    required: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['required'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['required'] */ js.Any
    ],
    title: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['title'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['title'] */ js.Any
    ],
    `type`: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['type'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['type'] */ js.Any
    ],
    uniqueItems: (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['uniqueItems'] */ js.Any
    ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['uniqueItems'] */ js.Any
    ]
  ): Resolvers[Schema] = {
    val __obj = js.Dynamic.literal($id = js.Any.fromFunction4($id), $ref = js.Any.fromFunction4($ref), $schema = js.Any.fromFunction4($schema), additionalItems = js.Any.fromFunction4(additionalItems), additionalProperties = js.Any.fromFunction4(additionalProperties), anyOf = js.Any.fromFunction4(anyOf), contains = js.Any.fromFunction4(contains), default = js.Any.fromFunction4(default), definitions = js.Any.fromFunction4(definitions), dependencies = js.Any.fromFunction4(dependencies), description = js.Any.fromFunction4(description), enum = js.Any.fromFunction4(enum), examples = js.Any.fromFunction4(examples), exclusiveMaximum = js.Any.fromFunction4(exclusiveMaximum), exclusiveMinimum = js.Any.fromFunction4(exclusiveMinimum), items = js.Any.fromFunction4(items), maxItems = js.Any.fromFunction4(maxItems), maxLength = js.Any.fromFunction4(maxLength), maxProperties = js.Any.fromFunction4(maxProperties), maximum = js.Any.fromFunction4(maximum), minItems = js.Any.fromFunction4(minItems), minLength = js.Any.fromFunction4(minLength), minProperties = js.Any.fromFunction4(minProperties), minimum = js.Any.fromFunction4(minimum), multipleOf = js.Any.fromFunction4(multipleOf), not = js.Any.fromFunction4(not), oneOf = js.Any.fromFunction4(oneOf), pattern = js.Any.fromFunction4(pattern), properties = js.Any.fromFunction4(properties), propertyNames = js.Any.fromFunction4(propertyNames), required = js.Any.fromFunction4(required), title = js.Any.fromFunction4(title), uniqueItems = js.Any.fromFunction4(uniqueItems))
    __obj.updateDynamic("type")(js.Any.fromFunction4(`type`))
    __obj.asInstanceOf[Resolvers[Schema]]
  }
  @scala.inline
  implicit class ResolversOps[Self[schema] <: Resolvers[schema], Schema] (val x: Self[Schema]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Schema] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Schema]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Schema] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Schema] with Other]
    @scala.inline
    def with$id(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Id>['$id'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Id>['$id'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$id")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def with$ref(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['$ref'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['$ref'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$ref")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def with$schema(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['$schema'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['$schema'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$schema")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withAdditionalItems(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalItems'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalItems'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalItems")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withAdditionalProperties(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalProperties'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalProperties'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalProperties")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withAnyOf(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['anyOf'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['anyOf'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyOf")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withContains(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Contains>['contains'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Contains>['contains'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withDefault(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['default'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['default'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withDefinitions(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['definitions'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['definitions'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitions")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withDependencies(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['dependencies'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['dependencies'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withDescription(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['description'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['description'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withEnum(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['enum'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['enum'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enum")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withExamples(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Examples>['examples'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Examples>['examples'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examples")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withExclusiveMaximum(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMaximum'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMaximum'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusiveMaximum")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withExclusiveMinimum(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMinimum'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMinimum'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusiveMinimum")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withItems(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['items'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['items'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withMaxItems(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxItems'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxItems'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItems")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withMaxLength(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxLength'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxLength'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withMaxProperties(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxProperties'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxProperties'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxProperties")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withMaximum(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['maximum'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['maximum'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withMinItems(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['minItems'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['minItems'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minItems")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withMinLength(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['minLength'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['minLength'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withMinProperties(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['minProperties'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['minProperties'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minProperties")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withMinimum(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['minimum'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['minimum'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withMultipleOf(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['multipleOf'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['multipleOf'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleOf")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withNot(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['not'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['not'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withOneOf(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['oneOf'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['oneOf'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneOf")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withPattern(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['pattern'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['pattern'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withProperties(
      value: (js.Array[Schema], js.Array[String], AdditionalProperties, Options_[Schema]) => Pick[Schema, properties | patternProperties | additionalProperties]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withPropertyNames(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.PropertyNames>['propertyNames'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.PropertyNames>['propertyNames'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyNames")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withRequired(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['required'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['required'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withTitle(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['title'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['title'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withType(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['type'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['type'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withUniqueItems(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['uniqueItems'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['uniqueItems'] */ js.Any
        ]
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueItems")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

