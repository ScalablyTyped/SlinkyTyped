package typingsSlinky.electronJsonStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataOptions extends js.Object {
  var dataPath: String = js.native
}

object DataOptions {
  @scala.inline
  def apply(dataPath: String): DataOptions = {
    val __obj = js.Dynamic.literal(dataPath = dataPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataOptions]
  }
  @scala.inline
  implicit class DataOptionsOps[Self <: DataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

