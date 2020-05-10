package typingsSlinky.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICloudMetaData extends js.Object {
  var session_id: java.lang.String = js.native
}

object ICloudMetaData {
  @scala.inline
  def apply(session_id: java.lang.String): ICloudMetaData = {
    val __obj = js.Dynamic.literal(session_id = session_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICloudMetaData]
  }
  @scala.inline
  implicit class ICloudMetaDataOps[Self <: ICloudMetaData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSession_id(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

