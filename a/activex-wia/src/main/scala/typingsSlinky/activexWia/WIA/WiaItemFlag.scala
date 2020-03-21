package typingsSlinky.activexWia.WIA

import typingsSlinky.activexWia.activexWiaNumbers.`-2147483648`
import typingsSlinky.activexWia.activexWiaNumbers.`0`
import typingsSlinky.activexWia.activexWiaNumbers.`1024`
import typingsSlinky.activexWia.activexWiaNumbers.`128`
import typingsSlinky.activexWia.activexWiaNumbers.`16384`
import typingsSlinky.activexWia.activexWiaNumbers.`16`
import typingsSlinky.activexWia.activexWiaNumbers.`1`
import typingsSlinky.activexWia.activexWiaNumbers.`2048`
import typingsSlinky.activexWia.activexWiaNumbers.`256`
import typingsSlinky.activexWia.activexWiaNumbers.`2`
import typingsSlinky.activexWia.activexWiaNumbers.`32768`
import typingsSlinky.activexWia.activexWiaNumbers.`32`
import typingsSlinky.activexWia.activexWiaNumbers.`4096`
import typingsSlinky.activexWia.activexWiaNumbers.`4`
import typingsSlinky.activexWia.activexWiaNumbers.`512`
import typingsSlinky.activexWia.activexWiaNumbers.`64`
import typingsSlinky.activexWia.activexWiaNumbers.`65536`
import typingsSlinky.activexWia.activexWiaNumbers.`8192`
import typingsSlinky.activexWia.activexWiaNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Item's type is composed of bits from the WiaItemFlags enumeration. You can test an Item's type by using the AND operation with
  * Item.Properties("Item Flags") and a member from the WiaItemFlags enumeration.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexWia.activexWiaNumbers.`16`
  - typingsSlinky.activexWia.activexWiaNumbers.`32`
  - typingsSlinky.activexWia.activexWiaNumbers.`2048`
  - typingsSlinky.activexWia.activexWiaNumbers.`128`
  - typingsSlinky.activexWia.activexWiaNumbers.`64`
  - typingsSlinky.activexWia.activexWiaNumbers.`256`
  - typingsSlinky.activexWia.activexWiaNumbers.`2`
  - typingsSlinky.activexWia.activexWiaNumbers.`4`
  - typingsSlinky.activexWia.activexWiaNumbers.`0`
  - typingsSlinky.activexWia.activexWiaNumbers.`16384`
  - typingsSlinky.activexWia.activexWiaNumbers.`32768`
  - typingsSlinky.activexWia.activexWiaNumbers.`512`
  - typingsSlinky.activexWia.activexWiaNumbers.`1`
  - typingsSlinky.activexWia.activexWiaNumbers.`-2147483648`
  - typingsSlinky.activexWia.activexWiaNumbers.`8`
  - typingsSlinky.activexWia.activexWiaNumbers.`4096`
  - typingsSlinky.activexWia.activexWiaNumbers.`8192`
  - typingsSlinky.activexWia.activexWiaNumbers.`65536`
  - typingsSlinky.activexWia.activexWiaNumbers.`1024`
*/
trait WiaItemFlag extends js.Object

object WiaItemFlag {
  @scala.inline
  def AnalyzeItemFlag: `16` = this.cast(16)
  @scala.inline
  def AudioItemFlag: `32` = this.cast(32)
  @scala.inline
  def BurstItemFlag: `2048` = this.cast(2048)
  @scala.inline
  def DeletedItemFlag: `128` = this.cast(128)
  @scala.inline
  def DeviceItemFlag: `64` = this.cast(64)
  @scala.inline
  def DisconnectedItemFlag: `256` = this.cast(256)
  @scala.inline
  def FileItemFlag: `2` = this.cast(2)
  @scala.inline
  def FolderItemFlag: `4` = this.cast(4)
  @scala.inline
  def FreeItemFlag: `0` = this.cast(0)
  @scala.inline
  def GeneratedItemFlag: `16384` = this.cast(16384)
  @scala.inline
  def HPanoramaItemFlag: `512` = this.cast(512)
  @scala.inline
  def HasAttachmentsItemFlag: `32768` = this.cast(32768)
  @scala.inline
  def ImageItemFlag: `1` = this.cast(1)
  @scala.inline
  def RemovedItemFlag: `-2147483648` = this.cast(-2147483648)
  @scala.inline
  def RootItemFlag: `8` = this.cast(8)
  @scala.inline
  def StorageItemFlag: `4096` = this.cast(4096)
  @scala.inline
  def TransferItemFlag: `8192` = this.cast(8192)
  @scala.inline
  def VPanoramaItemFlag: `1024` = this.cast(1024)
  @scala.inline
  def VideoItemFlag: `65536` = this.cast(65536)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

