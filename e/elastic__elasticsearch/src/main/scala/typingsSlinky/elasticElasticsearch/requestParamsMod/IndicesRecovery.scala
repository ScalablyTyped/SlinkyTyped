package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicesRecovery extends Generic {
  var active_only: js.UndefOr[Boolean] = js.native
  var detailed: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[String | js.Array[String]] = js.native
}

object IndicesRecovery {
  @scala.inline
  def apply(): IndicesRecovery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesRecovery]
  }
  @scala.inline
  implicit class IndicesRecoveryOps[Self <: IndicesRecovery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive_only(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active_only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive_only: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active_only")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailed")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
  }
  
}

