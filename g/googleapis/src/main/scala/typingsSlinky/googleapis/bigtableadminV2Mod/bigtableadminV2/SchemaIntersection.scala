package typingsSlinky.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A GcRule which deletes cells matching all of the given rules.
  */
@js.native
trait SchemaIntersection extends js.Object {
  /**
    * Only delete cells which would be deleted by every element of `rules`.
    */
  var rules: js.UndefOr[js.Array[SchemaGcRule]] = js.native
}

object SchemaIntersection {
  @scala.inline
  def apply(): SchemaIntersection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntersection]
  }
  @scala.inline
  implicit class SchemaIntersectionOps[Self <: SchemaIntersection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRules(value: js.Array[SchemaGcRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
  }
  
}

