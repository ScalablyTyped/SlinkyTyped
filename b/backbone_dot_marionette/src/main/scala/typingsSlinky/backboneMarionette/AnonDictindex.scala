package typingsSlinky.backboneMarionette

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.backboneMarionette.mod.Behavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictindex
  extends /* index */ StringDictionary[js.Any] {
  var behaviorClass: Instantiable1[js.UndefOr[/* options */ js.Any], Behavior] = js.native
}

object AnonDictindex {
  @scala.inline
  def apply(behaviorClass: Instantiable1[js.UndefOr[/* options */ js.Any], Behavior]): AnonDictindex = {
    val __obj = js.Dynamic.literal(behaviorClass = behaviorClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictindex]
  }
  @scala.inline
  implicit class AnonDictindexOps[Self <: AnonDictindex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBehaviorClass(value: Instantiable1[js.UndefOr[/* options */ js.Any], Behavior]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behaviorClass")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

