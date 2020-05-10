package typingsSlinky.pkijs.basicConstraintsMod

import typingsSlinky.asn1js.mod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicConstraints extends js.Object {
  var cA: Boolean = js.native
  var pathLenConstraint: Double | Integer = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object BasicConstraints {
  @scala.inline
  def apply(
    cA: Boolean,
    fromSchema: js.Any => Unit,
    pathLenConstraint: Double | Integer,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): BasicConstraints = {
    val __obj = js.Dynamic.literal(cA = cA.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), pathLenConstraint = pathLenConstraint.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[BasicConstraints]
  }
  @scala.inline
  implicit class BasicConstraintsOps[Self <: BasicConstraints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCA(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromSchema(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSchema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPathLenConstraint(value: Double | Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathLenConstraint")(value.asInstanceOf[js.Any])
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

