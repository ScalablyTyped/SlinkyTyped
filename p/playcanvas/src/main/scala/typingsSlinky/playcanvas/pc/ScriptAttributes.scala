package typingsSlinky.playcanvas.pc

import typingsSlinky.playcanvas.anon.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.ScriptAttributes
  * @classdesc Container of Script Attribute definitions. Implements an interface to add/remove attributes and store their definition for a {@link pc.ScriptType}.
  * Note: An instance of pc.ScriptAttributes is created automatically by each {@link pc.ScriptType}.
  * @param {pc.ScriptType} scriptType - Script Type that attributes relate to.
  */
@js.native
trait ScriptAttributes extends js.Object {
  /**
    * @function
    * @name pc.ScriptAttributes#add
    * @description Add Attribute.
    * @param {string} name - Name of an attribute.
    * @param {object} args - Object with Arguments for an attribute.
    * @param {("boolean"|"number"|"string"|"json"|"asset"|"entity"|"rgb"|"rgba"|"vec2"|"vec3"|"vec4"|"curve")} args.type - Type of an attribute value.
    * @param {*} [args.default] - Default attribute value.
    * @param {string} [args.title] - Title for Editor's for field UI.
    * @param {string} [args.description] - Description for Editor's for field UI.
    * @param {string|string[]} [args.placeholder] - Placeholder for Editor's for field UI.
    * For multi-field types, such as vec2, vec3, and others use array of strings.
    * @param {boolean} [args.array] - If attribute can hold single or multiple values.
    * @param {number} [args.size] - If attribute is array, maximum number of values can be set.
    * @param {number} [args.min] - Minimum value for type 'number', if max and min defined, slider will be rendered in Editor's UI.
    * @param {number} [args.max] - Maximum value for type 'number', if max and min defined, slider will be rendered in Editor's UI.
    * @param {number} [args.precision] - Level of precision for field type 'number' with floating values.
    * @param {number} [args.step] - Step value for type 'number'. The amount used to increment the value when using the arrow keys in the Editor's UI.
    * @param {string} [args.assetType] - Name of asset type to be used in 'asset' type attribute picker in Editor's UI, defaults to '*' (all).
    * @param {string[]} [args.curves] - List of names for Curves for field type 'curve'.
    * @param {string} [args.color] - String of color channels for Curves for field type 'curve', can be any combination of `rgba` characters.
    * Defining this property will render Gradient in Editor's field UI.
    * @param {object[]} [args.enum] - List of fixed choices for field, defined as array of objects, where key in object is a title of an option.
    * @example
    * PlayerController.attributes.add('fullName', {
    *     type: 'string'
    * });
    * @example
    * PlayerController.attributes.add('speed', {
    *     type: 'number',
    *     title: 'Speed',
    *     placeholder: 'km/h',
    *     default: 22.2
    * });
    * @example
    * PlayerController.attributes.add('resolution', {
    *     type: 'number',
    *     default: 32,
    *     enum: [
    *         { '32x32': 32 },
    *         { '64x64': 64 },
    *         { '128x128': 128 }
    *     ]
    * });
    */
  def add(name: String, args: Array): Unit = js.native
  /**
    * @function
    * @name pc.ScriptAttributes#get
    * @description Get object with attribute arguments.
    * Note: Changing argument properties will not affect existing Script Instances.
    * @param {string} name - Name of an attribute.
    * @returns {?object} Arguments with attribute properties.
    * @example
    * // changing default value for an attribute 'fullName'
    * var attr = PlayerController.attributes.get('fullName');
    * if (attr) attr.default = 'Unknown';
    */
  def get(name: String): js.Any = js.native
  /**
    * @function
    * @name pc.ScriptAttributes#has
    * @description Detect if Attribute is added.
    * @param {string} name - Name of an attribute.
    * @returns {boolean} True if Attribute is defined.
    * @example
    * if (PlayerController.attributes.has('fullName')) {
    *     // attribute fullName is defined
    * }
    */
  def has(name: String): Boolean = js.native
  /**
    * @function
    * @name pc.ScriptAttributes#remove
    * @description Remove Attribute.
    * @param {string} name - Name of an attribute.
    * @returns {boolean} True if removed or false if not defined.
    * @example
    * PlayerController.attributes.remove('fullName');
    */
  def remove(name: String): Boolean = js.native
}

object ScriptAttributes {
  @scala.inline
  def apply(
    add: (String, Array) => Unit,
    get: String => js.Any,
    has: String => Boolean,
    remove: String => Boolean
  ): ScriptAttributes = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[ScriptAttributes]
  }
  @scala.inline
  implicit class ScriptAttributesOps[Self <: ScriptAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (String, Array) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGet(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHas(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

