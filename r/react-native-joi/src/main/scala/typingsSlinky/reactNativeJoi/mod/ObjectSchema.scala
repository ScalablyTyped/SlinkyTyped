package typingsSlinky.reactNativeJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.reactNativeJoi.mod._SchemaLike because Already inherited
- typingsSlinky.reactNativeJoi.mod._Schema because Already inherited */ @js.native
trait ObjectSchema extends AnySchema {
  
  /**
    * Defines an all-or-nothing relationship between keys where if one of the peers is present, all of them are required as well.
    * @param peers - the key names of which if one present, all are required. peers can be a single string value,
    * an array of string values, or each peer provided as an argument.
    */
  def and(peers: String*): this.type = js.native
  def and(peers: js.Array[String]): this.type = js.native
  
  /**
    * Appends the allowed object keys. If schema is null, undefined, or {}, no changes will be applied.
    */
  def append(): this.type = js.native
  def append(schema: SchemaMap): this.type = js.native
  
  /**
    * Verifies an assertion where.
    */
  def assert(ref: String, schema: SchemaLike): this.type = js.native
  def assert(ref: String, schema: SchemaLike, message: String): this.type = js.native
  def assert(ref: Reference, schema: SchemaLike): this.type = js.native
  def assert(ref: Reference, schema: SchemaLike, message: String): this.type = js.native
  
  def forbiddenKeys(children: String*): this.type = js.native
  /**
    * Sets the specified children to forbidden.
    *
    * @param children - can be a single string value, an array of string values, or each child provided as an argument.
    *
    *   const schema = Joi.object().keys({ a: { b: Joi.number().required() }, c: { d: Joi.string().required() } });
    *   const optionalSchema = schema.forbiddenKeys('a.b', 'c.d');
    *
    * The behavior is exactly the same as requiredKeys.
    */
  def forbiddenKeys(children: js.Array[String]): this.type = js.native
  
  /**
    * Sets or extends the allowed object keys.
    */
  def keys(): this.type = js.native
  def keys(schema: SchemaMap): this.type = js.native
  
  /**
    * Specifies the exact number of keys in the object.
    */
  def length(limit: Double): this.type = js.native
  
  /**
    * Specifies the maximum number of keys in the object.
    */
  def max(limit: Double): this.type = js.native
  
  /**
    * Specifies the minimum number of keys in the object.
    */
  def min(limit: Double): this.type = js.native
  
  /**
    * Defines a relationship between keys where not all peers can be present at the same time.
    * @param peers - the key names of which if one present, the others may not all be present.
    * peers can be a single string value, an array of string values, or each peer provided as an argument.
    */
  def nand(peers: String*): this.type = js.native
  def nand(peers: js.Array[String]): this.type = js.native
  
  def optionalKeys(children: String*): this.type = js.native
  /**
    * Sets the specified children to optional.
    *
    * @param children - can be a single string value, an array of string values, or each child provided as an argument.
    *
    * The behavior is exactly the same as requiredKeys.
    */
  def optionalKeys(children: js.Array[String]): this.type = js.native
  
  /**
    * Defines a relationship between keys where one of the peers is required (and more than one is allowed).
    */
  def or(peers: String*): this.type = js.native
  def or(peers: js.Array[String]): this.type = js.native
  
  /**
    * Defines an exclusive relationship between a set of keys where only one is allowed but none are required where:
    * `peers` - the exclusive key names that must not appear together but where none are required.
    */
  def oxor(peers: String*): this.type = js.native
  def oxor(peers: js.Array[String]): this.type = js.native
  
  /**
    * Specify validation rules for unknown keys matching a pattern.
    *
    * @param pattern - a pattern that can be either a regular expression or a joi schema that will be tested against the unknown key names
    * @param schema - the schema object matching keys must validate against
    */
  def pattern(pattern: js.RegExp, schema: SchemaLike): this.type = js.native
  def pattern(pattern: SchemaLike, schema: SchemaLike): this.type = js.native
  
  /**
    * Renames a key to another name (deletes the renamed key).
    */
  def rename(from: String, to: String): this.type = js.native
  def rename(from: String, to: String, options: RenameOptions): this.type = js.native
  
  def requiredKeys(children: String*): this.type = js.native
  /**
    * Sets the specified children to required.
    *
    * @param children - can be a single string value, an array of string values, or each child provided as an argument.
    *
    *   var schema = Joi.object().keys({ a: { b: Joi.number() }, c: { d: Joi.string() } });
    *   var requiredSchema = schema.requiredKeys('', 'a.b', 'c', 'c.d');
    *
    * Note that in this example '' means the current object, a is not required but b is, as well as c and d.
    */
  def requiredKeys(children: js.Array[String]): this.type = js.native
  
  /**
    * Requires the object to be a Joi schema instance.
    */
  def schema(): this.type = js.native
  
  /**
    * Requires the object to be an instance of a given constructor.
    *
    * @param constructor - the constructor function that the object must be an instance of.
    * @param name - an alternate name to use in validation errors. This is useful when the constructor function does not have a name.
    */
  // tslint:disable-next-line:ban-types
  def `type`(constructor: js.Function): this.type = js.native
  def `type`(constructor: js.Function, name: String): this.type = js.native
  
  /**
    * Overrides the handling of unknown keys for the scope of the current object only (does not apply to children).
    */
  def unknown(): this.type = js.native
  def unknown(allow: Boolean): this.type = js.native
  
  /**
    * Requires the presence of other keys whenever the specified key is present.
    */
  def `with`(key: String, peers: String): this.type = js.native
  def `with`(key: String, peers: js.Array[String]): this.type = js.native
  
  /**
    * Forbids the presence of other keys whenever the specified is present.
    */
  def without(key: String, peers: String): this.type = js.native
  def without(key: String, peers: js.Array[String]): this.type = js.native
  
  /**
    * Defines an exclusive relationship between a set of keys. one of them is required but not at the same time where:
    */
  def xor(peers: String*): this.type = js.native
  def xor(peers: js.Array[String]): this.type = js.native
}
