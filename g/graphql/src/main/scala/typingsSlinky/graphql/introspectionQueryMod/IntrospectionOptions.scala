package typingsSlinky.graphql.introspectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrospectionOptions extends js.Object {
  // Whether to include descriptions in the introspection result.
  // Default: true
  var descriptions: Boolean = js.native
}

object IntrospectionOptions {
  @scala.inline
  def apply(descriptions: Boolean): IntrospectionOptions = {
    val __obj = js.Dynamic.literal(descriptions = descriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionOptions]
  }
  @scala.inline
  implicit class IntrospectionOptionsOps[Self <: IntrospectionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescriptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

