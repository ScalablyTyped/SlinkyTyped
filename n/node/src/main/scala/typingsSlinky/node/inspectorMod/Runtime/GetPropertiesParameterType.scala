package typingsSlinky.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPropertiesParameterType extends js.Object {
  /**
    * If true, returns accessor properties (with getter/setter) only; internal properties are not returned either.
    * @experimental
    */
  var accessorPropertiesOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether preview should be generated for the results.
    * @experimental
    */
  var generatePreview: js.UndefOr[Boolean] = js.undefined
  /**
    * Identifier of the object to return properties for.
    */
  var objectId: RemoteObjectId
  /**
    * If true, returns properties belonging only to the element itself, not to its prototype chain.
    */
  var ownProperties: js.UndefOr[Boolean] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setObjectId(value: RemoteObjectId): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessorPropertiesOnly(value: Boolean): Self = this.set("accessorPropertiesOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessorPropertiesOnly: Self = this.set("accessorPropertiesOnly", js.undefined)
    @scala.inline
    def setGeneratePreview(value: Boolean): Self = this.set("generatePreview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneratePreview: Self = this.set("generatePreview", js.undefined)
    @scala.inline
    def setOwnProperties(value: Boolean): Self = this.set("ownProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnProperties: Self = this.set("ownProperties", js.undefined)
  }
  
}

