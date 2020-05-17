package typingsSlinky.minecraftScriptingTypesShared

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.minecraftScriptingTypesShared.IEventData[js.Any]
  - typingsSlinky.minecraftScriptingTypesShared.IEntity
  - typingsSlinky.minecraftScriptingTypesShared.ILevel
  - typingsSlinky.minecraftScriptingTypesShared.IComponent[js.Any]
  - typingsSlinky.minecraftScriptingTypesShared.IQuery
  - typingsSlinky.minecraftScriptingTypesShared.IItemStack
  - typingsSlinky.minecraftScriptingTypesShared.IBlock
  - typingsSlinky.minecraftScriptingTypesShared.ITickingArea
*/
trait IMinecraftObject extends js.Object

object IMinecraftObject {
  @scala.inline
  implicit def apply(value: IBlock): IMinecraftObject = value.asInstanceOf[IMinecraftObject]
  @scala.inline
  implicit def apply(value: IComponent[js.Any]): IMinecraftObject = value.asInstanceOf[IMinecraftObject]
  @scala.inline
  implicit def apply(value: IEntity): IMinecraftObject = value.asInstanceOf[IMinecraftObject]
  @scala.inline
  implicit def apply(value: IEventData[js.Any]): IMinecraftObject = value.asInstanceOf[IMinecraftObject]
  @scala.inline
  implicit def apply(value: IItemStack): IMinecraftObject = value.asInstanceOf[IMinecraftObject]
  @scala.inline
  implicit def apply(value: ILevel): IMinecraftObject = value.asInstanceOf[IMinecraftObject]
  @scala.inline
  implicit def apply(value: IQuery): IMinecraftObject = value.asInstanceOf[IMinecraftObject]
  @scala.inline
  implicit def apply(value: ITickingArea): IMinecraftObject = value.asInstanceOf[IMinecraftObject]
}

