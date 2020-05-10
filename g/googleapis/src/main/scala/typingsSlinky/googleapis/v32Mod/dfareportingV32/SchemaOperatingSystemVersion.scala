package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a particular version of an operating system that
  * can be targeted by ads.
  */
@js.native
trait SchemaOperatingSystemVersion extends js.Object {
  /**
    * ID of this operating system version.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#operatingSystemVersion&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Major version (leftmost number) of this operating system version.
    */
  var majorVersion: js.UndefOr[String] = js.native
  /**
    * Minor version (number after the first dot) of this operating system
    * version.
    */
  var minorVersion: js.UndefOr[String] = js.native
  /**
    * Name of this operating system version.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Operating system of this operating system version.
    */
  var operatingSystem: js.UndefOr[SchemaOperatingSystem] = js.native
}

object SchemaOperatingSystemVersion {
  @scala.inline
  def apply(): SchemaOperatingSystemVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperatingSystemVersion]
  }
  @scala.inline
  implicit class SchemaOperatingSystemVersionOps[Self <: SchemaOperatingSystemVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    @scala.inline
    def withOperatingSystem(value: SchemaOperatingSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystem")(js.undefined)
        ret
    }
  }
  
}

