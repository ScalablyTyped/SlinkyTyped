package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TSDeclareMethod
import typingsSlinky.babelTypes.babelTypesStrings.`private`
import typingsSlinky.babelTypes.babelTypesStrings.`protected`
import typingsSlinky.babelTypes.babelTypesStrings.constructor
import typingsSlinky.babelTypes.babelTypesStrings.get
import typingsSlinky.babelTypes.babelTypesStrings.method
import typingsSlinky.babelTypes.babelTypesStrings.public
import typingsSlinky.babelTypes.babelTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSDeclareMethod_
  extends BaseNode
     with Node {
  var `abstract`: Boolean | Null = js.native
  var access: public | `private` | `protected` | Null = js.native
  var accessibility: public | `private` | `protected` | Null = js.native
  var async: Boolean = js.native
  var computed: Boolean = js.native
  var decorators: js.Array[Decorator_] | Null = js.native
  var generator: Boolean = js.native
  var key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression = js.native
  var kind: get | set | method | constructor = js.native
  var optional: Boolean | Null = js.native
  var params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_] = js.native
  var returnType: TSTypeAnnotation_ | Noop_ | Null = js.native
  var static: Boolean = js.native
  var typeParameters: TSTypeParameterDeclaration_ | Noop_ | Null = js.native
  @JSName("type")
  var type_TSDeclareMethod_ : TSDeclareMethod = js.native
}

object TSDeclareMethod_ {
  @scala.inline
  def apply(
    async: Boolean,
    computed: Boolean,
    generator: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression,
    kind: get | set | method | constructor,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    static: Boolean,
    `type`: TSDeclareMethod
  ): TSDeclareMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSDeclareMethod_]
  }
  @scala.inline
  implicit class TSDeclareMethod_Ops[Self <: TSDeclareMethod_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComputed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: get | set | method | constructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TSDeclareMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbstract(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abstract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbstractNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abstract")(null)
        ret
    }
    @scala.inline
    def withAccess(value: public | `private` | `protected`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(null)
        ret
    }
    @scala.inline
    def withAccessibility(value: public | `private` | `protected`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessibilityNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(null)
        ret
    }
    @scala.inline
    def withDecorators(value: js.Array[Decorator_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecoratorsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorators")(null)
        ret
    }
    @scala.inline
    def withOptional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionalNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(null)
        ret
    }
    @scala.inline
    def withReturnType(value: TSTypeAnnotation_ | Noop_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnType")(null)
        ret
    }
    @scala.inline
    def withTypeParameters(value: TSTypeParameterDeclaration_ | Noop_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeParametersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameters")(null)
        ret
    }
  }
  
}

