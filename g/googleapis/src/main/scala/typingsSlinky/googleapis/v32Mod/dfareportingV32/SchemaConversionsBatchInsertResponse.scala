package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Insert Conversions Response.
  */
@js.native
trait SchemaConversionsBatchInsertResponse extends js.Object {
  
  /**
    * Indicates that some or all conversions failed to insert.
    */
  var hasFailures: js.UndefOr[Boolean] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#conversionsBatchInsertResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The insert status of each conversion. Statuses are returned in the same
    * order that conversions are inserted.
    */
  var status: js.UndefOr[js.Array[SchemaConversionStatus]] = js.native
}
object SchemaConversionsBatchInsertResponse {
  
  @scala.inline
  def apply(): SchemaConversionsBatchInsertResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConversionsBatchInsertResponse]
  }
  
  @scala.inline
  implicit class SchemaConversionsBatchInsertResponseOps[Self <: SchemaConversionsBatchInsertResponse] (val x: Self) extends AnyVal {
    
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
    def setHasFailures(value: Boolean): Self = this.set("hasFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasFailures: Self = this.set("hasFailures", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setStatusVarargs(value: SchemaConversionStatus*): Self = this.set("status", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: js.Array[SchemaConversionStatus]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
