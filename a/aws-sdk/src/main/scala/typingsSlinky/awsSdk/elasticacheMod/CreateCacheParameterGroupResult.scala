package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCacheParameterGroupResult extends js.Object {
  var CacheParameterGroup: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.CacheParameterGroup] = js.native
}

object CreateCacheParameterGroupResult {
  @scala.inline
  def apply(): CreateCacheParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCacheParameterGroupResult]
  }
  @scala.inline
  implicit class CreateCacheParameterGroupResultOps[Self <: CreateCacheParameterGroupResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheParameterGroup(value: CacheParameterGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheParameterGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheParameterGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheParameterGroup")(js.undefined)
        ret
    }
  }
  
}

