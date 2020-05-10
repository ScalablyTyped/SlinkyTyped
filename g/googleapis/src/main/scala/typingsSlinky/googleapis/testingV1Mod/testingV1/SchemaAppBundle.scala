package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Android App Bundle file format, containing a BundleConfig.pb file, a
  * base module directory, zero or more dynamic feature module directories.
  * &lt;p&gt;See https://developer.android.com/guide/app-bundle/build for
  * guidance on building App Bundles.
  */
@js.native
trait SchemaAppBundle extends js.Object {
  /**
    * .aab file representing the app bundle under test.
    */
  var bundleLocation: js.UndefOr[SchemaFileReference] = js.native
}

object SchemaAppBundle {
  @scala.inline
  def apply(): SchemaAppBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppBundle]
  }
  @scala.inline
  implicit class SchemaAppBundleOps[Self <: SchemaAppBundle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBundleLocation(value: SchemaFileReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleLocation")(js.undefined)
        ret
    }
  }
  
}

