package typingsSlinky.baseui.toastMod

import slinky.core.facade.ReactElement
import typingsSlinky.baseui.anon.Placement
import typingsSlinky.baseui.anon.ReadonlyToastPropskeyKey
import typingsSlinky.baseui.anon.ReadonlyToasterProps
import typingsSlinky.baseui.anon.ToastPropskeyKey
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/toast", "ToasterContainer")
@js.native
class ToasterContainer ()
  extends Component[ReadonlyToasterProps, ToasterContainerState, js.Any] {
  def clear(key: Key): Unit = js.native
  def clearAll(): Unit = js.native
  def dismiss(key: Key): Unit = js.native
  def getOnCloseHandler(key: Key): js.Function0[_] = js.native
  def getOnCloseHandler(key: Key, onClose: js.Function0[_]): js.Function0[_] = js.native
  def getSharedProps(): Placement = js.native
  def getToastProps(props: ToastProps): ReadonlyToastPropskeyKey = js.native
  def internalOnClose(key: Key): Unit = js.native
  def renderToast(toastProps: ToastPropskeyKey): ReactElement = js.native
  def show(props: ToastProps): Key = js.native
  def update(key: Key, props: ToastProps): Unit = js.native
}

