package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rich Media Exit Override.
  */
@js.native
trait SchemaRichMediaExitOverride extends js.Object {
  /**
    * Click-through URL of this rich media exit override. Applicable if the
    * enabled field is set to true.
    */
  var clickThroughUrl: js.UndefOr[SchemaClickThroughUrl] = js.native
  /**
    * Whether to use the clickThroughUrl. If false, the creative-level exit
    * will be used.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * ID for the override to refer to a specific exit in the creative.
    */
  var exitId: js.UndefOr[String] = js.native
}

object SchemaRichMediaExitOverride {
  @scala.inline
  def apply(): SchemaRichMediaExitOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRichMediaExitOverride]
  }
  @scala.inline
  implicit class SchemaRichMediaExitOverrideOps[Self <: SchemaRichMediaExitOverride] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClickThroughUrl(value: SchemaClickThroughUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThroughUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickThroughUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThroughUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withExitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitId")(js.undefined)
        ret
    }
  }
  
}

