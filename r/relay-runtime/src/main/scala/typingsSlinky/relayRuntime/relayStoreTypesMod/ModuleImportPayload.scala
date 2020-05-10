package typingsSlinky.relayRuntime.relayStoreTypesMod

import typingsSlinky.relayRuntime.relayNetworkTypesMod.PayloadData
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.DataID
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleImportPayload extends js.Object {
  val data: PayloadData = js.native
  val dataID: DataID = js.native
  val operationReference: js.Any = js.native
  val path: js.Array[String] = js.native
  val typeName: String = js.native
  val variables: Variables = js.native
}

object ModuleImportPayload {
  @scala.inline
  def apply(
    data: PayloadData,
    dataID: DataID,
    operationReference: js.Any,
    path: js.Array[String],
    typeName: String,
    variables: Variables
  ): ModuleImportPayload = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataID = dataID.asInstanceOf[js.Any], operationReference = operationReference.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleImportPayload]
  }
  @scala.inline
  implicit class ModuleImportPayloadOps[Self <: ModuleImportPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: PayloadData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataID(value: DataID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationReference(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: Variables): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

