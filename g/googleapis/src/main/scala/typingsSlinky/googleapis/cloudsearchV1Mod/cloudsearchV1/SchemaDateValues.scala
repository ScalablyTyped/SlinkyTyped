package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of date values.
  */
@js.native
trait SchemaDateValues extends js.Object {
  
  var values: js.UndefOr[js.Array[SchemaDate]] = js.native
}
object SchemaDateValues {
  
  @scala.inline
  def apply(): SchemaDateValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDateValues]
  }
  
  @scala.inline
  implicit class SchemaDateValuesOps[Self <: SchemaDateValues] (val x: Self) extends AnyVal {
    
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
    def setValuesVarargs(value: SchemaDate*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[SchemaDate]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
