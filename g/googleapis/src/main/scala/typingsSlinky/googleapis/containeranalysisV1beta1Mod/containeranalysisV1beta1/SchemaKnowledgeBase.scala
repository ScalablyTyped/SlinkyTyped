package typingsSlinky.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaKnowledgeBase extends js.Object {
  /**
    * The KB name (generally of the form KB[0-9]+ i.e. KB123456).
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A link to the KB in the Windows update catalog -
    * https://www.catalog.update.microsoft.com/
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaKnowledgeBase {
  @scala.inline
  def apply(): SchemaKnowledgeBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKnowledgeBase]
  }
  @scala.inline
  implicit class SchemaKnowledgeBaseOps[Self <: SchemaKnowledgeBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

