package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTableOutput extends js.Object {
  
  /**
    * Represents the properties of a table.
    */
  var TableDescription: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.TableDescription] = js.native
}
object DeleteTableOutput {
  
  @scala.inline
  def apply(): DeleteTableOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTableOutput]
  }
  
  @scala.inline
  implicit class DeleteTableOutputOps[Self <: DeleteTableOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTableDescription(value: TableDescription): Self = this.set("TableDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableDescription: Self = this.set("TableDescription", js.undefined)
  }
}
