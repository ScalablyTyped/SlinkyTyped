package typingsSlinky.angularCompiler.tagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagDefinition extends js.Object {
  var canSelfClose: Boolean = js.native
  var closedByParent: Boolean = js.native
  var contentType: TagContentType = js.native
  var ignoreFirstLf: Boolean = js.native
  var implicitNamespacePrefix: String | Null = js.native
  var isVoid: Boolean = js.native
  def isClosedByChild(name: String): Boolean = js.native
}

object TagDefinition {
  @scala.inline
  def apply(
    canSelfClose: Boolean,
    closedByParent: Boolean,
    contentType: TagContentType,
    ignoreFirstLf: Boolean,
    isClosedByChild: String => Boolean,
    isVoid: Boolean
  ): TagDefinition = {
    val __obj = js.Dynamic.literal(canSelfClose = canSelfClose.asInstanceOf[js.Any], closedByParent = closedByParent.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], ignoreFirstLf = ignoreFirstLf.asInstanceOf[js.Any], isClosedByChild = js.Any.fromFunction1(isClosedByChild), isVoid = isVoid.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagDefinition]
  }
  @scala.inline
  implicit class TagDefinitionOps[Self <: TagDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanSelfClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSelfClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosedByParent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closedByParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentType(value: TagContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreFirstLf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFirstLf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsClosedByChild(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClosedByChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsVoid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVoid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImplicitNamespacePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicitNamespacePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImplicitNamespacePrefixNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicitNamespacePrefix")(null)
        ret
    }
  }
  
}

