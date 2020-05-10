package typingsSlinky.pkijs.generalNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneralNames extends js.Object {
  var names: js.Array[typingsSlinky.pkijs.generalNameMod.default] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object GeneralNames {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    names: js.Array[typingsSlinky.pkijs.generalNameMod.default],
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): GeneralNames = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), names = names.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[GeneralNames]
  }
  @scala.inline
  implicit class GeneralNamesOps[Self <: GeneralNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromSchema(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSchema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNames(value: js.Array[typingsSlinky.pkijs.generalNameMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToSchema(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSchema")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

