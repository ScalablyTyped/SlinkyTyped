package typingsSlinky.asana.mod.resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Params extends StObject {
  
  var opt_expand: js.UndefOr[String] = js.native
  
  var opt_fields: js.UndefOr[String] = js.native
}
object Params {
  
  @scala.inline
  def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  
  @scala.inline
  implicit class ParamsMutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpt_expand(value: String): Self = StObject.set(x, "opt_expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpt_expandUndefined: Self = StObject.set(x, "opt_expand", js.undefined)
    
    @scala.inline
    def setOpt_fields(value: String): Self = StObject.set(x, "opt_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpt_fieldsUndefined: Self = StObject.set(x, "opt_fields", js.undefined)
  }
}
