package typingsSlinky.node.inspectorMod.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Coverage data for a source range.
  */
@js.native
trait CoverageRange extends StObject {
  
  /**
    * Collected execution count of the source range.
    */
  var count: Double = js.native
  
  /**
    * JavaScript script source offset for the range end.
    */
  var endOffset: Double = js.native
  
  /**
    * JavaScript script source offset for the range start.
    */
  var startOffset: Double = js.native
}
object CoverageRange {
  
  @scala.inline
  def apply(count: Double, endOffset: Double, startOffset: Double): CoverageRange = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageRange]
  }
  
  @scala.inline
  implicit class CoverageRangeMutableBuilder[Self <: CoverageRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
  }
}
