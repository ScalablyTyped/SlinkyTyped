package typingsSlinky.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageAccessCondition extends js.Object {
  var `If-Match`: String = js.native
  var `If-Modified-Since`: js.Date = js.native
  var `If-None-Match`: String = js.native
  var `If-Unmodified-Since`: js.Date = js.native
}

object StorageAccessCondition {
  @scala.inline
  def apply(
    `If-Match`: String,
    `If-Modified-Since`: js.Date,
    `If-None-Match`: String,
    `If-Unmodified-Since`: js.Date
  ): StorageAccessCondition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("If-Match")(`If-Match`.asInstanceOf[js.Any])
    __obj.updateDynamic("If-Modified-Since")(`If-Modified-Since`.asInstanceOf[js.Any])
    __obj.updateDynamic("If-None-Match")(`If-None-Match`.asInstanceOf[js.Any])
    __obj.updateDynamic("If-Unmodified-Since")(`If-Unmodified-Since`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageAccessCondition]
  }
  @scala.inline
  implicit class StorageAccessConditionOps[Self <: StorageAccessCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withIf-Match`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("If-Match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withIf-Modified-Since`(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("If-Modified-Since")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withIf-None-Match`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("If-None-Match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withIf-Unmodified-Since`(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("If-Unmodified-Since")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

