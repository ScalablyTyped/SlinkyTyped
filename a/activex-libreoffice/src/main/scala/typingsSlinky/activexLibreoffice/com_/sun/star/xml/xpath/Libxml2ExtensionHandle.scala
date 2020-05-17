package typingsSlinky.activexLibreoffice.com_.sun.star.xml.xpath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Libxml2ExtensionHandle extends js.Object {
  var functionData: Double = js.native
  var functionLookupFunction: Double = js.native
  var variableData: Double = js.native
  var variableLookupFunction: Double = js.native
}

object Libxml2ExtensionHandle {
  @scala.inline
  def apply(
    functionData: Double,
    functionLookupFunction: Double,
    variableData: Double,
    variableLookupFunction: Double
  ): Libxml2ExtensionHandle = {
    val __obj = js.Dynamic.literal(functionData = functionData.asInstanceOf[js.Any], functionLookupFunction = functionLookupFunction.asInstanceOf[js.Any], variableData = variableData.asInstanceOf[js.Any], variableLookupFunction = variableLookupFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Libxml2ExtensionHandle]
  }
  @scala.inline
  implicit class Libxml2ExtensionHandleOps[Self <: Libxml2ExtensionHandle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunctionData(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunctionLookupFunction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionLookupFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariableData(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariableLookupFunction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableLookupFunction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

