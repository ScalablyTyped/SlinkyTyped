package typingsSlinky.chromeApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIncludedirectories extends js.Object {
  var include_directories: Boolean = js.native
}

object AnonIncludedirectories {
  @scala.inline
  def apply(include_directories: Boolean): AnonIncludedirectories = {
    val __obj = js.Dynamic.literal(include_directories = include_directories.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludedirectories]
  }
  @scala.inline
  implicit class AnonIncludedirectoriesOps[Self <: AnonIncludedirectories] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInclude_directories(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_directories")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

