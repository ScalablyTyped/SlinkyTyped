package typingsSlinky.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultikeyForeignConstraintBuilder extends js.Object {
  def references(columnNames: js.Array[String]): ReferencingColumnBuilder = js.native
}

object MultikeyForeignConstraintBuilder {
  @scala.inline
  def apply(references: js.Array[String] => ReferencingColumnBuilder): MultikeyForeignConstraintBuilder = {
    val __obj = js.Dynamic.literal(references = js.Any.fromFunction1(references))
    __obj.asInstanceOf[MultikeyForeignConstraintBuilder]
  }
  @scala.inline
  implicit class MultikeyForeignConstraintBuilderOps[Self <: MultikeyForeignConstraintBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReferences(value: js.Array[String] => ReferencingColumnBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("references")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

