package typingsSlinky.dojo.dojo.base.kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.version.html
  *
  * Version number of the Dojo Toolkit
  * Hash about the version, including
  *
  * major: Integer: Major version. If total version is "1.2.0beta1", will be 1
  * minor: Integer: Minor version. If total version is "1.2.0beta1", will be 2
  * patch: Integer: Patch version. If total version is "1.2.0beta1", will be 0
  * flag: String: Descriptor flag. If total version is "1.2.0beta1", will be "beta1"
  * revision: Number: The Git rev from which dojo was pulled
  *
  */
@js.native
trait version extends js.Object {
  /**
    *
    */
  var flag: String = js.native
  /**
    *
    */
  var major: Double = js.native
  /**
    *
    */
  var minor: Double = js.native
  /**
    *
    */
  var patch: Double = js.native
  /**
    *
    */
  var revision: Double = js.native
}

object version {
  @scala.inline
  def apply(flag: String, major: Double, minor: Double, patch: Double, revision: Double): version = {
    val __obj = js.Dynamic.literal(flag = flag.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[version]
  }
  @scala.inline
  implicit class versionOps[Self <: version] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("major")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

