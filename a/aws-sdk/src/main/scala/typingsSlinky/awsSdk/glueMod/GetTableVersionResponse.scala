package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTableVersionResponse extends js.Object {
  /**
    * The requested table version.
    */
  var TableVersion: js.UndefOr[typingsSlinky.awsSdk.glueMod.TableVersion] = js.native
}

object GetTableVersionResponse {
  @scala.inline
  def apply(): GetTableVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTableVersionResponse]
  }
  @scala.inline
  implicit class GetTableVersionResponseOps[Self <: GetTableVersionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTableVersion(value: TableVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableVersion")(js.undefined)
        ret
    }
  }
  
}

