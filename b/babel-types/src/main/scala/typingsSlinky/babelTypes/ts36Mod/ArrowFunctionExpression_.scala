package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.ArrowFunctionExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrowFunctionExpression_
  extends Node
     with BlockParent
     with Expression
     with Function
     with FunctionParent
     with Pureish
     with Scopable {
  
  var async: Boolean = js.native
  
  var body: BlockStatement_ | Expression = js.native
  
  var expression: Boolean = js.native
  
  var generator: Boolean = js.native
  
  var id: Identifier_ = js.native
  
  var params: js.Array[LVal] = js.native
  
  var returnType: js.UndefOr[TypeAnnotation_] = js.native
  
  var typeParameters: js.UndefOr[TypeParameterDeclaration_] = js.native
  
  @JSName("type")
  var type_ArrowFunctionExpression_ : ArrowFunctionExpression = js.native
}
object ArrowFunctionExpression_ {
  
  @scala.inline
  def apply(
    async: Boolean,
    body: BlockStatement_ | Expression,
    end: Double,
    expression: Boolean,
    generator: Boolean,
    id: Identifier_,
    loc: SourceLocation,
    params: js.Array[LVal],
    start: Double,
    `type`: ArrowFunctionExpression
  ): ArrowFunctionExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowFunctionExpression_]
  }
  
  @scala.inline
  implicit class ArrowFunctionExpression_Ops[Self <: ArrowFunctionExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: BlockStatement_ | Expression): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpression(value: Boolean): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerator(value: Boolean): Self = this.set("generator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Identifier_): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: LVal*): Self = this.set("params", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: js.Array[LVal]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ArrowFunctionExpression): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: TypeAnnotation_): Self = this.set("returnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnType: Self = this.set("returnType", js.undefined)
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_): Self = this.set("typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeParameters: Self = this.set("typeParameters", js.undefined)
  }
}
