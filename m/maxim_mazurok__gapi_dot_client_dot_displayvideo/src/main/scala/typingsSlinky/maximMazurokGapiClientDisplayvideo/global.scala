package typingsSlinky.maximMazurokGapiClientDisplayvideo

import typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.AdvertisersResource
import typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.CombinedAudiencesResource
import typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.CustomBiddingAlgorithmsResource
import typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.CustomListsResource
import typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.FirstAndThirdPartyAudiencesResource
import typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.FloodlightGroupsResource
import typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.GoogleAudiencesResource
import typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.InventorySourceGroupsResource
import typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.InventorySourcesResource
import typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.MediaResource
import typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.PartnersResource
import typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.SdfdownloadtasksResource
import typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.TargetingTypesResource
import typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.UsersResource
import typingsSlinky.maximMazurokGapiClientDisplayvideo.maximMazurokGapiClientDisplayvideoStrings.displayvideo
import typingsSlinky.maximMazurokGapiClientDisplayvideo.maximMazurokGapiClientDisplayvideoStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Display & Video 360 API v1 */
      def load(name: displayvideo, version: v1): js.Thenable[Unit] = js.native
      def load(name: displayvideo, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object displayvideo extends js.Object {
        
        val advertisers: AdvertisersResource = js.native
        
        val combinedAudiences: CombinedAudiencesResource = js.native
        
        val customBiddingAlgorithms: CustomBiddingAlgorithmsResource = js.native
        
        val customLists: CustomListsResource = js.native
        
        val firstAndThirdPartyAudiences: FirstAndThirdPartyAudiencesResource = js.native
        
        val floodlightGroups: FloodlightGroupsResource = js.native
        
        val googleAudiences: GoogleAudiencesResource = js.native
        
        val inventorySourceGroups: InventorySourceGroupsResource = js.native
        
        val inventorySources: InventorySourcesResource = js.native
        
        val media: MediaResource = js.native
        
        val partners: PartnersResource = js.native
        
        val sdfdownloadtasks: SdfdownloadtasksResource = js.native
        
        val targetingTypes: TargetingTypesResource = js.native
        
        val users: UsersResource = js.native
      }
    }
  }
}
