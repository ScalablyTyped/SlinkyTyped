package typingsSlinky.googleAppsScript.GoogleAppsScript.Lock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Prevents concurrent access to sections of code. This can be useful when you have multiple users
  * or processes modifying a shared resource and want to prevent collisions.
  */
trait LockService extends js.Object {
  def getDocumentLock(): typingsSlinky.googleAppsScript.GoogleAppsScript.Lock.Lock
  def getScriptLock(): typingsSlinky.googleAppsScript.GoogleAppsScript.Lock.Lock
  def getUserLock(): typingsSlinky.googleAppsScript.GoogleAppsScript.Lock.Lock
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
}

