package typingsSlinky.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForeignConstraintBuilder extends js.Object {
  def references(columnName: String): ReferencingColumnBuilder = js.native
}

object ForeignConstraintBuilder {
  @scala.inline
  def apply(references: String => ReferencingColumnBuilder): ForeignConstraintBuilder = {
    val __obj = js.Dynamic.literal(references = js.Any.fromFunction1(references))
    __obj.asInstanceOf[ForeignConstraintBuilder]
  }
  @scala.inline
  implicit class ForeignConstraintBuilderOps[Self <: ForeignConstraintBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReferences(value: String => ReferencingColumnBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("references")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

