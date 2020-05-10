package typingsSlinky.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A GcRule which deletes cells matching any of the given rules.
  */
@js.native
trait SchemaUnion extends js.Object {
  /**
    * Delete cells which would be deleted by any element of `rules`.
    */
  var rules: js.UndefOr[js.Array[SchemaGcRule]] = js.native
}

object SchemaUnion {
  @scala.inline
  def apply(): SchemaUnion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnion]
  }
  @scala.inline
  implicit class SchemaUnionOps[Self <: SchemaUnion] (val x: Self) extends AnyVal {
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

