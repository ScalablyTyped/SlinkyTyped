package typingsSlinky.drivelist

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("drivelist", "list")
  @js.native
  def list(callback: js.Function2[/* error */ js.Any, /* drives */ js.Array[Drive], Unit]): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.drivelist.drivelistStrings.SATA
    - typingsSlinky.drivelist.drivelistStrings.SCSI
    - typingsSlinky.drivelist.drivelistStrings.ATA
    - typingsSlinky.drivelist.drivelistStrings.IDE
    - typingsSlinky.drivelist.drivelistStrings.PCI
    - typingsSlinky.drivelist.drivelistStrings.UNKNOWN
  */
  trait BusType extends StObject
  object BusType {
    
    @scala.inline
    def ATA: typingsSlinky.drivelist.drivelistStrings.ATA = "ATA".asInstanceOf[typingsSlinky.drivelist.drivelistStrings.ATA]
    
    @scala.inline
    def IDE: typingsSlinky.drivelist.drivelistStrings.IDE = "IDE".asInstanceOf[typingsSlinky.drivelist.drivelistStrings.IDE]
    
    @scala.inline
    def PCI: typingsSlinky.drivelist.drivelistStrings.PCI = "PCI".asInstanceOf[typingsSlinky.drivelist.drivelistStrings.PCI]
    
    @scala.inline
    def SATA: typingsSlinky.drivelist.drivelistStrings.SATA = "SATA".asInstanceOf[typingsSlinky.drivelist.drivelistStrings.SATA]
    
    @scala.inline
    def SCSI: typingsSlinky.drivelist.drivelistStrings.SCSI = "SCSI".asInstanceOf[typingsSlinky.drivelist.drivelistStrings.SCSI]
    
    @scala.inline
    def UNKNOWN: typingsSlinky.drivelist.drivelistStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsSlinky.drivelist.drivelistStrings.UNKNOWN]
  }
  
  @js.native
  trait Drive extends StObject {
    
    var blockSize: Double | Null = js.native
    
    var busType: BusType = js.native
    
    var busVersion: String | Null = js.native
    
    var description: String = js.native
    
    var device: String = js.native
    
    var devicePath: String | Null = js.native
    
    var enumerator: String = js.native
    
    var error: js.Any = js.native
    
    var isCard: Boolean | Null = js.native
    
    var isReadOnly: Boolean = js.native
    
    var isRemovable: Boolean | Null = js.native
    
    var isSCSI: Boolean | Null = js.native
    
    var isSystem: Boolean = js.native
    
    var isUAS: Boolean | Null = js.native
    
    var isUSB: Boolean | Null = js.native
    
    var isVirtual: Boolean | Null = js.native
    
    var logicalBlockSize: Double | Null = js.native
    
    var mountpoints: js.Array[MountPoint] = js.native
    
    var raw: String = js.native
    
    // can be null
    var size: Double | Null = js.native
  }
  object Drive {
    
    @scala.inline
    def apply(
      busType: BusType,
      description: String,
      device: String,
      enumerator: String,
      error: js.Any,
      isReadOnly: Boolean,
      isSystem: Boolean,
      mountpoints: js.Array[MountPoint],
      raw: String
    ): Drive = {
      val __obj = js.Dynamic.literal(busType = busType.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], enumerator = enumerator.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isSystem = isSystem.asInstanceOf[js.Any], mountpoints = mountpoints.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Drive]
    }
    
    @scala.inline
    implicit class DriveMutableBuilder[Self <: Drive] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockSizeNull: Self = StObject.set(x, "blockSize", null)
      
      @scala.inline
      def setBusType(value: BusType): Self = StObject.set(x, "busType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBusVersion(value: String): Self = StObject.set(x, "busVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBusVersionNull: Self = StObject.set(x, "busVersion", null)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevicePath(value: String): Self = StObject.set(x, "devicePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevicePathNull: Self = StObject.set(x, "devicePath", null)
      
      @scala.inline
      def setEnumerator(value: String): Self = StObject.set(x, "enumerator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCard(value: Boolean): Self = StObject.set(x, "isCard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCardNull: Self = StObject.set(x, "isCard", null)
      
      @scala.inline
      def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRemovable(value: Boolean): Self = StObject.set(x, "isRemovable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRemovableNull: Self = StObject.set(x, "isRemovable", null)
      
      @scala.inline
      def setIsSCSI(value: Boolean): Self = StObject.set(x, "isSCSI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSCSINull: Self = StObject.set(x, "isSCSI", null)
      
      @scala.inline
      def setIsSystem(value: Boolean): Self = StObject.set(x, "isSystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUAS(value: Boolean): Self = StObject.set(x, "isUAS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUASNull: Self = StObject.set(x, "isUAS", null)
      
      @scala.inline
      def setIsUSB(value: Boolean): Self = StObject.set(x, "isUSB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUSBNull: Self = StObject.set(x, "isUSB", null)
      
      @scala.inline
      def setIsVirtual(value: Boolean): Self = StObject.set(x, "isVirtual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVirtualNull: Self = StObject.set(x, "isVirtual", null)
      
      @scala.inline
      def setLogicalBlockSize(value: Double): Self = StObject.set(x, "logicalBlockSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogicalBlockSizeNull: Self = StObject.set(x, "logicalBlockSize", null)
      
      @scala.inline
      def setMountpoints(value: js.Array[MountPoint]): Self = StObject.set(x, "mountpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountpointsVarargs(value: MountPoint*): Self = StObject.set(x, "mountpoints", js.Array(value :_*))
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeNull: Self = StObject.set(x, "size", null)
    }
  }
  
  @js.native
  trait MountPoint extends StObject {
    
    var label: js.UndefOr[String] = js.native
    
    var path: String = js.native
  }
  object MountPoint {
    
    @scala.inline
    def apply(path: String): MountPoint = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[MountPoint]
    }
    
    @scala.inline
    implicit class MountPointMutableBuilder[Self <: MountPoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
