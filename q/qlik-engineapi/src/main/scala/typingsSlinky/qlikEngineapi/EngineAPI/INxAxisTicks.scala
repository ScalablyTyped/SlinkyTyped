package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container for the dynamic properties of an attribute expression.
  */
@js.native
trait INxAxisTicks extends js.Object {
  /**
    * Name of the derived definition.
    */
  var qName: String = js.native
  /**
    * List of tags.
    */
  var qTags: js.Array[String] = js.native
  /**
    * List of ticks.
    */
  var qTicks: js.Array[INxTickCell] = js.native
}

object INxAxisTicks {
  @scala.inline
  def apply(qName: String, qTags: js.Array[String], qTicks: js.Array[INxTickCell]): INxAxisTicks = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any], qTicks = qTicks.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAxisTicks]
  }
  @scala.inline
  implicit class INxAxisTicksOps[Self <: INxAxisTicks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTicks(value: js.Array[INxTickCell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTicks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

