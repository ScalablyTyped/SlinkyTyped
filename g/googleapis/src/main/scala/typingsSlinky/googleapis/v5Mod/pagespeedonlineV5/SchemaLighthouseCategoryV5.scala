package typingsSlinky.googleapis.v5Mod.pagespeedonlineV5

import typingsSlinky.googleapis.AnonGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLighthouseCategoryV5 extends js.Object {
  /**
    * An array of references to all the audit members of this category.
    */
  var auditRefs: js.UndefOr[js.Array[AnonGroup]] = js.native
  /**
    * A more detailed description of the category and its importance.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The string identifier of the category.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A description for the manual audits in the category.
    */
  var manualDescription: js.UndefOr[String] = js.native
  var score: js.UndefOr[js.Any] = js.native
  /**
    * The human-friendly name of the category.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaLighthouseCategoryV5 {
  @scala.inline
  def apply(): SchemaLighthouseCategoryV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLighthouseCategoryV5]
  }
  @scala.inline
  implicit class SchemaLighthouseCategoryV5Ops[Self <: SchemaLighthouseCategoryV5] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuditRefs(value: js.Array[AnonGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditRefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuditRefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditRefs")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withManualDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withScore(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

