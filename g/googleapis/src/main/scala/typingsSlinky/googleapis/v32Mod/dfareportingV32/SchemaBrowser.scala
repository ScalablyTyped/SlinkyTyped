package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a browser that can be targeted by ads.
  */
@js.native
trait SchemaBrowser extends js.Object {
  /**
    * ID referring to this grouping of browser and version numbers. This is the
    * ID used for targeting.
    */
  var browserVersionId: js.UndefOr[String] = js.native
  /**
    * DART ID of this browser. This is the ID used when generating reports.
    */
  var dartId: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#browser&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Major version number (leftmost number) of this browser. For example, for
    * Chrome 5.0.376.86 beta, this field should be set to 5. An asterisk (*)
    * may be used to target any version number, and a question mark (?) may be
    * used to target cases where the version number cannot be identified. For
    * example, Chrome *.* targets any version of Chrome: 1.2, 2.5, 3.5, and so
    * on. Chrome 3.* targets Chrome 3.1, 3.5, but not 4.0. Firefox ?.? targets
    * cases where the ad server knows the browser is Firefox but can&#39;t tell
    * which version it is.
    */
  var majorVersion: js.UndefOr[String] = js.native
  /**
    * Minor version number (number after first dot on left) of this browser.
    * For example, for Chrome 5.0.375.86 beta, this field should be set to 0.
    * An asterisk (*) may be used to target any version number, and a question
    * mark (?) may be used to target cases where the version number cannot be
    * identified. For example, Chrome *.* targets any version of Chrome:
    * 1.2, 2.5, 3.5, and so on. Chrome 3.* targets Chrome 3.1, 3.5, but
    * not 4.0. Firefox ?.? targets cases where the ad server knows the browser
    * is Firefox but can&#39;t tell which version it is.
    */
  var minorVersion: js.UndefOr[String] = js.native
  /**
    * Name of this browser.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaBrowser {
  @scala.inline
  def apply(): SchemaBrowser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBrowser]
  }
  @scala.inline
  implicit class SchemaBrowserOps[Self <: SchemaBrowser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowserVersionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserVersionId")(js.undefined)
        ret
    }
    @scala.inline
    def withDartId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dartId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDartId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dartId")(js.undefined)
        ret
    }
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
    def withMajorVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorVersion")(js.undefined)
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

