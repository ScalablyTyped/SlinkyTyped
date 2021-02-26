package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `LView` is subdivided to ranges where the actual data is stored. Some of these ranges such as
  * `decls` and `vars` are known at compile time. Other such as `i18n` and `expando` are runtime only
  * concepts.
  */
@js.native
trait LViewDebugRange extends StObject {
  
  /**
    * The merged content of the range. `t` contains data from `TView.data` and `l` contains `LView`
    * data at an index.
    */
  var content: js.Array[LViewDebugRangeContent] = js.native
  
  /**
    * The ending index in `LView` where the range ends. (Exclusive)
    */
  var end: Double = js.native
  
  /**
    * The length of the range
    */
  var length: Double = js.native
  
  /**
    * The starting index in `LView` where the range begins. (Inclusive)
    */
  var start: Double = js.native
}
object LViewDebugRange {
  
  @scala.inline
  def apply(content: js.Array[LViewDebugRangeContent], end: Double, length: Double, start: Double): LViewDebugRange = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[LViewDebugRange]
  }
  
  @scala.inline
  implicit class LViewDebugRangeMutableBuilder[Self <: LViewDebugRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: js.Array[LViewDebugRangeContent]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentVarargs(value: LViewDebugRangeContent*): Self = StObject.set(x, "content", js.Array(value :_*))
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
