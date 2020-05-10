package typingsSlinky.azdata.mod.nb

import typingsSlinky.azdata.azdataStrings.stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStreamResult
  extends ICellOutput
     with Output {
  /**
  			 * Stream output field defining the stream name, for example stdout
  			 */
  var name: StreamType = js.native
  @JSName("output_type")
  var output_type_IStreamResult: stream = js.native
  /**
  			 * Stream output field defining the multiline stream text
  			 */
  var text: MultilineString = js.native
}

object IStreamResult {
  @scala.inline
  def apply(name: StreamType, output_type: stream, text: MultilineString): IStreamResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamResult]
  }
  @scala.inline
  implicit class IStreamResultOps[Self <: IStreamResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: StreamType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput_type(value: stream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: MultilineString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

