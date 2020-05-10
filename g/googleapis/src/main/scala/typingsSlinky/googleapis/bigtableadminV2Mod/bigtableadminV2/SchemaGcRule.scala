package typingsSlinky.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rule for determining which cells to delete during garbage collection.
  */
@js.native
trait SchemaGcRule extends js.Object {
  /**
    * Delete cells that would be deleted by every nested rule.
    */
  var intersection: js.UndefOr[SchemaIntersection] = js.native
  /**
    * Delete cells in a column older than the given age. Values must be at
    * least one millisecond, and will be truncated to microsecond granularity.
    */
  var maxAge: js.UndefOr[String] = js.native
  /**
    * Delete all cells in a column except the most recent N.
    */
  var maxNumVersions: js.UndefOr[Double] = js.native
  /**
    * Delete cells that would be deleted by any nested rule.
    */
  var union: js.UndefOr[SchemaUnion] = js.native
}

object SchemaGcRule {
  @scala.inline
  def apply(): SchemaGcRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGcRule]
  }
  @scala.inline
  implicit class SchemaGcRuleOps[Self <: SchemaGcRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntersection(value: SchemaIntersection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntersection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersection")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxNumVersions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNumVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxNumVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNumVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withUnion(value: SchemaUnion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("union")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("union")(js.undefined)
        ret
    }
  }
  
}

