package typingsSlinky.reactNativeTabView

import slinky.core.TagMod
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.enter
import typingsSlinky.reactNativeTabView.typesMod.Listener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/src/types.EventEmitterProps & {  position  :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> * / any, render (children : react.react.ReactNode): react.react.ReactNode, jumpTo (key : string): void} */
trait EventEmitterPropsposition extends js.Object {
  var position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
  @JSName("addListener")
  def addListener_enter(`type`: enter, listener: Listener): Unit
  def jumpTo(key: String): Unit
  @JSName("removeListener")
  def removeListener_enter(`type`: enter, listener: Listener): Unit
  def render(children: TagMod[Any]): TagMod[Any]
}

object EventEmitterPropsposition {
  @scala.inline
  def apply(
    addListener: (enter, Listener) => Unit,
    jumpTo: String => Unit,
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    removeListener: (enter, Listener) => Unit,
    render: TagMod[Any] => TagMod[Any]
  ): EventEmitterPropsposition = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), jumpTo = js.Any.fromFunction1(jumpTo), position = position.asInstanceOf[js.Any], removeListener = js.Any.fromFunction2(removeListener), render = js.Any.fromFunction1(render))
  
    __obj.asInstanceOf[EventEmitterPropsposition]
  }
}

