package typingsSlinky.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrioritySettings extends js.Object {
  /** The dataSource option can accept the JSON object collection that contains the priority related data.
    * @Default {{% highlight js%}[{ text: None, value: none },{ text: High, value: high },{ text: Medium, value: medium },{ text: Low, value: low }]{% endhighlight %}}
    */
  var dataSource: js.UndefOr[js.Any | js.Array[_]] = js.native
  /** When set to true, enables the priority options available for the Schedule appointments.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.native
  /** Allows priority field customization in the appointment window to add custom icons denoting the priority level for the appointments.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  /** Binds text field name in the dataSource to prioritySettings text. These text gets listed out in priority field of the appointment window.
    * @Default {text}
    */
  var text: js.UndefOr[String] = js.native
  /** Binds value field name in the dataSource to prioritySettings value. These field names usually accepts four priority values by default, high, low, medium and none.
    * @Default {value}
    */
  var value: js.UndefOr[String] = js.native
}

object PrioritySettings {
  @scala.inline
  def apply(): PrioritySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrioritySettings]
  }
  @scala.inline
  implicit class PrioritySettingsOps[Self <: PrioritySettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSource(value: js.Any | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

