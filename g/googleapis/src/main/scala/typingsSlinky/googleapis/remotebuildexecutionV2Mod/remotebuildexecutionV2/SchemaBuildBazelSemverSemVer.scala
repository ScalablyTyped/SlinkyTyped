package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The full version of a given tool.
  */
@js.native
trait SchemaBuildBazelSemverSemVer extends js.Object {
  /**
    * The major version, e.g 10 for 10.2.3.
    */
  var major: js.UndefOr[Double] = js.native
  /**
    * The minor version, e.g. 2 for 10.2.3.
    */
  var minor: js.UndefOr[Double] = js.native
  /**
    * The patch version, e.g 3 for 10.2.3.
    */
  var patch: js.UndefOr[Double] = js.native
  /**
    * The pre-release version. Either this field or major/minor/patch fields
    * must be filled. They are mutually exclusive. Pre-release versions are
    * assumed to be earlier than any released versions.
    */
  var prerelease: js.UndefOr[String] = js.native
}

object SchemaBuildBazelSemverSemVer {
  @scala.inline
  def apply(): SchemaBuildBazelSemverSemVer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelSemverSemVer]
  }
  @scala.inline
  implicit class SchemaBuildBazelSemverSemVerOps[Self <: SchemaBuildBazelSemverSemVer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMajor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("major")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("major")(js.undefined)
        ret
    }
    @scala.inline
    def withMinor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minor")(js.undefined)
        ret
    }
    @scala.inline
    def withPatch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.undefined)
        ret
    }
    @scala.inline
    def withPrerelease(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prerelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrerelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prerelease")(js.undefined)
        ret
    }
  }
  
}

