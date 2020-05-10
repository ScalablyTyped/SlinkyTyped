package typingsSlinky.graphqlBinding.distTypesMod

import typingsSlinky.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindingOptions extends js.Object {
  var before: js.UndefOr[js.Function0[Unit]] = js.native
  var disableCache: js.UndefOr[Boolean] = js.native
  var fragmentReplacements: js.UndefOr[js.Array[FragmentReplacement]] = js.native
  var schema: GraphQLSchema = js.native
}

object BindingOptions {
  @scala.inline
  def apply(schema: GraphQLSchema): BindingOptions = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingOptions]
  }
  @scala.inline
  implicit class BindingOptionsOps[Self <: BindingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSchema(value: GraphQLSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBefore(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCache")(js.undefined)
        ret
    }
    @scala.inline
    def withFragmentReplacements(value: js.Array[FragmentReplacement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentReplacements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragmentReplacements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentReplacements")(js.undefined)
        ret
    }
  }
  
}

