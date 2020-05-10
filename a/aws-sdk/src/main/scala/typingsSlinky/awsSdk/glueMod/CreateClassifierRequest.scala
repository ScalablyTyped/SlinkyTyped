package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClassifierRequest extends js.Object {
  /**
    * A CsvClassifier object specifying the classifier to create.
    */
  var CsvClassifier: js.UndefOr[CreateCsvClassifierRequest] = js.native
  /**
    * A GrokClassifier object specifying the classifier to create.
    */
  var GrokClassifier: js.UndefOr[CreateGrokClassifierRequest] = js.native
  /**
    * A JsonClassifier object specifying the classifier to create.
    */
  var JsonClassifier: js.UndefOr[CreateJsonClassifierRequest] = js.native
  /**
    * An XMLClassifier object specifying the classifier to create.
    */
  var XMLClassifier: js.UndefOr[CreateXMLClassifierRequest] = js.native
}

object CreateClassifierRequest {
  @scala.inline
  def apply(): CreateClassifierRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClassifierRequest]
  }
  @scala.inline
  implicit class CreateClassifierRequestOps[Self <: CreateClassifierRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCsvClassifier(value: CreateCsvClassifierRequest): Self = {
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
    def withGrokClassifier(value: CreateGrokClassifierRequest): Self = {
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
    def withJsonClassifier(value: CreateJsonClassifierRequest): Self = {
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
    def withXMLClassifier(value: CreateXMLClassifierRequest): Self = {
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

