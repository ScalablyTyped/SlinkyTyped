package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaultRootCauseService extends js.Object {
  /**
    * The account ID associated to the service.
    */
  var AccountId: js.UndefOr[String] = js.native
  /**
    * The path of root cause entities found on the service. 
    */
  var EntityPath: js.UndefOr[FaultRootCauseEntityPath] = js.native
  /**
    * A Boolean value indicating if the service is inferred from the trace.
    */
  var Inferred: js.UndefOr[NullableBoolean] = js.native
  /**
    * The service name.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * A collection of associated service names.
    */
  var Names: js.UndefOr[ServiceNames] = js.native
  /**
    * The type associated to the service.
    */
  var Type: js.UndefOr[String] = js.native
}

object FaultRootCauseService {
  @scala.inline
  def apply(): FaultRootCauseService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaultRootCauseService]
  }
  @scala.inline
  implicit class FaultRootCauseServiceOps[Self <: FaultRootCauseService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityPath(value: FaultRootCauseEntityPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityPath")(js.undefined)
        ret
    }
    @scala.inline
    def withInferred(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inferred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInferred: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inferred")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withNames(value: ServiceNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Names")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

