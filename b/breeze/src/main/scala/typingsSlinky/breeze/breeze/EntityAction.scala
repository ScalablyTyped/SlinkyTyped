package typingsSlinky.breeze.breeze

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.breeze.breeze.core.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityAction extends IEnum {
  var AcceptChanges: EntityActionSymbol = js.native
  var Attach: EntityActionSymbol = js.native
  var AttachOnImport: EntityActionSymbol = js.native
  var AttachOnQuery: EntityActionSymbol = js.native
  var Clear: EntityActionSymbol = js.native
  var Detach: EntityActionSymbol = js.native
  var EntityStateChange: EntityActionSymbol = js.native
  var MergeOnImport: EntityActionSymbol = js.native
  var MergeOnQuery: EntityActionSymbol = js.native
  var MergeOnSave: EntityActionSymbol = js.native
  var PropertyChange: EntityActionSymbol = js.native
  var RejectChanges: EntityActionSymbol = js.native
}

@JSGlobal("breeze.EntityAction")
@js.native
object EntityAction extends TopLevel[EntityAction]

