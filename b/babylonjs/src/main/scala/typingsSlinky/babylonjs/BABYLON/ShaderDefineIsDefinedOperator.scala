package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShaderDefineIsDefinedOperator extends ShaderDefineExpression {
  var define: String = js.native
  var not: Boolean = js.native
}

object ShaderDefineIsDefinedOperator {
  @scala.inline
  def apply(
    define: String,
    isTrue: org.scalablytyped.runtime.StringDictionary[String] => Boolean,
    not: Boolean
  ): ShaderDefineIsDefinedOperator = {
    val __obj = js.Dynamic.literal(define = define.asInstanceOf[js.Any], isTrue = js.Any.fromFunction1(isTrue), not = not.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderDefineIsDefinedOperator]
  }
  @scala.inline
  implicit class ShaderDefineIsDefinedOperatorOps[Self <: ShaderDefineIsDefinedOperator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("define")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

