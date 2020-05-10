package typingsSlinky.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstructorMetadata extends js.Object {
  var compilerGeneratedMetadata: js.UndefOr[js.Array[js.Function]] = js.native
  var userGeneratedMetadata: MetadataMap = js.native
}

object ConstructorMetadata {
  @scala.inline
  def apply(userGeneratedMetadata: MetadataMap): ConstructorMetadata = {
    val __obj = js.Dynamic.literal(userGeneratedMetadata = userGeneratedMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorMetadata]
  }
  @scala.inline
  implicit class ConstructorMetadataOps[Self <: ConstructorMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserGeneratedMetadata(value: MetadataMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userGeneratedMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompilerGeneratedMetadata(value: js.Array[js.Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilerGeneratedMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompilerGeneratedMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilerGeneratedMetadata")(js.undefined)
        ret
    }
  }
  
}

