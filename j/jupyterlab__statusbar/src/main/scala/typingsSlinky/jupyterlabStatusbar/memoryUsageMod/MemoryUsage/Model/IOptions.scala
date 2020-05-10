package typingsSlinky.jupyterlabStatusbar.memoryUsageMod.MemoryUsage.Model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for creating a MemoryUsage model.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The refresh rate (in ms) for querying the server.
    */
  var refreshRate: Double = js.native
}

object IOptions {
  @scala.inline
  def apply(refreshRate: Double): IOptions = {
    val __obj = js.Dynamic.literal(refreshRate = refreshRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRefreshRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshRate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

