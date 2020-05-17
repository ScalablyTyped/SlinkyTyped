package typingsSlinky.findPackageJson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.findPackageJson.mod.FoundPackage
  - typingsSlinky.findPackageJson.mod.Done
*/
trait FindResult extends js.Object

object FindResult {
  @scala.inline
  implicit def apply(value: Done): FindResult = value.asInstanceOf[FindResult]
  @scala.inline
  implicit def apply(value: FoundPackage): FindResult = value.asInstanceOf[FindResult]
}

