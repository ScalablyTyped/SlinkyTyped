package typingsSlinky.leafletDraw.mod.Control

import typingsSlinky.leaflet.mod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawConstructorOptions extends js.Object {
  /**
    * The options used to configure the draw toolbar.
    *
    * @default {}
    */
  var draw: js.UndefOr[DrawOptions] = js.native
  /**
    * The options used to configure the edit toolbar.
    *
    * @default false
    */
  var edit: js.UndefOr[EditOptions] = js.native
  /**
    * The initial position of the control (one of the map corners).
    *
    * @default 'topleft'
    */
  var position: js.UndefOr[ControlPosition] = js.native
}

object DrawConstructorOptions {
  @scala.inline
  def apply(): DrawConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawConstructorOptions]
  }
  @scala.inline
  implicit class DrawConstructorOptionsOps[Self <: DrawConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDraw(value: DrawOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(js.undefined)
        ret
    }
    @scala.inline
    def withEdit(value: EditOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: ControlPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
  }
  
}

