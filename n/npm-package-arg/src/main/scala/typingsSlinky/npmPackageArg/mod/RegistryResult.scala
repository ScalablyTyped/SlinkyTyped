package typingsSlinky.npmPackageArg.mod

import typingsSlinky.npmPackageArg.npmPackageArgBooleans.`true`
import typingsSlinky.npmPackageArg.npmPackageArgStrings.range
import typingsSlinky.npmPackageArg.npmPackageArgStrings.tag
import typingsSlinky.npmPackageArg.npmPackageArgStrings.version
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegistryResult extends Result {
  @JSName("fetchSpec")
  var fetchSpec_RegistryResult: String = js.native
  @JSName("registry")
  var registry_RegistryResult: `true` = js.native
  @JSName("saveSpec")
  var saveSpec_RegistryResult: Null = js.native
  @JSName("type")
  var type_RegistryResult: version | range | tag = js.native
}

