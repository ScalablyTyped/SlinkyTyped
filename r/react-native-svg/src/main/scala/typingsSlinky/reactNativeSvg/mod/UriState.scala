package typingsSlinky.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UriState extends js.Object {
  var xml: String | Null = js.native
}

object UriState {
  @scala.inline
  def apply(): UriState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UriState]
  }
  @scala.inline
  implicit class UriStateOps[Self <: UriState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXmlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xml")(null)
        ret
    }
  }
  
}

