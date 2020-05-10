package typingsSlinky.keystonejsKeystone.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Hooks */
@js.native
trait ListSchema[Fields /* <: String */] extends js.Object {
  var access: js.UndefOr[Access] = js.native
  var fields: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ fieldName in Fields ]: @keystonejs/keystone.@keystonejs/keystone.AllFieldsOptions<string>}
    */ typingsSlinky.keystonejsKeystone.keystonejsKeystoneStrings.ListSchema with TopLevel[js.Any] = js.native
  var hooks: js.UndefOr[Hooks] = js.native
  var listAdapterClass: js.UndefOr[js.Any] = js.native
  var plugins: js.UndefOr[js.Array[Plugin]] = js.native
   // TODO: investigate if a specific type can be provided
  var schemaDoc: js.UndefOr[String] = js.native
}

object ListSchema {
  @scala.inline
  def apply[Fields](
    fields: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ fieldName in Fields ]: @keystonejs/keystone.@keystonejs/keystone.AllFieldsOptions<string>}
    */ typingsSlinky.keystonejsKeystone.keystonejsKeystoneStrings.ListSchema with TopLevel[js.Any]
  ): ListSchema[Fields] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchema[Fields]]
  }
  @scala.inline
  implicit class ListSchemaOps[Self[fields] <: ListSchema[fields], Fields] (val x: Self[Fields]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Fields] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Fields]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Fields] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Fields] with Other]
    @scala.inline
    def withFields(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ fieldName in Fields ]: @keystonejs/keystone.@keystonejs/keystone.AllFieldsOptions<string>}
      */ typingsSlinky.keystonejsKeystone.keystonejsKeystoneStrings.ListSchema with TopLevel[js.Any]
    ): Self[Fields] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessFunction1(value: /* context */ AuthenticationContext => Boolean | GraphQLWhereClause): Self[Fields] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAccess(value: Access): Self[Fields] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess: Self[Fields] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(js.undefined)
        ret
    }
    @scala.inline
    def withHooks(value: Hooks): Self[Fields] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHooks: Self[Fields] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(js.undefined)
        ret
    }
    @scala.inline
    def withListAdapterClass(value: js.Any): Self[Fields] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listAdapterClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListAdapterClass: Self[Fields] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listAdapterClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[Plugin]): Self[Fields] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self[Fields] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaDoc(value: String): Self[Fields] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaDoc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaDoc: Self[Fields] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaDoc")(js.undefined)
        ret
    }
  }
  
}

