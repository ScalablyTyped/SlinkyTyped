package typingsSlinky.graphqlConfig.anon

import typingsSlinky.graphql.introspectionQueryMod.IntrospectionSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.IntrospectionQuery & {  errors  :undefined,   data  :undefined} */
@js.native
trait IntrospectionQueryerrorsu extends js.Object {
  val __schema: IntrospectionSchema = js.native
  var data: js.UndefOr[scala.Nothing] = js.native
  var errors: js.UndefOr[scala.Nothing] = js.native
}

object IntrospectionQueryerrorsu {
  @scala.inline
  def apply(__schema: IntrospectionSchema): IntrospectionQueryerrorsu = {
    val __obj = js.Dynamic.literal(__schema = __schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionQueryerrorsu]
  }
  @scala.inline
  implicit class IntrospectionQueryerrorsuOps[Self <: IntrospectionQueryerrorsu] (val x: Self) extends AnyVal {
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

