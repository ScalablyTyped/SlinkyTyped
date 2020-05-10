package typingsSlinky.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptParams extends js.Object {
  /** A timestamp that marks the most recent request for a refresh of data. */
  var lastRefresh: String = js.native
  /** If true, the getData() request is for automatic semantic type detection. */
  var sampleExtraction: js.UndefOr[Boolean] = js.native
}

object ScriptParams {
  @scala.inline
  def apply(lastRefresh: String): ScriptParams = {
    val __obj = js.Dynamic.literal(lastRefresh = lastRefresh.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptParams]
  }
  @scala.inline
  implicit class ScriptParamsOps[Self <: ScriptParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastRefresh(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSampleExtraction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleExtraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleExtraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleExtraction")(js.undefined)
        ret
    }
  }
  
}

