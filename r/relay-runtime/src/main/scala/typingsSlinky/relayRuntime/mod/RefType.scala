package typingsSlinky.relayRuntime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefType[Ref /* <: String */] extends js.Object {
  @JSName(" $refType")
  var Space$refType: Ref = js.native
}

object RefType {
  @scala.inline
  def apply[Ref](Space$refType: Ref): RefType[Ref] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(" $refType")(Space$refType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefType[Ref]]
  }
  @scala.inline
  implicit class RefTypeOps[Self[ref] <: RefType[ref], Ref] (val x: Self[Ref]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Ref] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Ref]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Ref] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Ref] with Other]
    @scala.inline
    def withSpace$refType(value: Ref): Self[Ref] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(" $refType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

