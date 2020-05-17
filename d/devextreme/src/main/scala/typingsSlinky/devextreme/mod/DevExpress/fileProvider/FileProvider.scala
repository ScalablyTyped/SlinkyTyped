package typingsSlinky.devextreme.mod.DevExpress.fileProvider

import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileProvider extends js.Object {
  /** Gets the specified items' content. */
  def getItemContent(items: js.Array[_]): Promise[_] with JQueryPromise[_] = js.native
}

object FileProvider {
  @scala.inline
  def apply(getItemContent: js.Array[_] => Promise[_] with JQueryPromise[_]): FileProvider = {
    val __obj = js.Dynamic.literal(getItemContent = js.Any.fromFunction1(getItemContent))
    __obj.asInstanceOf[FileProvider]
  }
  @scala.inline
  implicit class FileProviderOps[Self <: FileProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetItemContent(value: js.Array[_] => Promise[_] with JQueryPromise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemContent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

