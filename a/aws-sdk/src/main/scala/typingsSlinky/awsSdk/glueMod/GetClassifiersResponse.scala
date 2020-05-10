package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClassifiersResponse extends js.Object {
  /**
    * The requested list of classifier objects.
    */
  var Classifiers: js.UndefOr[ClassifierList] = js.native
  /**
    * A continuation token.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object GetClassifiersResponse {
  @scala.inline
  def apply(): GetClassifiersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClassifiersResponse]
  }
  @scala.inline
  implicit class GetClassifiersResponseOps[Self <: GetClassifiersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassifiers(value: ClassifierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Classifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Classifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: Token): Self = {
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

