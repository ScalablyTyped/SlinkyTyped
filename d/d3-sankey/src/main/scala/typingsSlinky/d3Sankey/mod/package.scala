package typingsSlinky.d3Sankey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SankeyExtraProperties = org.scalablytyped.runtime.StringDictionary[js.Any]
  type SankeyLink[N /* <: typingsSlinky.d3Sankey.mod.SankeyExtraProperties */, L /* <: typingsSlinky.d3Sankey.mod.SankeyExtraProperties */] = L with (typingsSlinky.d3Sankey.mod.SankeyLinkMinimal[N, L])
  type SankeyNode[N /* <: typingsSlinky.d3Sankey.mod.SankeyExtraProperties */, L /* <: typingsSlinky.d3Sankey.mod.SankeyExtraProperties */] = N with (typingsSlinky.d3Sankey.mod.SankeyNodeMinimal[N, L])
}
