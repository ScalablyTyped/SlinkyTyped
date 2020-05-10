package typingsSlinky.fabric.fabricImplMod

import org.scalajs.dom.raw.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextOptions extends TextOptions {
  /**
  	 * Indicates whether internal text char widths can be cached
  	 * @type Boolean
  	 */
  var caching: js.UndefOr[Boolean] = js.native
  /**
  	 * For functionalities on keyDown + ctrl || cmd
  	 */
  var ctrlKeysMapDown: js.UndefOr[js.Any] = js.native
  /**
  	 * For functionalities on keyUp + ctrl || cmd
  	 */
  var ctrlKeysMapUp: js.UndefOr[js.Any] = js.native
  /**
  	 * Color of default cursor (when not overwritten by character style)
  	 * @type String
  	 */
  var cursorColor: js.UndefOr[String] = js.native
  /**
  	 * Delay between cursor blink (in ms)
  	 * @type Number
  	 */
  var cursorDelay: js.UndefOr[Double] = js.native
  /**
  	 * Duration of cursor fadein (in ms)
  	 * @type Number
  	 */
  var cursorDuration: js.UndefOr[Double] = js.native
  /**
  	 * Width of cursor (in px)
  	 * @type Number
  	 */
  var cursorWidth: js.UndefOr[Double] = js.native
  /**
  	 * Indicates whether a text can be edited
  	 * @type Boolean
  	 */
  var editable: js.UndefOr[Boolean] = js.native
  /**
  	 * Border color of text object while it's in editing mode
  	 * @type String
  	 */
  var editingBorderColor: js.UndefOr[String] = js.native
  /**
  	 * Exposes underlying hidden text area
  	 */
  var hiddenTextarea: js.UndefOr[HTMLTextAreaElement] = js.native
  /**
  	 * Helps determining when the text is in composition, so that the cursor
  	 * rendering is altered.
  	 */
  var inCompositionMode: js.UndefOr[Boolean] = js.native
  /**
  	 * Indicates whether text is in editing mode
  	 * @type Boolean
  	 */
  var isEditing: js.UndefOr[Boolean] = js.native
  /**
  	 * For functionalities on keyDown
  	 * Map a special key to a function of the instance/prototype
  	 * If you need different behaviour for ESC or TAB or arrows, you have to change
  	 * this map setting the name of a function that you build on the fabric.Itext or
  	 * your prototype.
  	 * the map change will affect all Instances unless you need for only some text Instances
  	 * in that case you have to clone this object and assign your Instance.
  	 * this.keysMap = fabric.util.object.clone(this.keysMap);
  	 * The function must be in fabric.Itext.prototype.myFunction And will receive event as args[0]
  	 */
  var keysMap: js.UndefOr[js.Any] = js.native
  var path: js.UndefOr[String] = js.native
  /**
  	 * Indicates whether text is selected
  	 * @type Boolean
  	 */
  var selected: js.UndefOr[Boolean] = js.native
  /**
  	 * Color of text selection
  	 * @type String
  	 */
  var selectionColor: js.UndefOr[String] = js.native
  /**
  	 * Index where text selection ends
  	 * @type Number
  	 */
  var selectionEnd: js.UndefOr[Double] = js.native
  /**
  	 * Index where text selection starts (or where cursor is when there is no selection)
  	 * @type Number
  	 */
  var selectionStart: js.UndefOr[Double] = js.native
  var useNative: js.UndefOr[Boolean] = js.native
}

object ITextOptions {
  @scala.inline
  def apply(): ITextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextOptions]
  }
  @scala.inline
  implicit class ITextOptionsOps[Self <: ITextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaching(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caching")(js.undefined)
        ret
    }
    @scala.inline
    def withCtrlKeysMapDown(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrlKeysMapDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCtrlKeysMapDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrlKeysMapDown")(js.undefined)
        ret
    }
    @scala.inline
    def withCtrlKeysMapUp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrlKeysMapUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCtrlKeysMapUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrlKeysMapUp")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withEditingBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editingBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditingBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editingBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenTextarea(value: HTMLTextAreaElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenTextarea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenTextarea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenTextarea")(js.undefined)
        ret
    }
    @scala.inline
    def withInCompositionMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inCompositionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInCompositionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inCompositionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEditing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withKeysMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keysMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeysMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keysMap")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStart")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNative")(js.undefined)
        ret
    }
  }
  
}

