package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetCacheParameterGroupMessage extends js.Object {
  /**
    * The name of the cache parameter group to reset.
    */
  var CacheParameterGroupName: String = js.native
  /**
    * An array of parameter names to reset to their default values. If ResetAllParameters is true, do not use ParameterNameValues. If ResetAllParameters is false, you must specify the name of at least one parameter to reset.
    */
  var ParameterNameValues: js.UndefOr[ParameterNameValueList] = js.native
  /**
    * If true, all parameters in the cache parameter group are reset to their default values. If false, only the parameters listed by ParameterNameValues are reset to their default values. Valid values: true | false 
    */
  var ResetAllParameters: js.UndefOr[Boolean] = js.native
}

object ResetCacheParameterGroupMessage {
  @scala.inline
  def apply(CacheParameterGroupName: String): ResetCacheParameterGroupMessage = {
    val __obj = js.Dynamic.literal(CacheParameterGroupName = CacheParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetCacheParameterGroupMessage]
  }
  @scala.inline
  implicit class ResetCacheParameterGroupMessageOps[Self <: ResetCacheParameterGroupMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheParameterGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheParameterGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameterNameValues(value: ParameterNameValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterNameValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterNameValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterNameValues")(js.undefined)
        ret
    }
    @scala.inline
    def withResetAllParameters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResetAllParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetAllParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResetAllParameters")(js.undefined)
        ret
    }
  }
  
}

