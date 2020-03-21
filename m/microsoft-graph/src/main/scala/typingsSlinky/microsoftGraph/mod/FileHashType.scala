package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.sha1
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.sha256
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.md5
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.authenticodeHash256
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.lsHash
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.ctph
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait FileHashType extends js.Object

object FileHashType {
  @scala.inline
  def authenticodeHash256: typingsSlinky.microsoftGraph.microsoftGraphStrings.authenticodeHash256 = this.cast("authenticodeHash256")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ctph: typingsSlinky.microsoftGraph.microsoftGraphStrings.ctph = this.cast("ctph")
  @scala.inline
  def lsHash: typingsSlinky.microsoftGraph.microsoftGraphStrings.lsHash = this.cast("lsHash")
  @scala.inline
  def md5: typingsSlinky.microsoftGraph.microsoftGraphStrings.md5 = this.cast("md5")
  @scala.inline
  def sha1: typingsSlinky.microsoftGraph.microsoftGraphStrings.sha1 = this.cast("sha1")
  @scala.inline
  def sha256: typingsSlinky.microsoftGraph.microsoftGraphStrings.sha256 = this.cast("sha256")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

