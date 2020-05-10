package typingsSlinky.gapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestAccess extends js.Object {
  /** A concurrent access response. */
  var concurrentAccess: js.UndefOr[ConcurrentAccessRestriction] = js.native
  /** A download access response. */
  var downloadAccess: js.UndefOr[DownloadAccessRestriction] = js.native
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
}

object RequestAccess {
  @scala.inline
  def apply(): RequestAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestAccess]
  }
  @scala.inline
  implicit class RequestAccessOps[Self <: RequestAccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConcurrentAccess(value: ConcurrentAccessRestriction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrentAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrentAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrentAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadAccess(value: DownloadAccessRestriction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadAccess")(js.undefined)
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

