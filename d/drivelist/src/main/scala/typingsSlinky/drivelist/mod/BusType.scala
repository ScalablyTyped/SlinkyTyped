package typingsSlinky.drivelist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.drivelist.drivelistStrings.SATA
  - typingsSlinky.drivelist.drivelistStrings.SCSI
  - typingsSlinky.drivelist.drivelistStrings.ATA
  - typingsSlinky.drivelist.drivelistStrings.IDE
  - typingsSlinky.drivelist.drivelistStrings.PCI
  - typingsSlinky.drivelist.drivelistStrings.UNKNOWN
*/
trait BusType extends js.Object

object BusType {
  @scala.inline
  def ATA: typingsSlinky.drivelist.drivelistStrings.ATA = this.cast("ATA")
  @scala.inline
  def IDE: typingsSlinky.drivelist.drivelistStrings.IDE = this.cast("IDE")
  @scala.inline
  def PCI: typingsSlinky.drivelist.drivelistStrings.PCI = this.cast("PCI")
  @scala.inline
  def SATA: typingsSlinky.drivelist.drivelistStrings.SATA = this.cast("SATA")
  @scala.inline
  def SCSI: typingsSlinky.drivelist.drivelistStrings.SCSI = this.cast("SCSI")
  @scala.inline
  def UNKNOWN: typingsSlinky.drivelist.drivelistStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

