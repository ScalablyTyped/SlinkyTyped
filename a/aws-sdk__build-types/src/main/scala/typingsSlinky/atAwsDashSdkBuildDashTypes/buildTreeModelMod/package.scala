package typingsSlinky.atAwsDashSdkBuildDashTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildTreeModelMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.atAwsDashSdkTypes.buildProtocolMod.Blob
  import typingsSlinky.atAwsDashSdkTypes.buildProtocolMod.Boolean
  import typingsSlinky.atAwsDashSdkTypes.buildProtocolMod.Float
  import typingsSlinky.atAwsDashSdkTypes.buildProtocolMod.Integer
  import typingsSlinky.atAwsDashSdkTypes.buildProtocolMod.Timestamp

  type NamedAndDocumented[T] = Documented with Named with T
  type NormalizedOperationMap = StringDictionary[NormalizedOperation]
  type TreeModelOperationMap = StringDictionary[TreeModelOperation]
  type TreeModelShape = NamedAndDocumented[
    Blob | Boolean | Float | Integer | Timestamp | TreeModelString | TreeModelList | TreeModelMap | TreeModelStructure
  ]
  type TreeModelShapeMap = StringDictionary[TreeModelShape]
}
