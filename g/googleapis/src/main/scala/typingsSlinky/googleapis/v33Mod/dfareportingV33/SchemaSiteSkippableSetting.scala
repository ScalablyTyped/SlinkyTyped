package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Skippable Settings
  */
@js.native
trait SchemaSiteSkippableSetting extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#siteSkippableSetting&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Amount of time to play videos served to this site template before
    * counting a view. Applicable when skippable is true.
    */
  var progressOffset: js.UndefOr[SchemaVideoOffset] = js.native
  /**
    * Amount of time to play videos served to this site before the skip button
    * should appear. Applicable when skippable is true.
    */
  var skipOffset: js.UndefOr[SchemaVideoOffset] = js.native
  /**
    * Whether the user can skip creatives served to this site. This will act as
    * default for new placements created under this site.
    */
  var skippable: js.UndefOr[Boolean] = js.native
}

object SchemaSiteSkippableSetting {
  @scala.inline
  def apply(): SchemaSiteSkippableSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteSkippableSetting]
  }
  @scala.inline
  implicit class SchemaSiteSkippableSettingOps[Self <: SchemaSiteSkippableSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressOffset(value: SchemaVideoOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipOffset(value: SchemaVideoOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withSkippable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skippable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkippable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skippable")(js.undefined)
        ret
    }
  }
  
}

