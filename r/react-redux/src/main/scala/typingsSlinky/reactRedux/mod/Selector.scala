package typingsSlinky.reactRedux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function2[/ * state * / S, / * ownProps * / TOwnProps, TProps]
  - js.Function1[/ * state * / S, TProps]
*/
trait Selector[S, TProps, TOwnProps] extends js.Object

object Selector {
  @scala.inline
  implicit def apply[S, TProps, TOwnProps](value: js.Function1[/* state */ S, TProps]): Selector[S, TProps, TOwnProps] = value.asInstanceOf[Selector[S, TProps, TOwnProps]]
  @scala.inline
  implicit def apply[S, TProps, TOwnProps](value: js.Function2[/* state */ S, /* ownProps */ TOwnProps, TProps]): Selector[S, TProps, TOwnProps] = value.asInstanceOf[Selector[S, TProps, TOwnProps]]
}

