package typingsSlinky.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "FilterMixin")
@js.native
class FilterMixin () extends js.Object {
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): FilterMixin = js.native
  
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): FilterMixin = js.native
  
  /*
    Sets the filter name.
    */
  def name(name: String): FilterMixin = js.native
  
  /*
    Returns the filter object.
    */
  def toJSON(): FilterMixin = js.native
}
