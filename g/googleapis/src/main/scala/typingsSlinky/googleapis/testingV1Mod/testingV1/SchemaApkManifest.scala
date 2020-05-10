package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Android app manifest. See
  * http://developer.android.com/guide/topics/manifest/manifest-intro.html
  */
@js.native
trait SchemaApkManifest extends js.Object {
  /**
    * User-readable name for the application.
    */
  var applicationLabel: js.UndefOr[String] = js.native
  var intentFilters: js.UndefOr[js.Array[SchemaIntentFilter]] = js.native
  /**
    * Maximum API level on which the application is designed to run.
    */
  var maxSdkVersion: js.UndefOr[Double] = js.native
  /**
    * Minimum API level required for the application to run.
    */
  var minSdkVersion: js.UndefOr[Double] = js.native
  /**
    * Full Java-style package name for this application, e.g.
    * &quot;com.example.foo&quot;.
    */
  var packageName: js.UndefOr[String] = js.native
}

object SchemaApkManifest {
  @scala.inline
  def apply(): SchemaApkManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApkManifest]
  }
  @scala.inline
  implicit class SchemaApkManifestOps[Self <: SchemaApkManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withIntentFilters(value: js.Array[SchemaIntentFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntentFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSdkVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSdkVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSdkVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSdkVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSdkVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSdkVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSdkVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSdkVersion")(js.undefined)
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

