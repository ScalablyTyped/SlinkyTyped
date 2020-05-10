package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The position of an embedded object such as a chart.
  */
@js.native
trait SchemaEmbeddedObjectPosition extends js.Object {
  /**
    * If true, the embedded object is put on a new sheet whose ID is chosen for
    * you. Used only when writing.
    */
  var newSheet: js.UndefOr[Boolean] = js.native
  /**
    * The position at which the object is overlaid on top of a grid.
    */
  var overlayPosition: js.UndefOr[SchemaOverlayPosition] = js.native
  /**
    * The sheet this is on. Set only if the embedded object is on its own
    * sheet. Must be non-negative.
    */
  var sheetId: js.UndefOr[Double] = js.native
}

object SchemaEmbeddedObjectPosition {
  @scala.inline
  def apply(): SchemaEmbeddedObjectPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmbeddedObjectPosition]
  }
  @scala.inline
  implicit class SchemaEmbeddedObjectPositionOps[Self <: SchemaEmbeddedObjectPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewSheet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewSheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSheet")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayPosition(value: SchemaOverlayPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSheetId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetId")(js.undefined)
        ret
    }
  }
  
}

