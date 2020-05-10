package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An iOS version.
  */
@js.native
trait SchemaIosVersion extends js.Object {
  /**
    * An opaque id for this iOS version. Use this id to invoke the
    * TestExecutionService.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * An integer representing the major iOS version. Examples: &quot;8&quot;,
    * &quot;9&quot;.
    */
  var majorVersion: js.UndefOr[Double] = js.native
  /**
    * An integer representing the minor iOS version. Examples: &quot;1&quot;,
    * &quot;2&quot;.
    */
  var minorVersion: js.UndefOr[Double] = js.native
  /**
    * The available Xcode versions for this version.
    */
  var supportedXcodeVersionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Tags for this dimension. Examples: &quot;default&quot;,
    * &quot;preview&quot;, &quot;deprecated&quot;.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object SchemaIosVersion {
  @scala.inline
  def apply(): SchemaIosVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosVersion]
  }
  @scala.inline
  implicit class SchemaIosVersionOps[Self <: SchemaIosVersion] (val x: Self) extends AnyVal {
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
    def withMajorVersion(value: Double): Self = {
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
    def withMinorVersion(value: Double): Self = {
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
    def withSupportedXcodeVersionIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedXcodeVersionIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedXcodeVersionIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedXcodeVersionIds")(js.undefined)
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
  }
  
}

