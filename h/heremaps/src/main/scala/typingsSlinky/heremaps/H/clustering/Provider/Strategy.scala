package typingsSlinky.heremaps.H.clustering.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Strategy extends js.Object
/**
  * Enumeration represents possible clustering strategies. FASTGRID clustering is the efficient way to cluster large sets of data points.
  * GRID clustering is slower but has greater precision due to the bigger range of epsilon values, this strategy suitable for clustering smaller data sets (up to 1000 data points)
  * on desktop devices. DYNAMICGRID clustering uses the same algorithm of clustering as the GRID, but clusters on the viewport basis is meant to be used with data sets that are subject
  * to the frequent update operations.
  */
@JSGlobal("H.clustering.Provider.Strategy")
@js.native
object Strategy extends js.Object {
  
  @js.native
  sealed trait DYNAMICGRID extends Strategy
  
  @js.native
  sealed trait FASTGRID extends Strategy
  
  @js.native
  sealed trait GRID extends Strategy
}
