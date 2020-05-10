package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rights management policy for YouTube resources.
  */
@js.native
trait SchemaAccessPolicy extends js.Object {
  /**
    * The value of allowed indicates whether the access to the policy is
    * allowed or denied by default.
    */
  var allowed: js.UndefOr[Boolean] = js.native
  /**
    * A list of region codes that identify countries where the default policy
    * do not apply.
    */
  var exception: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAccessPolicy {
  @scala.inline
  def apply(): SchemaAccessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessPolicy]
  }
  @scala.inline
  implicit class SchemaAccessPolicyOps[Self <: SchemaAccessPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed")(js.undefined)
        ret
    }
    @scala.inline
    def withException(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exception")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exception")(js.undefined)
        ret
    }
  }
  
}

