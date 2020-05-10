package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEntityRecognizersResponse extends js.Object {
  /**
    * The list of properties of an entity recognizer.
    */
  var EntityRecognizerPropertiesList: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.EntityRecognizerPropertiesList] = js.native
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListEntityRecognizersResponse {
  @scala.inline
  def apply(): ListEntityRecognizersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEntityRecognizersResponse]
  }
  @scala.inline
  implicit class ListEntityRecognizersResponseOps[Self <: ListEntityRecognizersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityRecognizerPropertiesList(value: EntityRecognizerPropertiesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityRecognizerPropertiesList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityRecognizerPropertiesList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityRecognizerPropertiesList")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
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

