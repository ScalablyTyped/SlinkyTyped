package typingsSlinky.pixiSpine.PIXI.spine

import typingsSlinky.pixiSpine.PIXI.spine.core.Attachment
import typingsSlinky.pixiSpine.PIXI.spine.core.TextureRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.DisplayObject * / any */ @js.native
trait ISpineDisplayObject extends js.Object {
  var attachment: js.UndefOr[Attachment] = js.native
  var region: js.UndefOr[TextureRegion] = js.native
}

object ISpineDisplayObject {
  @scala.inline
  def apply(): ISpineDisplayObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpineDisplayObject]
  }
  @scala.inline
  implicit class ISpineDisplayObjectOps[Self <: ISpineDisplayObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachment(value: Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachment")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: TextureRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
  }
  
}

