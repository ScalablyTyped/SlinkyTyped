package typingsSlinky.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deployment extends js.Object {
  
  /**
    * Options for any Google Cloud Build builds created as a part of this deployment.These options will only be used if a new build is created, such as when deploying to the App Engine
    * flexible environment using files or zip.
    */
  var cloudBuildOptions: js.UndefOr[CloudBuildOptions] = js.native
  
  /** The Docker image for the container that runs the version. Only applicable for instances running in the App Engine flexible environment. */
  var container: js.UndefOr[ContainerInfo] = js.native
  
  /** Manifest of the files stored in Google Cloud Storage that are included as part of this version. All files must be readable using the credentials supplied with this call. */
  var files: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.appengine.gapi.client.appengine.FileInfo}
    */ typingsSlinky.maximMazurokGapiClientAppengine.maximMazurokGapiClientAppengineStrings.Deployment with TopLevel[js.Any]
  ] = js.native
  
  /** The zip file for this deployment, if this is a zip deployment. */
  var zip: js.UndefOr[ZipInfo] = js.native
}
object Deployment {
  
  @scala.inline
  def apply(): Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployment]
  }
  
  @scala.inline
  implicit class DeploymentOps[Self <: Deployment] (val x: Self) extends AnyVal {
    
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
    def setCloudBuildOptions(value: CloudBuildOptions): Self = this.set("cloudBuildOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudBuildOptions: Self = this.set("cloudBuildOptions", js.undefined)
    
    @scala.inline
    def setContainer(value: ContainerInfo): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setFiles(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.appengine.gapi.client.appengine.FileInfo}
      */ typingsSlinky.maximMazurokGapiClientAppengine.maximMazurokGapiClientAppengineStrings.Deployment with TopLevel[js.Any]
    ): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setZip(value: ZipInfo): Self = this.set("zip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZip: Self = this.set("zip", js.undefined)
  }
}
