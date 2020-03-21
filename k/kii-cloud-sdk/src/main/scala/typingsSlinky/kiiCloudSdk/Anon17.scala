package typingsSlinky.kiiCloudSdk

import org.scalajs.dom.raw.Blob
import typingsSlinky.kiiCloudSdk.KiiCloud.KiiObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon17 extends js.Object {
  def failure(obj: KiiObject, anErrorString: String): js.Any
  def success(obj: KiiObject, bodyBlob: Blob): js.Any
}

object Anon17 {
  @scala.inline
  def apply(failure: (KiiObject, String) => js.Any, success: (KiiObject, Blob) => js.Any): Anon17 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon17]
  }
}

