package typingsSlinky.errorStackParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("error-stack-parser", "parse")
  @js.native
  def parse(error: js.Error): js.Array[StackFrame] = js.native
  
  @js.native
  trait StackFrame extends StObject {
    
    var args: js.UndefOr[js.Array[_]] = js.native
    
    var columnNumber: js.UndefOr[Double] = js.native
    
    var evalOrigin: js.UndefOr[StackFrame] = js.native
    
    var fileName: js.UndefOr[String] = js.native
    
    var functionName: js.UndefOr[String] = js.native
    
    def getArgs(): js.Array[_] = js.native
    
    def getColumnNumber(): Double = js.native
    
    def getEvalOrigin(): StackFrame = js.native
    
    def getFileName(): String = js.native
    
    def getFunctionName(): String = js.native
    
    def getIsConstructor(): Boolean = js.native
    
    def getIsEval(): Boolean = js.native
    
    def getIsNative(): Boolean = js.native
    
    def getIsTopLevel(): Boolean = js.native
    
    def getLineNumber(): Double = js.native
    
    def getSource(): String = js.native
    
    var isConstructor: js.UndefOr[Boolean] = js.native
    
    var isEval: js.UndefOr[Boolean] = js.native
    
    var isNative: js.UndefOr[Boolean] = js.native
    
    var isTopLevel: js.UndefOr[Boolean] = js.native
    
    var lineNumber: js.UndefOr[Double] = js.native
    
    def setArgs(): Unit = js.native
    
    def setColumnNumber(): Unit = js.native
    
    def setEvalOrigin(): Unit = js.native
    
    def setFileName(): Unit = js.native
    
    def setFunctionName(): Unit = js.native
    
    def setIsConstructor(): Unit = js.native
    
    def setIsEval(): Unit = js.native
    
    def setIsNative(): Unit = js.native
    
    def setIsTopLevel(): Unit = js.native
    
    def setLineNumber(): Unit = js.native
    
    def setSource(): Unit = js.native
    
    var source: js.UndefOr[String] = js.native
  }
  object StackFrame {
    
    @scala.inline
    def apply(
      getArgs: () => js.Array[_],
      getColumnNumber: () => Double,
      getEvalOrigin: () => StackFrame,
      getFileName: () => String,
      getFunctionName: () => String,
      getIsConstructor: () => Boolean,
      getIsEval: () => Boolean,
      getIsNative: () => Boolean,
      getIsTopLevel: () => Boolean,
      getLineNumber: () => Double,
      getSource: () => String,
      setArgs: () => Unit,
      setColumnNumber: () => Unit,
      setEvalOrigin: () => Unit,
      setFileName: () => Unit,
      setFunctionName: () => Unit,
      setIsConstructor: () => Unit,
      setIsEval: () => Unit,
      setIsNative: () => Unit,
      setIsTopLevel: () => Unit,
      setLineNumber: () => Unit,
      setSource: () => Unit
    ): StackFrame = {
      val __obj = js.Dynamic.literal(getArgs = js.Any.fromFunction0(getArgs), getColumnNumber = js.Any.fromFunction0(getColumnNumber), getEvalOrigin = js.Any.fromFunction0(getEvalOrigin), getFileName = js.Any.fromFunction0(getFileName), getFunctionName = js.Any.fromFunction0(getFunctionName), getIsConstructor = js.Any.fromFunction0(getIsConstructor), getIsEval = js.Any.fromFunction0(getIsEval), getIsNative = js.Any.fromFunction0(getIsNative), getIsTopLevel = js.Any.fromFunction0(getIsTopLevel), getLineNumber = js.Any.fromFunction0(getLineNumber), getSource = js.Any.fromFunction0(getSource), setArgs = js.Any.fromFunction0(setArgs), setColumnNumber = js.Any.fromFunction0(setColumnNumber), setEvalOrigin = js.Any.fromFunction0(setEvalOrigin), setFileName = js.Any.fromFunction0(setFileName), setFunctionName = js.Any.fromFunction0(setFunctionName), setIsConstructor = js.Any.fromFunction0(setIsConstructor), setIsEval = js.Any.fromFunction0(setIsEval), setIsNative = js.Any.fromFunction0(setIsNative), setIsTopLevel = js.Any.fromFunction0(setIsTopLevel), setLineNumber = js.Any.fromFunction0(setLineNumber), setSource = js.Any.fromFunction0(setSource))
      __obj.asInstanceOf[StackFrame]
    }
    
    @scala.inline
    implicit class StackFrameMutableBuilder[Self <: StackFrame] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
      
      @scala.inline
      def setEvalOrigin(value: StackFrame): Self = StObject.set(x, "evalOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvalOriginUndefined: Self = StObject.set(x, "evalOrigin", js.undefined)
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
      
      @scala.inline
      def setGetArgs(value: () => js.Array[_]): Self = StObject.set(x, "getArgs", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetColumnNumber(value: () => Double): Self = StObject.set(x, "getColumnNumber", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEvalOrigin(value: () => StackFrame): Self = StObject.set(x, "getEvalOrigin", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFileName(value: () => String): Self = StObject.set(x, "getFileName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFunctionName(value: () => String): Self = StObject.set(x, "getFunctionName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIsConstructor(value: () => Boolean): Self = StObject.set(x, "getIsConstructor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIsEval(value: () => Boolean): Self = StObject.set(x, "getIsEval", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIsNative(value: () => Boolean): Self = StObject.set(x, "getIsNative", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIsTopLevel(value: () => Boolean): Self = StObject.set(x, "getIsTopLevel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLineNumber(value: () => Double): Self = StObject.set(x, "getLineNumber", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSource(value: () => String): Self = StObject.set(x, "getSource", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsConstructor(value: Boolean): Self = StObject.set(x, "isConstructor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsConstructorUndefined: Self = StObject.set(x, "isConstructor", js.undefined)
      
      @scala.inline
      def setIsEval(value: Boolean): Self = StObject.set(x, "isEval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEvalUndefined: Self = StObject.set(x, "isEval", js.undefined)
      
      @scala.inline
      def setIsNative(value: Boolean): Self = StObject.set(x, "isNative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNativeUndefined: Self = StObject.set(x, "isNative", js.undefined)
      
      @scala.inline
      def setIsTopLevel(value: Boolean): Self = StObject.set(x, "isTopLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTopLevelUndefined: Self = StObject.set(x, "isTopLevel", js.undefined)
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      @scala.inline
      def setSetArgs(value: () => Unit): Self = StObject.set(x, "setArgs", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetColumnNumber(value: () => Unit): Self = StObject.set(x, "setColumnNumber", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetEvalOrigin(value: () => Unit): Self = StObject.set(x, "setEvalOrigin", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetFileName(value: () => Unit): Self = StObject.set(x, "setFileName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetFunctionName(value: () => Unit): Self = StObject.set(x, "setFunctionName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetIsConstructor(value: () => Unit): Self = StObject.set(x, "setIsConstructor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetIsEval(value: () => Unit): Self = StObject.set(x, "setIsEval", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetIsNative(value: () => Unit): Self = StObject.set(x, "setIsNative", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetIsTopLevel(value: () => Unit): Self = StObject.set(x, "setIsTopLevel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetLineNumber(value: () => Unit): Self = StObject.set(x, "setLineNumber", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetSource(value: () => Unit): Self = StObject.set(x, "setSource", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
}
