package typingsSlinky.graphqlTools.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLParseOptions extends js.Object {
  var allowLegacySDLEmptyFields: js.UndefOr[Boolean] = js.native
  var allowLegacySDLImplementsInterfaces: js.UndefOr[Boolean] = js.native
  var experimentalFragmentVariables: js.UndefOr[Boolean] = js.native
  var noLocation: js.UndefOr[Boolean] = js.native
}

object GraphQLParseOptions {
  @scala.inline
  def apply(): GraphQLParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLParseOptions]
  }
  @scala.inline
  implicit class GraphQLParseOptionsOps[Self <: GraphQLParseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowLegacySDLEmptyFields(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLegacySDLEmptyFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowLegacySDLEmptyFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLegacySDLEmptyFields")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowLegacySDLImplementsInterfaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLegacySDLImplementsInterfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowLegacySDLImplementsInterfaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLegacySDLImplementsInterfaces")(js.undefined)
        ret
    }
    @scala.inline
    def withExperimentalFragmentVariables(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalFragmentVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimentalFragmentVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalFragmentVariables")(js.undefined)
        ret
    }
    @scala.inline
    def withNoLocation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noLocation")(js.undefined)
        ret
    }
  }
  
}

