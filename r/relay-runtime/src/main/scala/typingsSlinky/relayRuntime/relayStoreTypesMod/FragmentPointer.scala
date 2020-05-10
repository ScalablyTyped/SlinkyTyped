package typingsSlinky.relayRuntime.relayStoreTypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.DataID
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FragmentPointer extends js.Object {
  var __fragmentOwner: RequestDescriptor = js.native
  var __fragments: StringDictionary[Variables] = js.native
  var __id: DataID = js.native
}

object FragmentPointer {
  @scala.inline
  def apply(__fragmentOwner: RequestDescriptor, __fragments: StringDictionary[Variables], __id: DataID): FragmentPointer = {
    val __obj = js.Dynamic.literal(__fragmentOwner = __fragmentOwner.asInstanceOf[js.Any], __fragments = __fragments.asInstanceOf[js.Any], __id = __id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentPointer]
  }
  @scala.inline
  implicit class FragmentPointerOps[Self <: FragmentPointer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__fragmentOwner(value: RequestDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__fragmentOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with__fragments(value: StringDictionary[Variables]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__fragments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with__id(value: DataID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

