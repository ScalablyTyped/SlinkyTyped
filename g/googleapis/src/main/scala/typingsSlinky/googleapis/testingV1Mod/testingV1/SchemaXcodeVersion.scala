package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Xcode version that an iOS version is compatible with.
  */
@js.native
trait SchemaXcodeVersion extends js.Object {
  /**
    * Tags for this Xcode version. Example: &quot;default&quot;.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
  /**
    * The id for this version. Example: &quot;9.2&quot;.
    */
  var version: js.UndefOr[String] = js.native
}

object SchemaXcodeVersion {
  @scala.inline
  def apply(): SchemaXcodeVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaXcodeVersion]
  }
  @scala.inline
  implicit class SchemaXcodeVersionOps[Self <: SchemaXcodeVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

