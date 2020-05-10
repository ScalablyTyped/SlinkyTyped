package typingsSlinky.ejWebAll.ej.datavisualization.DigitalGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsCharacterSettings extends js.Object {
  /** Specifies the CharacterCount value for the DigitalGauge.
    * @Default {4}
    */
  var count: js.UndefOr[Double] = js.native
  /** Specifies the opacity value for the DigitalGauge.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Specifies the value for spacing between the characters
    * @Default {2}
    */
  var spacing: js.UndefOr[Double] = js.native
  /** Specifies the character type for the text to be displayed.
    * @Default {ej.datavisualization.DigitalGauge.CharacterType.EightCrossEightDotMatrix}
    */
  var `type`: js.UndefOr[CharacterType | String] = js.native
}

object ItemsCharacterSettings {
  @scala.inline
  def apply(): ItemsCharacterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemsCharacterSettings]
  }
  @scala.inline
  implicit class ItemsCharacterSettingsOps[Self <: ItemsCharacterSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: CharacterType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

