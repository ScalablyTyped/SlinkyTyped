package typingsSlinky.datatablesNetFixedcolumns.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Api extends js.Object {
  
  /*
    * Get FixedColumns Api
    */
  def fixedColumns(): FixedColumnsMethods = js.native
}
object Api {
  
  @scala.inline
  def apply(fixedColumns: () => FixedColumnsMethods): Api = {
    val __obj = js.Dynamic.literal(fixedColumns = js.Any.fromFunction0(fixedColumns))
    __obj.asInstanceOf[Api]
  }
  
  @scala.inline
  implicit class ApiOps[Self <: Api] (val x: Self) extends AnyVal {
    
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
    def setFixedColumns(value: () => FixedColumnsMethods): Self = this.set("fixedColumns", js.Any.fromFunction0(value))
  }
}
