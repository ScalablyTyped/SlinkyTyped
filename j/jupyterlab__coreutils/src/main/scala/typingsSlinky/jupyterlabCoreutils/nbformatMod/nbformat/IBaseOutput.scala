package typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat

import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base output type.
  */
@js.native
trait IBaseOutput extends JSONObject {
  /**
    * Type of cell output.
    */
  var output_type: String = js.native
}

object IBaseOutput {
  @scala.inline
  def apply(output_type: String): IBaseOutput = {
    val __obj = js.Dynamic.literal(output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseOutput]
  }
  @scala.inline
  implicit class IBaseOutputOps[Self <: IBaseOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutput_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output_type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

