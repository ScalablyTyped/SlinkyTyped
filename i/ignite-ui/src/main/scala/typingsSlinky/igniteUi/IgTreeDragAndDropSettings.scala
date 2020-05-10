package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTreeDragAndDropSettings
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets whether the widget will accept drag and drop from other controls.
  	 *
  	 */
  var allowDrop: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets the containment for the drag helper. The area inside of which thehelper is contained would be scrollable while dragging.
  	 *
  	 *
  	 * Valid values:
  	 * "boolean" If set to false, then the draggable elements will be contained in their window.
  	 * "selector" The draggable element will be contained to the bounding box of the first element found by the selector. If no element is found, no containment will be set.
  	 * "element" The draggable element will be contained to the bounding box of this element.
  	 * "string" Possible values: "parent", "document", "window".
  	 * "array" An array defining a bounding box in the form [ x1, y1, x2, y2 ].
  	 */
  var containment: js.UndefOr[Boolean | String | js.Object | js.Array[_]] = js.native
  /**
  	 * Gets the HTML markup for the "copy after" helper.
  	 *
  	 */
  var copyAfterMarkup: js.UndefOr[String] = js.native
  /**
  	 * Gets the HTML markup for the "copy before" helper.
  	 *
  	 */
  var copyBeforeMarkup: js.UndefOr[String] = js.native
  /**
  	 * Gets the HTML markup for the "copy between" helper.
  	 *
  	 */
  var copyBetweenMarkup: js.UndefOr[String] = js.native
  /**
  	 * Gets the HTML markup for the "copy to" helper.
  	 *
  	 */
  var copyToMarkup: js.UndefOr[String] = js.native
  /**
  	 * Gets the method for custom drop point validation. Returning true from this function would render the drop point valid, while false would make it invalid. The function has one parameter which is the current drop point and the context (this) of the function is the drag element.
  	 *
  	 *
  	 * Valid values:
  	 * "function" A function that will be used for validating drop points.
  	 * "null" Only built-in validation is applied.
  	 */
  var customDropValidation: js.UndefOr[js.Function] = js.native
  /**
  	 * Gets the drag and drop mode.
  	 *
  	 *
  	 * Valid values:
  	 * "default" Performs "copy" when holding the Ctrl key, otherwise "move" is performed.
  	 * "copy" Makes a copy of the dragged node at the drop location.
  	 * "move" Moves the dragged node at the drop location.
  	 */
  var dragAndDropMode: js.UndefOr[String] = js.native
  /**
  	 * Gets the opacity of the drag helper: 0 is fully transparent while 1 is fully opaque.
  	 *
  	 */
  var dragOpacity: js.UndefOr[Double] = js.native
  /**
  	 * Gets the delay between mousedown and the start of the actual drag. Smaller values make the nodes
  	 * more sensitive to drag and may interfere with selection.
  	 *
  	 */
  var dragStartDelay: js.UndefOr[Double] = js.native
  /**
  	 * Gets the delay after hovering a parent node before expanding that node during drag when [expandOnDragOver](ui.igtree#options:dragAndDropSettings.expandOnDragOver) is set to true.
  	 *
  	 */
  var expandDelay: js.UndefOr[Double] = js.native
  /**
  	 * Gets whether when dragging over a collapsed node with children will trigger the node to expand.
  	 *
  	 */
  var expandOnDragOver: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets the type of helper to be rendered for the drag operation.
  	 *
  	 *
  	 * Valid values:
  	 * "function" A function that will return a DOMElement to use while dragging.
  	 * "default" would render the default igTree helper.
  	 */
  var helper: js.UndefOr[js.Function | String] = js.native
  /**
  	 * Gets the HTML markup for the invalid helper.
  	 *
  	 */
  var invalidMoveToMarkup: js.UndefOr[String] = js.native
  /**
  	 * Gets the HTML markup for the "move after" helper.
  	 *
  	 */
  var moveAfterMarkup: js.UndefOr[String] = js.native
  /**
  	 * Gets the HTML markup for the "move before" helper.
  	 *
  	 */
  var moveBeforeMarkup: js.UndefOr[String] = js.native
  /**
  	 * Gets the HTML markup for the "move between" helper.
  	 *
  	 */
  var moveBetweenMarkup: js.UndefOr[String] = js.native
  /**
  	 * Gets the HTML markup for the "move to" helper.
  	 *
  	 */
  var moveToMarkup: js.UndefOr[String] = js.native
  /**
  	 * Gets whether the helper would revert to its original position upon an invalid drop.
  	 *
  	 */
  var revert: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets the duration of the revert animation.
  	 *
  	 */
  var revertDuration: js.UndefOr[Double] = js.native
  /**
  	 * Gets the z-index that would be set for the drag helper.
  	 *
  	 */
  var zIndex: js.UndefOr[Double] = js.native
}

object IgTreeDragAndDropSettings {
  @scala.inline
  def apply(): IgTreeDragAndDropSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeDragAndDropSettings]
  }
  @scala.inline
  implicit class IgTreeDragAndDropSettingsOps[Self <: IgTreeDragAndDropSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withContainment(value: Boolean | String | js.Object | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containment")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyAfterMarkup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyAfterMarkup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyAfterMarkup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyAfterMarkup")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyBeforeMarkup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyBeforeMarkup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyBeforeMarkup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyBeforeMarkup")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyBetweenMarkup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyBetweenMarkup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyBetweenMarkup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyBetweenMarkup")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyToMarkup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyToMarkup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyToMarkup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyToMarkup")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomDropValidation(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDropValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomDropValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDropValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withDragAndDropMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragAndDropMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragAndDropMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragAndDropMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDragOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withDragStartDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStartDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragStartDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStartDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandOnDragOver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandOnDragOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandOnDragOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandOnDragOver")(js.undefined)
        ret
    }
    @scala.inline
    def withHelper(value: js.Function | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helper")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidMoveToMarkup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidMoveToMarkup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidMoveToMarkup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidMoveToMarkup")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveAfterMarkup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveAfterMarkup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveAfterMarkup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveAfterMarkup")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveBeforeMarkup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveBeforeMarkup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveBeforeMarkup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveBeforeMarkup")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveBetweenMarkup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveBetweenMarkup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveBetweenMarkup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveBetweenMarkup")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveToMarkup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToMarkup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveToMarkup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToMarkup")(js.undefined)
        ret
    }
    @scala.inline
    def withRevert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revert")(js.undefined)
        ret
    }
    @scala.inline
    def withRevertDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revertDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevertDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revertDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

