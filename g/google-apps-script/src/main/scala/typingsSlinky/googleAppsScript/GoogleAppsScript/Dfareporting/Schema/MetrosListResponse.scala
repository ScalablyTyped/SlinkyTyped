package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetrosListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var metros: js.UndefOr[js.Array[Metro]] = js.native
}

object MetrosListResponse {
  @scala.inline
  def apply(): MetrosListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetrosListResponse]
  }
  @scala.inline
  implicit class MetrosListResponseOps[Self <: MetrosListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withMetros(value: js.Array[Metro]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metros")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetros: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metros")(js.undefined)
        ret
    }
  }
  
}

