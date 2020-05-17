package typingsSlinky.agGrid.componentMetadataProviderMod

import typingsSlinky.agGrid.anon.InstantiableIComponent
import typingsSlinky.agGrid.componentProviderMod.AgGridComponentFunctionInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentMetadata extends js.Object {
  var functionAdapter: js.UndefOr[
    js.Function1[/* callback */ AgGridComponentFunctionInput, InstantiableIComponent]
  ] = js.native
  var mandatoryMethodList: js.Array[String] = js.native
  var optionalMethodList: js.Array[String] = js.native
}

object ComponentMetadata {
  @scala.inline
  def apply(mandatoryMethodList: js.Array[String], optionalMethodList: js.Array[String]): ComponentMetadata = {
    val __obj = js.Dynamic.literal(mandatoryMethodList = mandatoryMethodList.asInstanceOf[js.Any], optionalMethodList = optionalMethodList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentMetadata]
  }
  @scala.inline
  implicit class ComponentMetadataOps[Self <: ComponentMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMandatoryMethodList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mandatoryMethodList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionalMethodList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalMethodList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunctionAdapter(value: /* callback */ AgGridComponentFunctionInput => InstantiableIComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionAdapter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFunctionAdapter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionAdapter")(js.undefined)
        ret
    }
  }
  
}

