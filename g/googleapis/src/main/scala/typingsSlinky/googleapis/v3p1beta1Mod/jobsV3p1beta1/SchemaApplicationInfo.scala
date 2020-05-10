package typingsSlinky.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Application related details of a job posting.
  */
@js.native
trait SchemaApplicationInfo extends js.Object {
  /**
    * Optional but at least one of uris, emails or instruction must be
    * specified.  Use this field to specify email address(es) to which resumes
    * or applications can be sent.  The maximum number of allowed characters
    * for each entry is 255.
    */
  var emails: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional but at least one of uris, emails or instruction must be
    * specified.  Use this field to provide instructions, such as &quot;Mail
    * your application to ...&quot;, that a candidate can follow to apply for
    * the job.  This field accepts and sanitizes HTML input, and also accepts
    * bold, italic, ordered list, and unordered list markup tags.  The maximum
    * number of allowed characters is 3,000.
    */
  var instruction: js.UndefOr[String] = js.native
  /**
    * Optional but at least one of uris, emails or instruction must be
    * specified.  Use this URI field to direct an applicant to a website, for
    * example to link to an online application form.  The maximum number of
    * allowed characters for each entry is 2,000.
    */
  var uris: js.UndefOr[js.Array[String]] = js.native
}

object SchemaApplicationInfo {
  @scala.inline
  def apply(): SchemaApplicationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationInfo]
  }
  @scala.inline
  implicit class SchemaApplicationInfoOps[Self <: SchemaApplicationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmails(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emails")(js.undefined)
        ret
    }
    @scala.inline
    def withInstruction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstruction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instruction")(js.undefined)
        ret
    }
    @scala.inline
    def withUris(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uris")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUris: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uris")(js.undefined)
        ret
    }
  }
  
}

