package typingsSlinky.awsSdkClientS3Browser.typesPartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledPart extends Part {
  /**
    * <p>Date and time at which the part was uploaded.</p>
    */
  @JSName("LastModified")
  var LastModified_UnmarshalledPart: js.UndefOr[js.Date] = js.native
}

object UnmarshalledPart {
  @scala.inline
  def apply(): UnmarshalledPart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledPart]
  }
  @scala.inline
  implicit class UnmarshalledPartOps[Self <: UnmarshalledPart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastModified(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(js.undefined)
        ret
    }
  }
  
}

