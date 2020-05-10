package typingsSlinky.officeUiFabricReact.docPageTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITableJson extends js.Object {
  var deprecated: js.UndefOr[Boolean] = js.native
  var deprecatedMessage: js.UndefOr[String] = js.native
  var description: String = js.native
  /**
    * Any types the item extends, translated to an array of text elements and links to other types.
    * For classes and interfaces only.
    */
  var extendsTokens: js.Array[ILinkToken] = js.native
  var kind: ApiKind = js.native
  var members: js.UndefOr[js.Array[IEnumTableRowJson | ITableRowJson]] = js.native
  var name: String = js.native
}

object ITableJson {
  @scala.inline
  def apply(description: String, extendsTokens: js.Array[ILinkToken], kind: ApiKind, name: String): ITableJson = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], extendsTokens = extendsTokens.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableJson]
  }
  @scala.inline
  implicit class ITableJsonOps[Self <: ITableJson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtendsTokens(value: js.Array[ILinkToken]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendsTokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: ApiKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeprecated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecatedMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecatedMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withMembers(value: js.Array[IEnumTableRowJson | ITableRowJson]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(js.undefined)
        ret
    }
  }
  
}

