package typingsSlinky.loadableServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStatsFile extends js.Object {
  /**
  	 * Stats file path generated using `@loadable/webpack-plugin`
  	 */
  var statsFile: String = js.native
}

object AnonStatsFile {
  @scala.inline
  def apply(statsFile: String): AnonStatsFile = {
    val __obj = js.Dynamic.literal(statsFile = statsFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStatsFile]
  }
  @scala.inline
  implicit class AnonStatsFileOps[Self <: AnonStatsFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatsFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statsFile")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

