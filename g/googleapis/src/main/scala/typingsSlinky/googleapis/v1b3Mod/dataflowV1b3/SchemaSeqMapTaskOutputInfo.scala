package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about an output of a SeqMapTask.
  */
@js.native
trait SchemaSeqMapTaskOutputInfo extends js.Object {
  /**
    * The sink to write the output value to.
    */
  var sink: js.UndefOr[SchemaSink] = js.native
  /**
    * The id of the TupleTag the user code will tag the output value by.
    */
  var tag: js.UndefOr[String] = js.native
}

object SchemaSeqMapTaskOutputInfo {
  @scala.inline
  def apply(): SchemaSeqMapTaskOutputInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeqMapTaskOutputInfo]
  }
  @scala.inline
  implicit class SchemaSeqMapTaskOutputInfoOps[Self <: SchemaSeqMapTaskOutputInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSink(value: SchemaSink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sink")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
  }
  
}

