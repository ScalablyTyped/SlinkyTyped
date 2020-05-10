package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for Drive export.
  */
@js.native
trait SchemaDriveExportOptions extends js.Object {
  /**
    * Set to true to include access level information for users with &lt;a
    * href=&quot;https://support.google.com/vault/answer/6099459#metadata&quot;&gt;indirect
    * access&lt;/a&gt; to files.
    */
  var includeAccessInfo: js.UndefOr[Boolean] = js.native
}

object SchemaDriveExportOptions {
  @scala.inline
  def apply(): SchemaDriveExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveExportOptions]
  }
  @scala.inline
  implicit class SchemaDriveExportOptionsOps[Self <: SchemaDriveExportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeAccessInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAccessInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeAccessInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAccessInfo")(js.undefined)
        ret
    }
  }
  
}

