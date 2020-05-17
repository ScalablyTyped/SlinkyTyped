package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShaderDefineExpression extends js.Object {
  def isTrue(preprocessors: org.scalablytyped.runtime.StringDictionary[String]): Boolean = js.native
}

object ShaderDefineExpression {
  @scala.inline
  def apply(isTrue: org.scalablytyped.runtime.StringDictionary[String] => Boolean): ShaderDefineExpression = {
    val __obj = js.Dynamic.literal(isTrue = js.Any.fromFunction1(isTrue))
    __obj.asInstanceOf[ShaderDefineExpression]
  }
  @scala.inline
  implicit class ShaderDefineExpressionOps[Self <: ShaderDefineExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsTrue(value: org.scalablytyped.runtime.StringDictionary[String] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrue")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

