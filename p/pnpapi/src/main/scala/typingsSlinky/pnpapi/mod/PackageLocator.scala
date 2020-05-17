package typingsSlinky.pnpapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pnpapi.mod.PhysicalPackageLocator
  - typingsSlinky.pnpapi.mod.TopLevelPackageLocator
*/
trait PackageLocator extends js.Object

object PackageLocator {
  @scala.inline
  implicit def apply(value: PhysicalPackageLocator): PackageLocator = value.asInstanceOf[PackageLocator]
  @scala.inline
  implicit def apply(value: TopLevelPackageLocator): PackageLocator = value.asInstanceOf[PackageLocator]
}

