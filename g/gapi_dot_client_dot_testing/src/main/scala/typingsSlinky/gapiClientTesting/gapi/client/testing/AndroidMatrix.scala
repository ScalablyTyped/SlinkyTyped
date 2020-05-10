package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidMatrix extends js.Object {
  /**
    * The ids of the set of Android device to be used.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var androidModelIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The ids of the set of Android OS version to be used.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var androidVersionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The set of locales the test device will enable for testing.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var locales: js.UndefOr[js.Array[String]] = js.native
  /**
    * The set of orientations to test with.
    * Use the EnvironmentDiscoveryService to get supported options.
    * Required
    */
  var orientations: js.UndefOr[js.Array[String]] = js.native
}

object AndroidMatrix {
  @scala.inline
  def apply(): AndroidMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidMatrix]
  }
  @scala.inline
  implicit class AndroidMatrixOps[Self <: AndroidMatrix] (val x: Self) extends AnyVal {
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

