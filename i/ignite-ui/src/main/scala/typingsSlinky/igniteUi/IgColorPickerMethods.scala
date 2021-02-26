package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgColorPickerMethods extends StObject {
  
  /**
    * Gets the color for an element from the color picker in RGB format.
    *
    * @param $element A jQuery element in the color picker from which the color will be retrieved.
    */
  def colorFromElement($element: js.Object): String = js.native
  
  /**
    * Gets a reference to the div element of the color table
    */
  def colorTable(): js.Object = js.native
  
  /**
    * Gets a reference to the div element with the default or custom colors table.
    */
  def customColorTable(): js.Object = js.native
  
  /**
    * Select a color.
    *
    * @param color The #RGB value of the color to be selected.
    */
  def selectColor(color: String): js.Object = js.native
  
  /**
    * Returns the hexademical string of the currently selected color in the color picker. Returns null if no color is selected.
    * @return string|null Returns the selected color if available. Null if no color is selected.
    */
  def selectedColor(): String = js.native
  
  /**
    * Returns the div element with the standard color table.
    */
  def standardColorsTable(): js.Object = js.native
}
object IgColorPickerMethods {
  
  @scala.inline
  def apply(
    colorFromElement: js.Object => String,
    colorTable: () => js.Object,
    customColorTable: () => js.Object,
    selectColor: String => js.Object,
    selectedColor: () => String,
    standardColorsTable: () => js.Object
  ): IgColorPickerMethods = {
    val __obj = js.Dynamic.literal(colorFromElement = js.Any.fromFunction1(colorFromElement), colorTable = js.Any.fromFunction0(colorTable), customColorTable = js.Any.fromFunction0(customColorTable), selectColor = js.Any.fromFunction1(selectColor), selectedColor = js.Any.fromFunction0(selectedColor), standardColorsTable = js.Any.fromFunction0(standardColorsTable))
    __obj.asInstanceOf[IgColorPickerMethods]
  }
  
  @scala.inline
  implicit class IgColorPickerMethodsMutableBuilder[Self <: IgColorPickerMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorFromElement(value: js.Object => String): Self = StObject.set(x, "colorFromElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColorTable(value: () => js.Object): Self = StObject.set(x, "colorTable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCustomColorTable(value: () => js.Object): Self = StObject.set(x, "customColorTable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectColor(value: String => js.Object): Self = StObject.set(x, "selectColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectedColor(value: () => String): Self = StObject.set(x, "selectedColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStandardColorsTable(value: () => js.Object): Self = StObject.set(x, "standardColorsTable", js.Any.fromFunction0(value))
  }
}
