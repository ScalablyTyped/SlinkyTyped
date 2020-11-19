package typingsSlinky.pulumiAws.getLocalGatewayRouteTablesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ec2.GetLocalGatewayRouteTablesFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLocalGatewayRouteTablesResult extends js.Object {
  
  val filters: js.UndefOr[js.Array[GetLocalGatewayRouteTablesFilter]] = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * Set of Local Gateway Route Table identifiers
    */
  val ids: js.Array[String] = js.native
  
  val tags: StringDictionary[String] = js.native
}
object GetLocalGatewayRouteTablesResult {
  
  @scala.inline
  def apply(id: String, ids: js.Array[String], tags: StringDictionary[String]): GetLocalGatewayRouteTablesResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocalGatewayRouteTablesResult]
  }
  
  @scala.inline
  implicit class GetLocalGatewayRouteTablesResultOps[Self <: GetLocalGatewayRouteTablesResult] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = this.set("ids", js.Array(value :_*))
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = this.set("ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: GetLocalGatewayRouteTablesFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetLocalGatewayRouteTablesFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
}
