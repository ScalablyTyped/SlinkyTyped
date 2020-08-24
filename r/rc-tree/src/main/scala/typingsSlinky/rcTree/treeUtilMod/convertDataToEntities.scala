package typingsSlinky.rcTree.treeUtilMod

import typingsSlinky.rcTree.anon.InitWrapper
import typingsSlinky.rcTree.anon.KeyEntities
import typingsSlinky.rcTree.interfaceMod.DataNode
import typingsSlinky.rcTree.interfaceMod.GetKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tree/es/utils/treeUtil", "convertDataToEntities")
@js.native
object convertDataToEntities extends js.Object {
  def apply(dataNodes: js.Array[DataNode]): KeyEntities = js.native
  def apply(
    dataNodes: js.Array[DataNode],
    hasInitWrapperProcessEntityOnProcessFinished: js.UndefOr[scala.Nothing],
    externalGetKey: String
  ): KeyEntities = js.native
  def apply(
    dataNodes: js.Array[DataNode],
    hasInitWrapperProcessEntityOnProcessFinished: js.UndefOr[scala.Nothing],
    externalGetKey: GetKey[DataNode]
  ): KeyEntities = js.native
  def apply(dataNodes: js.Array[DataNode], hasInitWrapperProcessEntityOnProcessFinished: InitWrapper): KeyEntities = js.native
  def apply(
    dataNodes: js.Array[DataNode],
    hasInitWrapperProcessEntityOnProcessFinished: InitWrapper,
    externalGetKey: String
  ): KeyEntities = js.native
  def apply(
    dataNodes: js.Array[DataNode],
    hasInitWrapperProcessEntityOnProcessFinished: InitWrapper,
    externalGetKey: GetKey[DataNode]
  ): KeyEntities = js.native
}

