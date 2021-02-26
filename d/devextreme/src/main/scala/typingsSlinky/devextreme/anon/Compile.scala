package typingsSlinky.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compile extends StObject {
  
  var compile: js.UndefOr[js.Function] = js.native
  
  var render: js.UndefOr[js.Function] = js.native
}
object Compile {
  
  @scala.inline
  def apply(): Compile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compile]
  }
  
  @scala.inline
  implicit class CompileMutableBuilder[Self <: Compile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompile(value: js.Function): Self = StObject.set(x, "compile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompileUndefined: Self = StObject.set(x, "compile", js.undefined)
    
    @scala.inline
    def setRender(value: js.Function): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
  }
}
