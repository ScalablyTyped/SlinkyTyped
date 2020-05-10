package typingsSlinky.elasticsearch.mod

import typingsSlinky.elasticsearch.elasticsearchStrings._empty
import typingsSlinky.elasticsearch.elasticsearchStrings.g
import typingsSlinky.elasticsearch.elasticsearchStrings.k
import typingsSlinky.elasticsearch.elasticsearchStrings.m
import typingsSlinky.elasticsearch.elasticsearchStrings.p
import typingsSlinky.elasticsearch.elasticsearchStrings.t
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatThreadPoolParams extends CatCommonParams {
  var size: js.UndefOr[_empty | k | m | g | t | p] = js.native
  var threadPoolPatterns: js.UndefOr[NameList] = js.native
}

object CatThreadPoolParams {
  @scala.inline
  def apply(format: String): CatThreadPoolParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatThreadPoolParams]
  }
  @scala.inline
  implicit class CatThreadPoolParamsOps[Self <: CatThreadPoolParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSize(value: _empty | k | m | g | t | p): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withThreadPoolPatterns(value: NameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadPoolPatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreadPoolPatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadPoolPatterns")(js.undefined)
        ret
    }
  }
  
}

