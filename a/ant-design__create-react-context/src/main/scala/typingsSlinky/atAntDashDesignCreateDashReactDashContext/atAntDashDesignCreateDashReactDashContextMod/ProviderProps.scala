package typingsSlinky.atAntDashDesignCreateDashReactDashContext.atAntDashDesignCreateDashReactDashContextMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderProps[T] extends js.Object {
  var children: TagMod[Any]
  var value: T
}

object ProviderProps {
  @scala.inline
  def apply[T](children: TagMod[Any], value: T): ProviderProps[T] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProviderProps[T]]
  }
}

