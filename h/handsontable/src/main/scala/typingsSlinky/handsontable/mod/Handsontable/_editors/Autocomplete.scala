package typingsSlinky.handsontable.mod.Handsontable._editors

import typingsSlinky.handsontable.mod.Handsontable.CellValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Autocomplete extends Handsontable {
  
  def allowKeyEventPropagation(): Boolean = js.native
  def allowKeyEventPropagation(keyCode: Double): Boolean = js.native
  
  def flipDropdown(): Unit = js.native
  def flipDropdown(dropdownHeight: Double): Unit = js.native
  
  def flipDropdownIfNeeded(): Unit = js.native
  
  def getDropdownHeight(): Double = js.native
  
  def highlightBestMatchingChoice(): Unit = js.native
  def highlightBestMatchingChoice(index: Double): Unit = js.native
  
  def limitDropdownIfNeeded(): Unit = js.native
  def limitDropdownIfNeeded(spaceAvailable: js.UndefOr[scala.Nothing], dropdownHeight: Double): Unit = js.native
  def limitDropdownIfNeeded(spaceAvailable: Double): Unit = js.native
  def limitDropdownIfNeeded(spaceAvailable: Double, dropdownHeight: Double): Unit = js.native
  
  def queryChoices(): Unit = js.native
  def queryChoices(query: String): Unit = js.native
  
  def setDropdownHeight(): Unit = js.native
  def setDropdownHeight(height: Double): Unit = js.native
  
  def sortByRelevance(): js.Array[_] = js.native
  def sortByRelevance(value: js.UndefOr[scala.Nothing], choices: js.UndefOr[scala.Nothing], caseSensitive: Boolean): js.Array[_] = js.native
  def sortByRelevance(value: js.UndefOr[scala.Nothing], choices: js.Array[CellValue]): js.Array[_] = js.native
  def sortByRelevance(value: js.UndefOr[scala.Nothing], choices: js.Array[CellValue], caseSensitive: Boolean): js.Array[_] = js.native
  def sortByRelevance(value: CellValue): js.Array[_] = js.native
  def sortByRelevance(value: CellValue, choices: js.UndefOr[scala.Nothing], caseSensitive: Boolean): js.Array[_] = js.native
  def sortByRelevance(value: CellValue, choices: js.Array[CellValue]): js.Array[_] = js.native
  def sortByRelevance(value: CellValue, choices: js.Array[CellValue], caseSensitive: Boolean): js.Array[_] = js.native
  
  def unflipDropdown(): Unit = js.native
  
  def updateChoicesList(): Unit = js.native
  def updateChoicesList(choices: js.Array[CellValue]): Unit = js.native
  
  def updateDropdownHeight(): Unit = js.native
}
