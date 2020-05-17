package typingsSlinky.activexLibreoffice.com_.sun.star.java_

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * must be implemented by the user of the {@link XJavaThreadRegister_11} .
  * @deprecated Deprecated
  */
@js.native
trait XJavaThreadRegister11 extends XInterface {
  /** returns `TRUE` if the current thread is already attached to the VM otherwise `FALSE` . */
  def isThreadAttached(): Boolean = js.native
  /**
    * registers the current thread.
    *
    * This method should be called every time a JNI function is called from Java.
    */
  def registerThread(): Unit = js.native
  /**
    * revokes the current thread from the list of registered threads.
    *
    * This method should be called at the end of every JNI call from Java.
    */
  def revokeThread(): Unit = js.native
}

object XJavaThreadRegister11 {
  @scala.inline
  def apply(
    acquire: () => Unit,
    isThreadAttached: () => Boolean,
    queryInterface: `type` => js.Any,
    registerThread: () => Unit,
    release: () => Unit,
    revokeThread: () => Unit
  ): XJavaThreadRegister11 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), isThreadAttached = js.Any.fromFunction0(isThreadAttached), queryInterface = js.Any.fromFunction1(queryInterface), registerThread = js.Any.fromFunction0(registerThread), release = js.Any.fromFunction0(release), revokeThread = js.Any.fromFunction0(revokeThread))
    __obj.asInstanceOf[XJavaThreadRegister11]
  }
  @scala.inline
  implicit class XJavaThreadRegister11Ops[Self <: XJavaThreadRegister11] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsThreadAttached(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isThreadAttached")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegisterThread(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerThread")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRevokeThread(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revokeThread")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

