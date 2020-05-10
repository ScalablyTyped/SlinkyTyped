package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INamedValueNamespace extends js.Object {
  var NamedValues: INamedValues = js.native
  var NamespaceName: String = js.native
  def Clone(): INamedValueNamespace = js.native
}

object INamedValueNamespace {
  @scala.inline
  def apply(Clone: () => INamedValueNamespace, NamedValues: INamedValues, NamespaceName: String): INamedValueNamespace = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), NamedValues = NamedValues.asInstanceOf[js.Any], NamespaceName = NamespaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[INamedValueNamespace]
  }
  @scala.inline
  implicit class INamedValueNamespaceOps[Self <: INamedValueNamespace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => INamedValueNamespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNamedValues(value: INamedValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespaceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamespaceName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

