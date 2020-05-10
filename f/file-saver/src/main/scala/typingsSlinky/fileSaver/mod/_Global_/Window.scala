package typingsSlinky.fileSaver.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var saveAs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FileSaver.saveAs */ js.Any = js.native
}

object Window {
  @scala.inline
  def apply(
    saveAs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FileSaver.saveAs */ js.Any
  ): Window = {
    val __obj = js.Dynamic.literal(saveAs = saveAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSaveAs(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FileSaver.saveAs */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveAs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

