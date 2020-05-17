package typingsSlinky.reactRedux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - TActionCreator
  - typingsSlinky.reactRedux.mod.InferThunkActionCreatorType[TActionCreator]
*/
trait HandleThunkActionCreator[TActionCreator] extends js.Object

object HandleThunkActionCreator {
  @scala.inline
  implicit def apply[TActionCreator](value: InferThunkActionCreatorType[TActionCreator]): HandleThunkActionCreator[TActionCreator] = value.asInstanceOf[HandleThunkActionCreator[TActionCreator]]
  @scala.inline
  implicit def apply[TActionCreator](value: TActionCreator): HandleThunkActionCreator[TActionCreator] = value.asInstanceOf[HandleThunkActionCreator[TActionCreator]]
}

