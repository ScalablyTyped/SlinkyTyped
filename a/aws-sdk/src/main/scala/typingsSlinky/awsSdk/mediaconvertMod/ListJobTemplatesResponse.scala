package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobTemplatesResponse extends js.Object {
  /**
    * List of Job templates.
    */
  var JobTemplates: js.UndefOr[listOfJobTemplate] = js.native
  /**
    * Use this string to request the next batch of job templates.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListJobTemplatesResponse {
  @scala.inline
  def apply(): ListJobTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobTemplatesResponse]
  }
  @scala.inline
  implicit class ListJobTemplatesResponseOps[Self <: ListJobTemplatesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobTemplates(value: listOfJobTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobTemplates")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

