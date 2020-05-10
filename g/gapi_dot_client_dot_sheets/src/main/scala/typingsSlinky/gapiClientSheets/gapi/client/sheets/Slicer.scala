package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slicer extends js.Object {
  /**
    * The position of the slicer. Note that slicer can be positioned only on
    * existing sheet. Also, width and height of slicer can be automatically
    * adjusted to keep it within permitted limits.
    */
  var position: js.UndefOr[EmbeddedObjectPosition] = js.native
  /** The ID of the slicer. */
  var slicerId: js.UndefOr[Double] = js.native
  /** The specification of the slicer. */
  var spec: js.UndefOr[SlicerSpec] = js.native
}

object Slicer {
  @scala.inline
  def apply(): Slicer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Slicer]
  }
  @scala.inline
  implicit class SlicerOps[Self <: Slicer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosition(value: EmbeddedObjectPosition): Self = {
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
    @scala.inline
    def withSlicerId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slicerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlicerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slicerId")(js.undefined)
        ret
    }
    @scala.inline
    def withSpec(value: SlicerSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(js.undefined)
        ret
    }
  }
  
}

