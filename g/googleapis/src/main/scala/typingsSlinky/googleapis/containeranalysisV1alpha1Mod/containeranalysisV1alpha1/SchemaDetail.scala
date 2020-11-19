package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifies all occurrences of this vulnerability in the package for a
  * specific distro/location For example: glibc in cpe:/o:debian:debian_linux:8
  * for versions 2.1 - 2.2
  */
@js.native
trait SchemaDetail extends js.Object {
  
  /**
    * The name of the package where the vulnerability was found. This field can
    * be used as a filter in list requests.
    */
  @JSName("package")
  var _package: js.UndefOr[String] = js.native
  
  /**
    * The cpe_uri in [cpe format] (https://cpe.mitre.org/specification/) in
    * which the vulnerability manifests.  Examples include distro or storage
    * location for vulnerable jar. This field can be used as a filter in list
    * requests.
    */
  var cpeUri: js.UndefOr[String] = js.native
  
  /**
    * A vendor-specific description of this note.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The fix for this specific package version.
    */
  var fixedLocation: js.UndefOr[SchemaVulnerabilityLocation] = js.native
  
  /**
    * Whether this Detail is obsolete. Occurrences are expected not to point to
    * obsolete details.
    */
  var isObsolete: js.UndefOr[Boolean] = js.native
  
  /**
    * The max version of the package in which the vulnerability exists. This
    * field can be used as a filter in list requests.
    */
  var maxAffectedVersion: js.UndefOr[SchemaVersion] = js.native
  
  /**
    * The min version of the package in which the vulnerability exists.
    */
  var minAffectedVersion: js.UndefOr[SchemaVersion] = js.native
  
  /**
    * The type of package; whether native or non native(ruby gems, node.js
    * packages etc)
    */
  var packageType: js.UndefOr[String] = js.native
  
  /**
    * The severity (eg: distro assigned severity) for this vulnerability.
    */
  var severityName: js.UndefOr[String] = js.native
}
object SchemaDetail {
  
  @scala.inline
  def apply(): SchemaDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetail]
  }
  
  @scala.inline
  implicit class SchemaDetailOps[Self <: SchemaDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_package(value: String): Self = this.set("package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_package: Self = this.set("package", js.undefined)
    
    @scala.inline
    def setCpeUri(value: String): Self = this.set("cpeUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpeUri: Self = this.set("cpeUri", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFixedLocation(value: SchemaVulnerabilityLocation): Self = this.set("fixedLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedLocation: Self = this.set("fixedLocation", js.undefined)
    
    @scala.inline
    def setIsObsolete(value: Boolean): Self = this.set("isObsolete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsObsolete: Self = this.set("isObsolete", js.undefined)
    
    @scala.inline
    def setMaxAffectedVersion(value: SchemaVersion): Self = this.set("maxAffectedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAffectedVersion: Self = this.set("maxAffectedVersion", js.undefined)
    
    @scala.inline
    def setMinAffectedVersion(value: SchemaVersion): Self = this.set("minAffectedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinAffectedVersion: Self = this.set("minAffectedVersion", js.undefined)
    
    @scala.inline
    def setPackageType(value: String): Self = this.set("packageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageType: Self = this.set("packageType", js.undefined)
    
    @scala.inline
    def setSeverityName(value: String): Self = this.set("severityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverityName: Self = this.set("severityName", js.undefined)
  }
}
