package typingsSlinky.babelTypes.indexTs37Mod

import typingsSlinky.babelTypes.babelTypesStrings.ArrowFunctionExpression
import typingsSlinky.babelTypes.babelTypesStrings.BigIntLiteral
import typingsSlinky.babelTypes.babelTypesStrings.BooleanLiteral
import typingsSlinky.babelTypes.babelTypesStrings.DecimalLiteral
import typingsSlinky.babelTypes.babelTypesStrings.FunctionDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.FunctionExpression
import typingsSlinky.babelTypes.babelTypesStrings.NullLiteral
import typingsSlinky.babelTypes.babelTypesStrings.NumericLiteral
import typingsSlinky.babelTypes.babelTypesStrings.RegExpLiteral
import typingsSlinky.babelTypes.babelTypesStrings.StringLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.indexTs37Mod.FunctionDeclaration_
  - typingsSlinky.babelTypes.indexTs37Mod.FunctionExpression_
  - typingsSlinky.babelTypes.indexTs37Mod.StringLiteral_
  - typingsSlinky.babelTypes.indexTs37Mod.NumericLiteral_
  - typingsSlinky.babelTypes.indexTs37Mod.NullLiteral_
  - typingsSlinky.babelTypes.indexTs37Mod.BooleanLiteral_
  - typingsSlinky.babelTypes.indexTs37Mod.RegExpLiteral_
  - typingsSlinky.babelTypes.indexTs37Mod.ArrowFunctionExpression_
  - typingsSlinky.babelTypes.indexTs37Mod.BigIntLiteral_
  - typingsSlinky.babelTypes.indexTs37Mod.DecimalLiteral_
*/
trait Pureish extends _Node
object Pureish {
  
  @scala.inline
  def FunctionExpression_(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    `type`: FunctionExpression
  ): Pureish = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pureish]
  }
  
  @scala.inline
  def NumericLiteral_(`type`: NumericLiteral, value: Double): Pureish = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pureish]
  }
  
  @scala.inline
  def StringLiteral_(`type`: StringLiteral, value: String): Pureish = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pureish]
  }
  
  @scala.inline
  def FunctionDeclaration_(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    `type`: FunctionDeclaration
  ): Pureish = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pureish]
  }
  
  @scala.inline
  def NullLiteral_(`type`: NullLiteral): Pureish = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pureish]
  }
  
  @scala.inline
  def RegExpLiteral_(flags: String, pattern: String, `type`: RegExpLiteral): Pureish = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pureish]
  }
  
  @scala.inline
  def BooleanLiteral_(`type`: BooleanLiteral, value: Boolean): Pureish = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pureish]
  }
  
  @scala.inline
  def ArrowFunctionExpression_(
    async: Boolean,
    body: BlockStatement_ | Expression,
    expression: Boolean,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    `type`: ArrowFunctionExpression
  ): Pureish = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pureish]
  }
  
  @scala.inline
  def DecimalLiteral_(`type`: DecimalLiteral, value: String): Pureish = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pureish]
  }
  
  @scala.inline
  def BigIntLiteral_(`type`: BigIntLiteral, value: String): Pureish = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pureish]
  }
}
