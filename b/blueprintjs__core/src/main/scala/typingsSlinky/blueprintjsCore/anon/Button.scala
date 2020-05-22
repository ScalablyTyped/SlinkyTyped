package typingsSlinky.blueprintjsCore.anon

import typingsSlinky.blueprintjsCore.refUtilsMod.IRefCallback
import typingsSlinky.blueprintjsCore.refUtilsMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  var button: IRefCallback[_] | IRefObject[_]
}

object Button {
  @scala.inline
  def apply(button: IRefCallback[_] | IRefObject[_]): Button = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
}

