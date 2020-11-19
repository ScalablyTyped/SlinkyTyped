package typingsSlinky.rcTree.conductUtilMod

import typingsSlinky.rcTree.interfaceMod.DataEntity
import typingsSlinky.rcTree.interfaceMod.DataNode
import typingsSlinky.rcTree.interfaceMod.GetCheckDisabled
import typingsSlinky.rcTree.interfaceMod.Key
import typingsSlinky.rcTree.rcTreeBooleans.`true`
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-tree/es/utils/conductUtil", "conductCheck")
@js.native
object conductCheck_true extends js.Object {
  
  def apply(keyList: js.Array[Key], checked: `true`, keyEntities: Record[Key, DataEntity]): ConductReturnType = js.native
  def apply(
    keyList: js.Array[Key],
    checked: `true`,
    keyEntities: Record[Key, DataEntity],
    getCheckDisabled: GetCheckDisabled[DataNode]
  ): ConductReturnType = js.native
}
