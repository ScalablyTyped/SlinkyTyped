package typingsSlinky.iitc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("iitc", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class DataCache ()
    extends typingsSlinky.iitc.dataCacheMod.DataCache
  
  @js.native
  object IITC extends js.Object {
    
    /** Field-Polygon */
    @js.native
    class Field ()
      extends typingsSlinky.iitc.iitctypesMod.IITC.Field
    
    /** Link-Marker */
    @js.native
    class Link ()
      extends typingsSlinky.iitc.iitctypesMod.IITC.Link
    
    /** Portal-Marker */
    @js.native
    class Portal ()
      extends typingsSlinky.iitc.iitctypesMod.IITC.Portal
  }
  
  @js.native
  class MapDataRequest ()
    extends typingsSlinky.iitc.mapDataRequestMod.MapDataRequest
  
  @js.native
  class Render ()
    extends typingsSlinky.iitc.mapDataRenderMod.Render
  
  @js.native
  class RenderDebugTiles ()
    extends typingsSlinky.iitc.mapDataDebugMod.RenderDebugTiles
}
