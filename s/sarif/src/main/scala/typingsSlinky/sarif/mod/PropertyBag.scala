package typingsSlinky.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyBag
  extends /**
  * Additional Properties
  */
/* key */ StringDictionary[js.Any] {
  
  /**
    * A set of distinct strings that provide additional information.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}
object PropertyBag {
  
  @scala.inline
  def apply(): PropertyBag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyBag]
  }
  
  @scala.inline
  implicit class PropertyBagMutableBuilder[Self <: PropertyBag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
