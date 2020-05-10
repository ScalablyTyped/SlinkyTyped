package typingsSlinky.pulumiPulumi.serializeClosureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializedFunction extends js.Object {
  /**
    * The name of the exported module member.
    */
  var exportName: String = js.native
  /**
    * The text of a JavaScript module which exports a single name bound to an appropriate value.
    * In the case of a normal function, this value will just be serialized function.  In the case
    * of a factory function this value will be the result of invoking the factory function.
    */
  var text: String = js.native
}

object SerializedFunction {
  @scala.inline
  def apply(exportName: String, text: String): SerializedFunction = {
    val __obj = js.Dynamic.literal(exportName = exportName.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedFunction]
  }
  @scala.inline
  implicit class SerializedFunctionOps[Self <: SerializedFunction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

