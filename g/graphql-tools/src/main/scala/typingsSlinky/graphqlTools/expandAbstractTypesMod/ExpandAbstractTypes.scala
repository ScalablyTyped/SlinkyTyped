package typingsSlinky.graphqlTools.expandAbstractTypesMod

import typingsSlinky.graphqlTools.interfacesMod.Request
import typingsSlinky.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpandAbstractTypes extends Transform {
  var mapping: js.Any = js.native
  var reverseMapping: js.Any = js.native
  var targetSchema: js.Any = js.native
  @JSName("transformRequest")
  def transformRequest_MExpandAbstractTypes(originalRequest: Request): Request = js.native
}

object ExpandAbstractTypes {
  @scala.inline
  def apply(
    mapping: js.Any,
    reverseMapping: js.Any,
    targetSchema: js.Any,
    transformRequest: Request => Request
  ): ExpandAbstractTypes = {
    val __obj = js.Dynamic.literal(mapping = mapping.asInstanceOf[js.Any], reverseMapping = reverseMapping.asInstanceOf[js.Any], targetSchema = targetSchema.asInstanceOf[js.Any], transformRequest = js.Any.fromFunction1(transformRequest))
    __obj.asInstanceOf[ExpandAbstractTypes]
  }
  @scala.inline
  implicit class ExpandAbstractTypesOps[Self <: ExpandAbstractTypes] (val x: Self) extends AnyVal {
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
    def withReverseMapping(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseMapping")(value.asInstanceOf[js.Any])
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

