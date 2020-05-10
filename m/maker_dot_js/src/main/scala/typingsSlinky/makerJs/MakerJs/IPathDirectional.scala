package typingsSlinky.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A path that may be indicated to "flow" in either direction between its endpoints.
  */
@js.native
trait IPathDirectional extends IPath {
  /**
    * The endpoints of the path.
    */
  var endPoints: js.Array[IPoint] = js.native
  /**
    * Path flows forwards or reverse.
    */
  var reversed: js.UndefOr[Boolean] = js.native
}

object IPathDirectional {
  @scala.inline
  def apply(endPoints: js.Array[IPoint], origin: IPoint, `type`: String): IPathDirectional = {
    val __obj = js.Dynamic.literal(endPoints = endPoints.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathDirectional]
  }
  @scala.inline
  implicit class IPathDirectionalOps[Self <: IPathDirectional] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndPoints(value: js.Array[IPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReversed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReversed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(js.undefined)
        ret
    }
  }
  
}

