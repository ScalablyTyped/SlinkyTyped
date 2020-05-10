package typingsSlinky.nodeFetch.mod

import typingsSlinky.nodeFetch.nodeFetchStrings.native
import typingsSlinky.nodeFetch.nodeFetchStrings.transparent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlobOptions extends js.Object {
  var endings: js.UndefOr[transparent | native] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object BlobOptions {
  @scala.inline
  def apply(): BlobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlobOptions]
  }
  @scala.inline
  implicit class BlobOptionsOps[Self <: BlobOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndings(value: transparent | native): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endings")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

