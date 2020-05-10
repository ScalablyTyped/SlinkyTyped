package typingsSlinky.elasticsearch.mod

import typingsSlinky.elasticsearch.elasticsearchStrings.green
import typingsSlinky.elasticsearch.elasticsearchStrings.red
import typingsSlinky.elasticsearch.elasticsearchStrings.yellow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatIndicesParams extends CatCommonParams {
  var bytes: js.UndefOr[CatBytes] = js.native
  var health: js.UndefOr[green | yellow | red] = js.native
  var index: js.UndefOr[NameList] = js.native
  var pri: js.UndefOr[Boolean] = js.native
}

object CatIndicesParams {
  @scala.inline
  def apply(format: String): CatIndicesParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatIndicesParams]
  }
  @scala.inline
  implicit class CatIndicesParamsOps[Self <: CatIndicesParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytes(value: CatBytes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytes")(js.undefined)
        ret
    }
    @scala.inline
    def withHealth(value: green | yellow | red): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("health")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("health")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: NameList): Self = {
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
    @scala.inline
    def withPri(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pri")(js.undefined)
        ret
    }
  }
  
}

