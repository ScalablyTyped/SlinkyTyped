package typingsSlinky.angularCore.mod

import typingsSlinky.angularCore.angularCoreNumbers.`0`
import typingsSlinky.angularCore.angularCoreNumbers.`1024`
import typingsSlinky.angularCore.angularCoreNumbers.`128`
import typingsSlinky.angularCore.angularCoreNumbers.`12`
import typingsSlinky.angularCore.angularCoreNumbers.`13`
import typingsSlinky.angularCore.angularCoreNumbers.`16`
import typingsSlinky.angularCore.angularCoreNumbers.`1792`
import typingsSlinky.angularCore.angularCoreNumbers.`1`
import typingsSlinky.angularCore.angularCoreNumbers.`256`
import typingsSlinky.angularCore.angularCoreNumbers.`2`
import typingsSlinky.angularCore.angularCoreNumbers.`32`
import typingsSlinky.angularCore.angularCoreNumbers.`4`
import typingsSlinky.angularCore.angularCoreNumbers.`512`
import typingsSlinky.angularCore.angularCoreNumbers.`64`
import typingsSlinky.angularCore.angularCoreNumbers.`768`
import typingsSlinky.angularCore.angularCoreNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bitmask of states
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.angularCore.angularCoreNumbers.`1`
  - typingsSlinky.angularCore.angularCoreNumbers.`2`
  - typingsSlinky.angularCore.angularCoreNumbers.`4`
  - typingsSlinky.angularCore.angularCoreNumbers.`8`
  - typingsSlinky.angularCore.angularCoreNumbers.`16`
  - typingsSlinky.angularCore.angularCoreNumbers.`32`
  - typingsSlinky.angularCore.angularCoreNumbers.`64`
  - typingsSlinky.angularCore.angularCoreNumbers.`128`
  - typingsSlinky.angularCore.angularCoreNumbers.`1792`
  - typingsSlinky.angularCore.angularCoreNumbers.`0`
  - typingsSlinky.angularCore.angularCoreNumbers.`256`
  - typingsSlinky.angularCore.angularCoreNumbers.`512`
  - typingsSlinky.angularCore.angularCoreNumbers.`768`
  - typingsSlinky.angularCore.angularCoreNumbers.`1024`
  - typingsSlinky.angularCore.angularCoreNumbers.`12`
  - typingsSlinky.angularCore.angularCoreNumbers.`13`
*/
trait ViewState extends js.Object

object ViewState {
  @scala.inline
  def Attached: `4` = this.cast(4)
  @scala.inline
  def BeforeFirstCheck: `1` = this.cast(1)
  @scala.inline
  def CatDetectChanges: `12` = this.cast(12)
  @scala.inline
  def CatInit: `13` = this.cast(13)
  @scala.inline
  def CheckProjectedView: `32` = this.cast(32)
  @scala.inline
  def CheckProjectedViews: `64` = this.cast(64)
  @scala.inline
  def ChecksEnabled: `8` = this.cast(8)
  @scala.inline
  def Destroyed: `128` = this.cast(128)
  @scala.inline
  def FirstCheck: `2` = this.cast(2)
  @scala.inline
  def InitState_AfterInit: `1024` = this.cast(1024)
  @scala.inline
  def InitState_BeforeInit: `0` = this.cast(0)
  @scala.inline
  def InitState_CallingAfterContentInit: `512` = this.cast(512)
  @scala.inline
  def InitState_CallingAfterViewInit: `768` = this.cast(768)
  @scala.inline
  def InitState_CallingOnInit: `256` = this.cast(256)
  @scala.inline
  def InitState_Mask: `1792` = this.cast(1792)
  @scala.inline
  def IsProjectedView: `16` = this.cast(16)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

