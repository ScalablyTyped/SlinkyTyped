package typingsSlinky.postmanCollection.mod

import typingsSlinky.postmanCollection.postmanCollectionStrings.apikey
import typingsSlinky.postmanCollection.postmanCollectionStrings.awsv4
import typingsSlinky.postmanCollection.postmanCollectionStrings.basic
import typingsSlinky.postmanCollection.postmanCollectionStrings.bearer
import typingsSlinky.postmanCollection.postmanCollectionStrings.digest
import typingsSlinky.postmanCollection.postmanCollectionStrings.edgegrid
import typingsSlinky.postmanCollection.postmanCollectionStrings.hawk
import typingsSlinky.postmanCollection.postmanCollectionStrings.noauth
import typingsSlinky.postmanCollection.postmanCollectionStrings.ntlm
import typingsSlinky.postmanCollection.postmanCollectionStrings.oauth1
import typingsSlinky.postmanCollection.postmanCollectionStrings.oauth2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestAuthDefinition extends PropertyDefinition {
  var apikey: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var awsv4: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var basic: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var bearer: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var digest: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var edgegrid: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var hawk: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var ntlm: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var oauth1: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var oauth2: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var `type`: js.UndefOr[
    oauth2 | hawk | noauth | basic | oauth1 | apikey | digest | bearer | awsv4 | edgegrid | ntlm
  ] = js.native
}

object RequestAuthDefinition {
  @scala.inline
  def apply(): RequestAuthDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestAuthDefinition]
  }
  @scala.inline
  implicit class RequestAuthDefinitionOps[Self <: RequestAuthDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApikey(value: js.Array[VariableDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apikey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApikey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apikey")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsv4(value: js.Array[VariableDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsv4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsv4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsv4")(js.undefined)
        ret
    }
    @scala.inline
    def withBasic(value: js.Array[VariableDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basic")(js.undefined)
        ret
    }
    @scala.inline
    def withBearer(value: js.Array[VariableDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBearer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearer")(js.undefined)
        ret
    }
    @scala.inline
    def withDigest(value: js.Array[VariableDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digest")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgegrid(value: js.Array[VariableDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgegrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgegrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgegrid")(js.undefined)
        ret
    }
    @scala.inline
    def withHawk(value: js.Array[VariableDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hawk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHawk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hawk")(js.undefined)
        ret
    }
    @scala.inline
    def withNtlm(value: js.Array[VariableDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ntlm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNtlm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ntlm")(js.undefined)
        ret
    }
    @scala.inline
    def withOauth1(value: js.Array[VariableDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauth1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth1")(js.undefined)
        ret
    }
    @scala.inline
    def withOauth2(value: js.Array[VariableDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauth2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth2")(js.undefined)
        ret
    }
    @scala.inline
    def withType(
      value: oauth2 | hawk | noauth | basic | oauth1 | apikey | digest | bearer | awsv4 | edgegrid | ntlm
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

