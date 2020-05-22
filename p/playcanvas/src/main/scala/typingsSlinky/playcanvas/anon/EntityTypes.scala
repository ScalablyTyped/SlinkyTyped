package typingsSlinky.playcanvas.anon

import typingsSlinky.playcanvas.pc.Ray
import typingsSlinky.playcanvas.pc.XrHitTestSource
import typingsSlinky.playcanvas.pc.callbacks.XrHitTestStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityTypes extends js.Object {
  var callback: js.UndefOr[XrHitTestStart] = js.undefined
  var entityTypes: js.UndefOr[js.Array[String]] = js.undefined
  var offsetRay: js.UndefOr[Ray] = js.undefined
}

object EntityTypes {
  @scala.inline
  def apply(
    callback: (/* err */ js.Error | Null, /* hitTestSource */ XrHitTestSource | Null) => Unit = null,
    entityTypes: js.Array[String] = null,
    offsetRay: Ray = null
  ): EntityTypes = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (entityTypes != null) __obj.updateDynamic("entityTypes")(entityTypes.asInstanceOf[js.Any])
    if (offsetRay != null) __obj.updateDynamic("offsetRay")(offsetRay.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityTypes]
  }
}

