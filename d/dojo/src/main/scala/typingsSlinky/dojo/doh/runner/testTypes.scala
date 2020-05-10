package typingsSlinky.dojo.doh.runner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/doh/runner._testTypes.html
  *
  *
  */
@js.native
trait testTypes extends js.Object {
  /**
    *
    * @param group
    * @param tObj
    * @param type
    */
  def perf(group: js.Any, tObj: js.Any, `type`: js.Any): Unit = js.native
}

object testTypes {
  @scala.inline
  def apply(perf: (js.Any, js.Any, js.Any) => Unit): testTypes = {
    val __obj = js.Dynamic.literal(perf = js.Any.fromFunction3(perf))
    __obj.asInstanceOf[testTypes]
  }
  @scala.inline
  implicit class testTypesOps[Self <: testTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPerf(value: (js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perf")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

