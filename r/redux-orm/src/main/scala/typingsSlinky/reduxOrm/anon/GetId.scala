package typingsSlinky.reduxOrm.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.reduxOrm.modelMod.AnyModel
import typingsSlinky.reduxOrm.modelMod.IdType
import typingsSlinky.reduxOrm.modelMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetId[M /* <: Model[Instantiable0[AnyModel], _] */] extends js.Object {
  def getId(): IdType[M]
}

object GetId {
  @scala.inline
  def apply[M](getId: () => IdType[M]): GetId[M] = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId))
    __obj.asInstanceOf[GetId[M]]
  }
}

