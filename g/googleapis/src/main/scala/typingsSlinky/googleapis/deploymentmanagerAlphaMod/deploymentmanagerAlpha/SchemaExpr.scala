package typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an expression text. Example:  title: &quot;User account
  * presence&quot; description: &quot;Determines whether the request has a user
  * account&quot; expression: &quot;size(request.user) &gt; 0&quot;
  */
@js.native
trait SchemaExpr extends StObject {
  
  /**
    * An optional description of the expression. This is a longer text which
    * describes the expression, e.g. when hovered over it in a UI.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Textual representation of an expression in Common Expression Language
    * syntax.  The application context of the containing message determines
    * which well-known feature set of CEL is supported.
    */
  var expression: js.UndefOr[String] = js.native
  
  /**
    * An optional string indicating the location of the expression for error
    * reporting, e.g. a file name and a position in the file.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * An optional title for the expression, i.e. a short string describing its
    * purpose. This can be used e.g. in UIs which allow to enter the
    * expression.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaExpr {
  
  @scala.inline
  def apply(): SchemaExpr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExpr]
  }
  
  @scala.inline
  implicit class SchemaExprMutableBuilder[Self <: SchemaExpr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
