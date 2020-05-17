package typingsSlinky.dotPropImmutable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dot-prop-immutable", "delete")
@js.native
object delete extends js.Object {
  /**
    * Delete a nested property/array by a dot path
    *
    * @param object - Object to delete the `path` value.
    * @param path - Path of the property in the object, using `.` to separate each nested key. Use `\\.` if you have a `.` in the key.
    * @example
    * ```
    * var obj = {foo: [{ bar: 'gold-unicorn'}, 'white-unicorn', 'silver-unicorn']};
    *
    * // delete
    * dotProp.delete(obj, 'foo.$end');
    * //=> {foo: [{ bar: 'gold-unicorn'}, 'white-unicorn']}
    *
    * dotProp.delete(obj, 'foo.0.bar');
    * //=> {foo: [{}, 'white-unicorn', 'silver-unicorn']}
    * ```
    */
  def apply[T /* <: ArrayOrObject */](`object`: T, path: Path): T = js.native
}

