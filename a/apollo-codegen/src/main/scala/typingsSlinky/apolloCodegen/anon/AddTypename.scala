package typingsSlinky.apolloCodegen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTypename extends js.Object {
  var addTypename: js.UndefOr[Boolean] = js.native
  var customScalarsPrefix: js.UndefOr[String] = js.native
  var generateOperationIds: js.UndefOr[Boolean] = js.native
  var mergeInFieldsFromFragmentSpreads: js.UndefOr[Boolean] = js.native
  var namespace: js.UndefOr[String] = js.native
  var operationIdsPath: js.UndefOr[String | Null] = js.native
  var passthroughCustomScalars: js.UndefOr[Boolean] = js.native
  var useFlowExactObjects: js.UndefOr[Boolean] = js.native
  var useFlowReadOnlyTypes: js.UndefOr[Boolean] = js.native
}

object AddTypename {
  @scala.inline
  def apply(): AddTypename = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddTypename]
  }
  @scala.inline
  implicit class AddTypenameOps[Self <: AddTypename] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddTypename(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTypename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddTypename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTypename")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomScalarsPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customScalarsPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomScalarsPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customScalarsPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateOperationIds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateOperationIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateOperationIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateOperationIds")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeInFieldsFromFragmentSpreads(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeInFieldsFromFragmentSpreads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeInFieldsFromFragmentSpreads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeInFieldsFromFragmentSpreads")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationIdsPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationIdsPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationIdsPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationIdsPath")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationIdsPathNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationIdsPath")(null)
        ret
    }
    @scala.inline
    def withPassthroughCustomScalars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passthroughCustomScalars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassthroughCustomScalars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passthroughCustomScalars")(js.undefined)
        ret
    }
    @scala.inline
    def withUseFlowExactObjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFlowExactObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseFlowExactObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFlowExactObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withUseFlowReadOnlyTypes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFlowReadOnlyTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseFlowReadOnlyTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFlowReadOnlyTypes")(js.undefined)
        ret
    }
  }
  
}

