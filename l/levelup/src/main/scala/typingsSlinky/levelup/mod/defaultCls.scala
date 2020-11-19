package typingsSlinky.levelup.mod

import typingsSlinky.abstractLeveldown.mod.AbstractIterator
import typingsSlinky.abstractLeveldown.mod.AbstractLevelDOWN
import typingsSlinky.abstractLeveldown.mod.ErrorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("levelup", JSImport.Default)
@js.native
class defaultCls[DB /* <: AbstractLevelDOWN[_, _] */] protected ()
  extends LevelUp[DB, AbstractIterator[js.Any, js.Any]] {
  def this(db: DB) = this()
  def this(db: DB, cb: ErrorCallback) = this()
  def this(db: DB, options: js.Any) = this()
  def this(db: DB, options: js.Any, cb: ErrorCallback) = this()
}
