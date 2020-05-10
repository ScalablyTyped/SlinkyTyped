package typingsSlinky.agGrid.iAggFuncServiceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.agGrid.colDefMod.IAggFunc
import typingsSlinky.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAggFuncService extends js.Object {
  def addAggFunc(key: String, aggFunc: IAggFunc): Unit = js.native
  def addAggFuncs(aggFuncs: StringDictionary[IAggFunc]): Unit = js.native
  def clear(): Unit = js.native
  def getDefaultAggFunc(column: Column): String = js.native
}

object IAggFuncService {
  @scala.inline
  def apply(
    addAggFunc: (String, IAggFunc) => Unit,
    addAggFuncs: StringDictionary[IAggFunc] => Unit,
    clear: () => Unit,
    getDefaultAggFunc: Column => String
  ): IAggFuncService = {
    val __obj = js.Dynamic.literal(addAggFunc = js.Any.fromFunction2(addAggFunc), addAggFuncs = js.Any.fromFunction1(addAggFuncs), clear = js.Any.fromFunction0(clear), getDefaultAggFunc = js.Any.fromFunction1(getDefaultAggFunc))
    __obj.asInstanceOf[IAggFuncService]
  }
  @scala.inline
  implicit class IAggFuncServiceOps[Self <: IAggFuncService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddAggFunc(value: (String, IAggFunc) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAggFunc")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddAggFuncs(value: StringDictionary[IAggFunc] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAggFuncs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDefaultAggFunc(value: Column => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultAggFunc")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

