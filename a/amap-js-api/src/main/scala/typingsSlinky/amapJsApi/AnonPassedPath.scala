package typingsSlinky.amapJsApi

import typingsSlinky.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPassedPath extends js.Object {
  var passedPath: js.Array[LngLat] = js.native
}

object AnonPassedPath {
  @scala.inline
  def apply(passedPath: js.Array[LngLat]): AnonPassedPath = {
    val __obj = js.Dynamic.literal(passedPath = passedPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPassedPath]
  }
  @scala.inline
  implicit class AnonPassedPathOps[Self <: AnonPassedPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassedPath(value: js.Array[LngLat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passedPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

