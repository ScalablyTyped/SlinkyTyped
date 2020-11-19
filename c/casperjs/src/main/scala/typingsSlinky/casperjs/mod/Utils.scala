package typingsSlinky.casperjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Utils extends js.Object {
  
  def betterTypeOf(input: js.Any): js.Any = js.native
  
  def dump(value: js.Any): js.Any = js.native
  
  def fileExt(file: String): js.Any = js.native
  
  def fillBlanks(text: String, pad: Double): js.Any = js.native
  
  def format(f: String, args: js.Any*): js.Any = js.native
  
  def getPropertyPath(obj: js.Any, path: String): js.Any = js.native
  
  def inherits(ctor: js.Any, superCtor: js.Any): js.Any = js.native
  
  def isArray(value: js.Any): js.Any = js.native
  
  def isCasperObject(value: js.Any): js.Any = js.native
  
  def isClipRect(value: js.Any): js.Any = js.native
  
  def isFalsy(subject: js.Any): js.Any = js.native
  
  def isFunction(value: js.Any): js.Any = js.native
  
  def isJsFile(file: String): js.Any = js.native
  
  def isNull(value: js.Any): js.Any = js.native
  
  def isNumber(value: js.Any): js.Any = js.native
  
  def isObject(value: js.Any): js.Any = js.native
  
  def isRegExp(value: js.Any): js.Any = js.native
  
  def isString(value: js.Any): js.Any = js.native
  
  def isTruthy(subject: js.Any): js.Any = js.native
  
  def isType(what: js.Any, `type`: String): js.Any = js.native
  
  def isUndefined(value: js.Any): js.Any = js.native
  
  def isWebPage(what: js.Any): js.Any = js.native
  
  def mergeObjects(origin: js.Any, add: js.Any): js.Any = js.native
  
  def node(name: String, attributes: js.Any): js.Any = js.native
  
  def serialize(value: js.Any): js.Any = js.native
  
  def unique(array: js.Array[_]): js.Any = js.native
}
object Utils {
  
  @scala.inline
  def apply(
    betterTypeOf: js.Any => js.Any,
    dump: js.Any => js.Any,
    fileExt: String => js.Any,
    fillBlanks: (String, Double) => js.Any,
    format: (String, /* repeated */ js.Any) => js.Any,
    getPropertyPath: (js.Any, String) => js.Any,
    inherits: (js.Any, js.Any) => js.Any,
    isArray: js.Any => js.Any,
    isCasperObject: js.Any => js.Any,
    isClipRect: js.Any => js.Any,
    isFalsy: js.Any => js.Any,
    isFunction: js.Any => js.Any,
    isJsFile: String => js.Any,
    isNull: js.Any => js.Any,
    isNumber: js.Any => js.Any,
    isObject: js.Any => js.Any,
    isRegExp: js.Any => js.Any,
    isString: js.Any => js.Any,
    isTruthy: js.Any => js.Any,
    isType: (js.Any, String) => js.Any,
    isUndefined: js.Any => js.Any,
    isWebPage: js.Any => js.Any,
    mergeObjects: (js.Any, js.Any) => js.Any,
    node: (String, js.Any) => js.Any,
    serialize: js.Any => js.Any,
    unique: js.Array[_] => js.Any
  ): Utils = {
    val __obj = js.Dynamic.literal(betterTypeOf = js.Any.fromFunction1(betterTypeOf), dump = js.Any.fromFunction1(dump), fileExt = js.Any.fromFunction1(fileExt), fillBlanks = js.Any.fromFunction2(fillBlanks), format = js.Any.fromFunction2(format), getPropertyPath = js.Any.fromFunction2(getPropertyPath), inherits = js.Any.fromFunction2(inherits), isArray = js.Any.fromFunction1(isArray), isCasperObject = js.Any.fromFunction1(isCasperObject), isClipRect = js.Any.fromFunction1(isClipRect), isFalsy = js.Any.fromFunction1(isFalsy), isFunction = js.Any.fromFunction1(isFunction), isJsFile = js.Any.fromFunction1(isJsFile), isNull = js.Any.fromFunction1(isNull), isNumber = js.Any.fromFunction1(isNumber), isObject = js.Any.fromFunction1(isObject), isRegExp = js.Any.fromFunction1(isRegExp), isString = js.Any.fromFunction1(isString), isTruthy = js.Any.fromFunction1(isTruthy), isType = js.Any.fromFunction2(isType), isUndefined = js.Any.fromFunction1(isUndefined), isWebPage = js.Any.fromFunction1(isWebPage), mergeObjects = js.Any.fromFunction2(mergeObjects), node = js.Any.fromFunction2(node), serialize = js.Any.fromFunction1(serialize), unique = js.Any.fromFunction1(unique))
    __obj.asInstanceOf[Utils]
  }
  
  @scala.inline
  implicit class UtilsOps[Self <: Utils] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBetterTypeOf(value: js.Any => js.Any): Self = this.set("betterTypeOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDump(value: js.Any => js.Any): Self = this.set("dump", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFileExt(value: String => js.Any): Self = this.set("fileExt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFillBlanks(value: (String, Double) => js.Any): Self = this.set("fillBlanks", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormat(value: (String, /* repeated */ js.Any) => js.Any): Self = this.set("format", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetPropertyPath(value: (js.Any, String) => js.Any): Self = this.set("getPropertyPath", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInherits(value: (js.Any, js.Any) => js.Any): Self = this.set("inherits", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsArray(value: js.Any => js.Any): Self = this.set("isArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsCasperObject(value: js.Any => js.Any): Self = this.set("isCasperObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsClipRect(value: js.Any => js.Any): Self = this.set("isClipRect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsFalsy(value: js.Any => js.Any): Self = this.set("isFalsy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsFunction(value: js.Any => js.Any): Self = this.set("isFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsJsFile(value: String => js.Any): Self = this.set("isJsFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsNull(value: js.Any => js.Any): Self = this.set("isNull", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsNumber(value: js.Any => js.Any): Self = this.set("isNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsObject(value: js.Any => js.Any): Self = this.set("isObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsRegExp(value: js.Any => js.Any): Self = this.set("isRegExp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsString(value: js.Any => js.Any): Self = this.set("isString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsTruthy(value: js.Any => js.Any): Self = this.set("isTruthy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsType(value: (js.Any, String) => js.Any): Self = this.set("isType", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsUndefined(value: js.Any => js.Any): Self = this.set("isUndefined", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsWebPage(value: js.Any => js.Any): Self = this.set("isWebPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMergeObjects(value: (js.Any, js.Any) => js.Any): Self = this.set("mergeObjects", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNode(value: (String, js.Any) => js.Any): Self = this.set("node", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSerialize(value: js.Any => js.Any): Self = this.set("serialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnique(value: js.Array[_] => js.Any): Self = this.set("unique", js.Any.fromFunction1(value))
  }
}
