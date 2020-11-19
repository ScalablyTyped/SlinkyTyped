package typingsSlinky.bingmaps.global.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides an easy method for geocoding address and searching for points of interest from JavaScript.
  * @requires The Microsoft.Maps.Search module.
  */
@JSGlobal("Microsoft.Maps.Search")
@js.native
object Search extends js.Object {
  
  @js.native
  object MatchCode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.bingmaps.Microsoft.Maps.Search.MatchCode with Double] = js.native
    
    /* 2 */ val ambiguous: typingsSlinky.bingmaps.Microsoft.Maps.Search.MatchCode.ambiguous with Double = js.native
    
    /* 1 */ val good: typingsSlinky.bingmaps.Microsoft.Maps.Search.MatchCode.good with Double = js.native
    
    /* 4 */ val modified: typingsSlinky.bingmaps.Microsoft.Maps.Search.MatchCode.modified with Double = js.native
    
    /* 0 */ val none: typingsSlinky.bingmaps.Microsoft.Maps.Search.MatchCode.none with Double = js.native
    
    /* 3 */ val upHierarchy: typingsSlinky.bingmaps.Microsoft.Maps.Search.MatchCode.upHierarchy with Double = js.native
  }
  
  @js.native
  object MatchConfidence extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.bingmaps.Microsoft.Maps.Search.MatchConfidence with Double] = js.native
    
    /* 0 */ val high: typingsSlinky.bingmaps.Microsoft.Maps.Search.MatchConfidence.high with Double = js.native
    
    /* 2 */ val low: typingsSlinky.bingmaps.Microsoft.Maps.Search.MatchConfidence.low with Double = js.native
    
    /* 1 */ val medium: typingsSlinky.bingmaps.Microsoft.Maps.Search.MatchConfidence.medium with Double = js.native
    
    /* 3 */ val unknown: typingsSlinky.bingmaps.Microsoft.Maps.Search.MatchConfidence.unknown with Double = js.native
  }
  
  @js.native
  class SearchManager protected ()
    extends typingsSlinky.bingmaps.Microsoft.Maps.Search.SearchManager {
    /**
      * @constructor
      * @requires The Microsoft.Maps.Search module.
      * @param map A Map object
      */
    def this(map: typingsSlinky.bingmaps.Microsoft.Maps.Map) = this()
  }
}
