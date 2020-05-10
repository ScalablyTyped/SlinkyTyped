package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDocumentClassifiersResponse extends js.Object {
  /**
    * A list containing the properties of each job returned.
    */
  var DocumentClassifierPropertiesList: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.DocumentClassifierPropertiesList] = js.native
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListDocumentClassifiersResponse {
  @scala.inline
  def apply(): ListDocumentClassifiersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDocumentClassifiersResponse]
  }
  @scala.inline
  implicit class ListDocumentClassifiersResponseOps[Self <: ListDocumentClassifiersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentClassifierPropertiesList(value: DocumentClassifierPropertiesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentClassifierPropertiesList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentClassifierPropertiesList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentClassifierPropertiesList")(js.undefined)
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

