package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserDefinedFunctionInput extends js.Object {
  /**
    * The Java class that contains the function code.
    */
  var ClassName: js.UndefOr[NameString] = js.native
  /**
    * The name of the function.
    */
  var FunctionName: js.UndefOr[NameString] = js.native
  /**
    * The owner of the function.
    */
  var OwnerName: js.UndefOr[NameString] = js.native
  /**
    * The owner type.
    */
  var OwnerType: js.UndefOr[PrincipalType] = js.native
  /**
    * The resource URIs for the function.
    */
  var ResourceUris: js.UndefOr[ResourceUriList] = js.native
}

object UserDefinedFunctionInput {
  @scala.inline
  def apply(): UserDefinedFunctionInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDefinedFunctionInput]
  }
  @scala.inline
  implicit class UserDefinedFunctionInputOps[Self <: UserDefinedFunctionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionName")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerName")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerType(value: PrincipalType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerType")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceUris(value: ResourceUriList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceUris")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceUris: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceUris")(js.undefined)
        ret
    }
  }
  
}

