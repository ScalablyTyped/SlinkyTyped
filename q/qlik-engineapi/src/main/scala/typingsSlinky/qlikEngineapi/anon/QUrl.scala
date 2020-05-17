package typingsSlinky.qlikEngineapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QUrl extends js.Object {
  /**
    * Name of the Service
    */
  var qName: String = js.native
  /**
    * URL of the Service
    */
  var qUrl: String = js.native
}

object QUrl {
  @scala.inline
  def apply(qName: String, qUrl: String): QUrl = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any], qUrl = qUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[QUrl]
  }
  @scala.inline
  implicit class QUrlOps[Self <: QUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

