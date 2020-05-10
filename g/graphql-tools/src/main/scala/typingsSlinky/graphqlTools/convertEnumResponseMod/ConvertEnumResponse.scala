package typingsSlinky.graphqlTools.convertEnumResponseMod

import typingsSlinky.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConvertEnumResponse extends Transform {
  var enumNode: js.Any = js.native
  @JSName("transformResult")
  def transformResult_MConvertEnumResponse(result: js.Any): js.Any = js.native
}

object ConvertEnumResponse {
  @scala.inline
  def apply(enumNode: js.Any, transformResult: js.Any => js.Any): ConvertEnumResponse = {
    val __obj = js.Dynamic.literal(enumNode = enumNode.asInstanceOf[js.Any], transformResult = js.Any.fromFunction1(transformResult))
    __obj.asInstanceOf[ConvertEnumResponse]
  }
  @scala.inline
  implicit class ConvertEnumResponseOps[Self <: ConvertEnumResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumNode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformResult(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformResult")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

