package typingsSlinky.nodeDashMysqlDashWrapper.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CollectionChangedAction extends js.Object

@JSImport("node-mysql-wrapper", "CollectionChangedAction")
@js.native
object CollectionChangedAction extends js.Object {
  @js.native
  sealed trait DELETE extends CollectionChangedAction
  
  @js.native
  sealed trait INSERT extends CollectionChangedAction
  
  @js.native
  sealed trait RESET extends CollectionChangedAction
  
  /* 1 */ val DELETE: typingsSlinky.nodeDashMysqlDashWrapper.nodeDashMysqlDashWrapperMod.CollectionChangedAction.DELETE with Double = js.native
  /* 0 */ val INSERT: typingsSlinky.nodeDashMysqlDashWrapper.nodeDashMysqlDashWrapperMod.CollectionChangedAction.INSERT with Double = js.native
  /* 2 */ val RESET: typingsSlinky.nodeDashMysqlDashWrapper.nodeDashMysqlDashWrapperMod.CollectionChangedAction.RESET with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CollectionChangedAction with Double] = js.native
}

