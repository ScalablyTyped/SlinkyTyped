package typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FragmentPointer extends js.Object {
  var __fragmentOwner: RequestDescriptor
  var __fragments: StringDictionary[Variables]
  var __id: DataID
}

object FragmentPointer {
  @scala.inline
  def apply(__fragmentOwner: RequestDescriptor, __fragments: StringDictionary[Variables], __id: DataID): FragmentPointer = {
    val __obj = js.Dynamic.literal(__fragmentOwner = __fragmentOwner.asInstanceOf[js.Any], __fragments = __fragments.asInstanceOf[js.Any], __id = __id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FragmentPointer]
  }
}

