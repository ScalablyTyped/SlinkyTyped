package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mail search advanced options
  */
@js.native
trait SchemaMailOptions extends js.Object {
  /**
    * Set to true to exclude drafts.
    */
  var excludeDrafts: js.UndefOr[Boolean] = js.native
}

object SchemaMailOptions {
  @scala.inline
  def apply(): SchemaMailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMailOptions]
  }
  @scala.inline
  implicit class SchemaMailOptionsOps[Self <: SchemaMailOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludeDrafts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeDrafts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeDrafts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeDrafts")(js.undefined)
        ret
    }
  }
  
}

