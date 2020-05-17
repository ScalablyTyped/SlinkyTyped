package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveAttributes extends js.Object {
  var removeAttributes: js.UndefOr[Boolean] = js.native
  var removeIfDef: js.UndefOr[Boolean] = js.native
  var removeUniforms: js.UndefOr[Boolean] = js.native
  var removeVaryings: js.UndefOr[Boolean] = js.native
  var repeatKey: js.UndefOr[String] = js.native
  var replaceStrings: js.UndefOr[js.Array[Replace]] = js.native
}

object RemoveAttributes {
  @scala.inline
  def apply(): RemoveAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveAttributes]
  }
  @scala.inline
  implicit class RemoveAttributesOps[Self <: RemoveAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoveAttributes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveIfDef(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeIfDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveIfDef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeIfDef")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveUniforms(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeUniforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveUniforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeUniforms")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveVaryings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeVaryings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveVaryings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeVaryings")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeatKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeatKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatKey")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceStrings(value: js.Array[Replace]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceStrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceStrings")(js.undefined)
        ret
    }
  }
  
}

