package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePackageRequest extends js.Object {
  /**
    * Description of the package.
    */
  var PackageDescription: js.UndefOr[typingsSlinky.awsSdk.esMod.PackageDescription] = js.native
  /**
    * Unique identifier for the package.
    */
  var PackageName: typingsSlinky.awsSdk.esMod.PackageName = js.native
  /**
    * The customer S3 location PackageSource for importing the package.
    */
  var PackageSource: typingsSlinky.awsSdk.esMod.PackageSource = js.native
  /**
    * Type of package. Currently supports only TXT-DICTIONARY.
    */
  var PackageType: typingsSlinky.awsSdk.esMod.PackageType = js.native
}

object CreatePackageRequest {
  @scala.inline
  def apply(
    PackageName: PackageName,
    PackageSource: PackageSource,
    PackageType: PackageType,
    PackageDescription: PackageDescription = null
  ): CreatePackageRequest = {
    val __obj = js.Dynamic.literal(PackageName = PackageName.asInstanceOf[js.Any], PackageSource = PackageSource.asInstanceOf[js.Any], PackageType = PackageType.asInstanceOf[js.Any])
    if (PackageDescription != null) __obj.updateDynamic("PackageDescription")(PackageDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePackageRequest]
  }
}

