package typingsSlinky.reactRedux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactRedux.mod.MapDispatchToPropsFactory[TDispatchProps, TOwnProps]
  - typingsSlinky.reactRedux.mod.MapDispatchToProps[TDispatchProps, TOwnProps]
*/
trait MapDispatchToPropsParam[TDispatchProps, TOwnProps] extends js.Object

object MapDispatchToPropsParam {
  @scala.inline
  implicit def apply[TDispatchProps, TOwnProps](value: MapDispatchToProps[TDispatchProps, TOwnProps]): MapDispatchToPropsParam[TDispatchProps, TOwnProps] = value.asInstanceOf[MapDispatchToPropsParam[TDispatchProps, TOwnProps]]
  @scala.inline
  implicit def apply[TDispatchProps, TOwnProps](value: MapDispatchToPropsFactory[TDispatchProps, TOwnProps]): MapDispatchToPropsParam[TDispatchProps, TOwnProps] = value.asInstanceOf[MapDispatchToPropsParam[TDispatchProps, TOwnProps]]
}

