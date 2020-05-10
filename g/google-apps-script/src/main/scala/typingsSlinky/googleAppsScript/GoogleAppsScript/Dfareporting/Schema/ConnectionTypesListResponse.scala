package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionTypesListResponse extends js.Object {
  var connectionTypes: js.UndefOr[js.Array[ConnectionType]] = js.native
  var kind: js.UndefOr[String] = js.native
}

object ConnectionTypesListResponse {
  @scala.inline
  def apply(): ConnectionTypesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionTypesListResponse]
  }
  @scala.inline
  implicit class ConnectionTypesListResponseOps[Self <: ConnectionTypesListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionTypes(value: js.Array[ConnectionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

