package typingsSlinky.nodegit.submoduleMod.Submodule

import typingsSlinky.nodegit.nodegitNumbers.`1024`
import typingsSlinky.nodegit.nodegitNumbers.`128`
import typingsSlinky.nodegit.nodegitNumbers.`16`
import typingsSlinky.nodegit.nodegitNumbers.`1`
import typingsSlinky.nodegit.nodegitNumbers.`2048`
import typingsSlinky.nodegit.nodegitNumbers.`256`
import typingsSlinky.nodegit.nodegitNumbers.`2`
import typingsSlinky.nodegit.nodegitNumbers.`32`
import typingsSlinky.nodegit.nodegitNumbers.`4096`
import typingsSlinky.nodegit.nodegitNumbers.`4`
import typingsSlinky.nodegit.nodegitNumbers.`512`
import typingsSlinky.nodegit.nodegitNumbers.`64`
import typingsSlinky.nodegit.nodegitNumbers.`8192`
import typingsSlinky.nodegit.nodegitNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodegit.nodegitNumbers.`1`
  - typingsSlinky.nodegit.nodegitNumbers.`2`
  - typingsSlinky.nodegit.nodegitNumbers.`4`
  - typingsSlinky.nodegit.nodegitNumbers.`8`
  - typingsSlinky.nodegit.nodegitNumbers.`16`
  - typingsSlinky.nodegit.nodegitNumbers.`32`
  - typingsSlinky.nodegit.nodegitNumbers.`64`
  - typingsSlinky.nodegit.nodegitNumbers.`128`
  - typingsSlinky.nodegit.nodegitNumbers.`256`
  - typingsSlinky.nodegit.nodegitNumbers.`512`
  - typingsSlinky.nodegit.nodegitNumbers.`1024`
  - typingsSlinky.nodegit.nodegitNumbers.`2048`
  - typingsSlinky.nodegit.nodegitNumbers.`4096`
  - typingsSlinky.nodegit.nodegitNumbers.`8192`
*/
trait STATUS extends js.Object

object STATUS {
  @scala.inline
  def INDEX_ADDED: `16` = this.cast(16)
  @scala.inline
  def INDEX_DELETED: `32` = this.cast(32)
  @scala.inline
  def INDEX_MODIFIED: `64` = this.cast(64)
  @scala.inline
  def IN_CONFIG: `4` = this.cast(4)
  @scala.inline
  def IN_HEAD: `1` = this.cast(1)
  @scala.inline
  def IN_INDEX: `2` = this.cast(2)
  @scala.inline
  def IN_WD: `8` = this.cast(8)
  @scala.inline
  def WD_ADDED: `256` = this.cast(256)
  @scala.inline
  def WD_DELETED: `512` = this.cast(512)
  @scala.inline
  def WD_INDEX_MODIFIED: `2048` = this.cast(2048)
  @scala.inline
  def WD_MODIFIED: `1024` = this.cast(1024)
  @scala.inline
  def WD_UNINITIALIZED: `128` = this.cast(128)
  @scala.inline
  def WD_UNTRACKED: `8192` = this.cast(8192)
  @scala.inline
  def WD_WD_MODIFIED: `4096` = this.cast(4096)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

