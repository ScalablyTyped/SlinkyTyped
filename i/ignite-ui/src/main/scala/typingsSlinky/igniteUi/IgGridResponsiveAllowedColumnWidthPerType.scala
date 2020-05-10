package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridResponsiveAllowedColumnWidthPerType
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Minimal width in pixels bool columns can take before forcing vertical rendering
  	 *
  	 */
  var bool: js.UndefOr[Double] = js.native
  /**
  	 * Minimal width in pixels date columns can take before forcing vertical rendering
  	 *
  	 */
  var date: js.UndefOr[Double] = js.native
  /**
  	 * Minimal width in pixels number columns can take before forcing vertical rendering
  	 *
  	 */
  var number: js.UndefOr[Double] = js.native
  /**
  	 * Minimal width in pixels object columns can take before forcing vertical rendering
  	 *
  	 */
  var `object`: js.UndefOr[Double] = js.native
  /**
  	 * Minimal width in pixels string columns can take before forcing vertical rendering
  	 *
  	 */
  var string: js.UndefOr[Double] = js.native
}

object IgGridResponsiveAllowedColumnWidthPerType {
  @scala.inline
  def apply(): IgGridResponsiveAllowedColumnWidthPerType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridResponsiveAllowedColumnWidthPerType]
  }
  @scala.inline
  implicit class IgGridResponsiveAllowedColumnWidthPerTypeOps[Self <: IgGridResponsiveAllowedColumnWidthPerType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBool(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bool")(js.undefined)
        ret
    }
    @scala.inline
    def withDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
    @scala.inline
    def withObject(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(js.undefined)
        ret
    }
    @scala.inline
    def withString(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(js.undefined)
        ret
    }
  }
  
}

