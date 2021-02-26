package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.nodeFilterMod.NodeFilter
import typingsSlinky.firebaseDatabase.queryParamsMod.QueryParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object limitedFilterMod {
  
  @JSImport("@firebase/database/dist/src/core/view/filter/LimitedFilter", "LimitedFilter")
  @js.native
  class LimitedFilter protected () extends NodeFilter {
    /**
      * @param {!QueryParams} params
      */
    def this(params: QueryParams) = this()
    
    /**
      * @param {!Node} snap
      * @param {string} childKey
      * @param {!Node} childSnap
      * @param {!CompleteChildSource} source
      * @param {?ChildChangeAccumulator} changeAccumulator
      * @return {!Node}
      * @private
      */
    var fullLimitUpdateChild_ : js.Any = js.native
    
    /**
      * @const
      * @type {!Index}
      * @private
      */
    val index_ : js.Any = js.native
    
    /**
      * @const
      * @type {number}
      * @private
      */
    val limit_ : js.Any = js.native
    
    /**
      * @const
      * @type {RangedFilter}
      * @private
      */
    val rangedFilter_ : js.Any = js.native
    
    /**
      * @const
      * @type {boolean}
      * @private
      */
    val reverse_ : js.Any = js.native
  }
}
