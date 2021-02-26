package typingsSlinky.jstree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSTreeStaticDefaultsUnique extends StObject {
  
  /**
    * Indicates if the comparison should be case sensitive. Default is `false`.
    * @name $.jstree.defaults.unique.case_sensitive
    * @plugin unique
    */
  var case_sensitive: Boolean = js.native
  
  /**
    * A callback executed in the instance's scope when a new node is created
    * and the name is already taken, the two arguments are the conflicting name and the counter.
    * The default will produce results like `New node (2)`.
    * @name $.jstree.defaults.unique.duplicate
    * @plugin unique
    */
  def duplicate(name: String, counter: Double): String = js.native
  
  /**
    * Indicates if white space should be trimmed before the comparison. Default is `false`.
    * @name $.jstree.defaults.unique.trim_whitespace
    * @plugin unique
    */
  var trim_whitespace: Boolean = js.native
}
object JSTreeStaticDefaultsUnique {
  
  @scala.inline
  def apply(case_sensitive: Boolean, duplicate: (String, Double) => String, trim_whitespace: Boolean): JSTreeStaticDefaultsUnique = {
    val __obj = js.Dynamic.literal(case_sensitive = case_sensitive.asInstanceOf[js.Any], duplicate = js.Any.fromFunction2(duplicate), trim_whitespace = trim_whitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSTreeStaticDefaultsUnique]
  }
  
  @scala.inline
  implicit class JSTreeStaticDefaultsUniqueMutableBuilder[Self <: JSTreeStaticDefaultsUnique] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCase_sensitive(value: Boolean): Self = StObject.set(x, "case_sensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicate(value: (String, Double) => String): Self = StObject.set(x, "duplicate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTrim_whitespace(value: Boolean): Self = StObject.set(x, "trim_whitespace", value.asInstanceOf[js.Any])
  }
}
