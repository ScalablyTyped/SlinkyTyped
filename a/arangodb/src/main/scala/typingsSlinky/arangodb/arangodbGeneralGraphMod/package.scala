package typingsSlinky.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object arangodbGeneralGraphMod {
  type Betweenness = typingsSlinky.arangodb.arangodbGeneralGraphMod.Eccentricity
  type Closeness = typingsSlinky.arangodb.arangodbGeneralGraphMod.Eccentricity
  type ClosenessOptions = typingsSlinky.arangodb.arangodbGeneralGraphMod.ShortestPathOptions
  type CommonProperties = org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Array[typingsSlinky.arangodb.AnonId]]]
  type CountCommonNeighbors = org.scalablytyped.runtime.StringDictionary[
    js.UndefOr[js.Array[org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double]]]]
  ]
  type CountCommonProperties = org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double]]
  type DiameterOptions = typingsSlinky.arangodb.arangodbGeneralGraphMod.BetweennessOptions
  type Eccentricity = org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double]]
  type EccentricityOptions = typingsSlinky.arangodb.arangodbGeneralGraphMod.ShortestPathOptions
  type Example = (js.Array[js.Object | java.lang.String]) | js.Object | java.lang.String | scala.Null
  type RadiusOptions = typingsSlinky.arangodb.arangodbGeneralGraphMod.BetweennessOptions
}
