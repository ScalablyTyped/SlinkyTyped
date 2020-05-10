package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A document footer.
  */
@js.native
trait SchemaFooter extends js.Object {
  /**
    * The contents of the footer.  The indexes for a footer&#39;s content begin
    * at zero.
    */
  var content: js.UndefOr[js.Array[SchemaStructuralElement]] = js.native
  /**
    * The ID of the footer.
    */
  var footerId: js.UndefOr[String] = js.native
}

object SchemaFooter {
  @scala.inline
  def apply(): SchemaFooter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFooter]
  }
  @scala.inline
  implicit class SchemaFooterOps[Self <: SchemaFooter] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withFooterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerId")(js.undefined)
        ret
    }
  }
  
}

