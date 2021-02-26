package typingsSlinky.aureliaTemplating.mod

import typingsSlinky.std.HTMLTemplateElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStaticViewStrategyConfig extends StObject {
  
  var dependencies: js.UndefOr[js.Array[js.Function] | js.Object] = js.native
  
  var template: String | HTMLTemplateElement = js.native
}
object IStaticViewStrategyConfig {
  
  @scala.inline
  def apply(template: String | HTMLTemplateElement): IStaticViewStrategyConfig = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStaticViewStrategyConfig]
  }
  
  @scala.inline
  implicit class IStaticViewStrategyConfigMutableBuilder[Self <: IStaticViewStrategyConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDependencies(value: js.Array[js.Function] | js.Object): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    @scala.inline
    def setDependenciesVarargs(value: js.Function*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
    
    @scala.inline
    def setTemplate(value: String | HTMLTemplateElement): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
