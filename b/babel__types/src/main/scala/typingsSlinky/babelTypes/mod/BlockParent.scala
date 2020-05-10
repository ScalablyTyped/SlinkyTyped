package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ArrowFunctionExpression
import typingsSlinky.babelTypes.babelTypesStrings.BlockStatement
import typingsSlinky.babelTypes.babelTypesStrings.CatchClause
import typingsSlinky.babelTypes.babelTypesStrings.ClassMethod
import typingsSlinky.babelTypes.babelTypesStrings.ClassPrivateMethod
import typingsSlinky.babelTypes.babelTypesStrings.DoWhileStatement
import typingsSlinky.babelTypes.babelTypesStrings.ForInStatement
import typingsSlinky.babelTypes.babelTypesStrings.ForOfStatement
import typingsSlinky.babelTypes.babelTypesStrings.ForStatement
import typingsSlinky.babelTypes.babelTypesStrings.FunctionDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.FunctionExpression
import typingsSlinky.babelTypes.babelTypesStrings.ObjectMethod
import typingsSlinky.babelTypes.babelTypesStrings.Program
import typingsSlinky.babelTypes.babelTypesStrings.SwitchStatement
import typingsSlinky.babelTypes.babelTypesStrings.TSModuleBlock
import typingsSlinky.babelTypes.babelTypesStrings.WhileStatement
import typingsSlinky.babelTypes.babelTypesStrings.constructor
import typingsSlinky.babelTypes.babelTypesStrings.get
import typingsSlinky.babelTypes.babelTypesStrings.method
import typingsSlinky.babelTypes.babelTypesStrings.module
import typingsSlinky.babelTypes.babelTypesStrings.script
import typingsSlinky.babelTypes.babelTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.BlockStatement_
  - typingsSlinky.babelTypes.mod.CatchClause_
  - typingsSlinky.babelTypes.mod.DoWhileStatement_
  - typingsSlinky.babelTypes.mod.ForInStatement_
  - typingsSlinky.babelTypes.mod.ForStatement_
  - typingsSlinky.babelTypes.mod.FunctionDeclaration_
  - typingsSlinky.babelTypes.mod.FunctionExpression_
  - typingsSlinky.babelTypes.mod.Program_
  - typingsSlinky.babelTypes.mod.ObjectMethod_
  - typingsSlinky.babelTypes.mod.SwitchStatement_
  - typingsSlinky.babelTypes.mod.WhileStatement_
  - typingsSlinky.babelTypes.mod.ArrowFunctionExpression_
  - typingsSlinky.babelTypes.mod.ForOfStatement_
  - typingsSlinky.babelTypes.mod.ClassMethod_
  - typingsSlinky.babelTypes.mod.ClassPrivateMethod_
  - typingsSlinky.babelTypes.mod.TSModuleBlock_
*/
trait BlockParent extends _Node

object BlockParent {
  @scala.inline
  def ForInStatement_(body: Statement, left: VariableDeclaration_ | LVal, right: Expression, `type`: ForInStatement): BlockParent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockParent]
  }
  @scala.inline
  def Program_(
    body: js.Array[Statement],
    directives: js.Array[Directive_],
    sourceFile: String,
    sourceType: script | module,
    `type`: Program
  ): BlockParent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockParent]
  }
  @scala.inline
  def ObjectMethod_(
    async: Boolean,
    body: BlockStatement_,
    computed: Boolean,
    generator: Boolean,
    key: js.Any,
    kind: method | get | set,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    `type`: ObjectMethod
  ): BlockParent = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockParent]
  }
  @scala.inline
  def TSModuleBlock_(body: js.Array[Statement], `type`: TSModuleBlock): BlockParent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockParent]
  }
  @scala.inline
  def ClassMethod_(
    async: Boolean,
    body: BlockStatement_,
    computed: Boolean,
    generator: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression,
    kind: get | set | method | constructor,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    static: Boolean,
    `type`: ClassMethod
  ): BlockParent = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockParent]
  }
  @scala.inline
  def SwitchStatement_(cases: js.Array[SwitchCase_], discriminant: Expression, `type`: SwitchStatement): BlockParent = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockParent]
  }
  @scala.inline
  def FunctionExpression_(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    `type`: FunctionExpression
  ): BlockParent = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockParent]
  }
  @scala.inline
  def CatchClause_(body: BlockStatement_, `type`: CatchClause): BlockParent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockParent]
  }
  @scala.inline
  def BlockStatement_(body: js.Array[Statement], directives: js.Array[Directive_], `type`: BlockStatement): BlockParent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockParent]
  }
  @scala.inline
  def WhileStatement_(body: Statement, test: Expression, `type`: WhileStatement): BlockParent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockParent]
  }
  @scala.inline
  def ForOfStatement_(
    await: Boolean,
    body: Statement,
    left: VariableDeclaration_ | LVal,
    right: Expression,
    `type`: ForOfStatement
  ): BlockParent = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockParent]
  }
  @scala.inline
  def ArrowFunctionExpression_(
    async: Boolean,
    body: BlockStatement_ | Expression,
    expression: Boolean,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    `type`: ArrowFunctionExpression
  ): BlockParent = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockParent]
  }
  @scala.inline
  def FunctionDeclaration_(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    `type`: FunctionDeclaration
  ): BlockParent = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockParent]
  }
  @scala.inline
  def DoWhileStatement_(body: Statement, test: Expression, `type`: DoWhileStatement): BlockParent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockParent]
  }
  @scala.inline
  def ClassPrivateMethod_(
    async: Boolean,
    body: BlockStatement_,
    computed: Boolean,
    generator: Boolean,
    key: PrivateName_,
    kind: get | set | method | constructor,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    returnType: js.Any,
    static: Boolean,
    `type`: ClassPrivateMethod,
    typeParameters: js.Any
  ): BlockParent = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockParent]
  }
  @scala.inline
  def ForStatement_(body: Statement, `type`: ForStatement): BlockParent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockParent]
  }
}

