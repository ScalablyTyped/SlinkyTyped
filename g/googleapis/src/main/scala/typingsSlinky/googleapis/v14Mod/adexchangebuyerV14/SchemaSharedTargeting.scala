package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSharedTargeting extends js.Object {
  /**
    * The list of values to exclude from targeting. Each value is AND&#39;d
    * together.
    */
  var exclusions: js.UndefOr[js.Array[SchemaTargetingValue]] = js.native
  /**
    * The list of value to include as part of the targeting. Each value is
    * OR&#39;d together.
    */
  var inclusions: js.UndefOr[js.Array[SchemaTargetingValue]] = js.native
  /**
    * The key representing the shared targeting criterion.
    */
  var key: js.UndefOr[String] = js.native
}

object SchemaSharedTargeting {
  @scala.inline
  def apply(): SchemaSharedTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSharedTargeting]
  }
  @scala.inline
  implicit class SchemaSharedTargetingOps[Self <: SchemaSharedTargeting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclusions(value: js.Array[SchemaTargetingValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusions")(js.undefined)
        ret
    }
    @scala.inline
    def withInclusions(value: js.Array[SchemaTargetingValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclusions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusions")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
  }
  
}

