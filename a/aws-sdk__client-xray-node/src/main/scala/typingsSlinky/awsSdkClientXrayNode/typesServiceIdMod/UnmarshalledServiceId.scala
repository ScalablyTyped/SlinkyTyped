package typingsSlinky.awsSdkClientXrayNode.typesServiceIdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledServiceId extends ServiceId {
  /**
    * <p/>
    */
  @JSName("Names")
  var Names_UnmarshalledServiceId: js.UndefOr[js.Array[String]] = js.native
}

object UnmarshalledServiceId {
  @scala.inline
  def apply(): UnmarshalledServiceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledServiceId]
  }
  @scala.inline
  implicit class UnmarshalledServiceIdOps[Self <: UnmarshalledServiceId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Names")(js.undefined)
        ret
    }
  }
  
}

