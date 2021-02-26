package typingsSlinky.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.estree.mod.ClassDeclaration
  - typingsSlinky.estree.mod.ClassExpression
*/
trait Class extends Node
object Class {
  
  @scala.inline
  def ClassDeclaration(body: ClassBody, `type`: typingsSlinky.estree.estreeStrings.ClassDeclaration): typingsSlinky.estree.mod.ClassDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ClassDeclaration]
  }
  
  @scala.inline
  def ClassExpression(body: ClassBody, `type`: typingsSlinky.estree.estreeStrings.ClassExpression): typingsSlinky.estree.mod.ClassExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ClassExpression]
  }
}
