package typingsSlinky.baseui.toastMod

import org.scalablytyped.runtime.Instantiable0
import slinky.core.TagMod
import typingsSlinky.react.reactMod.Key
import typingsSlinky.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToaster extends js.Object {
  def clear(key: Key): Unit
  def getRef(): Ref[Instantiable0[ToasterContainer]]
  def info(children: TagMod[Any], props: ToastProps): Key
  def negative(children: TagMod[Any], props: ToastProps): Key
  def positive(children: TagMod[Any], props: ToastProps): Key
  def show(children: TagMod[Any], props: ToastProps): Key
  def update(key: Key, props: ToastProps): Unit
  def warning(children: TagMod[Any], props: ToastProps): Key
}

object IToaster {
  @scala.inline
  def apply(
    clear: Key => Unit,
    getRef: () => Ref[Instantiable0[ToasterContainer]],
    info: (TagMod[Any], ToastProps) => Key,
    negative: (TagMod[Any], ToastProps) => Key,
    positive: (TagMod[Any], ToastProps) => Key,
    show: (TagMod[Any], ToastProps) => Key,
    update: (Key, ToastProps) => Unit,
    warning: (TagMod[Any], ToastProps) => Key
  ): IToaster = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), getRef = js.Any.fromFunction0(getRef), info = js.Any.fromFunction2(info), negative = js.Any.fromFunction2(negative), positive = js.Any.fromFunction2(positive), show = js.Any.fromFunction2(show), update = js.Any.fromFunction2(update), warning = js.Any.fromFunction2(warning))
  
    __obj.asInstanceOf[IToaster]
  }
}

