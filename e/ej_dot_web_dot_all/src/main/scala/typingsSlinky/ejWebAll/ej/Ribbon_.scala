package typingsSlinky.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ribbon_ extends Widget_ {
  
  /** Add new option to Backstage page.
    * @param {any} select the object to add the backstage item
    * @param {number} index to the backstage item this is optional.
    * @returns {void}
    */
  def addBackStageItem(item: js.Any): Unit = js.native
  def addBackStageItem(item: js.Any, index: Double): Unit = js.native
  
  /** Adds contextual tab or contextual tab set dynamically in the ribbon control with contextual tabs object and index position. When index is null, ribbon contextual tab or contextual
    * tab set is added at the last index.
    * @param {any} contextual tab or contextual tab set object.
    * @param {number} index of the contextual tab or contextual tab set, this is optional.
    * @returns {void}
    */
  def addContextualTabs(contextualTabSet: js.Any): Unit = js.native
  def addContextualTabs(contextualTabSet: js.Any, index: Double): Unit = js.native
  
  /** Adds tab dynamically in the ribbon control with given name, tab group array and index position. When index is null, ribbon tab is added at the last index.
    * @param {string} ribbon tab display text.
    * @param {any[]} groups to be displayed in ribbon tab .
    * @param {number} index of the ribbon tab,this is optional.
    * @returns {void}
    */
  def addTab(tabText: String, ribbonGroups: js.Array[_]): Unit = js.native
  def addTab(tabText: String, ribbonGroups: js.Array[_], index: Double): Unit = js.native
  
  /** Adds tab group dynamically in the ribbon control with given tab index, tab group object and group index position. When group index is null, ribbon group is added at the last index.
    * @param {number} ribbon tab index.
    * @param {any} group to be displayed in ribbon tab .
    * @param {number} index of the ribbon group,this is optional.
    * @returns {void}
    */
  def addTabGroup(tabIndex: Double, tabGroup: js.Any): Unit = js.native
  def addTabGroup(tabIndex: Double, tabGroup: js.Any, groupIndex: Double): Unit = js.native
  
  /** Adds group content dynamically in the ribbon control with given tab index, group index, content, content index and sub group index position. When content index is null, content is
    * added at the last index.
    * @param {number} ribbon tab index.
    * @param {number} ribbon group index.
    * @param {any} content to be displayed in the ribbon group.
    * @param {number} ribbon content index. This is optional. If the value is not given, then by default contentIndex will be considered as 0.
    * @param {number} sub group index in the ribbon group. This is optional. If the value is not given, then by default contentIndex will be considered as 0.
    * @returns {void}
    */
  def addTabGroupContent(tabIndex: Double, groupIndex: Double, content: js.Any): Unit = js.native
  def addTabGroupContent(
    tabIndex: Double,
    groupIndex: Double,
    content: js.Any,
    contentIndex: js.UndefOr[scala.Nothing],
    subGroupIndex: Double
  ): Unit = js.native
  def addTabGroupContent(tabIndex: Double, groupIndex: Double, content: js.Any, contentIndex: Double): Unit = js.native
  def addTabGroupContent(tabIndex: Double, groupIndex: Double, content: js.Any, contentIndex: Double, subGroupIndex: Double): Unit = js.native
  
  /** Collapses the ribbon tab content.
    * @returns {void}
    */
  def collapse(): Unit = js.native
  
  var defaults: typingsSlinky.ejWebAll.ej.Ribbon.Model = js.native
  
  /** Expands the ribbon tab content.
    * @returns {void}
    */
  def expand(): Unit = js.native
  
  /** Gets text of the given index tab in the ribbon control.
    * @param {number} index of the tab item.
    * @returns {string}
    */
  def getTabText(index: Double): String = js.native
  
  /** Hides the ribbon backstage page.
    * @returns {void}
    */
  def hideBackstage(): Unit = js.native
  
  /** Hides the given text tab in the ribbon control.
    * @param {string} text of the tab item.
    * @returns {void}
    */
  def hideTab(text: String): Unit = js.native
  
  /** Checks whether the given text tab in the ribbon control is enabled or not.
    * @param {string} text of the tab item.
    * @returns {boolean}
    */
  def isEnable(text: String): Boolean = js.native
  
  /** Checks whether the given text tab in the ribbon control is visible or not.
    * @param {string} text of the tab item.
    * @returns {boolean}
    */
  def isVisible(text: String): Boolean = js.native
  
  @JSName("model")
  var model_Ribbon_ : typingsSlinky.ejWebAll.ej.Ribbon.Model = js.native
  
  /** Remove option from Backstage.
    * @param {number} index to the backstage item
    * @returns {void}
    */
  def removeBackStageItem(index: Double): Unit = js.native
  
  /** Removes the given index tab item from the ribbon control.
    * @param {number} index of tab item.
    * @returns {void}
    */
  def removeTab(index: Double): Unit = js.native
  
  /** To customize whole content from Tab Group.
    * @param {number} ribbon tab index.
    * @param {string} ribbon group text.
    * @param {number} ribbon content index. This is optional. If the value is not given, all content groups will be removed.
    * @param {number} sub group index in the ribbon group. This is optional. If the value is not given, all content groups will be removed.
    * @returns {void}
    */
  def removeTabGroupContent(tabIndex: Double, groupText: String): Unit = js.native
  def removeTabGroupContent(
    tabIndex: Double,
    groupText: String,
    contentIndex: js.UndefOr[scala.Nothing],
    subGroupIndex: Double
  ): Unit = js.native
  def removeTabGroupContent(tabIndex: Double, groupText: String, contentIndex: Double): Unit = js.native
  def removeTabGroupContent(tabIndex: Double, groupText: String, contentIndex: Double, subGroupIndex: Double): Unit = js.native
  
  /** Sets new text to the given text tab in the ribbon control.
    * @param {string} current text of the tab item.
    * @param {string} new text of the tab item.
    * @returns {void}
    */
  def setTabText(tabText: String, newText: String): Unit = js.native
  
  /** Displays the ribbon backstage page.
    * @returns {void}
    */
  def showBackstage(): Unit = js.native
  
  /** Displays the given text tab in the ribbon control.
    * @param {string} text of the tab item.
    * @returns {void}
    */
  def showTab(text: String): Unit = js.native
  
  /** Update option in existing Backstage.
    * @param {number} index to the backstage item
    * @param {any} select the object to add the backstage item
    * @returns {void}
    */
  def updateBackStageItem(index: Double): Unit = js.native
  def updateBackStageItem(index: Double, item: js.Any): Unit = js.native
  
  /** To customize Group alone in the inside content.
    * @param {number} ribbon tab index.
    * @param {string} group id to be displayed in ribbon tab .
    * @param {any} contentGroup is used in the object
    * @returns {void}
    */
  def updateGroup(tabIndex: Double, groupId: String): Unit = js.native
  def updateGroup(tabIndex: Double, groupId: String, contentGroup: js.Any): Unit = js.native
}
