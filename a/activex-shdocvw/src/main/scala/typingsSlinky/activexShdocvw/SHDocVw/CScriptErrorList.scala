package typingsSlinky.activexShdocvw.SHDocVw

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CScriptErrorList extends StObject {
  
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
  implicit class CScriptErrorListMutableBuilder[Self <: CScriptErrorList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvanceError(value: () => Unit): Self = StObject.set(x, "advanceError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCanAdvanceError(value: () => Double): Self = StObject.set(x, "canAdvanceError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCanRetreatError(value: () => Double): Self = StObject.set(x, "canRetreatError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAlwaysShowLockState(value: () => Double): Self = StObject.set(x, "getAlwaysShowLockState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDetailsPaneOpen(value: () => Double): Self = StObject.set(x, "getDetailsPaneOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetErrorChar(value: () => Double): Self = StObject.set(x, "getErrorChar", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetErrorCode(value: () => Double): Self = StObject.set(x, "getErrorCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetErrorLine(value: () => Double): Self = StObject.set(x, "getErrorLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetErrorMsg(value: () => String): Self = StObject.set(x, "getErrorMsg", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetErrorUrl(value: () => String): Self = StObject.set(x, "getErrorUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPerErrorDisplay(value: () => Double): Self = StObject.set(x, "getPerErrorDisplay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRetreatError(value: () => Unit): Self = StObject.set(x, "retreatError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSHDocVwDotCScriptErrorList_typekey(value: CScriptErrorList): Self = StObject.set(x, "SHDocVw.CScriptErrorList_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDetailsPaneOpen(value: Double => Unit): Self = StObject.set(x, "setDetailsPaneOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPerErrorDisplay(value: Double => Unit): Self = StObject.set(x, "setPerErrorDisplay", js.Any.fromFunction1(value))
  }
}
