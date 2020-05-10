package typingsSlinky.ibmMobilefirst.WL.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcedureInvocationData extends js.Object {
  var adapter: String = js.native
  var compressResponse: js.UndefOr[Boolean] = js.native
  var parameters: js.UndefOr[js.Array[_]] = js.native
  var procedure: String = js.native
}

object ProcedureInvocationData {
  @scala.inline
  def apply(adapter: String, procedure: String): ProcedureInvocationData = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcedureInvocationData]
  }
  @scala.inline
  implicit class ProcedureInvocationDataOps[Self <: ProcedureInvocationData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdapter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcedure(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("procedure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompressResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompressResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
  }
  
}

