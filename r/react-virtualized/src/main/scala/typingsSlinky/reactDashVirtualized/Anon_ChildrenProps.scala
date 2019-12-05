package typingsSlinky.reactDashVirtualized

import slinky.core.TagMod
import typingsSlinky.react.reactMod.Validator
import typingsSlinky.reactDashVirtualized.distEsScrollSyncMod.ScrollSyncChildProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenProps extends js.Object {
  var children: Validator[js.Function1[/* props */ ScrollSyncChildProps, TagMod[Any]]]
}

object Anon_ChildrenProps {
  @scala.inline
  def apply(children: Validator[js.Function1[/* props */ ScrollSyncChildProps, TagMod[Any]]]): Anon_ChildrenProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ChildrenProps]
  }
}

