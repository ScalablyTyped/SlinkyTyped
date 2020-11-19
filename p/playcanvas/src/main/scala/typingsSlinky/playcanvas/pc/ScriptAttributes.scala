package typingsSlinky.playcanvas.pc

import typingsSlinky.playcanvas.anon.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Container of Script Attribute definitions. Implements an interface to add/remove attributes and store their definition for a {@link pc.ScriptType}.
  * Note: An instance of pc.ScriptAttributes is created automatically by each {@link pc.ScriptType}.
  * @param scriptType - Script Type that attributes relate to.
  */
@js.native
trait ScriptAttributes extends js.Object {
  
  /**
    * Add Attribute.
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
    * @param name - Name of an attribute.
    * @param args - Object with Arguments for an attribute.
    * @param args.type - Type of an attribute value.
    * @param [args.default] - Default attribute value.
    * @param [args.title] - Title for Editor's for field UI.
    * @param [args.description] - Description for Editor's for field UI.
    * @param [args.placeholder] - Placeholder for Editor's for field UI.
    * For multi-field types, such as vec2, vec3, and others use array of strings.
    * @param [args.array] - If attribute can hold single or multiple values.
    * @param [args.size] - If attribute is array, maximum number of values can be set.
    * @param [args.min] - Minimum value for type 'number', if max and min defined, slider will be rendered in Editor's UI.
    * @param [args.max] - Maximum value for type 'number', if max and min defined, slider will be rendered in Editor's UI.
    * @param [args.precision] - Level of precision for field type 'number' with floating values.
    * @param [args.step] - Step value for type 'number'. The amount used to increment the value when using the arrow keys in the Editor's UI.
    * @param [args.assetType] - Name of asset type to be used in 'asset' type attribute picker in Editor's UI, defaults to '*' (all).
    * @param [args.curves] - List of names for Curves for field type 'curve'.
    * @param [args.color] - String of color channels for Curves for field type 'curve', can be any combination of `rgba` characters.
    * Defining this property will render Gradient in Editor's field UI.
    * @param [args.enum] - List of fixed choices for field, defined as array of objects, where key in object is a title of an option.
    */
  def add(name: String, args: Array): Unit = js.native
  
  /**
    * Get object with attribute arguments.
    * Note: Changing argument properties will not affect existing Script Instances.
    * @example
    * // changing default value for an attribute 'fullName'
    * var attr = PlayerController.attributes.get('fullName');
    * if (attr) attr.default = 'Unknown';
    * @param name - Name of an attribute.
    * @returns Arguments with attribute properties.
    */
  def get(name: String): js.Any = js.native
  
  /**
    * Detect if Attribute is added.
    * @example
    * if (PlayerController.attributes.has('fullName')) {
    *     // attribute fullName is defined
    * }
    * @param name - Name of an attribute.
    * @returns True if Attribute is defined.
    */
  def has(name: String): Boolean = js.native
  
  /**
    * Remove Attribute.
    * @example
    * PlayerController.attributes.remove('fullName');
    * @param name - Name of an attribute.
    * @returns True if removed or false if not defined.
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: (String, Array) => Unit): Self = this.set("add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGet(value: String => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: String => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: String => Boolean): Self = this.set("remove", js.Any.fromFunction1(value))
  }
}
