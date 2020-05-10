package typingsSlinky.extjs.Ext.layout.component

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAuto extends IComponent {
  /** [Method] Called to perform the calculations for this layout
  		* @param ownerContext Object
  		*/
  @JSName("calculate")
  var calculate_IAuto: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var setHeightInDom: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var setWidthInDom: js.UndefOr[Boolean] = js.native
}

object IAuto {
  @scala.inline
  def apply(): IAuto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAuto]
  }
  @scala.inline
  implicit class IAutoOps[Self <: IAuto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculate(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCalculate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculate")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHeightInDom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeightInDom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetHeightInDom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeightInDom")(js.undefined)
        ret
    }
    @scala.inline
    def withSetWidthInDom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidthInDom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetWidthInDom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidthInDom")(js.undefined)
        ret
    }
  }
  
}

