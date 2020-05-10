package typingsSlinky.googleFeeds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait findResult extends js.Object {
  var error: js.UndefOr[feedError] = js.native
  var findEntries: js.Array[findEntry] = js.native
  var xmlDocument: js.UndefOr[String] = js.native
}

object findResult {
  @scala.inline
  def apply(findEntries: js.Array[findEntry]): findResult = {
    val __obj = js.Dynamic.literal(findEntries = findEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[findResult]
  }
  @scala.inline
  implicit class findResultOps[Self <: findResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFindEntries(value: js.Array[findEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: feedError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlDocument(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlDocument")(js.undefined)
        ret
    }
  }
  
}

