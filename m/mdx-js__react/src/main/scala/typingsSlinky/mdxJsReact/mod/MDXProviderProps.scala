package typingsSlinky.mdxJsReact.mod

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
  def apply(components: MDXProviderComponentsProp, children: TagMod[Any] = null): MDXProviderProps = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDXProviderProps]
  }
}

