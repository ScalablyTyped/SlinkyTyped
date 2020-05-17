package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShaderCodeNode extends js.Object {
  var additionalDefineKey: js.UndefOr[String] = js.native
  var additionalDefineValue: js.UndefOr[String] = js.native
  var children: js.Array[ShaderCodeNode] = js.native
  var line: String = js.native
  def isValid(preprocessors: org.scalablytyped.runtime.StringDictionary[String]): Boolean = js.native
  def process(preprocessors: org.scalablytyped.runtime.StringDictionary[String], options: ProcessingOptions): String = js.native
}

object ShaderCodeNode {
  @scala.inline
  def apply(
    children: js.Array[ShaderCodeNode],
    isValid: org.scalablytyped.runtime.StringDictionary[String] => Boolean,
    line: String,
    process: (org.scalablytyped.runtime.StringDictionary[String], ProcessingOptions) => String
  ): ShaderCodeNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isValid = js.Any.fromFunction1(isValid), line = line.asInstanceOf[js.Any], process = js.Any.fromFunction2(process))
    __obj.asInstanceOf[ShaderCodeNode]
  }
  @scala.inline
  implicit class ShaderCodeNodeOps[Self <: ShaderCodeNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Array[ShaderCodeNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValid(value: org.scalablytyped.runtime.StringDictionary[String] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcess(value: (org.scalablytyped.runtime.StringDictionary[String], ProcessingOptions) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAdditionalDefineKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalDefineKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalDefineKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalDefineKey")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalDefineValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalDefineValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalDefineValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalDefineValue")(js.undefined)
        ret
    }
  }
  
}

