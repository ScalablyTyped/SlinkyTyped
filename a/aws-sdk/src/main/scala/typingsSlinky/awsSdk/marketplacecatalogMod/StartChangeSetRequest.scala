package typingsSlinky.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartChangeSetRequest extends js.Object {
  /**
    * The catalog related to the request. Fixed value: AWSMarketplace 
    */
  var Catalog: typingsSlinky.awsSdk.marketplacecatalogMod.Catalog = js.native
  /**
    * Array of change object.
    */
  var ChangeSet: RequestedChangeList = js.native
  /**
    * Optional case sensitive string of up to 100 ASCII characters. The change set name can be used to filter the list of change sets. 
    */
  var ChangeSetName: js.UndefOr[typingsSlinky.awsSdk.marketplacecatalogMod.ChangeSetName] = js.native
  /**
    * A unique token to identify the request to ensure idempotency.
    */
  var ClientRequestToken: js.UndefOr[typingsSlinky.awsSdk.marketplacecatalogMod.ClientRequestToken] = js.native
}

object StartChangeSetRequest {
  @scala.inline
  def apply(Catalog: Catalog, ChangeSet: RequestedChangeList): StartChangeSetRequest = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any], ChangeSet = ChangeSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartChangeSetRequest]
  }
  @scala.inline
  implicit class StartChangeSetRequestOps[Self <: StartChangeSetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCatalog(value: Catalog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Catalog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeSet(value: RequestedChangeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeSetName(value: ChangeSetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSetName")(js.undefined)
        ret
    }
    @scala.inline
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(js.undefined)
        ret
    }
  }
  
}

