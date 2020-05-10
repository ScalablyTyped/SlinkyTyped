package typingsSlinky.angularCompiler.serializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaceholderMapper extends js.Object {
  def toInternalName(publicName: String): String | Null = js.native
  def toPublicName(internalName: String): String | Null = js.native
}

object PlaceholderMapper {
  @scala.inline
  def apply(toInternalName: String => String | Null, toPublicName: String => String | Null): PlaceholderMapper = {
    val __obj = js.Dynamic.literal(toInternalName = js.Any.fromFunction1(toInternalName), toPublicName = js.Any.fromFunction1(toPublicName))
    __obj.asInstanceOf[PlaceholderMapper]
  }
  @scala.inline
  implicit class PlaceholderMapperOps[Self <: PlaceholderMapper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToInternalName(value: String => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toInternalName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToPublicName(value: String => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPublicName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

