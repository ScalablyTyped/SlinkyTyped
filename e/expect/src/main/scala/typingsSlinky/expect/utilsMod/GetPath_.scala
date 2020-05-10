package typingsSlinky.expect.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPath_ extends js.Object {
  var hasEndProp: js.UndefOr[Boolean] = js.native
  var lastTraversedObject: js.Any = js.native
  var traversedPath: js.Array[String] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object GetPath_ {
  @scala.inline
  def apply(lastTraversedObject: js.Any, traversedPath: js.Array[String]): GetPath_ = {
    val __obj = js.Dynamic.literal(lastTraversedObject = lastTraversedObject.asInstanceOf[js.Any], traversedPath = traversedPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPath_]
  }
  @scala.inline
  implicit class GetPath_Ops[Self <: GetPath_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastTraversedObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastTraversedObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTraversedPath(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traversedPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasEndProp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasEndProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasEndProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasEndProp")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

