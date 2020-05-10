package typingsSlinky.reactNativeBackgroundDownloader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Directories_ extends js.Object {
  var documents: String = js.native
}

object Directories_ {
  @scala.inline
  def apply(documents: String): Directories_ = {
    val __obj = js.Dynamic.literal(documents = documents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directories_]
  }
  @scala.inline
  implicit class Directories_Ops[Self <: Directories_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocuments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documents")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

