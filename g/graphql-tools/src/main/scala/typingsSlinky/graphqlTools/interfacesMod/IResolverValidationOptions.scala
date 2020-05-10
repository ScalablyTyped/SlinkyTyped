package typingsSlinky.graphqlTools.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResolverValidationOptions extends js.Object {
  var allowResolversNotInSchema: js.UndefOr[Boolean] = js.native
  var requireResolversForAllFields: js.UndefOr[Boolean] = js.native
  var requireResolversForArgs: js.UndefOr[Boolean] = js.native
  var requireResolversForNonScalar: js.UndefOr[Boolean] = js.native
  var requireResolversForResolveType: js.UndefOr[Boolean] = js.native
}

object IResolverValidationOptions {
  @scala.inline
  def apply(): IResolverValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResolverValidationOptions]
  }
  @scala.inline
  implicit class IResolverValidationOptionsOps[Self <: IResolverValidationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowResolversNotInSchema(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowResolversNotInSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowResolversNotInSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowResolversNotInSchema")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireResolversForAllFields(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireResolversForAllFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireResolversForAllFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireResolversForAllFields")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireResolversForArgs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireResolversForArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireResolversForArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireResolversForArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireResolversForNonScalar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireResolversForNonScalar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireResolversForNonScalar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireResolversForNonScalar")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireResolversForResolveType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireResolversForResolveType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireResolversForResolveType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireResolversForResolveType")(js.undefined)
        ret
    }
  }
  
}

