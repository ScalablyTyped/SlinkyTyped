package typingsSlinky.karmaJasmine.mod

import typingsSlinky.karmaJasmine.EnvConfigurationtimeoutIn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOptions extends js.Object {
  var jasmine: js.UndefOr[EnvConfigurationtimeoutIn] = js.native
  /**
    * run a subset of the full set of specs.
    * Complete sharding support needs to be done in the process that calls karma,
    * and would need to support test result integration across shards.
    * See {@link https://github.com/karma-runner/karma-jasmine#sharding}
    *
    */
  var shardIndex: js.UndefOr[Double] = js.native
  /**
    * run a subset of the full set of specs.
    * Complete sharding support needs to be done in the process that calls karma,
    * and would need to support test result integration across shards.
    * See {@link https://github.com/karma-runner/karma-jasmine#sharding}
    */
  var totalShards: js.UndefOr[Double] = js.native
}

object ClientOptions {
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJasmine(value: EnvConfigurationtimeoutIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jasmine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJasmine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jasmine")(js.undefined)
        ret
    }
    @scala.inline
    def withShardIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shardIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShardIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shardIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalShards(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalShards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalShards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalShards")(js.undefined)
        ret
    }
  }
  
}

