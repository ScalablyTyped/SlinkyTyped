package typingsSlinky.mobxReact.providerMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any} */ trait ProviderProps extends js.Object {
  var children: TagMod[Any]
}

object ProviderProps {
  @scala.inline
  def apply(children: TagMod[Any]): ProviderProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProviderProps]
  }
}

