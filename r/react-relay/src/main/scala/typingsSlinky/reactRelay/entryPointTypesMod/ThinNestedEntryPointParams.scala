package typingsSlinky.reactRelay.entryPointTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  entryPoint  :TEntryPoint,   entryPointParams  :TEntryPointParams}> */
@js.native
trait ThinNestedEntryPointParams[TEntryPointParams, TEntryPoint] extends js.Object {
  val entryPoint: TEntryPoint = js.native
  val entryPointParams: TEntryPointParams = js.native
}

object ThinNestedEntryPointParams {
  @scala.inline
  def apply[TEntryPointParams, TEntryPoint](entryPoint: TEntryPoint, entryPointParams: TEntryPointParams): ThinNestedEntryPointParams[TEntryPointParams, TEntryPoint] = {
    val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], entryPointParams = entryPointParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThinNestedEntryPointParams[TEntryPointParams, TEntryPoint]]
  }
  @scala.inline
  implicit class ThinNestedEntryPointParamsOps[Self[tentrypointparams, tentrypoint] <: ThinNestedEntryPointParams[tentrypointparams, tentrypoint], TEntryPointParams, TEntryPoint] (val x: Self[TEntryPointParams, TEntryPoint]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEntryPointParams, TEntryPoint] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEntryPointParams, TEntryPoint]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TEntryPointParams, TEntryPoint]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TEntryPointParams, TEntryPoint]) with Other]
    @scala.inline
    def withEntryPoint(value: TEntryPoint): Self[TEntryPointParams, TEntryPoint] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntryPointParams(value: TEntryPointParams): Self[TEntryPointParams, TEntryPoint] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPointParams")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

