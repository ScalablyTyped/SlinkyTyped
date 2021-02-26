package typingsSlinky.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AtRuleNewProps extends ContainerNewProps {
  
  /**
    * The identifier that immediately follows the @.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * These are the values that follow the at-rule's name, but precede any {}
    * block. The spec refers to this area as the at-rule's "prelude".
    */
  var params: js.UndefOr[String | Double] = js.native
  
  @JSName("raws")
  var raws_AtRuleNewProps: js.UndefOr[AtRuleRaws] = js.native
}
object AtRuleNewProps {
  
  @scala.inline
  def apply(): AtRuleNewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AtRuleNewProps]
  }
  
  @scala.inline
  implicit class AtRuleNewPropsMutableBuilder[Self <: AtRuleNewProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParams(value: String | Double): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setRaws(value: AtRuleRaws): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawsUndefined: Self = StObject.set(x, "raws", js.undefined)
  }
}
