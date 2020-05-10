package typingsSlinky.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDevMode extends js.Object {
  var devMode: js.UndefOr[Boolean] = js.native
  var newWindow: js.UndefOr[Boolean] = js.native
  var pathsToOpen: js.Array[String] = js.native
  var safeMode: js.UndefOr[Boolean] = js.native
}

object AnonDevMode {
  @scala.inline
  def apply(pathsToOpen: js.Array[String]): AnonDevMode = {
    val __obj = js.Dynamic.literal(pathsToOpen = pathsToOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDevMode]
  }
  @scala.inline
  implicit class AnonDevModeOps[Self <: AnonDevMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPathsToOpen(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathsToOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devMode")(js.undefined)
        ret
    }
    @scala.inline
    def withNewWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withSafeMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeMode")(js.undefined)
        ret
    }
  }
  
}

