package typingsSlinky.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnitDefinition extends StObject {
  
  var aliases: js.UndefOr[js.Array[String]] = js.native
  
  var definition: js.UndefOr[String | Unit] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var prefixes: js.UndefOr[String] = js.native
}
object UnitDefinition {
  
  @scala.inline
  def apply(): UnitDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnitDefinition]
  }
  
  @scala.inline
  implicit class UnitDefinitionMutableBuilder[Self <: UnitDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
    
    @scala.inline
    def setDefinition(value: String | Unit): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPrefixes(value: String): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixesUndefined: Self = StObject.set(x, "prefixes", js.undefined)
  }
}
