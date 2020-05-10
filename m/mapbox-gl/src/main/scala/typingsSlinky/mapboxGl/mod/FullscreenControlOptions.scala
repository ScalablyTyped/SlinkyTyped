package typingsSlinky.mapboxGl.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullscreenControlOptions extends js.Object {
  /**
    * A compatible DOM element which should be made full screen.
    * By default, the map container element will be made full screen.
    */
  var container: js.UndefOr[HTMLElement | Null] = js.native
}

object FullscreenControlOptions {
  @scala.inline
  def apply(): FullscreenControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullscreenControlOptions]
  }
  @scala.inline
  implicit class FullscreenControlOptionsOps[Self <: FullscreenControlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(null)
        ret
    }
  }
  
}

