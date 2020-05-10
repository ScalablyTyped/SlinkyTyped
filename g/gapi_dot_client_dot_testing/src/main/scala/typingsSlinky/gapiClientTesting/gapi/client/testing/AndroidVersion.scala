package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidVersion extends js.Object {
  /**
    * The API level for this Android version.
    * Examples: 18, 19
    * @OutputOnly
    */
  var apiLevel: js.UndefOr[Double] = js.native
  /**
    * The code name for this Android version.
    * Examples: "JellyBean", "KitKat"
    * @OutputOnly
    */
  var codeName: js.UndefOr[String] = js.native
  /**
    * Market share for this version.
    * @OutputOnly
    */
  var distribution: js.UndefOr[Distribution] = js.native
  /**
    * An opaque id for this Android version.
    * Use this id to invoke the TestExecutionService.
    * @OutputOnly
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The date this Android version became available in the market.
    * @OutputOnly
    */
  var releaseDate: js.UndefOr[Date] = js.native
  /**
    * Tags for this dimension.
    * Examples: "default", "preview", "deprecated"
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
  /**
    * A string representing this version of the Android OS.
    * Examples: "4.3", "4.4"
    * @OutputOnly
    */
  var versionString: js.UndefOr[String] = js.native
}

object AndroidVersion {
  @scala.inline
  def apply(): AndroidVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidVersion]
  }
  @scala.inline
  implicit class AndroidVersionOps[Self <: AndroidVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeName")(js.undefined)
        ret
    }
    @scala.inline
    def withDistribution(value: Distribution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistribution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distribution")(js.undefined)
        ret
    }
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
    def withReleaseDate(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDate")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionString")(js.undefined)
        ret
    }
  }
  
}

