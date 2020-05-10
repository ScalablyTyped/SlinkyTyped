package typingsSlinky.knockoutKogrid.kg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grid[EntityType] extends js.Object {
  @JSName("$$selectionPhase")
  var DollarDollarselectionPhase: Boolean = js.native
  var config: GridOptions[EntityType] = js.native
  var rowFactory: RowFactory[EntityType] = js.native
  var selectionService: SelectionService[EntityType] = js.native
  def configureColumnWidths(): Unit = js.native
}

object Grid {
  @scala.inline
  def apply[EntityType](
    DollarDollarselectionPhase: Boolean,
    config: GridOptions[EntityType],
    configureColumnWidths: () => Unit,
    rowFactory: RowFactory[EntityType],
    selectionService: SelectionService[EntityType]
  ): Grid[EntityType] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], configureColumnWidths = js.Any.fromFunction0(configureColumnWidths), rowFactory = rowFactory.asInstanceOf[js.Any], selectionService = selectionService.asInstanceOf[js.Any])
    __obj.updateDynamic("$$selectionPhase")(DollarDollarselectionPhase.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grid[EntityType]]
  }
  @scala.inline
  implicit class GridOps[Self[entitytype] <: Grid[entitytype], EntityType] (val x: Self[EntityType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[EntityType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[EntityType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[EntityType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[EntityType] with Other]
    @scala.inline
    def withDollarDollarselectionPhase(value: Boolean): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$$selectionPhase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: GridOptions[EntityType]): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigureColumnWidths(value: () => Unit): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configureColumnWidths")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRowFactory(value: RowFactory[EntityType]): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionService(value: SelectionService[EntityType]): Self[EntityType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionService")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

