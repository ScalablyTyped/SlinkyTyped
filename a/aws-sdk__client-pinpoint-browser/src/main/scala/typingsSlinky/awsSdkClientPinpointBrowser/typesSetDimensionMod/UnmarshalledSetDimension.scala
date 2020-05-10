package typingsSlinky.awsSdkClientPinpointBrowser.typesSetDimensionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSetDimension extends SetDimension {
  /**
    * The criteria values for the segment dimension. Endpoints with matching attribute values are included or excluded from the segment, depending on the setting for Type.
    */
  @JSName("Values")
  var Values_UnmarshalledSetDimension: js.UndefOr[js.Array[String]] = js.native
}

object UnmarshalledSetDimension {
  @scala.inline
  def apply(): UnmarshalledSetDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSetDimension]
  }
  @scala.inline
  implicit class UnmarshalledSetDimensionOps[Self <: UnmarshalledSetDimension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(js.undefined)
        ret
    }
  }
  
}

