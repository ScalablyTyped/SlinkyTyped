package typingsSlinky.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Key Value Targeting Expression.
  */
@js.native
trait SchemaKeyValueTargetingExpression extends StObject {
  
  /**
    * Keyword expression being targeted by the ad.
    */
  var expression: js.UndefOr[String] = js.native
}
object SchemaKeyValueTargetingExpression {
  
  @scala.inline
  def apply(): SchemaKeyValueTargetingExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyValueTargetingExpression]
  }
  
  @scala.inline
  implicit class SchemaKeyValueTargetingExpressionMutableBuilder[Self <: SchemaKeyValueTargetingExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
  }
}
