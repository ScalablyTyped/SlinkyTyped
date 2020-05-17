package typingsSlinky.meteor.ejsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EJSONableCustomType extends EJSONableProperty {
  @JSName("clone")
  var clone_FEJSONableCustomType: js.UndefOr[js.Function0[this.type]] = js.native
  @JSName("equals")
  var equals_FEJSONableCustomType: js.UndefOr[js.Function1[/* other */ js.Object, Boolean]] = js.native
  def toJSONValue(): JSONable = js.native
  def typeName(): String = js.native
}

object EJSONableCustomType {
  @scala.inline
  def apply(toJSONValue: () => JSONable, typeName: () => String): EJSONableCustomType = {
    val __obj = js.Dynamic.literal(toJSONValue = js.Any.fromFunction0(toJSONValue), typeName = js.Any.fromFunction0(typeName))
    __obj.asInstanceOf[EJSONableCustomType]
  }
  @scala.inline
  implicit class EJSONableCustomTypeOps[Self <: EJSONableCustomType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToJSONValue(value: () => JSONable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSONValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTypeName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClone(value: () => EJSONableCustomType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(js.undefined)
        ret
    }
    @scala.inline
    def withEquals(value: /* other */ js.Object => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.undefined)
        ret
    }
  }
  
}

