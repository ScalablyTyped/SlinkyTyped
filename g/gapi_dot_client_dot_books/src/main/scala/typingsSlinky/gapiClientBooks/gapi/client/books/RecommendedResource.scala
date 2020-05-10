package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBooks.AnonMaxAllowedMaturityRating
import typingsSlinky.gapiClientBooks.AnonRating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecommendedResource extends js.Object {
  /** Return a list of recommended books for the current user. */
  def list(request: AnonMaxAllowedMaturityRating): Request_[Volumes] = js.native
  /** Rate a recommended book for the current user. */
  def rate(request: AnonRating): Request_[BooksVolumesRecommendedRateResponse] = js.native
}

object RecommendedResource {
  @scala.inline
  def apply(
    list: AnonMaxAllowedMaturityRating => Request_[Volumes],
    rate: AnonRating => Request_[BooksVolumesRecommendedRateResponse]
  ): RecommendedResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), rate = js.Any.fromFunction1(rate))
    __obj.asInstanceOf[RecommendedResource]
  }
  @scala.inline
  implicit class RecommendedResourceOps[Self <: RecommendedResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonMaxAllowedMaturityRating => Request_[Volumes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRate(value: AnonRating => Request_[BooksVolumesRecommendedRateResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

