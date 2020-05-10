package typingsSlinky.dojo.dojox.charting.scaler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/scaler/common.html
  *
  *
  */
@js.native
trait common extends js.Object {
  /**
    *
    * @param moduleName
    * @param ifloaded
    * @param ifnotloaded
    */
  def doIfLoaded(moduleName: js.Any, ifloaded: js.Any, ifnotloaded: js.Any): js.Any = js.native
  /**
    *
    * @param number
    * @param precision
    * @param kwArgs
    */
  def getNumericLabel(number: Double, precision: Double, kwArgs: js.Object): js.Any = js.native
}

object common {
  @scala.inline
  def apply(
    doIfLoaded: (js.Any, js.Any, js.Any) => js.Any,
    getNumericLabel: (Double, Double, js.Object) => js.Any
  ): common = {
    val __obj = js.Dynamic.literal(doIfLoaded = js.Any.fromFunction3(doIfLoaded), getNumericLabel = js.Any.fromFunction3(getNumericLabel))
    __obj.asInstanceOf[common]
  }
  @scala.inline
  implicit class commonOps[Self <: common] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoIfLoaded(value: (js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doIfLoaded")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetNumericLabel(value: (Double, Double, js.Object) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumericLabel")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

