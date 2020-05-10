package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSchemaExtensionResult extends js.Object {
  /**
    * The identifier of the schema extension that will be applied.
    */
  var SchemaExtensionId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.SchemaExtensionId] = js.native
}

object StartSchemaExtensionResult {
  @scala.inline
  def apply(): StartSchemaExtensionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSchemaExtensionResult]
  }
  @scala.inline
  implicit class StartSchemaExtensionResultOps[Self <: StartSchemaExtensionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSchemaExtensionId(value: SchemaExtensionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaExtensionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaExtensionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemaExtensionId")(js.undefined)
        ret
    }
  }
  
}

