package typingsSlinky.chromeApps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Includedirectories extends js.Object {
  var include_directories: Boolean = js.native
}

object Includedirectories {
  @scala.inline
  def apply(include_directories: Boolean): Includedirectories = {
    val __obj = js.Dynamic.literal(include_directories = include_directories.asInstanceOf[js.Any])
    __obj.asInstanceOf[Includedirectories]
  }
  @scala.inline
  implicit class IncludedirectoriesOps[Self <: Includedirectories] (val x: Self) extends AnyVal {
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

