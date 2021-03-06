package typingsSlinky.dojo.dojox.mobile

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.dojo.AnonUnwatch
import typingsSlinky.dojo.dojoStrings.checked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/ToggleButton.html
  *
  * A non-templated button widget that can be in two states (checked or not).
  * Can be base class for things like tabs or checkbox or radio buttons
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.dojo.dijit.form.ToggleButtonMixin because Inheritance from two classes. Inlined checked, postCreate, reset */ @JSGlobal("dojox.mobile.ToggleButton")
@js.native
class ToggleButton () extends Button {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Corresponds to the native HTML <input> element's attribute.
    * In markup, specified as "checked='checked'" or just "checked".
    * True if the button is depressed, or the checkbox is checked,
    * or the radio button is selected, etc.
    *
    */
  var checked: Boolean = js.native
  /**
    * Corresponds to the native HTML <input> element's attribute.
    *
    */
  @JSName("value")
  var value_ToggleButton: String = js.native
  @JSName("get")
  def get_checked(property: checked): Boolean = js.native
  /**
    * Reset the widget's value to what it was at initialization time
    *
    */
  /**
    * Reset the widget's value to what it was at initialization time
    * 
    */
  def reset(): Unit = js.native
  @JSName("set")
  def set_checked(property: checked, value: Boolean): Unit = js.native
  @JSName("watch")
  def watch_checked(
    property: checked,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

