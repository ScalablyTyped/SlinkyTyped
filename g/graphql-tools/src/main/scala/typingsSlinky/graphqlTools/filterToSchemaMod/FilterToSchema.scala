package typingsSlinky.graphqlTools.filterToSchemaMod

import typingsSlinky.graphqlTools.interfacesMod.Request
import typingsSlinky.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterToSchema extends Transform {
  var targetSchema: js.Any = js.native
  @JSName("transformRequest")
  def transformRequest_MFilterToSchema(originalRequest: Request): Request = js.native
}

object FilterToSchema {
  @scala.inline
  def apply(targetSchema: js.Any, transformRequest: Request => Request): FilterToSchema = {
    val __obj = js.Dynamic.literal(targetSchema = targetSchema.asInstanceOf[js.Any], transformRequest = js.Any.fromFunction1(transformRequest))
    __obj.asInstanceOf[FilterToSchema]
  }
  @scala.inline
  implicit class FilterToSchemaOps[Self <: FilterToSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetSchema(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformRequest(value: Request => Request): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformRequest")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

