package typingsSlinky.node.inspectorMod.NodeTracing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraceConfig extends js.Object {
  /**
    * Included category filters.
    */
  var includedCategories: js.Array[String] = js.native
  /**
    * Controls how the trace buffer stores data.
    */
  var recordMode: js.UndefOr[String] = js.native
}

object TraceConfig {
  @scala.inline
  def apply(includedCategories: js.Array[String]): TraceConfig = {
    val __obj = js.Dynamic.literal(includedCategories = includedCategories.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraceConfig]
  }
  @scala.inline
  implicit class TraceConfigOps[Self <: TraceConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludedCategories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includedCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordMode")(js.undefined)
        ret
    }
  }
  
}

