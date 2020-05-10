package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobManifest extends js.Object {
  /**
    * Contains the information required to locate the specified job's manifest.
    */
  var Location: JobManifestLocation = js.native
  /**
    * Describes the format of the specified job's manifest. If the manifest is in CSV format, also describes the columns contained within the manifest.
    */
  var Spec: JobManifestSpec = js.native
}

object JobManifest {
  @scala.inline
  def apply(Location: JobManifestLocation, Spec: JobManifestSpec): JobManifest = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any], Spec = Spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobManifest]
  }
  @scala.inline
  implicit class JobManifestOps[Self <: JobManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: JobManifestLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpec(value: JobManifestSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Spec")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

