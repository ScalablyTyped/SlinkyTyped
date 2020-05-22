package typingsSlinky.objection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbRef extends js.Object {
  @JSName("#dbRef")
  var NumbersigndbRef: Double
}

object DbRef {
  @scala.inline
  def apply(NumbersigndbRef: Double): DbRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("#dbRef")(NumbersigndbRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbRef]
  }
}

