package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of Android device configuration permutations is defined by the the
  * cross-product of the given axes. Internally, the given AndroidMatrix will
  * be expanded into a set of AndroidDevices.  Only supported permutations will
  * be instantiated.  Invalid permutations (e.g., incompatible models/versions)
  * are ignored.
  */
@js.native
trait SchemaAndroidMatrix extends js.Object {
  /**
    * Required. The ids of the set of Android device to be used. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var androidModelIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required. The ids of the set of Android OS version to be used. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var androidVersionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required. The set of locales the test device will enable for testing. Use
    * the TestEnvironmentDiscoveryService to get supported options.
    */
  var locales: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required. The set of orientations to test with. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var orientations: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAndroidMatrix {
  @scala.inline
  def apply(): SchemaAndroidMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidMatrix]
  }
  @scala.inline
  implicit class SchemaAndroidMatrixOps[Self <: SchemaAndroidMatrix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidModelIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidModelIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidModelIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidModelIds")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidVersionIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidVersionIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidVersionIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidVersionIds")(js.undefined)
        ret
    }
    @scala.inline
    def withLocales(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locales")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocales: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locales")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientations")(js.undefined)
        ret
    }
  }
  
}

