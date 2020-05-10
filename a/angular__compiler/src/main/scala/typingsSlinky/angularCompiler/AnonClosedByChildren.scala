package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.tagsMod.TagContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClosedByChildren extends js.Object {
  var closedByChildren: js.UndefOr[js.Array[String]] = js.native
  var closedByParent: js.UndefOr[Boolean] = js.native
  var contentType: js.UndefOr[TagContentType] = js.native
  var ignoreFirstLf: js.UndefOr[Boolean] = js.native
  var implicitNamespacePrefix: js.UndefOr[String] = js.native
  var isVoid: js.UndefOr[Boolean] = js.native
}

object AnonClosedByChildren {
  @scala.inline
  def apply(): AnonClosedByChildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonClosedByChildren]
  }
  @scala.inline
  implicit class AnonClosedByChildrenOps[Self <: AnonClosedByChildren] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClosedByChildren(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closedByChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosedByChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closedByChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withClosedByParent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closedByParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosedByParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closedByParent")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: TagContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreFirstLf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFirstLf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreFirstLf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFirstLf")(js.undefined)
        ret
    }
    @scala.inline
    def withImplicitNamespacePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicitNamespacePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplicitNamespacePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicitNamespacePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVoid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVoid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsVoid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVoid")(js.undefined)
        ret
    }
  }
  
}

