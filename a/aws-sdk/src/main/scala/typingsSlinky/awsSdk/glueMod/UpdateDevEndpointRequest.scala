package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDevEndpointRequest extends js.Object {
  /**
    * The map of arguments to add the map of arguments used to configure the DevEndpoint. Valid arguments are:    "--enable-glue-datacatalog": ""     "GLUE_PYTHON_VERSION": "3"     "GLUE_PYTHON_VERSION": "2"    You can specify a version of Python support for development endpoints by using the Arguments parameter in the CreateDevEndpoint or UpdateDevEndpoint APIs. If no arguments are provided, the version defaults to Python 2.
    */
  var AddArguments: js.UndefOr[MapValue] = js.native
  /**
    * The list of public keys for the DevEndpoint to use.
    */
  var AddPublicKeys: js.UndefOr[PublicKeysList] = js.native
  /**
    * Custom Python or Java libraries to be loaded in the DevEndpoint.
    */
  var CustomLibraries: js.UndefOr[DevEndpointCustomLibraries] = js.native
  /**
    * The list of argument keys to be deleted from the map of arguments used to configure the DevEndpoint.
    */
  var DeleteArguments: js.UndefOr[StringList] = js.native
  /**
    * The list of public keys to be deleted from the DevEndpoint.
    */
  var DeletePublicKeys: js.UndefOr[PublicKeysList] = js.native
  /**
    * The name of the DevEndpoint to be updated.
    */
  var EndpointName: GenericString = js.native
  /**
    * The public key for the DevEndpoint to use.
    */
  var PublicKey: js.UndefOr[GenericString] = js.native
  /**
    *  True if the list of custom libraries to be loaded in the development endpoint needs to be updated, or False if otherwise.
    */
  var UpdateEtlLibraries: js.UndefOr[BooleanValue] = js.native
}

object UpdateDevEndpointRequest {
  @scala.inline
  def apply(EndpointName: GenericString): UpdateDevEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDevEndpointRequest]
  }
  @scala.inline
  implicit class UpdateDevEndpointRequestOps[Self <: UpdateDevEndpointRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointName(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddArguments(value: MapValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddArguments")(js.undefined)
        ret
    }
    @scala.inline
    def withAddPublicKeys(value: PublicKeysList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddPublicKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddPublicKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddPublicKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomLibraries(value: DevEndpointCustomLibraries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomLibraries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomLibraries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomLibraries")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteArguments(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteArguments")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletePublicKeys(value: PublicKeysList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletePublicKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletePublicKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletePublicKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicKey(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKey")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateEtlLibraries(value: BooleanValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateEtlLibraries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateEtlLibraries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateEtlLibraries")(js.undefined)
        ret
    }
  }
  
}

