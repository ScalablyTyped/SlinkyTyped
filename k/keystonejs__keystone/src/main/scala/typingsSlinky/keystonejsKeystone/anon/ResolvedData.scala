package typingsSlinky.keystonejsKeystone.anon

import typingsSlinky.keystonejsKeystone.mod.KeyValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedData[FieldNames /* <: String */] extends js.Object {
  var resolvedData: KeyValues[FieldNames, _] = js.native
}

object ResolvedData {
  @scala.inline
  def apply[FieldNames](resolvedData: KeyValues[FieldNames, _]): ResolvedData[FieldNames] = {
    val __obj = js.Dynamic.literal(resolvedData = resolvedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedData[FieldNames]]
  }
  @scala.inline
  implicit class ResolvedDataOps[Self[fieldnames] <: ResolvedData[fieldnames], FieldNames] (val x: Self[FieldNames]) extends AnyVal {
    @scala.inline
    def duplicate: Self[FieldNames] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[FieldNames]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[FieldNames] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[FieldNames] with Other]
    @scala.inline
    def withResolvedData(value: KeyValues[FieldNames, _]): Self[FieldNames] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

