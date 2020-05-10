package typingsSlinky.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConfigPath extends js.Object {
  val configPath: String = js.native
}

object AnonConfigPath {
  @scala.inline
  def apply(configPath: String): AnonConfigPath = {
    val __obj = js.Dynamic.literal(configPath = configPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfigPath]
  }
  @scala.inline
  implicit class AnonConfigPathOps[Self <: AnonConfigPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

