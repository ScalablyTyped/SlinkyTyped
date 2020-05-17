package typingsSlinky.mongorito.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mongorito.mod.GetAction
  - typingsSlinky.mongorito.mod.SetAction
  - typingsSlinky.mongorito.mod.UnsetAction
  - typingsSlinky.mongorito.mod.RefreshAction
  - typingsSlinky.mongorito.mod.RefreshedAction
  - typingsSlinky.mongorito.mod.SaveAction
  - typingsSlinky.mongorito.mod.CreateAction
  - typingsSlinky.mongorito.mod.CreatedAction
  - typingsSlinky.mongorito.mod.UpdateAction
  - typingsSlinky.mongorito.mod.UpdatedAction
  - typingsSlinky.mongorito.mod.RemoveAction
  - typingsSlinky.mongorito.mod.RemovedAction
  - typingsSlinky.mongorito.mod.IncrementAction
  - typingsSlinky.mongorito.mod.CreateIndexAction
  - typingsSlinky.mongorito.mod.DropIndexAction
  - typingsSlinky.mongorito.mod.ListIndexesAction
  - typingsSlinky.mongorito.mod.QueryAction
  - typingsSlinky.mongorito.mod.CallAction
*/
trait Action extends js.Object

object Action {
  @scala.inline
  implicit def apply(value: CallAction): Action = value.asInstanceOf[Action]
  @scala.inline
  implicit def apply(value: CreateAction): Action = value.asInstanceOf[Action]
  @scala.inline
  implicit def apply(value: CreateIndexAction): Action = value.asInstanceOf[Action]
  @scala.inline
  implicit def apply(value: CreatedAction): Action = value.asInstanceOf[Action]
  @scala.inline
  implicit def apply(value: DropIndexAction): Action = value.asInstanceOf[Action]
  @scala.inline
  implicit def apply(value: GetAction): Action = value.asInstanceOf[Action]
  @scala.inline
  implicit def apply(value: IncrementAction): Action = value.asInstanceOf[Action]
  @scala.inline
  implicit def apply(value: ListIndexesAction): Action = value.asInstanceOf[Action]
  @scala.inline
  implicit def apply(value: QueryAction): Action = value.asInstanceOf[Action]
  @scala.inline
  implicit def apply(value: RefreshAction): Action = value.asInstanceOf[Action]
  @scala.inline
  implicit def apply(value: RefreshedAction): Action = value.asInstanceOf[Action]
  @scala.inline
  implicit def apply(value: RemoveAction): Action = value.asInstanceOf[Action]
  @scala.inline
  implicit def apply(value: RemovedAction): Action = value.asInstanceOf[Action]
  @scala.inline
  implicit def apply(value: SaveAction): Action = value.asInstanceOf[Action]
  @scala.inline
  implicit def apply(value: SetAction): Action = value.asInstanceOf[Action]
  @scala.inline
  implicit def apply(value: UnsetAction): Action = value.asInstanceOf[Action]
  @scala.inline
  implicit def apply(value: UpdateAction): Action = value.asInstanceOf[Action]
  @scala.inline
  implicit def apply(value: UpdatedAction): Action = value.asInstanceOf[Action]
}

