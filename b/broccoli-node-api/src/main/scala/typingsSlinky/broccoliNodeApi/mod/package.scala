package typingsSlinky.broccoliNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type InputNode = typingsSlinky.broccoliNodeApi.mod.Node | java.lang.String
  type Node = typingsSlinky.broccoliNodeApi.mod.SourceNode | typingsSlinky.broccoliNodeApi.mod.TransformNode
  type SourceNode = typingsSlinky.broccoliNodeApi.mod.NodeCommon[typingsSlinky.broccoliNodeApi.mod.SourceNodeInfo]
  type TransformNode = typingsSlinky.broccoliNodeApi.mod.NodeCommon[typingsSlinky.broccoliNodeApi.mod.TransformNodeInfo]
}
