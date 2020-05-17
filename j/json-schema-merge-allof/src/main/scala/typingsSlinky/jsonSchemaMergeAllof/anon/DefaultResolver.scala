package typingsSlinky.jsonSchemaMergeAllof.anon

import typingsSlinky.jsonSchemaMergeAllof.mod.JSONSchema
import typingsSlinky.jsonSchemaMergeAllof.mod.MergeSchemas
import typingsSlinky.jsonSchemaMergeAllof.mod.Options_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultResolver[Schema /* <: JSONSchema */] extends js.Object {
  /**
    * ### Default resolver
    * You can set a default resolver that catches any unknown keyword.
    * Let's say you want to use the same strategy as the ones for the
    * meta keywords, to use the first value found. You can accomplish
    * that like this:
    *
    * ```js
    * mergeJsonSchema({
    *   ...
    * }, {
    *   resolvers: {
    *       defaultResolver: mergeJsonSchema.options.resolvers.title
    *   }
    * })
    * ```
    */
  var defaultResolver: js.UndefOr[
    js.Function4[
      /* values */ js.Array[_], 
      /* path */ js.Array[String], 
      /* mergeSchemas */ MergeSchemas, 
      /* options */ Options_[Schema], 
      _
    ]
  ] = js.native
}

object DefaultResolver {
  @scala.inline
  def apply[Schema](): DefaultResolver[Schema] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultResolver[Schema]]
  }
  @scala.inline
  implicit class DefaultResolverOps[Self[schema] <: DefaultResolver[schema], Schema] (val x: Self[Schema]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Schema] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Schema]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Schema] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Schema] with Other]
    @scala.inline
    def withDefaultResolver(
      value: (/* values */ js.Array[_], /* path */ js.Array[String], /* mergeSchemas */ MergeSchemas, /* options */ Options_[Schema]) => _
    ): Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultResolver")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutDefaultResolver: Self[Schema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultResolver")(js.undefined)
        ret
    }
  }
  
}

