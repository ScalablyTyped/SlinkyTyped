package typingsSlinky.knockoutValidation

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutValidationUtils extends js.Object {
  def contextFor(node: Element): KnockoutValidationConfiguration = js.native
  def getConfigOptions(element: Element): KnockoutValidationConfiguration = js.native
  def getDomData(node: Element): KnockoutValidationConfiguration = js.native
  def getValue(o: js.Any): js.Any = js.native
  def hasAttribute(node: Element, attr: String): Boolean = js.native
  def insertAfter(node: Element, newNode: Element): Unit = js.native
  def isArray(o: js.Any): Boolean = js.native
  def isEmptyVal(`val`: js.Any): Boolean = js.native
  def isObject(o: js.Any): Boolean = js.native
  def isValidatable(o: js.Any): Boolean = js.native
  def newId(): Double = js.native
  def setDomData(node: Element, data: KnockoutValidationConfiguration): Unit = js.native
  def values(o: js.Any): js.Array[_] = js.native
}

object KnockoutValidationUtils {
  @scala.inline
  def apply(
    contextFor: Element => KnockoutValidationConfiguration,
    getConfigOptions: Element => KnockoutValidationConfiguration,
    getDomData: Element => KnockoutValidationConfiguration,
    getValue: js.Any => js.Any,
    hasAttribute: (Element, String) => Boolean,
    insertAfter: (Element, Element) => Unit,
    isArray: js.Any => Boolean,
    isEmptyVal: js.Any => Boolean,
    isObject: js.Any => Boolean,
    isValidatable: js.Any => Boolean,
    newId: () => Double,
    setDomData: (Element, KnockoutValidationConfiguration) => Unit,
    values: js.Any => js.Array[_]
  ): KnockoutValidationUtils = {
    val __obj = js.Dynamic.literal(contextFor = js.Any.fromFunction1(contextFor), getConfigOptions = js.Any.fromFunction1(getConfigOptions), getDomData = js.Any.fromFunction1(getDomData), getValue = js.Any.fromFunction1(getValue), hasAttribute = js.Any.fromFunction2(hasAttribute), insertAfter = js.Any.fromFunction2(insertAfter), isArray = js.Any.fromFunction1(isArray), isEmptyVal = js.Any.fromFunction1(isEmptyVal), isObject = js.Any.fromFunction1(isObject), isValidatable = js.Any.fromFunction1(isValidatable), newId = js.Any.fromFunction0(newId), setDomData = js.Any.fromFunction2(setDomData), values = js.Any.fromFunction1(values))
    __obj.asInstanceOf[KnockoutValidationUtils]
  }
  @scala.inline
  implicit class KnockoutValidationUtilsOps[Self <: KnockoutValidationUtils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextFor(value: Element => KnockoutValidationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextFor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetConfigOptions(value: Element => KnockoutValidationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConfigOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDomData(value: Element => KnockoutValidationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDomData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetValue(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasAttribute(value: (Element, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttribute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInsertAfter(value: (Element, Element) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAfter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsArray(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isArray")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEmptyVal(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmptyVal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsObject(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsValidatable(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValidatable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNewId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDomData(value: (Element, KnockoutValidationConfiguration) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDomData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withValues(value: js.Any => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

