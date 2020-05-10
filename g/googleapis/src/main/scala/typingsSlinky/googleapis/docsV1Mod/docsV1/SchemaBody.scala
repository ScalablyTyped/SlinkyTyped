package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The document body.  The body typically contains the full document contents
  * except for headers, footers and footnotes.
  */
@js.native
trait SchemaBody extends js.Object {
  /**
    * The contents of the body.  The indexes for the body&#39;s content begin
    * at zero.
    */
  var content: js.UndefOr[js.Array[SchemaStructuralElement]] = js.native
}

object SchemaBody {
  @scala.inline
  def apply(): SchemaBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBody]
  }
  @scala.inline
  implicit class SchemaBodyOps[Self <: SchemaBody] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: js.Array[SchemaStructuralElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
  }
  
}

