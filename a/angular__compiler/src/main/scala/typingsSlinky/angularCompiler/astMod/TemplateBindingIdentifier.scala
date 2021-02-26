package typingsSlinky.angularCompiler.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateBindingIdentifier extends StObject {
  
  var source: String = js.native
  
  var span: AbsoluteSourceSpan = js.native
}
object TemplateBindingIdentifier {
  
  @scala.inline
  def apply(source: String, span: AbsoluteSourceSpan): TemplateBindingIdentifier = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateBindingIdentifier]
  }
  
  @scala.inline
  implicit class TemplateBindingIdentifierMutableBuilder[Self <: TemplateBindingIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpan(value: AbsoluteSourceSpan): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
  }
}
