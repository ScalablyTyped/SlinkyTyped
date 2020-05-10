package typingsSlinky.reReselect.mod

import typingsSlinky.reReselect.AnonCacheSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("re-reselect", "FifoObjectCache")
@js.native
class FifoObjectCache protected () extends ICacheObject {
  def this(options: AnonCacheSize) = this()
  def get(key: ObjectCacheKey): js.Any = js.native
  @JSName("isValidCacheKey")
  def isValidCacheKey_MFifoObjectCache(key: ObjectCacheKey): Boolean = js.native
  def remove(key: ObjectCacheKey): Unit = js.native
  def set(key: ObjectCacheKey, selectorFn: js.Any): Unit = js.native
}

