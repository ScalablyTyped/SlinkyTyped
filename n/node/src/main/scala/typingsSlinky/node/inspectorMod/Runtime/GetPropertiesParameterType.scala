package typingsSlinky.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPropertiesParameterType extends js.Object {
  /**
    * If true, returns accessor properties (with getter/setter) only; internal properties are not returned either.
    * @experimental
    */
  var accessorPropertiesOnly: js.UndefOr[Boolean] = js.native
  /**
    * Whether preview should be generated for the results.
    * @experimental
    */
  var generatePreview: js.UndefOr[Boolean] = js.native
  /**
    * Identifier of the object to return properties for.
    */
  var objectId: RemoteObjectId = js.native
  /**
    * If true, returns properties belonging only to the element itself, not to its prototype chain.
    */
  var ownProperties: js.UndefOr[Boolean] = js.native
}

object GetPropertiesParameterType {
  @scala.inline
  def apply(objectId: RemoteObjectId): GetPropertiesParameterType = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPropertiesParameterType]
  }
  @scala.inline
  implicit class GetPropertiesParameterTypeOps[Self <: GetPropertiesParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectId(value: RemoteObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessorPropertiesOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorPropertiesOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessorPropertiesOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorPropertiesOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withGeneratePreview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatePreview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneratePreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatePreview")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnProperties(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownProperties")(js.undefined)
        ret
    }
  }
  
}

