package typingsSlinky.graphqlTools.replaceFieldWithFragmentMod

import typingsSlinky.graphqlTools.interfacesMod.Request
import typingsSlinky.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceFieldWithFragment extends Transform {
  var mapping: js.Any = js.native
  var targetSchema: js.Any = js.native
  @JSName("transformRequest")
  def transformRequest_MReplaceFieldWithFragment(originalRequest: Request): Request = js.native
}

object ReplaceFieldWithFragment {
  @scala.inline
  def apply(mapping: js.Any, targetSchema: js.Any, transformRequest: Request => Request): ReplaceFieldWithFragment = {
    val __obj = js.Dynamic.literal(mapping = mapping.asInstanceOf[js.Any], targetSchema = targetSchema.asInstanceOf[js.Any], transformRequest = js.Any.fromFunction1(transformRequest))
    __obj.asInstanceOf[ReplaceFieldWithFragment]
  }
  @scala.inline
  implicit class ReplaceFieldWithFragmentOps[Self <: ReplaceFieldWithFragment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMapping(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapping")(value.asInstanceOf[js.Any])
        ret
    }
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

