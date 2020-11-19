package typingsSlinky.dragselect.mod

import typingsSlinky.dragselect.anon.PartialareaHTMLElementSVG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dragselect", JSImport.Namespace)
@js.native
/**
  * @param [options.area=document] area in which you can drag. If not provided it will be the whole document
  * @param [options.autoScrollSpeed=1] Speed in which the area scrolls while selecting (if available). Unit is pixel per movement. Default = 1
  * @param [options.zoom=1] Zoom scale factor (in case of using CSS style transform: scale() which messes with real positions). Unit scale zoom. Default = 1
  * @param [options.callback=(selected, event) => {}] a callback function that gets fired when the element is dropped. This callback gets a property which is an array that holds all selected
  *     nodes. The second property passed is the event object.
  * @param [options.customStyles=false] if set to true, no styles (except for position absolute) will be applied by default
  * @param [options.hoverClass=ds-hover] the class assigned to the mouse hovered items
  * @param [options.multiSelectMode=false] Add newly selected elements to the selection instead of replacing them. Default = false
  * @param [options.onDragMove=()=>{}] It is fired when the user drags. This callback gets the event object. Executed before DragSelect function code ran, after getting the current mouse position.
  * @param [options.onDragStartBegin=()=>{}] Is fired when the user clicks in the area. This callback gets the event object. Executed *before* DragSelect function code ran.
  * @param [options.onDragStart=()=>{}] It is fired when the user clicks in the area. This callback gets the event object. Executed after DragSelect function code ran, before the setup of event
  *     listeners.
  * @param [options.onElementSelect=()=>{}] It is fired every time an element is selected. This callback gets a property which is the just selected node
  * @param [options.onElementUnselect=()=>{}] It is fired every time an element is de-selected. This callback gets a property which is the just de-selected node
  * @param [options.selectableClass=ds-selectable] the class assigned to the elements that can be selected
  * @param [options.selectables=[]] the elements that can be selected
  * @param [options.selectedClass=ds-selected] the class assigned to the selected items
  * @param [options.selector=HTMLElement] the square that will draw the selection
  * @param [options.selectorClass=ds-selector] the class assigned to the square selector helper
  * @param [options.multiSelectKeys=['ctrlKey', 'shiftKey', 'metaKey']] An array of keys that allows switching to the multi-select mode (see the @multiSelectMode option). The only possible values
  *     are keys that are provided via the event object. So far: <kbd>ctrlKey</kbd>, <kbd>shiftKey</kbd>, <kbd>metaKey</kbd> and <kbd>altKey</kbd>. Provide an empty array `[]` if you want to turn
  *     off the functionality.
  */
class ^ () extends DragSelect {
  def this(options: PartialareaHTMLElementSVG) = this()
}
