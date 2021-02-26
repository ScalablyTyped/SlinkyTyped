package typingsSlinky.knockstrap

import typingsSlinky.knockstrap.anon.Instance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutStatic extends StObject {
  
  var stringTemplateEngine: Instance = js.native
}
object KnockoutStatic {
  
  @scala.inline
  def apply(stringTemplateEngine: Instance): KnockoutStatic = {
    val __obj = js.Dynamic.literal(stringTemplateEngine = stringTemplateEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutStatic]
  }
  
  @scala.inline
  implicit class KnockoutStaticMutableBuilder[Self <: KnockoutStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStringTemplateEngine(value: Instance): Self = StObject.set(x, "stringTemplateEngine", value.asInstanceOf[js.Any])
  }
}
