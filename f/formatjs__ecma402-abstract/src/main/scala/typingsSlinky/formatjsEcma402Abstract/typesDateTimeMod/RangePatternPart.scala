package typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangePatternPart[T /* <: RangePatternType */] extends js.Object {
  
  var pattern: String = js.native
  
  var source: T = js.native
}
object RangePatternPart {
  
  @scala.inline
  def apply[T /* <: RangePatternType */](pattern: String, source: T): RangePatternPart[T] = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangePatternPart[T]]
  }
  
  @scala.inline
  implicit class RangePatternPartOps[Self <: RangePatternPart[_], T /* <: RangePatternType */] (val x: Self with RangePatternPart[T]) extends AnyVal {
    
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
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: T): Self = this.set("source", value.asInstanceOf[js.Any])
  }
}
