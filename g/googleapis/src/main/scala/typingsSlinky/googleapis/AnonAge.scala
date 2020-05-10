package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAge extends js.Object {
  var age: js.UndefOr[Double] = js.native
  var createdBefore: js.UndefOr[String] = js.native
  var isLive: js.UndefOr[Boolean] = js.native
  var matchesPattern: js.UndefOr[String] = js.native
  var matchesStorageClass: js.UndefOr[js.Array[String]] = js.native
  var numNewerVersions: js.UndefOr[Double] = js.native
}

object AnonAge {
  @scala.inline
  def apply(): AnonAge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAge]
  }
  @scala.inline
  implicit class AnonAgeOps[Self <: AnonAge] (val x: Self) extends AnyVal {
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
    def withMatchesPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchesPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchesPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchesPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchesStorageClass(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchesStorageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchesStorageClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchesStorageClass")(js.undefined)
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

