package typingsSlinky.fridaGum.Java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VM_ extends js.Object {
  /**
    * Gets a wrapper for the current thread's `JNIEnv`.
    *
    * Throws an exception if the current thread is not attached to the VM.
    */
  def getEnv(): Env = js.native
  /**
    * Ensures that the current thread is attached to the VM and calls `fn`.
    * (This isn't necessary in callbacks from Java.)
    *
    * @param fn Function to run while attached to the VM.
    */
  def perform(fn: js.Function0[Unit]): Unit = js.native
  /**
    * Tries to get a wrapper for the current thread's `JNIEnv`.
    *
    * Returns `null` if the current thread is not attached to the VM.
    */
  def tryGetEnv(): Env | Null = js.native
}

object VM_ {
  @scala.inline
  def apply(getEnv: () => Env, perform: js.Function0[Unit] => Unit, tryGetEnv: () => Env | Null): VM_ = {
    val __obj = js.Dynamic.literal(getEnv = js.Any.fromFunction0(getEnv), perform = js.Any.fromFunction1(perform), tryGetEnv = js.Any.fromFunction0(tryGetEnv))
    __obj.asInstanceOf[VM_]
  }
  @scala.inline
  implicit class VM_Ops[Self <: VM_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetEnv(value: () => Env): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnv")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPerform(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTryGetEnv(value: () => Env | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryGetEnv")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

