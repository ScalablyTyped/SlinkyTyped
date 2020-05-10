package typingsSlinky.mockFs.itemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A filesystem item.
  */
@js.native
trait Item extends js.Object {
  /**  Returns whether the current user has execute permission. */
  def canExecute(): Boolean = js.native
  /** Returns whether the current user has read permission. */
  def canRead(): Boolean = js.native
  /** Returns whether the current user has write permission. */
  def canWrite(): Boolean = js.native
  /** Get access time. */
  def getATime(): js.Date = js.native
  /** Get birth time. */
  def getBirthtime(): js.Date = js.native
  /** Get change time. */
  def getCTime(): js.Date = js.native
  /** Get group id. */
  def getGid(): Double = js.native
  /** Get modification time. */
  def getMTime(): js.Date = js.native
  /** Get mode (permission only, e.g 0666). */
  def getMode(): Double = js.native
  /** Get item stats. */
  def getStats(): Stats = js.native
  /** Get user id. */
  def getUid(): Double = js.native
  /** Set access time. */
  def setATime(atime: js.Date): Unit = js.native
  /** Set birth time. */
  def setBirthtime(birthtime: js.Date): Unit = js.native
  /** Set change time. */
  def setCTime(ctime: js.Date): Unit = js.native
  /** Set group id. */
  def setGid(gid: Double): Unit = js.native
  /** Set modification time. */
  def setMTime(mtime: js.Date): Unit = js.native
  /** Set mode (permission only, e.g 0666). */
  def setMode(mode: Double): Unit = js.native
  /** Set user id. */
  def setUid(uid: Double): Unit = js.native
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
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanExecute(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canExecute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCanRead(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRead")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCanWrite(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canWrite")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetATime(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getATime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBirthtime(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBirthtime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCTime(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGid(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMTime(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMode(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStats(value: () => Stats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStats")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUid(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetATime(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setATime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetBirthtime(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBirthtime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetCTime(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCTime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetGid(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGid")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMTime(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMTime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMode(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetUid(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUid")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

