package typingsSlinky.minecraftScriptingTypesShared

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.minecraftScriptingTypesShared.IEntityTickingArea
  - typingsSlinky.minecraftScriptingTypesShared.ILevelTickingArea
*/
trait ITickingArea extends IMinecraftObject

object ITickingArea {
  @scala.inline
  implicit def apply(value: IEntityTickingArea): ITickingArea = value.asInstanceOf[ITickingArea]
  @scala.inline
  implicit def apply(value: ILevelTickingArea): ITickingArea = value.asInstanceOf[ITickingArea]
}

