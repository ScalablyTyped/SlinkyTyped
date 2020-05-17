package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShaderCodeTestNode extends ShaderCodeNode {
  var testExpression: ShaderDefineExpression = js.native
}

object ShaderCodeTestNode {
  @scala.inline
  def apply(
    children: js.Array[ShaderCodeNode],
    isValid: org.scalablytyped.runtime.StringDictionary[String] => Boolean,
    line: String,
    process: (org.scalablytyped.runtime.StringDictionary[String], ProcessingOptions) => String,
    testExpression: ShaderDefineExpression
  ): ShaderCodeTestNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isValid = js.Any.fromFunction1(isValid), line = line.asInstanceOf[js.Any], process = js.Any.fromFunction2(process), testExpression = testExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderCodeTestNode]
  }
  @scala.inline
  implicit class ShaderCodeTestNodeOps[Self <: ShaderCodeTestNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTestExpression(value: ShaderDefineExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testExpression")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

