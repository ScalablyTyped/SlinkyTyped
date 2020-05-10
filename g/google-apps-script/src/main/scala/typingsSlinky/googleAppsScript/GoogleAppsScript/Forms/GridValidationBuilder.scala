package typingsSlinky.googleAppsScript.GoogleAppsScript.Forms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DataValidationBuilder for a GridValidation.
  *
  *     // Add a grid item to a form and require one response per column.
  *     var gridItem = form.addGridItem();
  *     gridItem.setTitle('Rate your interests')
  *       .setRows(['Cars', 'Computers', 'Celebrities'])
  *       .setColumns(['Boring', 'So-so', 'Interesting']);
  *     var gridValidation = FormApp.createGridValidation()
  *       .setHelpText(“Select one item per column.”)
  *       .requireLimitOneResponsePerColumn()
  *       .build();
  *     gridItem.setValidation(gridValidation);
  */
@js.native
trait GridValidationBuilder extends js.Object {
  def requireLimitOneResponsePerColumn(): GridValidationBuilder = js.native
}

object GridValidationBuilder {
  @scala.inline
  def apply(requireLimitOneResponsePerColumn: () => GridValidationBuilder): GridValidationBuilder = {
    val __obj = js.Dynamic.literal(requireLimitOneResponsePerColumn = js.Any.fromFunction0(requireLimitOneResponsePerColumn))
    __obj.asInstanceOf[GridValidationBuilder]
  }
  @scala.inline
  implicit class GridValidationBuilderOps[Self <: GridValidationBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequireLimitOneResponsePerColumn(value: () => GridValidationBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireLimitOneResponsePerColumn")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

