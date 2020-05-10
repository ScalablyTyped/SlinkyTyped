package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ClassMethod
import typingsSlinky.babelTypes.babelTypesStrings.ClassPrivateMethod
import typingsSlinky.babelTypes.babelTypesStrings.ObjectMethod
import typingsSlinky.babelTypes.babelTypesStrings.constructor
import typingsSlinky.babelTypes.babelTypesStrings.get
import typingsSlinky.babelTypes.babelTypesStrings.method
import typingsSlinky.babelTypes.babelTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.ObjectMethod_
  - typingsSlinky.babelTypes.mod.ClassMethod_
  - typingsSlinky.babelTypes.mod.ClassPrivateMethod_
*/
trait Method extends _Node

object Method {
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
  ): Method = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
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
  ): Method = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
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
  ): Method = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
}

