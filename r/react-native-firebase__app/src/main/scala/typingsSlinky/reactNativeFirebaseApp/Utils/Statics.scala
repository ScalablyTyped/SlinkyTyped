package typingsSlinky.reactNativeFirebaseApp.Utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Statics extends js.Object {
  var FilePath: typingsSlinky.reactNativeFirebaseApp.Utils.FilePath = js.native
}

object Statics {
  @scala.inline
  def apply(FilePath: FilePath): Statics = {
    val __obj = js.Dynamic.literal(FilePath = FilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statics]
  }
  @scala.inline
  implicit class StaticsOps[Self <: Statics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilePath(value: FilePath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilePath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

