package typingsSlinky.googleAppsScript.GoogleAppsScript.Lock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Prevents concurrent access to sections of code. This can be useful when you have multiple users
  * or processes modifying a shared resource and want to prevent collisions.
  */
@js.native
trait LockService extends js.Object {
  def getDocumentLock(): typingsSlinky.googleAppsScript.GoogleAppsScript.Lock.Lock = js.native
  def getScriptLock(): typingsSlinky.googleAppsScript.GoogleAppsScript.Lock.Lock = js.native
  def getUserLock(): typingsSlinky.googleAppsScript.GoogleAppsScript.Lock.Lock = js.native
}

object LockService {
  @scala.inline
  def apply(
    getDocumentLock: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Lock.Lock,
    getScriptLock: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Lock.Lock,
    getUserLock: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Lock.Lock
  ): LockService = {
    val __obj = js.Dynamic.literal(getDocumentLock = js.Any.fromFunction0(getDocumentLock), getScriptLock = js.Any.fromFunction0(getScriptLock), getUserLock = js.Any.fromFunction0(getUserLock))
    __obj.asInstanceOf[LockService]
  }
  @scala.inline
  implicit class LockServiceOps[Self <: LockService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDocumentLock(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Lock.Lock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDocumentLock")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScriptLock(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Lock.Lock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScriptLock")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUserLock(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Lock.Lock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserLock")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

