package typingsSlinky.relayRuntime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _FragmentRefs[Refs /* <: String */] extends js.Object {
  @JSName(" $fragmentRefs")
  var Space$fragmentRefs: FragmentRefs[Refs] = js.native
}

object _FragmentRefs {
  @scala.inline
  def apply[Refs](Space$fragmentRefs: FragmentRefs[Refs]): _FragmentRefs[Refs] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(" $fragmentRefs")(Space$fragmentRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[_FragmentRefs[Refs]]
  }
  @scala.inline
  implicit class _FragmentRefsOps[Self[refs] <: _FragmentRefs[refs], Refs] (val x: Self[Refs]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Refs] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Refs]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Refs] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Refs] with Other]
    @scala.inline
    def withSpace$fragmentRefs(value: FragmentRefs[Refs]): Self[Refs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(" $fragmentRefs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

