package typingsSlinky.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBucketByActivity extends js.Object {
  /**
    * The default activity stream will be used if a specific
    * activityDataSourceId is not specified.
    */
  var activityDataSourceId: js.UndefOr[String] = js.native
  /**
    * Specifies that only activity segments of duration longer than
    * minDurationMillis are considered and used as a container for aggregated
    * data.
    */
  var minDurationMillis: js.UndefOr[String] = js.native
}

object SchemaBucketByActivity {
  @scala.inline
  def apply(): SchemaBucketByActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucketByActivity]
  }
  @scala.inline
  implicit class SchemaBucketByActivityOps[Self <: SchemaBucketByActivity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityDataSourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityDataSourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityDataSourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityDataSourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDurationMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDurationMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDurationMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDurationMillis")(js.undefined)
        ret
    }
  }
  
}

