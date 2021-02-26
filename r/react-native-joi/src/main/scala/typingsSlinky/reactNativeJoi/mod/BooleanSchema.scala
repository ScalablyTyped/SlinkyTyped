package typingsSlinky.reactNativeJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.reactNativeJoi.mod._SchemaLike because Already inherited
- typingsSlinky.reactNativeJoi.mod._Schema because Already inherited */ @js.native
trait BooleanSchema extends AnySchema {
  
  /**
    * Allows for additional values to be considered valid booleans by converting them to false during validation.
    * Accepts a value or an array of values. String comparisons are by default case insensitive,
    * see boolean.insensitive() to change this behavior.
    * @param values - strings, numbers or arrays of them
    */
  def falsy(values: (String | Double | (js.Array[Double | String]))*): this.type = js.native
  
  /**
    * Allows the values provided to truthy and falsy as well as the "true" and "false" default conversion
    * (when not in strict() mode) to be matched in a case insensitive manner.
    */
  def insensitive(): this.type = js.native
  def insensitive(enabled: Boolean): this.type = js.native
  
  /**
    * Allows for additional values to be considered valid booleans by converting them to true during validation.
    * Accepts a value or an array of values. String comparisons are by default case insensitive,
    * see boolean.insensitive() to change this behavior.
    * @param values - strings, numbers or arrays of them
    */
  def truthy(values: (String | Double | (js.Array[Double | String]))*): this.type = js.native
}
