package typingsSlinky.baseui.toastMod

import org.scalablytyped.runtime.Instantiable0
import slinky.core.TagMod
import typingsSlinky.baseui.ReadonlyToastProps
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToaster extends js.Object {
  def clear(key: Key): Unit = js.native
  def getRef(): Ref[Instantiable0[ToasterContainer]] = js.native
  def info(children: TagMod[Any], props: ReadonlyToastProps): Key = js.native
  def negative(children: TagMod[Any], props: ReadonlyToastProps): Key = js.native
  def positive(children: TagMod[Any], props: ReadonlyToastProps): Key = js.native
  def show(children: TagMod[Any], props: ReadonlyToastProps): Key = js.native
  def update(key: Key, props: ReadonlyToastProps): Unit = js.native
  def warning(children: TagMod[Any], props: ReadonlyToastProps): Key = js.native
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
  @scala.inline
  implicit class IToasterOps[Self <: IToaster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: Key => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRef(value: () => Ref[Instantiable0[ToasterContainer]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRef")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInfo(value: (TagMod[Any], ReadonlyToastProps) => Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNegative(value: (TagMod[Any], ReadonlyToastProps) => Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negative")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPositive(value: (TagMod[Any], ReadonlyToastProps) => Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positive")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withShow(value: (TagMod[Any], ReadonlyToastProps) => Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (Key, ReadonlyToastProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWarning(value: (TagMod[Any], ReadonlyToastProps) => Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

