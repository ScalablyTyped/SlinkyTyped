package typingsSlinky.googleAppsScript.GoogleAppsScript.Forms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A DataValidationBuilder for a CheckboxGridValidation.
  *
  *     // Add a checkbox grid item to a form and restrict it to one response per column.
  *     var checkboxGridItem = form.addCheckboxGridItem();
  *     checkboxGridItem.setTitle('Where did you celebrate New Years?')
  *       .setRows(['New York', 'San Francisco', 'London'])
  *       .setColumns(['2014', '2015', '2016', '2017']);
  *     var checkboxGridValidation = FormApp.createcheckboxGridValidation()
  *       .setHelpText(“Select one item per column.”)
  *       .requireLimitOneResponsePerColumn()
  *       .build();
  *     checkboxGridItem.setValidation(checkboxGridValidation);
  */
@js.native
trait CheckboxGridValidationBuilder extends StObject {
  
  def requireLimitOneResponsePerColumn(): CheckboxGridValidationBuilder = js.native
}
object CheckboxGridValidationBuilder {
  
  @scala.inline
  def apply(requireLimitOneResponsePerColumn: () => CheckboxGridValidationBuilder): CheckboxGridValidationBuilder = {
    val __obj = js.Dynamic.literal(requireLimitOneResponsePerColumn = js.Any.fromFunction0(requireLimitOneResponsePerColumn))
    __obj.asInstanceOf[CheckboxGridValidationBuilder]
  }
  
  @scala.inline
  implicit class CheckboxGridValidationBuilderMutableBuilder[Self <: CheckboxGridValidationBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequireLimitOneResponsePerColumn(value: () => CheckboxGridValidationBuilder): Self = StObject.set(x, "requireLimitOneResponsePerColumn", js.Any.fromFunction0(value))
  }
}
