package typingsSlinky.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBucketBySession extends js.Object {
  /**
    * Specifies that only sessions of duration longer than minDurationMillis
    * are considered and used as a container for aggregated data.
    */
  var minDurationMillis: js.UndefOr[String] = js.native
}

object SchemaBucketBySession {
  @scala.inline
  def apply(): SchemaBucketBySession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucketBySession]
  }
  @scala.inline
  implicit class SchemaBucketBySessionOps[Self <: SchemaBucketBySession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

