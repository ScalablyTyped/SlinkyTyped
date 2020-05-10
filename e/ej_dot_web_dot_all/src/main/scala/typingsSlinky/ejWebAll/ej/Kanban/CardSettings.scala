package typingsSlinky.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardSettings extends js.Object {
  /** To customize the card border color based on assigned task. Colors and corresponding values defined here will be mapped with colorField mapped data source column.
    * @Default {Object}
    */
  var colorMapping: js.UndefOr[js.Any] = js.native
  /** This specifies the Kanban card to drop into particular target element.
    */
  var externalDropTarget: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates to add the template for card .
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
}

object CardSettings {
  @scala.inline
  def apply(): CardSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardSettings]
  }
  @scala.inline
  implicit class CardSettingsOps[Self <: CardSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorMapping(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalDropTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalDropTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalDropTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalDropTarget")(js.undefined)
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
  }
  
}

