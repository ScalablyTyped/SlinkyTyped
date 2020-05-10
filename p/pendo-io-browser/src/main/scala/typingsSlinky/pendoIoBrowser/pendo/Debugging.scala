package typingsSlinky.pendoIoBrowser.pendo

import typingsSlinky.pendoIoBrowser.AnonAuto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Debugging extends js.Object {
   // TODO
  def getAllGuides(): js.Array[Guide] = js.native
  def getAutoGuides(): AnonAuto = js.native
  def getBadgeGuides(): js.Array[Guide] = js.native
  def getEventCache(): js.Array[_] = js.native
  def getLauncherGuides(): js.Array[Guide] = js.native
}

object Debugging {
  @scala.inline
  def apply(
    getAllGuides: () => js.Array[Guide],
    getAutoGuides: () => AnonAuto,
    getBadgeGuides: () => js.Array[Guide],
    getEventCache: () => js.Array[_],
    getLauncherGuides: () => js.Array[Guide]
  ): Debugging = {
    val __obj = js.Dynamic.literal(getAllGuides = js.Any.fromFunction0(getAllGuides), getAutoGuides = js.Any.fromFunction0(getAutoGuides), getBadgeGuides = js.Any.fromFunction0(getBadgeGuides), getEventCache = js.Any.fromFunction0(getEventCache), getLauncherGuides = js.Any.fromFunction0(getLauncherGuides))
    __obj.asInstanceOf[Debugging]
  }
  @scala.inline
  implicit class DebuggingOps[Self <: Debugging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAllGuides(value: () => js.Array[Guide]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllGuides")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAutoGuides(value: () => AnonAuto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoGuides")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBadgeGuides(value: () => js.Array[Guide]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBadgeGuides")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEventCache(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEventCache")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLauncherGuides(value: () => js.Array[Guide]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLauncherGuides")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

