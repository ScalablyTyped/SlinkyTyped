package typingsSlinky.dojo.dojox.grid.cells

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/cells/dijit.html
  *
  *
  */
@js.native
trait dijit_ extends js.Object {
  /**
    *
    */
  def CheckBox(): Unit = js.native
  /**
    *
    */
  def ComboBox(): Unit = js.native
  /**
    *
    */
  def DateTextBox(): Unit = js.native
  /**
    *
    */
  def Editor(): Unit = js.native
}

object dijit_ {
  @scala.inline
  def apply(CheckBox: () => Unit, ComboBox: () => Unit, DateTextBox: () => Unit, Editor: () => Unit): dijit_ = {
    val __obj = js.Dynamic.literal(CheckBox = js.Any.fromFunction0(CheckBox), ComboBox = js.Any.fromFunction0(ComboBox), DateTextBox = js.Any.fromFunction0(DateTextBox), Editor = js.Any.fromFunction0(Editor))
    __obj.asInstanceOf[dijit_]
  }
  @scala.inline
  implicit class dijit_Ops[Self <: dijit_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckBox(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withComboBox(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComboBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDateTextBox(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateTextBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEditor(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Editor")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

