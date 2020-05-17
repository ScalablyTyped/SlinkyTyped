package typingsSlinky.reactNativeTabView.anon

import slinky.core.TagMod
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.enter
import typingsSlinky.reactNativeTabView.typesMod.Listener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/src/types.EventEmitterProps & {  position  :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> * / any, render (children : react.react.ReactNode): react.react.ReactNode, jumpTo (key : string): void} */
@js.native
trait EventEmitterPropsposition extends js.Object {
  var position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any = js.native
  @JSName("addListener")
  def addListener_enter(`type`: enter, listener: Listener): Unit = js.native
  def jumpTo(key: String): Unit = js.native
  @JSName("removeListener")
  def removeListener_enter(`type`: enter, listener: Listener): Unit = js.native
  def render(children: TagMod[Any]): TagMod[Any] = js.native
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
  @scala.inline
  implicit class EventEmitterPropspositionOps[Self <: EventEmitterPropsposition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddListener(value: (enter, Listener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withJumpTo(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumpTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPosition(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveListener(value: (enter, Listener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRender(value: TagMod[Any] => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

