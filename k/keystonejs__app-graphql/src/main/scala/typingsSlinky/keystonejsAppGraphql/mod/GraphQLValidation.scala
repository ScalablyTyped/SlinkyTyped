package typingsSlinky.keystonejsAppGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLValidation extends js.Object {
   // TODO: fetch the correct type in apollo server validations
  def definitionLimit(limit: Double): js.Any = js.native
  def depthLimit(limit: Double): js.Any = js.native
   // TODO: fetch the correct type in apollo server validations
  def fieldLimit(limit: Double): js.Any = js.native
}

object GraphQLValidation {
  @scala.inline
  def apply(definitionLimit: Double => js.Any, depthLimit: Double => js.Any, fieldLimit: Double => js.Any): GraphQLValidation = {
    val __obj = js.Dynamic.literal(definitionLimit = js.Any.fromFunction1(definitionLimit), depthLimit = js.Any.fromFunction1(depthLimit), fieldLimit = js.Any.fromFunction1(fieldLimit))
    __obj.asInstanceOf[GraphQLValidation]
  }
  @scala.inline
  implicit class GraphQLValidationOps[Self <: GraphQLValidation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefinitionLimit(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionLimit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDepthLimit(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthLimit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFieldLimit(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldLimit")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

