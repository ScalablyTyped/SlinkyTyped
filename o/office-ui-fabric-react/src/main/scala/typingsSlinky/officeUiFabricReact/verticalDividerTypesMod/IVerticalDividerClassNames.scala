package typingsSlinky.officeUiFabricReact.verticalDividerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVerticalDividerClassNames extends js.Object {
  /**
    * Styling for the divider.
    */
  var divider: String = js.native
  /**
    * Styling for the div that wraps the actual divider
    */
  var wrapper: String = js.native
}

object IVerticalDividerClassNames {
  @scala.inline
  def apply(divider: String, wrapper: String): IVerticalDividerClassNames = {
    val __obj = js.Dynamic.literal(divider = divider.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVerticalDividerClassNames]
  }
  @scala.inline
  implicit class IVerticalDividerClassNamesOps[Self <: IVerticalDividerClassNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDivider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

