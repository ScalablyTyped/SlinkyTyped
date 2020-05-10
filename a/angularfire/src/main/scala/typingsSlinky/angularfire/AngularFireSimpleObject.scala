package typingsSlinky.angularfire

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AngularFireSimpleObject
  extends /* key */ StringDictionary[js.Any] {
  @JSName("$id")
  var $id: String = js.native
  @JSName("$priority")
  var $priority: Double = js.native
  @JSName("$value")
  var $value: js.Any = js.native
}

object AngularFireSimpleObject {
  @scala.inline
  def apply($id: String, $priority: Double, $value: js.Any): AngularFireSimpleObject = {
    val __obj = js.Dynamic.literal($id = $id.asInstanceOf[js.Any], $priority = $priority.asInstanceOf[js.Any], $value = $value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngularFireSimpleObject]
  }
  @scala.inline
  implicit class AngularFireSimpleObjectOps[Self <: AngularFireSimpleObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$priority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$value(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

