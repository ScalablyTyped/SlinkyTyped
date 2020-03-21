package typingsSlinky.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.aliOss.aliOssStrings.Standard
  - typingsSlinky.aliOss.aliOssStrings.IA
  - typingsSlinky.aliOss.aliOssStrings.Archive
*/
trait StorageType extends js.Object

object StorageType {
  @scala.inline
  def Archive: typingsSlinky.aliOss.aliOssStrings.Archive = this.cast("Archive")
  @scala.inline
  def IA: typingsSlinky.aliOss.aliOssStrings.IA = this.cast("IA")
  @scala.inline
  def Standard: typingsSlinky.aliOss.aliOssStrings.Standard = this.cast("Standard")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

