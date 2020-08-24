package typingsSlinky.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Classes extends js.Object {
  var attributes: js.UndefOr[StringDictionary[String | js.RegExp | Boolean]] = js.native
  var classes: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.native
  var name: js.UndefOr[String | js.RegExp] = js.native
  var styles: js.UndefOr[StringDictionary[String | js.RegExp]] = js.native
}

object Classes {
  @scala.inline
  def apply(): Classes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Classes]
  }
  @scala.inline
  implicit class ClassesOps[Self <: Classes] (val x: Self) extends AnyVal {
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
    def setAttributes(value: StringDictionary[String | js.RegExp | Boolean]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setClassesVarargs(value: (String | js.RegExp)*): Self = this.set("classes", js.Array(value :_*))
    @scala.inline
    def setClassesRegExp(value: js.RegExp): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def setClasses(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setNameRegExp(value: js.RegExp): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String | js.RegExp): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStyles(value: StringDictionary[String | js.RegExp]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

