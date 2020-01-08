package typingsSlinky.fsDashMerger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fsDashMergerMod {
  import typingsSlinky.broccoliDashNodeDashApi.broccoliDashNodeDashApiMod.InputNode
  import typingsSlinky.node.Buffer

  type FileContent = String | Buffer | Null
  type Node = FSMergerObject | InputNode
}
