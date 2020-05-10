package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminServicesOptions extends js.Object {
  var databaseFileInfoOptions: js.Array[ServiceOption] = js.native
  var databaseInfoOptions: js.Array[ServiceOption] = js.native
  var fileGroupInfoOptions: js.Array[ServiceOption] = js.native
}

object AdminServicesOptions {
  @scala.inline
  def apply(
    databaseFileInfoOptions: js.Array[ServiceOption],
    databaseInfoOptions: js.Array[ServiceOption],
    fileGroupInfoOptions: js.Array[ServiceOption]
  ): AdminServicesOptions = {
    val __obj = js.Dynamic.literal(databaseFileInfoOptions = databaseFileInfoOptions.asInstanceOf[js.Any], databaseInfoOptions = databaseInfoOptions.asInstanceOf[js.Any], fileGroupInfoOptions = fileGroupInfoOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminServicesOptions]
  }
  @scala.inline
  implicit class AdminServicesOptionsOps[Self <: AdminServicesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabaseFileInfoOptions(value: js.Array[ServiceOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseFileInfoOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatabaseInfoOptions(value: js.Array[ServiceOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseInfoOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileGroupInfoOptions(value: js.Array[ServiceOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileGroupInfoOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

