package typingsSlinky.materialUiCore.withStylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSS.CreateStyleSheetOptions<ClassKey> * / any */ @js.native
trait WithStylesOptions[ClassKey /* <: String */] extends js.Object {
  var flip: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var withTheme: js.UndefOr[Boolean] = js.native
}

object WithStylesOptions {
  @scala.inline
  def apply[ClassKey](): WithStylesOptions[ClassKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithStylesOptions[ClassKey]]
  }
  @scala.inline
  implicit class WithStylesOptionsOps[Self[classkey] <: WithStylesOptions[classkey], ClassKey] (val x: Self[ClassKey]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ClassKey] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ClassKey]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ClassKey] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ClassKey] with Other]
    @scala.inline
    def withFlip(value: Boolean): Self[ClassKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlip: Self[ClassKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self[ClassKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[ClassKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withWithTheme(value: Boolean): Self[ClassKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithTheme: Self[ClassKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withTheme")(js.undefined)
        ret
    }
  }
  
}

