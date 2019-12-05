package typingsSlinky.phantom.phantomMod

import typingsSlinky.phantom.phantomNumbers.`true`
import typingsSlinky.phantom.phantomStrings.callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPhantomCallback extends js.Object {
  var method: callback
  var parent: typingsSlinky.phantom.phantomStrings.phantom
  var target: js.Function
  var transform: `true`
}

object IPhantomCallback {
  @scala.inline
  def apply(
    method: callback,
    parent: typingsSlinky.phantom.phantomStrings.phantom,
    target: js.Function,
    transform: `true`
  ): IPhantomCallback = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPhantomCallback]
  }
}

