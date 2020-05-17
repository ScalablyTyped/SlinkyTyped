package typingsSlinky.openui5.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterValueSetRequest extends js.Object {
  /**
    * Get the filter expression for this request.Expressions are represented by separate objects. If none
    * exists so far, anew expression object gets created.
    * @returns The filter object         associated to this request.
    */
  def getFilterExpression(): FilterExpression = js.native
  /**
    * Get the sort expression for this request.Expressions are represented by separate objects. If none
    * exists so far, anew expression object gets created.
    * @returns The sort object         associated to this request.
    */
  def getSortExpression(): SortExpression = js.native
  /**
    * Get the value of an query option for the OData request URI correspondingto this request.
    * @param sQueryOptionName Identifies the query option: $select,           $filter,... or any custom
    * query option
    * @returns The value of the requested query option or null, if         this option is not used for the
    * OData request.
    */
  def getURIQueryOptionValue(sQueryOptionName: String): String = js.native
  /**
    * Get the unescaped URI to fetch the parameter value set.
    * @param sServiceRootURI (optional) Identifies the root of the OData           service
    * @returns The unescaped URI that contains the OData resource path         and OData system query
    * options to express the request for the         parameter value set..
    */
  def getURIToParameterValueSetEntries(sServiceRootURI: String): String = js.native
  /**
    * Specify which components of the parameter shall be included in the valueset.
    * @param bIncludeText Indicator whether or not to include the parameter text (if           available)
    * in the value set. Pass null to keep current           setting.
    */
  def includeParameterText(bIncludeText: js.Any): Unit = js.native
  /**
    * Set the filter expression for this request.Expressions are represented by separate objects. Calling
    * this methodreplaces the filter object maintained by this request.
    * @param oFilter The filter object to be associated with this request.
    */
  def setFilterExpression(oFilter: FilterExpression): Unit = js.native
  /**
    * Set the sort expression for this request.Expressions are represented by separate objects. Calling
    * this methodreplaces the sort object maintained by this request.
    * @param oSorter The sort object to be associated with this request.
    */
  def setSortExpression(oSorter: SortExpression): Unit = js.native
}

object ParameterValueSetRequest {
  @scala.inline
  def apply(
    getFilterExpression: () => FilterExpression,
    getSortExpression: () => SortExpression,
    getURIQueryOptionValue: String => String,
    getURIToParameterValueSetEntries: String => String,
    includeParameterText: js.Any => Unit,
    setFilterExpression: FilterExpression => Unit,
    setSortExpression: SortExpression => Unit
  ): ParameterValueSetRequest = {
    val __obj = js.Dynamic.literal(getFilterExpression = js.Any.fromFunction0(getFilterExpression), getSortExpression = js.Any.fromFunction0(getSortExpression), getURIQueryOptionValue = js.Any.fromFunction1(getURIQueryOptionValue), getURIToParameterValueSetEntries = js.Any.fromFunction1(getURIToParameterValueSetEntries), includeParameterText = js.Any.fromFunction1(includeParameterText), setFilterExpression = js.Any.fromFunction1(setFilterExpression), setSortExpression = js.Any.fromFunction1(setSortExpression))
    __obj.asInstanceOf[ParameterValueSetRequest]
  }
  @scala.inline
  implicit class ParameterValueSetRequestOps[Self <: ParameterValueSetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetFilterExpression(value: () => FilterExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilterExpression")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSortExpression(value: () => SortExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSortExpression")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetURIQueryOptionValue(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getURIQueryOptionValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetURIToParameterValueSetEntries(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getURIToParameterValueSetEntries")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIncludeParameterText(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeParameterText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFilterExpression(value: FilterExpression => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilterExpression")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSortExpression(value: SortExpression => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSortExpression")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

