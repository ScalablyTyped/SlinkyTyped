package typingsSlinky.jscodeshift.jsxelementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MappingMethods extends js.Object {
  /**
    * Given a JSXElement, returns its "root" name. E.g. it would return "Foo" for
    * both <Foo /> and <Foo.Bar />.
    */
  def getRootName(path: ASTPath[_]): String = js.native
}

object MappingMethods {
  @scala.inline
  def apply(getRootName: ASTPath[_] => String): MappingMethods = {
    val __obj = js.Dynamic.literal(getRootName = js.Any.fromFunction1(getRootName))
    __obj.asInstanceOf[MappingMethods]
  }
  @scala.inline
  implicit class MappingMethodsOps[Self <: MappingMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetRootName(value: ASTPath[_] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRootName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

