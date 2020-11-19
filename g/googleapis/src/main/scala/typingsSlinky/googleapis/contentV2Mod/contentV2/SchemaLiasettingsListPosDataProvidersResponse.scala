package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLiasettingsListPosDataProvidersResponse extends js.Object {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#liasettingsListPosDataProvidersResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The list of POS data providers for each eligible country
    */
  var posDataProviders: js.UndefOr[js.Array[SchemaPosDataProviders]] = js.native
}
object SchemaLiasettingsListPosDataProvidersResponse {
  
  @scala.inline
  def apply(): SchemaLiasettingsListPosDataProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiasettingsListPosDataProvidersResponse]
  }
  
  @scala.inline
  implicit class SchemaLiasettingsListPosDataProvidersResponseOps[Self <: SchemaLiasettingsListPosDataProvidersResponse] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPosDataProvidersVarargs(value: SchemaPosDataProviders*): Self = this.set("posDataProviders", js.Array(value :_*))
    
    @scala.inline
    def setPosDataProviders(value: js.Array[SchemaPosDataProviders]): Self = this.set("posDataProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosDataProviders: Self = this.set("posDataProviders", js.undefined)
  }
}
