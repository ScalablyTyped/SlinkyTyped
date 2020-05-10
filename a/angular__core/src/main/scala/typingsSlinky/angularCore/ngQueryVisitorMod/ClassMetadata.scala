package typingsSlinky.angularCore.ngQueryVisitorMod

import typingsSlinky.angularCore.ngComponentTemplateMod.ResolvedTemplate
import typingsSlinky.typescript.mod.ClassDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassMetadata extends js.Object {
  /** List of class declarations that derive from the given class. */
  var derivedClasses: js.Array[ClassDeclaration] = js.native
  /** List of property names that declare an Angular input within the given class. */
  var ngInputNames: js.Array[String] = js.native
  /** Super class of the given class. */
  var superClass: ClassDeclaration | Null = js.native
  /** Component template that belongs to that class if present. */
  var template: js.UndefOr[ResolvedTemplate] = js.native
}

object ClassMetadata {
  @scala.inline
  def apply(derivedClasses: js.Array[ClassDeclaration], ngInputNames: js.Array[String]): ClassMetadata = {
    val __obj = js.Dynamic.literal(derivedClasses = derivedClasses.asInstanceOf[js.Any], ngInputNames = ngInputNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassMetadata]
  }
  @scala.inline
  implicit class ClassMetadataOps[Self <: ClassMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDerivedClasses(value: js.Array[ClassDeclaration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("derivedClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNgInputNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngInputNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuperClass(value: ClassDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuperClassNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superClass")(null)
        ret
    }
    @scala.inline
    def withTemplate(value: ResolvedTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
  }
  
}

