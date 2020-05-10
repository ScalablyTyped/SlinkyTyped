package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgValidatorField
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets the target element (input or control target) to be validated. This field setting is required.
  	 *
  	 *
  	 * Valid values:
  	 * "string" A valid jQuery selector for the element
  	 * "object" A reference to a jQuery object
  	 */
  var selector: js.UndefOr[String | js.Object] = js.native
}

object IgValidatorField {
  @scala.inline
  def apply(): IgValidatorField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgValidatorField]
  }
  @scala.inline
  implicit class IgValidatorFieldOps[Self <: IgValidatorField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelector(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
  }
  
}

