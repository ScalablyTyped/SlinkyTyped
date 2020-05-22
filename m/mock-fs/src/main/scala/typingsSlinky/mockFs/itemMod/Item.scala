package typingsSlinky.mockFs.itemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A filesystem item.
  */
trait Item extends js.Object {
  /**  Returns whether the current user has execute permission. */
  def canExecute(): Boolean
  /** Returns whether the current user has read permission. */
  def canRead(): Boolean
  /** Returns whether the current user has write permission. */
  def canWrite(): Boolean
  /** Get access time. */
  def getATime(): js.Date
  /** Get birth time. */
  def getBirthtime(): js.Date
  /** Get change time. */
  def getCTime(): js.Date
  /** Get group id. */
  def getGid(): Double
  /** Get modification time. */
  def getMTime(): js.Date
  /** Get mode (permission only, e.g 0666). */
  def getMode(): Double
  /** Get item stats. */
  def getStats(): Stats
  /** Get user id. */
  def getUid(): Double
  /** Set access time. */
  def setATime(atime: js.Date): Unit
  /** Set birth time. */
  def setBirthtime(birthtime: js.Date): Unit
  /** Set change time. */
  def setCTime(ctime: js.Date): Unit
  /** Set group id. */
  def setGid(gid: Double): Unit
  /** Set modification time. */
  def setMTime(mtime: js.Date): Unit
  /** Set mode (permission only, e.g 0666). */
  def setMode(mode: Double): Unit
  /** Set user id. */
  def setUid(uid: Double): Unit
}

object Item {
  @scala.inline
  def apply(
    canExecute: () => Boolean,
    canRead: () => Boolean,
    canWrite: () => Boolean,
    getATime: () => js.Date,
    getBirthtime: () => js.Date,
    getCTime: () => js.Date,
    getGid: () => Double,
    getMTime: () => js.Date,
    getMode: () => Double,
    getStats: () => Stats,
    getUid: () => Double,
    setATime: js.Date => Unit,
    setBirthtime: js.Date => Unit,
    setCTime: js.Date => Unit,
    setGid: Double => Unit,
    setMTime: js.Date => Unit,
    setMode: Double => Unit,
    setUid: Double => Unit
  ): Item = {
    val __obj = js.Dynamic.literal(canExecute = js.Any.fromFunction0(canExecute), canRead = js.Any.fromFunction0(canRead), canWrite = js.Any.fromFunction0(canWrite), getATime = js.Any.fromFunction0(getATime), getBirthtime = js.Any.fromFunction0(getBirthtime), getCTime = js.Any.fromFunction0(getCTime), getGid = js.Any.fromFunction0(getGid), getMTime = js.Any.fromFunction0(getMTime), getMode = js.Any.fromFunction0(getMode), getStats = js.Any.fromFunction0(getStats), getUid = js.Any.fromFunction0(getUid), setATime = js.Any.fromFunction1(setATime), setBirthtime = js.Any.fromFunction1(setBirthtime), setCTime = js.Any.fromFunction1(setCTime), setGid = js.Any.fromFunction1(setGid), setMTime = js.Any.fromFunction1(setMTime), setMode = js.Any.fromFunction1(setMode), setUid = js.Any.fromFunction1(setUid))
    __obj.asInstanceOf[Item]
  }
}

