package typingsSlinky.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a domain.
  */
@js.native
trait SchemaDomain extends js.Object {
  /**
    * An opaque string used to identify this domain.
    */
  var legacyId: js.UndefOr[String] = js.native
  /**
    * The name of the domain, e.g. &quot;google.com&quot;.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaDomain {
  @scala.inline
  def apply(): SchemaDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomain]
  }
  @scala.inline
  implicit class SchemaDomainOps[Self <: SchemaDomain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLegacyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegacyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacyId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

