package typingsSlinky.rcTreeSelect

import typingsSlinky.rcTree.interfaceMod.DataEntity
import typingsSlinky.rcTreeSelect.interfaceMod.Key
import typingsSlinky.rcTreeSelect.interfaceMod.RawValueType
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-tree-select/es/utils/strategyUtil", JSImport.Namespace)
@js.native
object strategyUtilMod extends js.Object {
  
  val SHOW_ALL: /* "SHOW_ALL" */ String = js.native
  
  val SHOW_CHILD: /* "SHOW_CHILD" */ String = js.native
  
  val SHOW_PARENT: /* "SHOW_PARENT" */ String = js.native
  
  def formatStrategyKeys(keys: js.Array[Key], strategy: CheckedStrategy, keyEntities: Record[Key, DataEntity]): js.Array[RawValueType] = js.native
  
  type CheckedStrategy = /* "SHOW_ALL" */ String
}
