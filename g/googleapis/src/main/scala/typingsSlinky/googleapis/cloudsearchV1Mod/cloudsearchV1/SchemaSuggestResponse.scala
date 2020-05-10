package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of the suggest API.
  */
@js.native
trait SchemaSuggestResponse extends js.Object {
  /**
    * List of suggestion results.
    */
  var suggestResults: js.UndefOr[js.Array[SchemaSuggestResult]] = js.native
}

object SchemaSuggestResponse {
  @scala.inline
  def apply(): SchemaSuggestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestResponse]
  }
  @scala.inline
  implicit class SchemaSuggestResponseOps[Self <: SchemaSuggestResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuggestResults(value: js.Array[SchemaSuggestResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestResults")(js.undefined)
        ret
    }
  }
  
}

