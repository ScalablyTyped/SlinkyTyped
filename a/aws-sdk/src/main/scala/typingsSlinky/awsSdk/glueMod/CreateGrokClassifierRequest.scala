package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGrokClassifierRequest extends js.Object {
  /**
    * An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs, Amazon CloudWatch Logs, and so on.
    */
  var Classification: typingsSlinky.awsSdk.glueMod.Classification = js.native
  /**
    * Optional custom grok patterns used by this classifier.
    */
  var CustomPatterns: js.UndefOr[typingsSlinky.awsSdk.glueMod.CustomPatterns] = js.native
  /**
    * The grok pattern used by this classifier.
    */
  var GrokPattern: typingsSlinky.awsSdk.glueMod.GrokPattern = js.native
  /**
    * The name of the new classifier.
    */
  var Name: NameString = js.native
}

object CreateGrokClassifierRequest {
  @scala.inline
  def apply(Classification: Classification, GrokPattern: GrokPattern, Name: NameString): CreateGrokClassifierRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], GrokPattern = GrokPattern.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGrokClassifierRequest]
  }
  @scala.inline
  implicit class CreateGrokClassifierRequestOps[Self <: CreateGrokClassifierRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassification(value: Classification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Classification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrokPattern(value: GrokPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrokPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomPatterns(value: CustomPatterns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomPatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomPatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomPatterns")(js.undefined)
        ret
    }
  }
  
}

