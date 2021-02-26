package typingsSlinky.nodeOsUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driveMod {
  
  @JSImport("node-os-utils/lib/drive", JSImport.Default)
  @js.native
  class default () extends Drive
  
  @js.native
  trait Drive extends StObject {
    
    def free(diskName: String): js.Promise[DriveFreeInfo] = js.native
    
    def info(diskName: String): js.Promise[DriveInfo] = js.native
    
    def used(diskName: String): js.Promise[DriveUsedInfo] = js.native
  }
  object Drive {
    
    @scala.inline
    def apply(
      free: String => js.Promise[DriveFreeInfo],
      info: String => js.Promise[DriveInfo],
      used: String => js.Promise[DriveUsedInfo]
    ): Drive = {
      val __obj = js.Dynamic.literal(free = js.Any.fromFunction1(free), info = js.Any.fromFunction1(info), used = js.Any.fromFunction1(used))
      __obj.asInstanceOf[Drive]
    }
    
    @scala.inline
    implicit class DriveMutableBuilder[Self <: Drive] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFree(value: String => js.Promise[DriveFreeInfo]): Self = StObject.set(x, "free", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInfo(value: String => js.Promise[DriveInfo]): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUsed(value: String => js.Promise[DriveUsedInfo]): Self = StObject.set(x, "used", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait DriveFreeInfo extends StObject {
    
    var freeGb: Double = js.native
    
    var freePercentage: Double = js.native
    
    var totalGb: Double = js.native
  }
  object DriveFreeInfo {
    
    @scala.inline
    def apply(freeGb: Double, freePercentage: Double, totalGb: Double): DriveFreeInfo = {
      val __obj = js.Dynamic.literal(freeGb = freeGb.asInstanceOf[js.Any], freePercentage = freePercentage.asInstanceOf[js.Any], totalGb = totalGb.asInstanceOf[js.Any])
      __obj.asInstanceOf[DriveFreeInfo]
    }
    
    @scala.inline
    implicit class DriveFreeInfoMutableBuilder[Self <: DriveFreeInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFreeGb(value: Double): Self = StObject.set(x, "freeGb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreePercentage(value: Double): Self = StObject.set(x, "freePercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalGb(value: Double): Self = StObject.set(x, "totalGb", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.nodeOsUtils.driveMod.DriveUsedInfo because var conflicts: totalGb. Inlined usedGb, usedPercentage */ @js.native
  trait DriveInfo extends DriveFreeInfo {
    
    var usedGb: Double = js.native
    
    var usedPercentage: Double = js.native
  }
  object DriveInfo {
    
    @scala.inline
    def apply(freeGb: Double, freePercentage: Double, totalGb: Double, usedGb: Double, usedPercentage: Double): DriveInfo = {
      val __obj = js.Dynamic.literal(freeGb = freeGb.asInstanceOf[js.Any], freePercentage = freePercentage.asInstanceOf[js.Any], totalGb = totalGb.asInstanceOf[js.Any], usedGb = usedGb.asInstanceOf[js.Any], usedPercentage = usedPercentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[DriveInfo]
    }
    
    @scala.inline
    implicit class DriveInfoMutableBuilder[Self <: DriveInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUsedGb(value: Double): Self = StObject.set(x, "usedGb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsedPercentage(value: Double): Self = StObject.set(x, "usedPercentage", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DriveUsedInfo extends StObject {
    
    var totalGb: Double = js.native
    
    var usedGb: Double = js.native
    
    var usedPercentage: Double = js.native
  }
  object DriveUsedInfo {
    
    @scala.inline
    def apply(totalGb: Double, usedGb: Double, usedPercentage: Double): DriveUsedInfo = {
      val __obj = js.Dynamic.literal(totalGb = totalGb.asInstanceOf[js.Any], usedGb = usedGb.asInstanceOf[js.Any], usedPercentage = usedPercentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[DriveUsedInfo]
    }
    
    @scala.inline
    implicit class DriveUsedInfoMutableBuilder[Self <: DriveUsedInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTotalGb(value: Double): Self = StObject.set(x, "totalGb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsedGb(value: Double): Self = StObject.set(x, "usedGb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsedPercentage(value: Double): Self = StObject.set(x, "usedPercentage", value.asInstanceOf[js.Any])
    }
  }
}
