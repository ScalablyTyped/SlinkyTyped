package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A version of the Android OS.
  */
@js.native
trait SchemaAndroidVersion extends js.Object {
  /**
    * The API level for this Android version. Examples: 18, 19.
    */
  var apiLevel: js.UndefOr[Double] = js.native
  /**
    * The code name for this Android version. Examples: &quot;JellyBean&quot;,
    * &quot;KitKat&quot;.
    */
  var codeName: js.UndefOr[String] = js.native
  /**
    * Market share for this version.
    */
  var distribution: js.UndefOr[SchemaDistribution] = js.native
  /**
    * An opaque id for this Android version. Use this id to invoke the
    * TestExecutionService.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The date this Android version became available in the market.
    */
  var releaseDate: js.UndefOr[SchemaDate] = js.native
  /**
    * Tags for this dimension. Examples: &quot;default&quot;,
    * &quot;preview&quot;, &quot;deprecated&quot;.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
  /**
    * A string representing this version of the Android OS. Examples:
    * &quot;4.3&quot;, &quot;4.4&quot;.
    */
  var versionString: js.UndefOr[String] = js.native
}

object SchemaAndroidVersion {
  @scala.inline
  def apply(): SchemaAndroidVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidVersion]
  }
  @scala.inline
  implicit class SchemaAndroidVersionOps[Self <: SchemaAndroidVersion] (val x: Self) extends AnyVal {
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
    def withDistribution(value: SchemaDistribution): Self = {
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
    def withReleaseDate(value: SchemaDate): Self = {
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

