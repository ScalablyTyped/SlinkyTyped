package typingsSlinky.gapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BooksVolumesRecommendedRateResponse extends js.Object {
  var consistency_token: js.UndefOr[String] = js.native
}

object BooksVolumesRecommendedRateResponse {
  @scala.inline
  def apply(): BooksVolumesRecommendedRateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BooksVolumesRecommendedRateResponse]
  }
  @scala.inline
  implicit class BooksVolumesRecommendedRateResponseOps[Self <: BooksVolumesRecommendedRateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsistency_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consistency_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsistency_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consistency_token")(js.undefined)
        ret
    }
  }
  
}

