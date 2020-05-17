package typingsSlinky.reactRedux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactRedux.mod.MapDispatchToPropsFactory[TDispatchProps, TOwnProps]
  - typingsSlinky.reactRedux.mod.MapDispatchToPropsFunction[TDispatchProps, TOwnProps]
*/
trait MapDispatchToPropsNonObject[TDispatchProps, TOwnProps] extends js.Object

object MapDispatchToPropsNonObject {
  @scala.inline
  implicit def apply[TDispatchProps, TOwnProps](
    value: (MapDispatchToPropsFactory[TDispatchProps, TOwnProps]) | (MapDispatchToPropsFunction[TDispatchProps, TOwnProps])
  ): MapDispatchToPropsNonObject[TDispatchProps, TOwnProps] = value.asInstanceOf[MapDispatchToPropsNonObject[TDispatchProps, TOwnProps]]
}

