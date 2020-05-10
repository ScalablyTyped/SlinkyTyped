package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformTypesListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#platformTypesListResponse". */
  var kind: js.UndefOr[String] = js.native
  /** Platform type collection. */
  var platformTypes: js.UndefOr[js.Array[PlatformType]] = js.native
}

object PlatformTypesListResponse {
  @scala.inline
  def apply(): PlatformTypesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformTypesListResponse]
  }
  @scala.inline
  implicit class PlatformTypesListResponseOps[Self <: PlatformTypesListResponse] (val x: Self) extends AnyVal {
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
    def withPlatformTypes(value: js.Array[PlatformType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformTypes")(js.undefined)
        ret
    }
  }
  
}

