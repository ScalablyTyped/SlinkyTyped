package typingsSlinky.angularCore

import typingsSlinky.angularCompiler.mod.PropertyWrite
import typingsSlinky.angularCompiler.r3AstMod.NullVisitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlVariableAssignmentVisitorMod {
  
  @JSImport("@angular/core/schematics/migrations/template-var-assignment/angular/html_variable_assignment_visitor", "HtmlVariableAssignmentVisitor")
  @js.native
  class HtmlVariableAssignmentVisitor () extends NullVisitor {
    
    var currentVariables: js.Any = js.native
    
    var expressionAstVisitor: js.Any = js.native
    
    var variableAssignments: js.Array[TemplateVariableAssignment] = js.native
  }
  
  @js.native
  trait TemplateVariableAssignment extends StObject {
    
    var end: Double = js.native
    
    var node: PropertyWrite = js.native
    
    var start: Double = js.native
  }
  object TemplateVariableAssignment {
    
    @scala.inline
    def apply(end: Double, node: PropertyWrite, start: Double): TemplateVariableAssignment = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateVariableAssignment]
    }
    
    @scala.inline
    implicit class TemplateVariableAssignmentMutableBuilder[Self <: TemplateVariableAssignment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: PropertyWrite): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
