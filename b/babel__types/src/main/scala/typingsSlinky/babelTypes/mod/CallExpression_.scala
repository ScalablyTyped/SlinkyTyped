package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesBooleans.`false`
import typingsSlinky.babelTypes.babelTypesBooleans.`true`
import typingsSlinky.babelTypes.babelTypesStrings.CallExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait CallExpression_
  extends Expression
     with BaseNode {
  var arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_] = js.native
  var callee: Expression | V8IntrinsicIdentifier_ = js.native
  var optional: `true` | `false` | Null = js.native
  var typeArguments: TypeParameterInstantiation_ | Null = js.native
  var typeParameters: TSTypeParameterInstantiation_ | Null = js.native
  @JSName("type")
  var type_CallExpression_ : CallExpression = js.native
}

object CallExpression_ {
  @scala.inline
  def apply(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_],
    callee: Expression | V8IntrinsicIdentifier_,
    `type`: CallExpression
  ): CallExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallExpression_]
  }
  @scala.inline
  implicit class CallExpression_Ops[Self <: CallExpression_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArguments(value: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallee(value: Expression | V8IntrinsicIdentifier_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: CallExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptional(value: `true` | `false`): Self = {
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
    def withTypeArguments(value: TypeParameterInstantiation_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeArgumentsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeArguments")(null)
        ret
    }
    @scala.inline
    def withTypeParameters(value: TSTypeParameterInstantiation_): Self = {
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

