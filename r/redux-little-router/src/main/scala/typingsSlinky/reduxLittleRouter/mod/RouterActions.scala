package typingsSlinky.reduxLittleRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxLittleRouter.mod.LocationChangedAction
  - typingsSlinky.reduxLittleRouter.mod.PushAction
  - typingsSlinky.reduxLittleRouter.mod.ReplaceAction
  - typingsSlinky.reduxLittleRouter.mod.GoAction
  - typingsSlinky.reduxLittleRouter.mod.GoBackAction
  - typingsSlinky.reduxLittleRouter.mod.GoForwardAction
  - typingsSlinky.reduxLittleRouter.mod.BlockAction
  - typingsSlinky.reduxLittleRouter.mod.UnblockAction
  - typingsSlinky.reduxLittleRouter.mod.ReplaceRoutesAction
*/
trait RouterActions extends js.Object

object RouterActions {
  @scala.inline
  implicit def apply(value: BlockAction): RouterActions = value.asInstanceOf[RouterActions]
  @scala.inline
  implicit def apply(value: GoAction): RouterActions = value.asInstanceOf[RouterActions]
  @scala.inline
  implicit def apply(value: GoBackAction): RouterActions = value.asInstanceOf[RouterActions]
  @scala.inline
  implicit def apply(value: GoForwardAction): RouterActions = value.asInstanceOf[RouterActions]
  @scala.inline
  implicit def apply(value: LocationChangedAction): RouterActions = value.asInstanceOf[RouterActions]
  @scala.inline
  implicit def apply(value: PushAction): RouterActions = value.asInstanceOf[RouterActions]
  @scala.inline
  implicit def apply(value: ReplaceAction): RouterActions = value.asInstanceOf[RouterActions]
  @scala.inline
  implicit def apply(value: ReplaceRoutesAction): RouterActions = value.asInstanceOf[RouterActions]
  @scala.inline
  implicit def apply(value: UnblockAction): RouterActions = value.asInstanceOf[RouterActions]
}

