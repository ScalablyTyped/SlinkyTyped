package typingsSlinky.casperjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withBetterTypeOf(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("betterTypeOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDump(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dump")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFileExt(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFillBlanks(value: (String, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillBlanks")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFormat(value: (String, /* repeated */ js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetPropertyPath(value: (js.Any, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPropertyPath")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInherits(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherits")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsArray(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isArray")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsCasperObject(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCasperObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsClipRect(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClipRect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsFalsy(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFalsy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsFunction(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsJsFile(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isJsFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsNull(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNull")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsNumber(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNumber")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsObject(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsRegExp(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRegExp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsString(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsTruthy(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTruthy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsType(value: (js.Any, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isType")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsUndefined(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUndefined")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsWebPage(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWebPage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMergeObjects(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeObjects")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNode(value: (String, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSerialize(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnique(value: js.Array[_] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

