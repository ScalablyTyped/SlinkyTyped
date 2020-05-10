package typingsSlinky.jupyterlabUiComponents.blueprintMod

import typingsSlinky.jupyterlabUiComponents.jupyterlabUiComponentsStrings.button
import typingsSlinky.jupyterlabUiComponents.jupyterlabUiComponentsStrings.reset
import typingsSlinky.jupyterlabUiComponents.jupyterlabUiComponentsStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IBPButtonProps * / any */ @js.native
trait IButtonProps extends js.Object {
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[button | submit | reset] = js.native
}

object IButtonProps {
  @scala.inline
  def apply(): IButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IButtonProps]
  }
  @scala.inline
  implicit class IButtonPropsOps[Self <: IButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: button | submit | reset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

