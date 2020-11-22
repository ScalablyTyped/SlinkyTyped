package typingsSlinky.matterJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Common")
@js.native
class Common () extends js.Object
/* static members */
@JSImport("matter-js", "Common")
@js.native
object Common extends js.Object {
  
  /**
    * Used to require external libraries outside of the bundle.
    * It first looks for the `globalName` on the environment's global namespace.
    * If the global is not found, it will fall back to using the standard `require` using the `moduleName`.
    * @private
    * @method _requireGlobal
    * @param {string} globalName The global module name
    * @param {string} moduleName The fallback CommonJS module name
    * @return {} The loaded module
    */
  def _requireGlobal(globalName: String, moduleName: String): js.Any = js.native
  
  /**
    * Takes _n_ functions as arguments and returns a new function that calls them in order.
    * The arguments applied when calling the new function will also be applied to every function passed.
    * The value of `this` refers to the last value returned in the chain that was not `undefined`.
    * Therefore if a passed function does not return a value, the previously returned value is maintained.
    * After all passed functions have been called the new function returns the last returned value (if any).
    * If any of the passed functions are a chain, then the chain will be flattened.
    * @method chain
    * @param ...funcs {function} The functions to chain.
    * @return {function} A new function that calls the passed functions in order.
    */
  def chain(): js.Function = js.native
  
  /**
    * Chains a function to excute after the original function on the given `path` relative to `base`.
    * See also docs for `Common.chain`.
    * @method chainPathAfter
    * @param {} base The base object
    * @param {string} path The path relative to `base`
    * @param {function} func The function to chain after the original
    * @return {function} The chained function that replaced the original
    */
  def chainPathAfter(base: js.Object, path: String, func: js.Function): js.Function = js.native
  
  /**
    * Chains a function to excute before the original function on the given `path` relative to `base`.
    * See also docs for `Common.chain`.
    * @method chainPathBefore
    * @param {} base The base object
    * @param {string} path The path relative to `base`
    * @param {function} func The function to chain before the original
    * @return {function} The chained function that replaced the original
    */
  def chainPathBefore(base: js.Object, path: String, func: js.Function): js.Function = js.native
  
  /**
    * Randomly chooses a value from a list with equal probability.
    * The function uses a seeded random generator.
    * @method choose
    * @param {array} choices
    * @return {object} A random choice object from the array
    */
  def choose(choices: js.Array[_]): js.Any = js.native
  
  /**
    * Returns the given value clamped between a minimum and maximum value.
    * @method clamp
    * @param {number} value
    * @param {number} min
    * @param {number} max
    * @return {number} The value clamped between min and max inclusive
    */
  def clamp(value: Double, min: Double, max: Double): Double = js.native
  
  /**
    * Creates a new clone of the object, if deep is true references will also be cloned.
    * @method clone
    * @param {} obj
    * @param {bool} deep
    * @return {} obj cloned
    */
  def clone(obj: js.Object, deep: Boolean): js.Object = js.native
  
  /**
    * Converts a CSS hex colour string into an integer.
    * @method colorToNumber
    * @param {string} colorString
    * @return {number} An integer representing the CSS hex string
    */
  def colorToNumber(colorString: String): Double = js.native
  
  /**
    * Extends the object in the first argument using the object in the second argument.
    * @method extend
    * @param {} obj
    * @param {boolean} deep
    * @return {} obj extended
    */
  def extend(obj: js.Object, deep: Boolean): js.Object = js.native
  
  /**
    * Gets a value from `base` relative to the `path` string.
    * @method get
    * @param {} obj The base object
    * @param {string} path The path relative to `base`, e.g. 'Foo.Bar.baz'
    * @param {number} [begin] Path slice begin
    * @param {number} [end] Path slice end
    * @return {} The object at the given path
    */
  def get(obj: js.Object, path: String, begin: Double, end: Double): js.Object = js.native
  
  /**
    * A cross browser compatible indexOf implementation.
    * @method indexOf
    * @param {array} haystack
    * @param {object} needle
    * @return {number} The position of needle in haystack, otherwise -1.
    */
  def indexOf(haystack: js.Array[_], needle: js.Object): Double = js.native
  
  /**
    * Shows a `console.info` message only if the current `Common.logLevel` allows it.
    * The message will be prefixed with 'matter-js' to make it easily identifiable.
    * @method info
    * @param ...objs {} The objects to log.
    */
  def info(): js.Any = js.native
  
  /**
    * Returns true if the object is an array.
    * @method isArray
    * @param {object} obj
    * @return {boolean} True if the object is an array, otherwise false
    */
  def isArray(obj: js.Object): Boolean = js.native
  
  /**
    * Returns true if the object is a HTMLElement, otherwise false.
    * @method isElement
    * @param {object} obj
    * @return {boolean} True if the object is a HTMLElement, otherwise false
    */
  def isElement(obj: js.Object): Boolean = js.native
  
  /**
    * Returns true if the object is a function.
    * @method isFunction
    * @param {object} obj
    * @return {boolean} True if the object is a function, otherwise false
    */
  def isFunction(obj: js.Object): Boolean = js.native
  
  /**
    * Returns true if the object is a plain object.
    * @method isPlainObject
    * @param {object} obj
    * @return {boolean} True if the object is a plain object, otherwise false
    */
  def isPlainObject(obj: js.Object): Boolean = js.native
  
  /**
    * Returns true if the object is a string.
    * @method isString
    * @param {object} obj
    * @return {boolean} True if the object is a string, otherwise false
    */
  def isString(obj: js.Object): Boolean = js.native
  
  /**
    * Returns the list of keys for the given object.
    * @method keys
    * @param {} obj
    * @return {string[]} keys
    */
  def keys(obj: js.Object): js.Array[String] = js.native
  
  /**
    * Shows a `console.log` message only if the current `Common.logLevel` allows it.
    * The message will be prefixed with 'matter-js' to make it easily identifiable.
    * @method log
    * @param ...objs {} The objects to log.
    */
  def log(): js.Any = js.native
  
  /**
    * A cross browser compatible array map implementation.
    * @method map
    * @param {array} list
    * @param {function} func
    * @return {array} Values from list transformed by func.
    */
  def map(list: js.Array[_], funct: js.Function): js.Array[_] = js.native
  
  /**
    * Returns the next unique sequential ID.
    * @method nextId
    * @return {number} Unique sequential ID
    */
  def nextId(): Double = js.native
  
  /**
    * Returns the current timestamp since the time origin (e.g. from page load).
    * The result will be high-resolution including decimal places if available.
    * @method now
    * @return {number} the current timestamp
    */
  def now(): Double = js.native
  
  /**
    * Returns a random value between a minimum and a maximum value inclusive.
    * The function uses a seeded random generator.
    * @method random
    * @param {number} min
    * @param {number} max
    * @return {number} A random number between min and max inclusive
    */
  def random(): Double = js.native
  def random(min: js.UndefOr[scala.Nothing], max: Double): Double = js.native
  def random(min: Double): Double = js.native
  def random(min: Double, max: Double): Double = js.native
  
  /**
    * Sets a value on `base` relative to the given `path` string.
    * @method set
    * @param {} obj The base object
    * @param {string} path The path relative to `base`, e.g. 'Foo.Bar.baz'
    * @param {} val The value to set
    * @param {number} [begin] Path slice begin
    * @param {number} [end] Path slice end
    * @return {} Pass through `val` for chaining
    */
  def set(obj: js.Object, path: String, `val`: js.Object, begin: Double, end: Double): js.Object = js.native
  
  /**
    * Shuffles the given array in-place.
    * The function uses a seeded random generator.
    * @method shuffle
    * @param {array} array
    * @return {array} array shuffled randomly
    */
  def shuffle(array: js.Array[_]): js.Array[_] = js.native
  
  /**
    * Returns the sign of the given value.
    * @method sign
    * @param {number} value
    * @return {number} -1 if negative, +1 if 0 or positive
    */
  def sign(value: Double): Double = js.native
  
  /**
    * Takes a directed graph and returns the partially ordered set of vertices in topological order.
    * Circular dependencies are allowed.
    * @method topologicalSort
    * @param {object} graph
    * @return {array} Partially ordered set of vertices in topological order.
    */
  def topologicalSort(graph: js.Object): js.Array[_] = js.native
  
  /**
    * Returns the list of values for the given object.
    * @method values
    * @param {} obj
    * @return {array} Array of the objects property values
    */
  def values(obj: js.Object): js.Array[_] = js.native
  
  /**
    * Shows a `console.warn` message only if the current `Common.logLevel` allows it.
    * The message will be prefixed with 'matter-js' to make it easily identifiable.
    * @method warn
    * @param ...objs {} The objects to log.
    */
  def warn(): js.Any = js.native
}
