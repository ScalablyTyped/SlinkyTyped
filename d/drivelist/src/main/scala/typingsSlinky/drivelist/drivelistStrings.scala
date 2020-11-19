package typingsSlinky.drivelist

import typingsSlinky.drivelist.mod.BusType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drivelistStrings {
  
  @scala.inline
  def ATA: ATA = "ATA".asInstanceOf[ATA]
  
  @scala.inline
  def IDE: IDE = "IDE".asInstanceOf[IDE]
  
  @scala.inline
  def PCI: PCI = "PCI".asInstanceOf[PCI]
  
  @scala.inline
  def SATA: SATA = "SATA".asInstanceOf[SATA]
  
  @scala.inline
  def SCSI: SCSI = "SCSI".asInstanceOf[SCSI]
  
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait ATA extends BusType
  
  @js.native
  sealed trait IDE extends BusType
  
  @js.native
  sealed trait PCI extends BusType
  
  @js.native
  sealed trait SATA extends BusType
  
  @js.native
  sealed trait SCSI extends BusType
  
  @js.native
  sealed trait UNKNOWN extends BusType
}
