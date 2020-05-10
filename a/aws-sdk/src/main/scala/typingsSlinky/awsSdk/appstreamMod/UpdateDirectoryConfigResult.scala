package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDirectoryConfigResult extends js.Object {
  /**
    * Information about the Directory Config object.
    */
  var DirectoryConfig: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.DirectoryConfig] = js.native
}

object UpdateDirectoryConfigResult {
  @scala.inline
  def apply(): UpdateDirectoryConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDirectoryConfigResult]
  }
  @scala.inline
  implicit class UpdateDirectoryConfigResultOps[Self <: UpdateDirectoryConfigResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryConfig(value: DirectoryConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryConfig")(js.undefined)
        ret
    }
  }
  
}

