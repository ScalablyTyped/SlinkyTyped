package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClassifierResponse extends js.Object {
  /**
    * The requested classifier.
    */
  var Classifier: js.UndefOr[typingsSlinky.awsSdk.glueMod.Classifier] = js.native
}

object GetClassifierResponse {
  @scala.inline
  def apply(): GetClassifierResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClassifierResponse]
  }
  @scala.inline
  implicit class GetClassifierResponseOps[Self <: GetClassifierResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassifier(value: Classifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Classifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Classifier")(js.undefined)
        ret
    }
  }
  
}

