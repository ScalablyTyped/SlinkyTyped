package typingsSlinky.fastGlob.matcherMod

import typingsSlinky.fastGlob.fastGlobBooleans.`true`
import typingsSlinky.fastGlob.typesMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicPatternSegment extends PatternSegment {
  
  var dynamic: `true` = js.native
  
  var pattern: Pattern = js.native
  
  var patternRe: js.RegExp = js.native
}
object DynamicPatternSegment {
  
  @scala.inline
  def apply(dynamic: `true`, pattern: Pattern, patternRe: js.RegExp): DynamicPatternSegment = {
    val __obj = js.Dynamic.literal(dynamic = dynamic.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], patternRe = patternRe.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicPatternSegment]
  }
  
  @scala.inline
  implicit class DynamicPatternSegmentOps[Self <: DynamicPatternSegment] (val x: Self) extends AnyVal {
    
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
    def setDynamic(value: `true`): Self = this.set("dynamic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: Pattern): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternRe(value: js.RegExp): Self = this.set("patternRe", value.asInstanceOf[js.Any])
  }
}
