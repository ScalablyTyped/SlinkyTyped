package typingsSlinky.atMdxDashJsReact.atMdxDashJsReactMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDXProviderProps extends js.Object {
  var children: TagMod[Any]
  var components: MDXProviderComponentsProp
}

object MDXProviderProps {
  @scala.inline
  def apply(children: TagMod[Any], components: MDXProviderComponentsProp): MDXProviderProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MDXProviderProps]
  }
}

