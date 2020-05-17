package typingsSlinky.reactRedux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactRedux.mod.MapStateToPropsFactory[TStateProps, TOwnProps, State]
  - typingsSlinky.reactRedux.mod.MapStateToProps[TStateProps, TOwnProps, State]
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait MapStateToPropsParam[TStateProps, TOwnProps, State] extends js.Object

object MapStateToPropsParam {
  @scala.inline
  implicit def apply[TStateProps, TOwnProps, State](
    value: (MapStateToProps[TStateProps, TOwnProps, State]) | (MapStateToPropsFactory[TStateProps, TOwnProps, State])
  ): MapStateToPropsParam[TStateProps, TOwnProps, State] = value.asInstanceOf[MapStateToPropsParam[TStateProps, TOwnProps, State]]
  @scala.inline
  implicit def apply[TStateProps, TOwnProps, State](value: Null): MapStateToPropsParam[TStateProps, TOwnProps, State] = value.asInstanceOf[MapStateToPropsParam[TStateProps, TOwnProps, State]]
  @scala.inline
  implicit def fromUndef[TStateProps, TOwnProps, State, T](value: js.UndefOr[T])(implicit ev: T => MapStateToPropsParam[TStateProps, TOwnProps, State]): MapStateToPropsParam[TStateProps, TOwnProps, State] = value.asInstanceOf[MapStateToPropsParam[TStateProps, TOwnProps, State]]
}

