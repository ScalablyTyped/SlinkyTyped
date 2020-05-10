package typingsSlinky.pkijs.nameConstraintsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NameConstraints extends js.Object {
  var excludedSubtrees: js.UndefOr[js.Array[typingsSlinky.pkijs.generalSubtreeMod.default]] = js.native
  var permittedSubtrees: js.UndefOr[js.Array[typingsSlinky.pkijs.generalSubtreeMod.default]] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object NameConstraints {
  @scala.inline
  def apply(fromSchema: js.Any => Unit, toJSON: () => js.Any, toSchema: () => js.Any): NameConstraints = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[NameConstraints]
  }
  @scala.inline
  implicit class NameConstraintsOps[Self <: NameConstraints] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withExcludedSubtrees(value: js.Array[typingsSlinky.pkijs.generalSubtreeMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedSubtrees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedSubtrees: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedSubtrees")(js.undefined)
        ret
    }
    @scala.inline
    def withPermittedSubtrees(value: js.Array[typingsSlinky.pkijs.generalSubtreeMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permittedSubtrees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermittedSubtrees: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permittedSubtrees")(js.undefined)
        ret
    }
  }
  
}

