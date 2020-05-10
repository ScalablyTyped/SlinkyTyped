package typingsSlinky.rollupPluginutils.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.estreeWalker.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachedScope extends js.Object {
  var declarations: StringDictionary[Boolean] = js.native
  var isBlockScope: Boolean = js.native
  var parent: js.UndefOr[AttachedScope] = js.native
  def addDeclaration(node: Node, isBlockDeclaration: Boolean, isVar: Boolean): Unit = js.native
  def contains(name: String): Boolean = js.native
}

object AttachedScope {
  @scala.inline
  def apply(
    addDeclaration: (Node, Boolean, Boolean) => Unit,
    contains: String => Boolean,
    declarations: StringDictionary[Boolean],
    isBlockScope: Boolean
  ): AttachedScope = {
    val __obj = js.Dynamic.literal(addDeclaration = js.Any.fromFunction3(addDeclaration), contains = js.Any.fromFunction1(contains), declarations = declarations.asInstanceOf[js.Any], isBlockScope = isBlockScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachedScope]
  }
  @scala.inline
  implicit class AttachedScopeOps[Self <: AttachedScope] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddDeclaration(value: (Node, Boolean, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDeclaration")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withContains(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeclarations(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBlockScope(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBlockScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: AttachedScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
  }
  
}

