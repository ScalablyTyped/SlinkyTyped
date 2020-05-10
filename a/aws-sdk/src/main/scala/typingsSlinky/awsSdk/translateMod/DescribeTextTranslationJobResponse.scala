package typingsSlinky.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTextTranslationJobResponse extends js.Object {
  /**
    * An object that contains the properties associated with an asynchronous batch translation job.
    */
  var TextTranslationJobProperties: js.UndefOr[typingsSlinky.awsSdk.translateMod.TextTranslationJobProperties] = js.native
}

object DescribeTextTranslationJobResponse {
  @scala.inline
  def apply(): DescribeTextTranslationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTextTranslationJobResponse]
  }
  @scala.inline
  implicit class DescribeTextTranslationJobResponseOps[Self <: DescribeTextTranslationJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTextTranslationJobProperties(value: TextTranslationJobProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextTranslationJobProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextTranslationJobProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextTranslationJobProperties")(js.undefined)
        ret
    }
  }
  
}

