package typingsSlinky.minio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("minio", "CopyConditions")
@js.native
class CopyConditions () extends js.Object {
  
  def setMatchETag(etag: String): Unit = js.native
  
  def setMatchETagExcept(etag: String): Unit = js.native
  
  def setModified(date: js.Date): Unit = js.native
  
  def setUnmodified(date: js.Date): Unit = js.native
}
