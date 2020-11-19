package typingsSlinky.localforage

import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalForageSerializer extends js.Object {
  
  def bufferToString(buffer: js.typedarray.ArrayBuffer): String = js.native
  
  def deserialize[T](value: String): T | js.typedarray.ArrayBuffer | Blob = js.native
  
  def serialize[T](value: T, callback: js.Function2[/* value */ String, /* error */ js.Any, Unit]): Unit = js.native
  def serialize[T](
    value: js.typedarray.ArrayBuffer,
    callback: js.Function2[/* value */ String, /* error */ js.Any, Unit]
  ): Unit = js.native
  def serialize[T](value: Blob, callback: js.Function2[/* value */ String, /* error */ js.Any, Unit]): Unit = js.native
  
  def stringToBuffer(serializedString: String): js.typedarray.ArrayBuffer = js.native
}
