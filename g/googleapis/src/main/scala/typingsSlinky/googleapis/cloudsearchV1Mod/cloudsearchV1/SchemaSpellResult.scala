package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSpellResult extends js.Object {
  /**
    * The suggested spelling of the query.
    */
  var suggestedQuery: js.UndefOr[String] = js.native
}

object SchemaSpellResult {
  @scala.inline
  def apply(): SchemaSpellResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpellResult]
  }
  @scala.inline
  implicit class SchemaSpellResultOps[Self <: SchemaSpellResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuggestedQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedQuery")(js.undefined)
        ret
    }
  }
  
}

