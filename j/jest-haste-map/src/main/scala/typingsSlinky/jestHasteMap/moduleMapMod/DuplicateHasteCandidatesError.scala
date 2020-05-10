package typingsSlinky.jestHasteMap.moduleMapMod

import typingsSlinky.jestHasteMap.typesMod.DuplicatesSet
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DuplicateHasteCandidatesError extends Error {
  var duplicatesSet: DuplicatesSet = js.native
  var hasteName: String = js.native
  var platform: String | Null = js.native
  var supportsNativePlatform: Boolean = js.native
}

object DuplicateHasteCandidatesError {
  @scala.inline
  def apply(
    duplicatesSet: DuplicatesSet,
    hasteName: String,
    message: String,
    name: String,
    supportsNativePlatform: Boolean
  ): DuplicateHasteCandidatesError = {
    val __obj = js.Dynamic.literal(duplicatesSet = duplicatesSet.asInstanceOf[js.Any], hasteName = hasteName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], supportsNativePlatform = supportsNativePlatform.asInstanceOf[js.Any])
    __obj.asInstanceOf[DuplicateHasteCandidatesError]
  }
  @scala.inline
  implicit class DuplicateHasteCandidatesErrorOps[Self <: DuplicateHasteCandidatesError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuplicatesSet(value: DuplicatesSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicatesSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasteName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasteName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsNativePlatform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsNativePlatform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatformNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(null)
        ret
    }
  }
  
}

