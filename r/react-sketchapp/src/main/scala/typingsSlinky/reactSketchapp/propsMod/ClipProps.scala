package typingsSlinky.reactSketchapp.propsMod

import typingsSlinky.reactSketchapp.reactSketchappStrings.evenodd
import typingsSlinky.reactSketchapp.reactSketchappStrings.nonzero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClipProps extends StObject {
  
  var clipPath: js.UndefOr[String] = js.native
  
  var clipRule: js.UndefOr[evenodd | nonzero] = js.native
}
object ClipProps {
  
  @scala.inline
  def apply(): ClipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClipProps]
  }
  
  @scala.inline
  implicit class ClipPropsMutableBuilder[Self <: ClipProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
    
    @scala.inline
    def setClipRule(value: evenodd | nonzero): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
  }
}
