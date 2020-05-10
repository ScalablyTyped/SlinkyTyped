package typingsSlinky.officeUiFabricReact.docPageTypesMod

import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.method
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITableRowJson extends js.Object {
  var defaultValue: js.UndefOr[String] = js.native
  var deprecated: Boolean = js.native
  var deprecatedMessage: js.UndefOr[String] = js.native
  var description: String = js.native
  var kind: js.UndefOr[method | property] = js.native
  var name: String = js.native
  var required: js.UndefOr[Boolean] = js.native
  /**
    * The row's type translated to an array of text elements and links to other types.
    * For example, `Readonly<IFoo>` would translate to:
    * `[{ text: 'Readonly<' }, { text: 'IFoo', hyperlinkedPage: '(page name)', pageKind: '(kind)' }, { text: '>' }]`
    */
  var typeTokens: js.Array[ILinkToken] = js.native
}

object ITableRowJson {
  @scala.inline
  def apply(deprecated: Boolean, description: String, name: String, typeTokens: js.Array[ILinkToken]): ITableRowJson = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typeTokens = typeTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableRowJson]
  }
  @scala.inline
  implicit class ITableRowJsonOps[Self <: ITableRowJson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeprecated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeTokens(value: js.Array[ILinkToken]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeTokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
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
    def withKind(value: method | property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
  }
  
}

