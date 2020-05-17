package typingsSlinky.antDesignReactNative.tagMod

import typingsSlinky.antDesignReactNative.anon.ActiveText
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag
  extends Component[TagNativeProps, js.Any, js.Any] {
  var closeDom: View | Null = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MTag(nextProps: TagNativeProps): Unit = js.native
  def handleLongPress(): Unit = js.native
  def onPress(): Unit = js.native
  def onPressIn(styles: ActiveText): js.Function0[Unit] = js.native
  def onPressOut(styles: ActiveText): js.Function0[Unit] = js.native
  def onTagClose(): Unit = js.native
}

