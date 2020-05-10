package typingsSlinky.meteor.meteorMod.Meteor

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Global props **/
/** Settings **/
@js.native
trait Settings_
  extends /* id */ StringDictionary[js.Any] {
  var public: StringDictionary[js.Any] = js.native
}

object Settings_ {
  @scala.inline
  def apply(public: StringDictionary[js.Any]): Settings_ = {
    val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings_]
  }
  @scala.inline
  implicit class Settings_Ops[Self <: Settings_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPublic(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

