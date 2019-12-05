package typingsSlinky.chromeDashApps.chrome.networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object onc {
  import typingsSlinky.chromeDashApps.chrome.integer
  import typingsSlinky.chromeDashApps.chrome.networking.onc._internal_.NetworkConfigBase
  import typingsSlinky.chromeDashApps.chrome.networking.onc._internal_.ObjectFunction
  import typingsSlinky.chromeDashApps.chromeDashAppsStrings.full
  import typingsSlinky.chromeDashApps.chromeDashAppsStrings.managed
  import typingsSlinky.chromeDashApps.chromeDashAppsStrings.partial
  import typingsSlinky.chromeDashApps.chromeDashAppsStrings.unmanaged

  type ManagedBoolean = ManagedType[Boolean]
  type ManagedDOMString = ManagedType[String]
  type ManagedDOMStringList = ManagedType[js.Array[String]]
  type ManagedIPConfigType = ManagedType[js.Array[IPConfigType]]
  type ManagedLong = ManagedType[integer]
  type ManagedProperties = NetworkProperties[managed, full]
  type NetworkConfigProperties[OF /* <: ObjectFunction */] = NetworkConfigBase[unmanaged, full, OF]
  type NetworkStateProperties = NetworkProperties[unmanaged, partial]
}
