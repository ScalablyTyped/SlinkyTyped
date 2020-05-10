package typingsSlinky.cassandraDriver.mappingMod.mapping

import typingsSlinky.cassandraDriver.typesMod.types.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MappingExecutionOptions extends js.Object {
  var executionProfile: js.UndefOr[String] = js.native
  var fetchSize: js.UndefOr[Double] = js.native
  var isIdempotent: js.UndefOr[Boolean] = js.native
  var logged: js.UndefOr[Boolean] = js.native
  var pageState: js.UndefOr[Double] = js.native
  var timestamp: js.UndefOr[Double | Long] = js.native
}

object MappingExecutionOptions {
  @scala.inline
  def apply(): MappingExecutionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingExecutionOptions]
  }
  @scala.inline
  implicit class MappingExecutionOptionsOps[Self <: MappingExecutionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutionProfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchSize")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIdempotent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIdempotent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIdempotent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIdempotent")(js.undefined)
        ret
    }
    @scala.inline
    def withLogged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logged")(js.undefined)
        ret
    }
    @scala.inline
    def withPageState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageState")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: Double | Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
  }
  
}

