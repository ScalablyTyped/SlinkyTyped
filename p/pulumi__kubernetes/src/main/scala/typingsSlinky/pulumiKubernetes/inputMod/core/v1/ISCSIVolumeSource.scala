package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.
  */
@js.native
trait ISCSIVolumeSource extends StObject {
  
  /**
    * whether support iSCSI Discovery CHAP authentication
    */
  var chapAuthDiscovery: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * whether support iSCSI Session CHAP authentication
    */
  var chapAuthSession: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi
    */
  var fsType: js.UndefOr[Input[String]] = js.native
  
  /**
    * Custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the connection.
    */
  var initiatorName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Target iSCSI Qualified Name.
    */
  var iqn: Input[String] = js.native
  
  /**
    * iSCSI Interface Name that uses an iSCSI transport. Defaults to 'default' (tcp).
    */
  var iscsiInterface: js.UndefOr[Input[String]] = js.native
  
  /**
    * iSCSI Target Lun number.
    */
  var lun: Input[Double] = js.native
  
  /**
    * iSCSI Target Portal List. The portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
    */
  var portals: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * CHAP Secret for iSCSI target and initiator authentication
    */
  var secretRef: js.UndefOr[Input[LocalObjectReference]] = js.native
  
  /**
    * iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
    */
  var targetPortal: Input[String] = js.native
}
object ISCSIVolumeSource {
  
  @scala.inline
  def apply(iqn: Input[String], lun: Input[Double], targetPortal: Input[String]): ISCSIVolumeSource = {
    val __obj = js.Dynamic.literal(iqn = iqn.asInstanceOf[js.Any], lun = lun.asInstanceOf[js.Any], targetPortal = targetPortal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISCSIVolumeSource]
  }
  
  @scala.inline
  implicit class ISCSIVolumeSourceMutableBuilder[Self <: ISCSIVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChapAuthDiscovery(value: Input[Boolean]): Self = StObject.set(x, "chapAuthDiscovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChapAuthDiscoveryUndefined: Self = StObject.set(x, "chapAuthDiscovery", js.undefined)
    
    @scala.inline
    def setChapAuthSession(value: Input[Boolean]): Self = StObject.set(x, "chapAuthSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChapAuthSessionUndefined: Self = StObject.set(x, "chapAuthSession", js.undefined)
    
    @scala.inline
    def setFsType(value: Input[String]): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsTypeUndefined: Self = StObject.set(x, "fsType", js.undefined)
    
    @scala.inline
    def setInitiatorName(value: Input[String]): Self = StObject.set(x, "initiatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitiatorNameUndefined: Self = StObject.set(x, "initiatorName", js.undefined)
    
    @scala.inline
    def setIqn(value: Input[String]): Self = StObject.set(x, "iqn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIscsiInterface(value: Input[String]): Self = StObject.set(x, "iscsiInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIscsiInterfaceUndefined: Self = StObject.set(x, "iscsiInterface", js.undefined)
    
    @scala.inline
    def setLun(value: Input[Double]): Self = StObject.set(x, "lun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortals(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "portals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalsUndefined: Self = StObject.set(x, "portals", js.undefined)
    
    @scala.inline
    def setPortalsVarargs(value: Input[String]*): Self = StObject.set(x, "portals", js.Array(value :_*))
    
    @scala.inline
    def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setSecretRef(value: Input[LocalObjectReference]): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretRefUndefined: Self = StObject.set(x, "secretRef", js.undefined)
    
    @scala.inline
    def setTargetPortal(value: Input[String]): Self = StObject.set(x, "targetPortal", value.asInstanceOf[js.Any])
  }
}
