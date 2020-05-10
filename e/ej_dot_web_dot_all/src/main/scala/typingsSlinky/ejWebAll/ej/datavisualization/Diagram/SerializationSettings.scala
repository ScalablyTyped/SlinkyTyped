package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializationSettings extends js.Object {
  /** defines whether the default diagram properties can be serialized or not.
    * @Default {false}
    */
  var preventDefaultValues: js.UndefOr[Boolean] = js.native
}

object SerializationSettings {
  @scala.inline
  def apply(): SerializationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializationSettings]
  }
  @scala.inline
  implicit class SerializationSettingsOps[Self <: SerializationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreventDefaultValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefaultValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDefaultValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefaultValues")(js.undefined)
        ret
    }
  }
  
}

