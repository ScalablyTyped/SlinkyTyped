package typingsSlinky.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Tag Manager Container Version.
  */
@js.native
trait SchemaContainerVersion extends js.Object {
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * The built-in variables in the container that this version was taken from.
    */
  var builtInVariable: js.UndefOr[js.Array[SchemaBuiltInVariable]] = js.native
  
  /**
    * The container that this version was taken from.
    */
  var container: js.UndefOr[SchemaContainer] = js.native
  
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  
  /**
    * The Container Version ID uniquely identifies the GTM Container Version.
    */
  var containerVersionId: js.UndefOr[String] = js.native
  
  /**
    * The custom templates in the container that this version was taken from.
    */
  var customTemplate: js.UndefOr[js.Array[SchemaCustomTemplate]] = js.native
  
  /**
    * A value of true indicates this container version has been deleted.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  
  /**
    * Container version description.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The fingerprint of the GTM Container Version as computed at storage time.
    * This value is recomputed whenever the container version is modified.
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /**
    * The folders in the container that this version was taken from.
    */
  var folder: js.UndefOr[js.Array[SchemaFolder]] = js.native
  
  /**
    * Container version display name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * GTM ContainerVersions&#39;s API relative path.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * The tags in the container that this version was taken from.
    */
  var tag: js.UndefOr[js.Array[SchemaTag]] = js.native
  
  /**
    * Auto generated link to the tag manager UI
    */
  var tagManagerUrl: js.UndefOr[String] = js.native
  
  /**
    * The triggers in the container that this version was taken from.
    */
  var trigger: js.UndefOr[js.Array[SchemaTrigger]] = js.native
  
  /**
    * The variables in the container that this version was taken from.
    */
  var variable: js.UndefOr[js.Array[SchemaVariable]] = js.native
  
  /**
    * The zones in the container that this version was taken from.
    */
  var zone: js.UndefOr[js.Array[SchemaZone]] = js.native
}
object SchemaContainerVersion {
  
  @scala.inline
  def apply(): SchemaContainerVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainerVersion]
  }
  
  @scala.inline
  implicit class SchemaContainerVersionOps[Self <: SchemaContainerVersion] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setBuiltInVariableVarargs(value: SchemaBuiltInVariable*): Self = this.set("builtInVariable", js.Array(value :_*))
    
    @scala.inline
    def setBuiltInVariable(value: js.Array[SchemaBuiltInVariable]): Self = this.set("builtInVariable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuiltInVariable: Self = this.set("builtInVariable", js.undefined)
    
    @scala.inline
    def setContainer(value: SchemaContainer): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    
    @scala.inline
    def setContainerVersionId(value: String): Self = this.set("containerVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerVersionId: Self = this.set("containerVersionId", js.undefined)
    
    @scala.inline
    def setCustomTemplateVarargs(value: SchemaCustomTemplate*): Self = this.set("customTemplate", js.Array(value :_*))
    
    @scala.inline
    def setCustomTemplate(value: js.Array[SchemaCustomTemplate]): Self = this.set("customTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomTemplate: Self = this.set("customTemplate", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setFolderVarargs(value: SchemaFolder*): Self = this.set("folder", js.Array(value :_*))
    
    @scala.inline
    def setFolder(value: js.Array[SchemaFolder]): Self = this.set("folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolder: Self = this.set("folder", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setTagVarargs(value: SchemaTag*): Self = this.set("tag", js.Array(value :_*))
    
    @scala.inline
    def setTag(value: js.Array[SchemaTag]): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def setTagManagerUrl(value: String): Self = this.set("tagManagerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagManagerUrl: Self = this.set("tagManagerUrl", js.undefined)
    
    @scala.inline
    def setTriggerVarargs(value: SchemaTrigger*): Self = this.set("trigger", js.Array(value :_*))
    
    @scala.inline
    def setTrigger(value: js.Array[SchemaTrigger]): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    
    @scala.inline
    def setVariableVarargs(value: SchemaVariable*): Self = this.set("variable", js.Array(value :_*))
    
    @scala.inline
    def setVariable(value: js.Array[SchemaVariable]): Self = this.set("variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariable: Self = this.set("variable", js.undefined)
    
    @scala.inline
    def setZoneVarargs(value: SchemaZone*): Self = this.set("zone", js.Array(value :_*))
    
    @scala.inline
    def setZone(value: js.Array[SchemaZone]): Self = this.set("zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
}
