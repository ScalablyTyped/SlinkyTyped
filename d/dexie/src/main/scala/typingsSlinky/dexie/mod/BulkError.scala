package typingsSlinky.dexie.mod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkError extends DexieError {
  var failures: NumberDictionary[js.Error] = js.native
}

object BulkError {
  @scala.inline
  def apply(failures: NumberDictionary[js.Error], inner: js.Any, message: String, name: String, stack: String): BulkError = {
    val __obj = js.Dynamic.literal(failures = failures.asInstanceOf[js.Any], inner = inner.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkError]
  }
  @scala.inline
  implicit class BulkErrorOps[Self <: BulkError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFailures(value: NumberDictionary[js.Error]): Self = this.set("failures", value.asInstanceOf[js.Any])
  }
  
}

