package typingsSlinky.baseui.toastMod

import org.scalablytyped.runtime.Instantiable0
import slinky.core.TagMod
import typingsSlinky.baseui.anon.ReadonlyToastProps
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToaster extends js.Object {
  def clear(key: Key): Unit
  def getRef(): Ref[Instantiable0[ToasterContainer]]
  def info(children: TagMod[Any], props: ReadonlyToastProps): Key
  def negative(children: TagMod[Any], props: ReadonlyToastProps): Key
  def positive(children: TagMod[Any], props: ReadonlyToastProps): Key
  def show(children: TagMod[Any], props: ReadonlyToastProps): Key
  def update(key: Key, props: ReadonlyToastProps): Unit
  def warning(children: TagMod[Any], props: ReadonlyToastProps): Key
}

object IToaster {
  @scala.inline
  def apply(
    clear: Key => Unit,
    getRef: () => Ref[Instantiable0[ToasterContainer]],
    info: (TagMod[Any], ReadonlyToastProps) => Key,
    negative: (TagMod[Any], ReadonlyToastProps) => Key,
    positive: (TagMod[Any], ReadonlyToastProps) => Key,
    show: (TagMod[Any], ReadonlyToastProps) => Key,
    update: (Key, ReadonlyToastProps) => Unit,
    warning: (TagMod[Any], ReadonlyToastProps) => Key
  ): IToaster = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), getRef = js.Any.fromFunction0(getRef), info = js.Any.fromFunction2(info), negative = js.Any.fromFunction2(negative), positive = js.Any.fromFunction2(positive), show = js.Any.fromFunction2(show), update = js.Any.fromFunction2(update), warning = js.Any.fromFunction2(warning))
    __obj.asInstanceOf[IToaster]
  }
}

