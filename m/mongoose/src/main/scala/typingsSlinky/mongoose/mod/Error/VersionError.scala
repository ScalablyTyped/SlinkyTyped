package typingsSlinky.mongoose.mod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersionError
  extends typingsSlinky.mongoose.mod.Error {
  var modifiedPaths: js.Array[_] = js.native
  @JSName("name")
  var name_VersionError: typingsSlinky.mongoose.mongooseStrings.VersionError = js.native
  var version: js.Any = js.native
}

object VersionError {
  @scala.inline
  def apply(
    modifiedPaths: js.Array[_],
    name: typingsSlinky.mongoose.mongooseStrings.VersionError,
    version: js.Any
  ): VersionError = {
    val __obj = js.Dynamic.literal(modifiedPaths = modifiedPaths.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionError]
  }
  @scala.inline
  implicit class VersionErrorOps[Self <: VersionError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModifiedPaths(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: typingsSlinky.mongoose.mongooseStrings.VersionError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

