package typingsSlinky.graphql.introspectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrospectionQuery_ extends js.Object {
  val __schema: IntrospectionSchema = js.native
}

object IntrospectionQuery_ {
  @scala.inline
  def apply(__schema: IntrospectionSchema): IntrospectionQuery_ = {
    val __obj = js.Dynamic.literal(__schema = __schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionQuery_]
  }
  @scala.inline
  implicit class IntrospectionQuery_Ops[Self <: IntrospectionQuery_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__schema(value: IntrospectionSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__schema")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

