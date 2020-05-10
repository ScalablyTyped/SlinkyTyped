package typingsSlinky.fridaGum.Java

import typingsSlinky.fridaGum.NativePointer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumerateLoadedClassesCallbacks extends js.Object {
  /**
    * Called when all loaded classes have been enumerated.
    */
  def onComplete(): Unit = js.native
  /**
    * Called with the name of each currently loaded class, and a JNI
    * reference for its Java Class object.
    *
    * Pass the `name` to `Java.use()` to get a JavaScript wrapper.
    * You may also `Java.cast()` the `handle` to `java.lang.Class`.
    */
  def onMatch(name: String, handle: NativePointer): Unit = js.native
}

object EnumerateLoadedClassesCallbacks {
  @scala.inline
  def apply(onComplete: () => Unit, onMatch: (String, NativePointer) => Unit): EnumerateLoadedClassesCallbacks = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onMatch = js.Any.fromFunction2(onMatch))
    __obj.asInstanceOf[EnumerateLoadedClassesCallbacks]
  }
  @scala.inline
  implicit class EnumerateLoadedClassesCallbacksOps[Self <: EnumerateLoadedClassesCallbacks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnMatch(value: (String, NativePointer) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMatch")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

