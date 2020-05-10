package typingsSlinky.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An initial split point for a newly created table.
  */
@js.native
trait SchemaSplit extends js.Object {
  /**
    * Row key to use as an initial tablet boundary.
    */
  var key: js.UndefOr[String] = js.native
}

object SchemaSplit {
  @scala.inline
  def apply(): SchemaSplit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSplit]
  }
  @scala.inline
  implicit class SchemaSplitOps[Self <: SchemaSplit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
  }
  
}

