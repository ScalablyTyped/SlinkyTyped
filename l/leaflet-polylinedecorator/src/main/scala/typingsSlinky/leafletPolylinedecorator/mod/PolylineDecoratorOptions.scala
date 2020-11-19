package typingsSlinky.leafletPolylinedecorator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolylineDecoratorOptions extends js.Object {
  
  var patterns: js.Array[Pattern] = js.native
}
object PolylineDecoratorOptions {
  
  @scala.inline
  def apply(patterns: js.Array[Pattern]): PolylineDecoratorOptions = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolylineDecoratorOptions]
  }
  
  @scala.inline
  implicit class PolylineDecoratorOptionsOps[Self <: PolylineDecoratorOptions] (val x: Self) extends AnyVal {
    
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
    def setPatternsVarargs(value: Pattern*): Self = this.set("patterns", js.Array(value :_*))
    
    @scala.inline
    def setPatterns(value: js.Array[Pattern]): Self = this.set("patterns", value.asInstanceOf[js.Any])
  }
}
