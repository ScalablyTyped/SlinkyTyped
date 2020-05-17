package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShaderDefineAndOperator extends ShaderDefineExpression {
  var leftOperand: ShaderDefineExpression = js.native
  var rightOperand: ShaderDefineExpression = js.native
}

object ShaderDefineAndOperator {
  @scala.inline
  def apply(
    isTrue: org.scalablytyped.runtime.StringDictionary[String] => Boolean,
    leftOperand: ShaderDefineExpression,
    rightOperand: ShaderDefineExpression
  ): ShaderDefineAndOperator = {
    val __obj = js.Dynamic.literal(isTrue = js.Any.fromFunction1(isTrue), leftOperand = leftOperand.asInstanceOf[js.Any], rightOperand = rightOperand.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderDefineAndOperator]
  }
  @scala.inline
  implicit class ShaderDefineAndOperatorOps[Self <: ShaderDefineAndOperator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeftOperand(value: ShaderDefineExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftOperand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightOperand(value: ShaderDefineExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightOperand")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

