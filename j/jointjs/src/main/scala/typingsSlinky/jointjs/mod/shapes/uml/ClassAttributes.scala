package typingsSlinky.jointjs.mod.shapes.uml

import typingsSlinky.jointjs.mod.dia.Element.GenericAttributes
import typingsSlinky.jointjs.mod.shapes.SVGRectSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassAttributes extends GenericAttributes[SVGRectSelector] {
  var attributes: js.Array[String] = js.native
  var methods: js.Array[String] = js.native
  var name: js.Array[String] = js.native
}

object ClassAttributes {
  @scala.inline
  def apply(attributes: js.Array[String], methods: js.Array[String], name: js.Array[String]): ClassAttributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassAttributes]
  }
  @scala.inline
  implicit class ClassAttributesOps[Self <: ClassAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethods(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

