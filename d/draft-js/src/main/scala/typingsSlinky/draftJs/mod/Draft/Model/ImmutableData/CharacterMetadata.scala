package typingsSlinky.draftJs.mod.Draft.Model.ImmutableData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CharacterMetadata extends js.Object {
  def getEntity(): String = js.native
  def getStyle(): DraftInlineStyle = js.native
  def hasStyle(style: String): Boolean = js.native
}

object CharacterMetadata {
  @scala.inline
  def apply(getEntity: () => String, getStyle: () => DraftInlineStyle, hasStyle: String => Boolean): CharacterMetadata = {
    val __obj = js.Dynamic.literal(getEntity = js.Any.fromFunction0(getEntity), getStyle = js.Any.fromFunction0(getStyle), hasStyle = js.Any.fromFunction1(hasStyle))
    __obj.asInstanceOf[CharacterMetadata]
  }
  @scala.inline
  implicit class CharacterMetadataOps[Self <: CharacterMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetEntity(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEntity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStyle(value: () => DraftInlineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasStyle(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasStyle")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

