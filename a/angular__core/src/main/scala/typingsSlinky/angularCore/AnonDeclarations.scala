package typingsSlinky.angularCore

import typingsSlinky.angularCore.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeclarations extends js.Object {
  /** List of components, directives, and pipes declared by this module. */
  var declarations: js.UndefOr[js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]] = js.native
  /**
    * List of modules, `ModuleWithProviders`, components, directives, or pipes exported by this
    * module.
    */
  var exports: js.UndefOr[js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]] = js.native
  /** List of modules or `ModuleWithProviders` imported by this module. */
  var imports: js.UndefOr[js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]] = js.native
}

object AnonDeclarations {
  @scala.inline
  def apply(): AnonDeclarations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDeclarations]
  }
  @scala.inline
  implicit class AnonDeclarationsOps[Self <: AnonDeclarations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeclarationsFunction0(value: () => js.Array[Type[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeclarations(value: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclarations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarations")(js.undefined)
        ret
    }
    @scala.inline
    def withExportsFunction0(value: () => js.Array[Type[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exports")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExports(value: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exports")(js.undefined)
        ret
    }
    @scala.inline
    def withImportsFunction0(value: () => js.Array[Type[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imports")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withImports(value: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imports")(js.undefined)
        ret
    }
  }
  
}

