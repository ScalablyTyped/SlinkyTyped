package typingsSlinky.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallSite extends js.Object {
  /**
    * Current column number [if this function was defined in a script]
    */
  def getColumnNumber(): Double | Null = js.native
  /**
    * A call site object representing the location where eval was called
    * [if this function was created using a call to eval]
    */
  def getEvalOrigin(): js.UndefOr[String] = js.native
  /**
    * Name of the script [if this function was defined in a script]
    */
  def getFileName(): String | Null = js.native
  /**
    * Current function
    */
  def getFunction(): js.UndefOr[js.Function] = js.native
  /**
    * Name of the current function, typically its name property.
    * If a name property is not available an attempt will be made to try
    * to infer a name from the function's context.
    */
  def getFunctionName(): String | Null = js.native
  /**
    * Current line number [if this function was defined in a script]
    */
  def getLineNumber(): Double | Null = js.native
  /**
    * Name of the property [of "this" or one of its prototypes] that holds
    * the current function
    */
  def getMethodName(): String | Null = js.native
  /**
    * Value of "this"
    */
  def getThis(): js.Any = js.native
  /**
    * Type of "this" as a string.
    * This is the name of the function stored in the constructor field of
    * "this", if available.  Otherwise the object's [[Class]] internal
    * property.
    */
  def getTypeName(): String | Null = js.native
  /**
    * Is this a constructor call?
    */
  def isConstructor(): Boolean = js.native
  /**
    * Does this call take place in code defined by a call to eval?
    */
  def isEval(): Boolean = js.native
  /**
    * Is this call in native V8 code?
    */
  def isNative(): Boolean = js.native
  /**
    * Is this a toplevel invocation, that is, is "this" the global object?
    */
  def isToplevel(): Boolean = js.native
}

object CallSite {
  @scala.inline
  def apply(
    getColumnNumber: () => Double | Null,
    getEvalOrigin: () => js.UndefOr[String],
    getFileName: () => String | Null,
    getFunction: () => js.UndefOr[js.Function],
    getFunctionName: () => String | Null,
    getLineNumber: () => Double | Null,
    getMethodName: () => String | Null,
    getThis: () => js.Any,
    getTypeName: () => String | Null,
    isConstructor: () => Boolean,
    isEval: () => Boolean,
    isNative: () => Boolean,
    isToplevel: () => Boolean
  ): CallSite = {
    val __obj = js.Dynamic.literal(getColumnNumber = js.Any.fromFunction0(getColumnNumber), getEvalOrigin = js.Any.fromFunction0(getEvalOrigin), getFileName = js.Any.fromFunction0(getFileName), getFunction = js.Any.fromFunction0(getFunction), getFunctionName = js.Any.fromFunction0(getFunctionName), getLineNumber = js.Any.fromFunction0(getLineNumber), getMethodName = js.Any.fromFunction0(getMethodName), getThis = js.Any.fromFunction0(getThis), getTypeName = js.Any.fromFunction0(getTypeName), isConstructor = js.Any.fromFunction0(isConstructor), isEval = js.Any.fromFunction0(isEval), isNative = js.Any.fromFunction0(isNative), isToplevel = js.Any.fromFunction0(isToplevel))
    __obj.asInstanceOf[CallSite]
  }
  @scala.inline
  implicit class CallSiteOps[Self <: CallSite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetColumnNumber(value: () => Double | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnNumber")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEvalOrigin(value: () => js.UndefOr[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEvalOrigin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFileName(value: () => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFileName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFunction(value: () => js.UndefOr[js.Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFunction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFunctionName(value: () => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFunctionName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLineNumber(value: () => Double | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLineNumber")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMethodName(value: () => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMethodName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetThis(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThis")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTypeName(value: () => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTypeName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsConstructor(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConstructor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEval(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEval")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsNative(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNative")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsToplevel(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isToplevel")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

