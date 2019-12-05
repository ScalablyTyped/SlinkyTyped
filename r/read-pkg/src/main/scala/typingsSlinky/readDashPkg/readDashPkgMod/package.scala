package typingsSlinky.readDashPkg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object readDashPkgMod {
  import typingsSlinky.normalizeDashPackageDashData.normalizeDashPackageDashDataMod.Package

  type NormalizedPackageJson = PackageJson with Package
  type PackageJson = typingsSlinky.typeDashFest.sourcePackageDashJsonMod.PackageJson
}
