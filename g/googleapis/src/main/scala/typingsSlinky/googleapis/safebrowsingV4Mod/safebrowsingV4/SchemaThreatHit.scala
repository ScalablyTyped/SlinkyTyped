package typingsSlinky.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaThreatHit extends js.Object {
  /**
    * Client-reported identification.
    */
  var clientInfo: js.UndefOr[SchemaClientInfo] = js.native
  /**
    * The threat entry responsible for the hit. Full hash should be reported
    * for hash-based hits.
    */
  var entry: js.UndefOr[SchemaThreatEntry] = js.native
  /**
    * The platform type reported.
    */
  var platformType: js.UndefOr[String] = js.native
  /**
    * The resources related to the threat hit.
    */
  var resources: js.UndefOr[js.Array[SchemaThreatSource]] = js.native
  /**
    * The threat type reported.
    */
  var threatType: js.UndefOr[String] = js.native
  /**
    * Details about the user that encountered the threat.
    */
  var userInfo: js.UndefOr[SchemaUserInfo] = js.native
}

object SchemaThreatHit {
  @scala.inline
  def apply(): SchemaThreatHit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThreatHit]
  }
  @scala.inline
  implicit class SchemaThreatHitOps[Self <: SchemaThreatHit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientInfo(value: SchemaClientInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withEntry(value: SchemaThreatEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformType")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: js.Array[SchemaThreatSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
    @scala.inline
    def withThreatType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threatType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreatType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threatType")(js.undefined)
        ret
    }
    @scala.inline
    def withUserInfo(value: SchemaUserInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInfo")(js.undefined)
        ret
    }
  }
  
}

