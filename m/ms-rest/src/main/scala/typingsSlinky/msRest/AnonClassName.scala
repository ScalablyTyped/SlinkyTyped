package typingsSlinky.msRest

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.msRest.mod.Mapper
import typingsSlinky.msRest.mod.MapperType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClassName extends js.Object {
  var className: String = js.native
  var modelProperties: js.UndefOr[StringDictionary[Mapper]] = js.native
  var name: MapperType = js.native
}

object AnonClassName {
  @scala.inline
  def apply(className: String, name: MapperType): AnonClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassName]
  }
  @scala.inline
  implicit class AnonClassNameOps[Self <: AnonClassName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: MapperType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelProperties(value: StringDictionary[Mapper]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelProperties")(js.undefined)
        ret
    }
  }
  
}

