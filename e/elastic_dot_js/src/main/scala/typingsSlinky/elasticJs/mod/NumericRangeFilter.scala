package typingsSlinky.elasticJs.mod

import typingsSlinky.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "NumericRangeFilter")
@js.native
class NumericRangeFilter protected () extends Filter {
  /*
    A Filter that only accepts numeric values within a specified range.
    */
  def this(fieldName: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): NumericRangeFilter = js.native
  
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): NumericRangeFilter = js.native
  
  /*
    Returns the field name used to create this object.
    */
  def field(field: String): NumericRangeFilter = js.native
  
  /*
    Sets the endpoint for the current range.
    */
  def from(startPoint: Number): NumericRangeFilter = js.native
  
  /*
    Greater than value.  Same as setting from to the value, and
    include_lower to false,
    */
  def gt(`val`: js.Any): NumericRangeFilter = js.native
  
  /*
    Greater than or equal to value.  Same as setting from to the value,
    and include_lower to true.
    */
  def gte(`val`: js.Any): NumericRangeFilter = js.native
  
  /*
    Should the first from (if set) be inclusive or not.
    Defaults to true
    */
  def includeLower(trueFalse: Boolean): NumericRangeFilter = js.native
  
  /*
    Should the last to (if set) be inclusive or not. Defaults to true.
    */
  def includeUpper(trueFalse: Boolean): NumericRangeFilter = js.native
  
  /*
    Less than value.  Same as setting to to the value, and include_upper
    to false.
    */
  def lt(`val`: js.Any): NumericRangeFilter = js.native
  
  /*
    Less than or equal to value.  Same as setting to to the value,
    and include_upper to true.
    */
  def lte(`val`: js.Any): NumericRangeFilter = js.native
  
  /*
    Sets the filter name.
    */
  def name(name: String): NumericRangeFilter = js.native
  
  /*
    Sets the endpoint for the current range.
    */
  def to(endPoint: Number): NumericRangeFilter = js.native
  
  /*
    Returns the filter object.
    */
  def toJSON(): NumericRangeFilter = js.native
}
