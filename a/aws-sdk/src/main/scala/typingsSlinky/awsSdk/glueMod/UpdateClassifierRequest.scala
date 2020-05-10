package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateClassifierRequest extends js.Object {
  /**
    * A CsvClassifier object with updated fields.
    */
  var CsvClassifier: js.UndefOr[UpdateCsvClassifierRequest] = js.native
  /**
    * A GrokClassifier object with updated fields.
    */
  var GrokClassifier: js.UndefOr[UpdateGrokClassifierRequest] = js.native
  /**
    * A JsonClassifier object with updated fields.
    */
  var JsonClassifier: js.UndefOr[UpdateJsonClassifierRequest] = js.native
  /**
    * An XMLClassifier object with updated fields.
    */
  var XMLClassifier: js.UndefOr[UpdateXMLClassifierRequest] = js.native
}

object UpdateClassifierRequest {
  @scala.inline
  def apply(): UpdateClassifierRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateClassifierRequest]
  }
  @scala.inline
  implicit class UpdateClassifierRequestOps[Self <: UpdateClassifierRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCsvClassifier(value: UpdateCsvClassifierRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CsvClassifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvClassifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CsvClassifier")(js.undefined)
        ret
    }
    @scala.inline
    def withGrokClassifier(value: UpdateGrokClassifierRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrokClassifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrokClassifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrokClassifier")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonClassifier(value: UpdateJsonClassifierRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JsonClassifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonClassifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JsonClassifier")(js.undefined)
        ret
    }
    @scala.inline
    def withXMLClassifier(value: UpdateXMLClassifierRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XMLClassifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXMLClassifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XMLClassifier")(js.undefined)
        ret
    }
  }
  
}

