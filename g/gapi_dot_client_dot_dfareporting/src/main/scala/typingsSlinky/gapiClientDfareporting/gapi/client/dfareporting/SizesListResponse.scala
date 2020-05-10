package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizesListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#sizesListResponse". */
  var kind: js.UndefOr[String] = js.native
  /** Size collection. */
  var sizes: js.UndefOr[js.Array[Size]] = js.native
}

object SizesListResponse {
  @scala.inline
  def apply(): SizesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizesListResponse]
  }
  @scala.inline
  implicit class SizesListResponseOps[Self <: SizesListResponse] (val x: Self) extends AnyVal {
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
    def withSizes(value: js.Array[Size]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(js.undefined)
        ret
    }
  }
  
}

