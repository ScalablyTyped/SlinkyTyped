package typingsSlinky.dojo.dojox.mobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/_PickerChooser.html
  *
  * This widget chooses a picker class according to the current theme.
  * Imports ValuePicker-based date/time picker when the current theme is "android".
  * Imports SpinWheel-based date/time picker otherwise.
  *
  */
@js.native
trait PickerChooser extends js.Object {
  /**
    * Imports a picker class according to the current theme.
    *
    * @param id
    * @param parentRequire
    * @param loaded
    */
  def load(id: js.Any, parentRequire: js.Any, loaded: js.Any): Unit = js.native
}

object PickerChooser {
  @scala.inline
  def apply(load: (js.Any, js.Any, js.Any) => Unit): PickerChooser = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction3(load))
    __obj.asInstanceOf[PickerChooser]
  }
  @scala.inline
  implicit class PickerChooserOps[Self <: PickerChooser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoad(value: (js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

