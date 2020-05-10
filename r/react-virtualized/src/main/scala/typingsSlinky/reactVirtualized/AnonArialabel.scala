package typingsSlinky.reactVirtualized

import typingsSlinky.react.mod.Requireable
import typingsSlinky.react.mod.Validator
import typingsSlinky.reactVirtualized.esCollectionMod.CollectionCellGroupRenderer
import typingsSlinky.reactVirtualized.esCollectionMod.CollectionCellRenderer
import typingsSlinky.reactVirtualized.esCollectionMod.CollectionCellSizeAndPositionGetter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArialabel extends js.Object {
  var `aria-label`: Requireable[String] = js.native
  var cellCount: Validator[Double] = js.native
  var cellGroupRenderer: Validator[CollectionCellGroupRenderer] = js.native
  var cellRenderer: Validator[CollectionCellRenderer] = js.native
  var cellSizeAndPositionGetter: Validator[CollectionCellSizeAndPositionGetter] = js.native
  var sectionSize: Requireable[Double] = js.native
}

object AnonArialabel {
  @scala.inline
  def apply(
    `aria-label`: Requireable[String],
    cellCount: Validator[Double],
    cellGroupRenderer: Validator[CollectionCellGroupRenderer],
    cellRenderer: Validator[CollectionCellRenderer],
    cellSizeAndPositionGetter: Validator[CollectionCellSizeAndPositionGetter],
    sectionSize: Requireable[Double]
  ): AnonArialabel = {
    val __obj = js.Dynamic.literal(cellCount = cellCount.asInstanceOf[js.Any], cellGroupRenderer = cellGroupRenderer.asInstanceOf[js.Any], cellRenderer = cellRenderer.asInstanceOf[js.Any], cellSizeAndPositionGetter = cellSizeAndPositionGetter.asInstanceOf[js.Any], sectionSize = sectionSize.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArialabel]
  }
  @scala.inline
  implicit class AnonArialabelOps[Self <: AnonArialabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAria-label`(value: Requireable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellCount(value: Validator[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellGroupRenderer(value: Validator[CollectionCellGroupRenderer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellGroupRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellRenderer(value: Validator[CollectionCellRenderer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellSizeAndPositionGetter(value: Validator[CollectionCellSizeAndPositionGetter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSizeAndPositionGetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSectionSize(value: Requireable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

