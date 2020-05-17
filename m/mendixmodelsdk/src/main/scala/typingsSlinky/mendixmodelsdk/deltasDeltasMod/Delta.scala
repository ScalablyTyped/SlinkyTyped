package typingsSlinky.mendixmodelsdk.deltasDeltasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mendixmodelsdk.deltasDeltasMod.ICreateElementTreeDelta
  - typingsSlinky.mendixmodelsdk.deltasDeltasMod.IDeleteElementDelta
  - typingsSlinky.mendixmodelsdk.deltasDeltasMod.IAttachElementDelta
  - typingsSlinky.mendixmodelsdk.deltasDeltasMod.IDetachElementDelta
  - typingsSlinky.mendixmodelsdk.deltasDeltasMod.ICreateUnitTreeDelta
  - typingsSlinky.mendixmodelsdk.deltasDeltasMod.IDeleteUnitDelta
  - typingsSlinky.mendixmodelsdk.deltasDeltasMod.IUpdatePropertyValueDelta
*/
trait Delta extends js.Object

object Delta {
  @scala.inline
  implicit def apply(value: IAttachElementDelta): Delta = value.asInstanceOf[Delta]
  @scala.inline
  implicit def apply(value: ICreateElementTreeDelta): Delta = value.asInstanceOf[Delta]
  @scala.inline
  implicit def apply(value: ICreateUnitTreeDelta): Delta = value.asInstanceOf[Delta]
  @scala.inline
  implicit def apply(value: IDeleteElementDelta): Delta = value.asInstanceOf[Delta]
  @scala.inline
  implicit def apply(value: IDeleteUnitDelta): Delta = value.asInstanceOf[Delta]
  @scala.inline
  implicit def apply(value: IDetachElementDelta): Delta = value.asInstanceOf[Delta]
  @scala.inline
  implicit def apply(value: IUpdatePropertyValueDelta): Delta = value.asInstanceOf[Delta]
}

