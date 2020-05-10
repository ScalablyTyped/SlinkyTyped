package typingsSlinky.imagemin.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var data: Buffer = js.native
  var destinationPath: String = js.native
  var sourcePath: String = js.native
}

object Result {
  @scala.inline
  def apply(data: Buffer, destinationPath: String, sourcePath: String): Result = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], destinationPath = destinationPath.asInstanceOf[js.Any], sourcePath = sourcePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourcePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

