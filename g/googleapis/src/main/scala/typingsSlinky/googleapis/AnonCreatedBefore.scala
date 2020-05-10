package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreatedBefore extends js.Object {
  var age: js.UndefOr[Double] = js.native
  var createdBefore: js.UndefOr[String] = js.native
  var isLive: js.UndefOr[Boolean] = js.native
  var numNewerVersions: js.UndefOr[Double] = js.native
}

object AnonCreatedBefore {
  @scala.inline
  def apply(): AnonCreatedBefore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCreatedBefore]
  }
  @scala.inline
  implicit class AnonCreatedBeforeOps[Self <: AnonCreatedBefore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("age")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("age")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedBefore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLive")(js.undefined)
        ret
    }
    @scala.inline
    def withNumNewerVersions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numNewerVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumNewerVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numNewerVersions")(js.undefined)
        ret
    }
  }
  
}

