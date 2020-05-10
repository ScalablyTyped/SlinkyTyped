package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Android package file to install.
  */
@js.native
trait SchemaApk extends js.Object {
  /**
    * The path to an APK to be installed on the device before the test begins.
    */
  var location: js.UndefOr[SchemaFileReference] = js.native
  /**
    * The java package for the APK to be installed. Value is determined by
    * examining the application&#39;s manifest.
    */
  var packageName: js.UndefOr[String] = js.native
}

object SchemaApk {
  @scala.inline
  def apply(): SchemaApk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApk]
  }
  @scala.inline
  implicit class SchemaApkOps[Self <: SchemaApk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: SchemaFileReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(js.undefined)
        ret
    }
  }
  
}

