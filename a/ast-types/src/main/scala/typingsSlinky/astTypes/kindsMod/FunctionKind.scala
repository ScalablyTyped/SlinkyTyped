package typingsSlinky.astTypes.kindsMod

import typingsSlinky.astTypes.astTypesStrings.get
import typingsSlinky.astTypes.astTypesStrings.method
import typingsSlinky.astTypes.astTypesStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectMethod
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassMethod
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
*/
trait FunctionKind extends StObject
object FunctionKind {
  
  @scala.inline
  def ArrowFunctionExpression(
    body: BlockStatementKind | ExpressionKind,
    params: js.Array[PatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.ArrowFunctionExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression]
  }
  
  @scala.inline
  def ClassMethod(
    body: BlockStatementKind,
    key: LiteralKind | IdentifierKind | ExpressionKind,
    params: js.Array[PatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.ClassMethod
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassMethod = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassMethod]
  }
  
  @scala.inline
  def ClassPrivateMethod(
    body: BlockStatementKind,
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.ClassPrivateMethod
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod]
  }
  
  @scala.inline
  def FunctionDeclaration(
    body: BlockStatementKind,
    params: js.Array[PatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.FunctionDeclaration
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionDeclaration]
  }
  
  @scala.inline
  def FunctionExpression(
    body: BlockStatementKind,
    params: js.Array[PatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.FunctionExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionExpression]
  }
  
  @scala.inline
  def ObjectMethod(
    body: BlockStatementKind,
    key: LiteralKind | IdentifierKind | ExpressionKind,
    kind: method | get | set,
    params: js.Array[PatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectMethod
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectMethod = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectMethod]
  }
}
