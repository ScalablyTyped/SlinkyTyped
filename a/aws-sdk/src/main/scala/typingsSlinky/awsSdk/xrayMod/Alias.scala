package typingsSlinky.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alias extends StObject {
  
  /**
    * The canonical name of the alias.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * A list of names for the alias, including the canonical name.
    */
  var Names: js.UndefOr[AliasNames] = js.native
  
  /**
    * The type of the alias.
    */
  var Type: js.UndefOr[String] = js.native
}
object Alias {
  
  @scala.inline
  def apply(): Alias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alias]
  }
  
  @scala.inline
  implicit class AliasMutableBuilder[Self <: Alias] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setNames(value: AliasNames): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = StObject.set(x, "Names", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
