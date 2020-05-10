package typingsSlinky.graphqlTools.addArgumentsAsVariablesMod

import typingsSlinky.graphqlTools.interfacesMod.Request
import typingsSlinky.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddArgumentsAsVariablesTransform extends Transform {
  var args: js.Any = js.native
  var schema: js.Any = js.native
  @JSName("transformRequest")
  def transformRequest_MAddArgumentsAsVariablesTransform(originalRequest: Request): Request = js.native
}

object AddArgumentsAsVariablesTransform {
  @scala.inline
  def apply(args: js.Any, schema: js.Any, transformRequest: Request => Request): AddArgumentsAsVariablesTransform = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], transformRequest = js.Any.fromFunction1(transformRequest))
    __obj.asInstanceOf[AddArgumentsAsVariablesTransform]
  }
  @scala.inline
  implicit class AddArgumentsAsVariablesTransformOps[Self <: AddArgumentsAsVariablesTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
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

