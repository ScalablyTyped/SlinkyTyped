package typingsSlinky.reactDashNativeDashTabDashView

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
  def jumpTo(key: String): Unit
  def render(children: TagMod[Any]): TagMod[Any]
}

object Anon_Children {
  @scala.inline
  def apply(
    jumpTo: String => Unit,
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    render: TagMod[Any] => TagMod[Any]
  ): Anon_Children = {
    val __obj = js.Dynamic.literal(jumpTo = js.Any.fromFunction1(jumpTo), position = position.asInstanceOf[js.Any], render = js.Any.fromFunction1(render))
  
    __obj.asInstanceOf[Anon_Children]
  }
}

