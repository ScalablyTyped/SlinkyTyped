package typingsSlinky.azdata.mod.nb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDisplayResult extends ICellOutput {
  /**
  			 * Mime bundle expected to contain mime type -> contents mappings.
  			 * This is dynamic and is controlled by kernels, so cannot be more specific
  			 */
  var data: StringDictionary[js.Any] = js.native
  /**
  			 * Optional metadata, also a mime bundle
  			 */
  var metadata: js.UndefOr[js.Object] = js.native
}

object IDisplayResult {
  @scala.inline
  def apply(data: StringDictionary[js.Any], output_type: OutputTypeName): IDisplayResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisplayResult]
  }
  @scala.inline
  implicit class IDisplayResultOps[Self <: IDisplayResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
  }
  
}

