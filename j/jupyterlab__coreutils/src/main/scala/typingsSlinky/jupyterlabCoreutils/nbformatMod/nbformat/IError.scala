package typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat

import typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output of an error that occurred during code cell execution.
  */
@js.native
trait IError
  extends IBaseOutput
     with _IOutput {
  /**
    * The name of the error.
    */
  var ename: String = js.native
  /**
    * The value, or message, of the error.
    */
  var evalue: String = js.native
  /**
    * Type of cell output.
    */
  @JSName("output_type")
  var output_type_IError: error = js.native
  /**
    * The error's traceback.
    */
  var traceback: js.Array[String] = js.native
}

object IError {
  @scala.inline
  def apply(ename: String, evalue: String, output_type: error, traceback: js.Array[String]): IError = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any], traceback = traceback.asInstanceOf[js.Any])
    __obj.asInstanceOf[IError]
  }
  @scala.inline
  implicit class IErrorOps[Self <: IError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvalue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput_type(value: error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTraceback(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceback")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

