package typingsSlinky.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobDetails extends js.Object {
  /**
    * The number of documents that could not be processed during a translation job.
    */
  var DocumentsWithErrorsCount: js.UndefOr[Integer] = js.native
  /**
    * The number of documents used as input in a translation job.
    */
  var InputDocumentsCount: js.UndefOr[Integer] = js.native
  /**
    * The number of documents successfully processed during a translation job.
    */
  var TranslatedDocumentsCount: js.UndefOr[Integer] = js.native
}

object JobDetails {
  @scala.inline
  def apply(): JobDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobDetails]
  }
  @scala.inline
  implicit class JobDetailsOps[Self <: JobDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentsWithErrorsCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentsWithErrorsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentsWithErrorsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentsWithErrorsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withInputDocumentsCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputDocumentsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputDocumentsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputDocumentsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslatedDocumentsCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TranslatedDocumentsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslatedDocumentsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TranslatedDocumentsCount")(js.undefined)
        ret
    }
  }
  
}

