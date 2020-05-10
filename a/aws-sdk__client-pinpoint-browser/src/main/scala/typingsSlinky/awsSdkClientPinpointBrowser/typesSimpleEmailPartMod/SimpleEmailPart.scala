package typingsSlinky.awsSdkClientPinpointBrowser.typesSimpleEmailPartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleEmailPart extends js.Object {
  /**
    * The character set of the content.
    */
  var Charset: js.UndefOr[String] = js.native
  /**
    * The textual data of the content.
    */
  var Data: js.UndefOr[String] = js.native
}

object SimpleEmailPart {
  @scala.inline
  def apply(): SimpleEmailPart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleEmailPart]
  }
  @scala.inline
  implicit class SimpleEmailPartOps[Self <: SimpleEmailPart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Charset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Charset")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data")(js.undefined)
        ret
    }
  }
  
}

