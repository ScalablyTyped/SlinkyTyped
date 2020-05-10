package typingsSlinky.jupyterlabUiComponents.blueprintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IBPInputGroupProps * / any */ @js.native
trait IInputGroupProps extends js.Object {
  var rightIcon: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IIconProps * / any['icon'] */ js.Any
  ] = js.native
}

object IInputGroupProps {
  @scala.inline
  def apply(): IInputGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInputGroupProps]
  }
  @scala.inline
  implicit class IInputGroupPropsOps[Self <: IInputGroupProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRightIcon(
      value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IIconProps * / any['icon'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIcon")(js.undefined)
        ret
    }
  }
  
}

