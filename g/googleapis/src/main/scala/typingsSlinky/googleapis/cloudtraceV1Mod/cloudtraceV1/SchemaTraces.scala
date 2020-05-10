package typingsSlinky.googleapis.cloudtraceV1Mod.cloudtraceV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of new or updated traces.
  */
@js.native
trait SchemaTraces extends js.Object {
  /**
    * List of traces.
    */
  var traces: js.UndefOr[js.Array[SchemaTrace]] = js.native
}

object SchemaTraces {
  @scala.inline
  def apply(): SchemaTraces = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTraces]
  }
  @scala.inline
  implicit class SchemaTracesOps[Self <: SchemaTraces] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTraces(value: js.Array[SchemaTrace]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traces")(js.undefined)
        ret
    }
  }
  
}

