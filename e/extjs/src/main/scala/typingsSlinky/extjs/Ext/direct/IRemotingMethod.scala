package typingsSlinky.extjs.Ext.direct

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRemotingMethod extends IBase {
  /** [Method] Takes the arguments for the Direct function and splits the arguments from the scope and the callback
  		* @param args Array The arguments passed to the direct call
  		* @returns Object An object with 3 properties: args, callback &amp; scope.
  		*/
  var getCallData: js.UndefOr[js.Function1[/* args */ js.UndefOr[Array], _]] = js.native
}

object IRemotingMethod {
  @scala.inline
  def apply(): IRemotingMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRemotingMethod]
  }
  @scala.inline
  implicit class IRemotingMethodOps[Self <: IRemotingMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCallData(value: /* args */ js.UndefOr[Array] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCallData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetCallData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCallData")(js.undefined)
        ret
    }
  }
  
}

