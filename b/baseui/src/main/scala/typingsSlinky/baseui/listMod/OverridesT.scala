package typingsSlinky.baseui.listMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverridesT extends js.Object {
  var ArtworkContainer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<StyledArtworkContainerPropsT> */ js.Any = js.native
  var Content: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<StyledContentPropsT> */ js.Any = js.native
  var EndEnhancerContainer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any = js.native
  var Root: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any = js.native
}

object OverridesT {
  @scala.inline
  def apply(
    ArtworkContainer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<StyledArtworkContainerPropsT> */ js.Any,
    Content: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<StyledContentPropsT> */ js.Any,
    EndEnhancerContainer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any,
    Root: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
  ): OverridesT = {
    val __obj = js.Dynamic.literal(ArtworkContainer = ArtworkContainer.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], EndEnhancerContainer = EndEnhancerContainer.asInstanceOf[js.Any], Root = Root.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverridesT]
  }
  @scala.inline
  implicit class OverridesTOps[Self <: OverridesT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtworkContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<StyledArtworkContainerPropsT> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArtworkContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<StyledContentPropsT> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndEnhancerContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndEnhancerContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Root")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

