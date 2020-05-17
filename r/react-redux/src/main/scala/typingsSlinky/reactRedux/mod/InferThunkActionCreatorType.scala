package typingsSlinky.reactRedux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - TActionCreator
  - js.Function1[/ * args * / js.Any, js.Any]
*/
trait InferThunkActionCreatorType[TActionCreator /* <: js.Function1[/* repeated */ js.Any, _] */] extends HandleThunkActionCreator[TActionCreator]

object InferThunkActionCreatorType {
  @scala.inline
  implicit def apply[TActionCreator](value: js.Function1[/* args */ js.Any, js.Any]): InferThunkActionCreatorType[TActionCreator] = value.asInstanceOf[InferThunkActionCreatorType[TActionCreator]]
  @scala.inline
  implicit def apply[TActionCreator](value: TActionCreator): InferThunkActionCreatorType[TActionCreator] = value.asInstanceOf[InferThunkActionCreatorType[TActionCreator]]
}

