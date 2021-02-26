package typingsSlinky.rollup.anon

import typingsSlinky.rollup.mod.SourceMapInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Code extends StObject {
  
  var code: String = js.native
  
  var map: js.UndefOr[SourceMapInput] = js.native
}
object Code {
  
  @scala.inline
  def apply(code: String): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  @scala.inline
  implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: SourceMapInput): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapNull: Self = StObject.set(x, "map", null)
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
  }
}
