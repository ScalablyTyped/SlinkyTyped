package typingsSlinky.jscodeshift.srcCoreMod

import typingsSlinky.jscodeshift.srcCollectionsJSXElementMod.FilterMethods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filters extends js.Object {
  var JSXElement: FilterMethods
  var VariableDeclarator: typingsSlinky.jscodeshift.srcCollectionsVariableDeclaratorMod.FilterMethods
}

object Filters {
  @scala.inline
  def apply(
    JSXElement: FilterMethods,
    VariableDeclarator: typingsSlinky.jscodeshift.srcCollectionsVariableDeclaratorMod.FilterMethods
  ): Filters = {
    val __obj = js.Dynamic.literal(JSXElement = JSXElement.asInstanceOf[js.Any], VariableDeclarator = VariableDeclarator.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Filters]
  }
}

