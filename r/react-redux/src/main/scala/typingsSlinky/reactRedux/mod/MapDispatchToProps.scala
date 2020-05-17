package typingsSlinky.reactRedux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactRedux.mod.MapDispatchToPropsFunction[TDispatchProps, TOwnProps]
  - TDispatchProps
*/
trait MapDispatchToProps[TDispatchProps, TOwnProps] extends MapDispatchToPropsParam[TDispatchProps, TOwnProps]

object MapDispatchToProps {
  @scala.inline
  implicit def apply[TDispatchProps, TOwnProps](value: MapDispatchToPropsFunction[TDispatchProps, TOwnProps]): MapDispatchToProps[TDispatchProps, TOwnProps] = value.asInstanceOf[MapDispatchToProps[TDispatchProps, TOwnProps]]
  @scala.inline
  implicit def apply[TDispatchProps, TOwnProps](value: TDispatchProps): MapDispatchToProps[TDispatchProps, TOwnProps] = value.asInstanceOf[MapDispatchToProps[TDispatchProps, TOwnProps]]
}

