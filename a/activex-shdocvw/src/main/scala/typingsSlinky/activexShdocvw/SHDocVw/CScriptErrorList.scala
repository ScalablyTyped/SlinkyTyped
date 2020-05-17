package typingsSlinky.activexShdocvw.SHDocVw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CScriptErrorList extends js.Object {
  @JSName("SHDocVw.CScriptErrorList_typekey")
  var SHDocVwDotCScriptErrorList_typekey: CScriptErrorList = js.native
  def advanceError(): Unit = js.native
  def canAdvanceError(): Double = js.native
  def canRetreatError(): Double = js.native
  def getAlwaysShowLockState(): Double = js.native
  def getDetailsPaneOpen(): Double = js.native
  def getErrorChar(): Double = js.native
  def getErrorCode(): Double = js.native
  def getErrorLine(): Double = js.native
  def getErrorMsg(): String = js.native
  def getErrorUrl(): String = js.native
  def getPerErrorDisplay(): Double = js.native
  def retreatError(): Unit = js.native
  def setDetailsPaneOpen(fDetailsPaneOpen: Double): Unit = js.native
  def setPerErrorDisplay(fPerErrorDisplay: Double): Unit = js.native
}

object CScriptErrorList {
  @scala.inline
  def apply(
    SHDocVwDotCScriptErrorList_typekey: CScriptErrorList,
    advanceError: () => Unit,
    canAdvanceError: () => Double,
    canRetreatError: () => Double,
    getAlwaysShowLockState: () => Double,
    getDetailsPaneOpen: () => Double,
    getErrorChar: () => Double,
    getErrorCode: () => Double,
    getErrorLine: () => Double,
    getErrorMsg: () => String,
    getErrorUrl: () => String,
    getPerErrorDisplay: () => Double,
    retreatError: () => Unit,
    setDetailsPaneOpen: Double => Unit,
    setPerErrorDisplay: Double => Unit
  ): CScriptErrorList = {
    val __obj = js.Dynamic.literal(advanceError = js.Any.fromFunction0(advanceError), canAdvanceError = js.Any.fromFunction0(canAdvanceError), canRetreatError = js.Any.fromFunction0(canRetreatError), getAlwaysShowLockState = js.Any.fromFunction0(getAlwaysShowLockState), getDetailsPaneOpen = js.Any.fromFunction0(getDetailsPaneOpen), getErrorChar = js.Any.fromFunction0(getErrorChar), getErrorCode = js.Any.fromFunction0(getErrorCode), getErrorLine = js.Any.fromFunction0(getErrorLine), getErrorMsg = js.Any.fromFunction0(getErrorMsg), getErrorUrl = js.Any.fromFunction0(getErrorUrl), getPerErrorDisplay = js.Any.fromFunction0(getPerErrorDisplay), retreatError = js.Any.fromFunction0(retreatError), setDetailsPaneOpen = js.Any.fromFunction1(setDetailsPaneOpen), setPerErrorDisplay = js.Any.fromFunction1(setPerErrorDisplay))
    __obj.updateDynamic("SHDocVw.CScriptErrorList_typekey")(SHDocVwDotCScriptErrorList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CScriptErrorList]
  }
  @scala.inline
  implicit class CScriptErrorListOps[Self <: CScriptErrorList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSHDocVwDotCScriptErrorList_typekey(value: CScriptErrorList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHDocVw.CScriptErrorList_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdvanceError(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advanceError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCanAdvanceError(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canAdvanceError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCanRetreatError(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRetreatError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAlwaysShowLockState(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAlwaysShowLockState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDetailsPaneOpen(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDetailsPaneOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetErrorChar(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getErrorChar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetErrorCode(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getErrorCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetErrorLine(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getErrorLine")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetErrorMsg(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getErrorMsg")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetErrorUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getErrorUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPerErrorDisplay(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPerErrorDisplay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRetreatError(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retreatError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDetailsPaneOpen(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDetailsPaneOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPerErrorDisplay(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPerErrorDisplay")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

