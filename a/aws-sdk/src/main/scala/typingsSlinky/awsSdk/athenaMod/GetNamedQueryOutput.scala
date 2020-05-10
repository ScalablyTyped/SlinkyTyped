package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNamedQueryOutput extends js.Object {
  /**
    * Information about the query.
    */
  var NamedQuery: js.UndefOr[typingsSlinky.awsSdk.athenaMod.NamedQuery] = js.native
}

object GetNamedQueryOutput {
  @scala.inline
  def apply(): GetNamedQueryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNamedQueryOutput]
  }
  @scala.inline
  implicit class GetNamedQueryOutputOps[Self <: GetNamedQueryOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamedQuery(value: NamedQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedQuery")(js.undefined)
        ret
    }
  }
  
}

