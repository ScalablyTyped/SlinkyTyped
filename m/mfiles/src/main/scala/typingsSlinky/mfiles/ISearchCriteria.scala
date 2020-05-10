package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFFacetFilterStatusFlags
import typingsSlinky.mfiles.MFiles.MFFullTextSearchFlags
import typingsSlinky.mfiles.MFiles.MFPredefinedSearchFilterType
import typingsSlinky.mfiles.MFiles.MFSearchFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchCriteria extends js.Object {
  var AdditionalConditions: ISearchConditionExs = js.native
  var ExpandUI: Boolean = js.native
  var FacetFilterAsJSON: String = js.native
  var FacetFilterStatusFlags: MFFacetFilterStatusFlags = js.native
  var FirstCondition: ISearchConditionEx = js.native
  var FullTextSearchFlags: MFFullTextSearchFlags = js.native
  var FullTextSearchString: String = js.native
  var ObjectTypeCondition: ISearchConditionEx = js.native
  var PredefinedSearchFilter: MFPredefinedSearchFilterType = js.native
  var PreviousBaseConditions: ISearchConditions = js.native
  var SearchFlags: MFSearchFlags = js.native
  var SearchRefinement: ISearchConditions = js.native
  var SearchWithinThisFolder: Boolean = js.native
  var SecondCondition: ISearchConditionEx = js.native
  def Clone(): ISearchCriteria = js.native
  def GetAsSearchConditions(
    ForceGettingExpandedConds: Boolean,
    IncludeSearchRefinementConditions: Boolean,
    IncludePreviousBaseConditions: Boolean
  ): ISearchConditions = js.native
}

object ISearchCriteria {
  @scala.inline
  def apply(
    AdditionalConditions: ISearchConditionExs,
    Clone: () => ISearchCriteria,
    ExpandUI: Boolean,
    FacetFilterAsJSON: String,
    FacetFilterStatusFlags: MFFacetFilterStatusFlags,
    FirstCondition: ISearchConditionEx,
    FullTextSearchFlags: MFFullTextSearchFlags,
    FullTextSearchString: String,
    GetAsSearchConditions: (Boolean, Boolean, Boolean) => ISearchConditions,
    ObjectTypeCondition: ISearchConditionEx,
    PredefinedSearchFilter: MFPredefinedSearchFilterType,
    PreviousBaseConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SearchRefinement: ISearchConditions,
    SearchWithinThisFolder: Boolean,
    SecondCondition: ISearchConditionEx
  ): ISearchCriteria = {
    val __obj = js.Dynamic.literal(AdditionalConditions = AdditionalConditions.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), ExpandUI = ExpandUI.asInstanceOf[js.Any], FacetFilterAsJSON = FacetFilterAsJSON.asInstanceOf[js.Any], FacetFilterStatusFlags = FacetFilterStatusFlags.asInstanceOf[js.Any], FirstCondition = FirstCondition.asInstanceOf[js.Any], FullTextSearchFlags = FullTextSearchFlags.asInstanceOf[js.Any], FullTextSearchString = FullTextSearchString.asInstanceOf[js.Any], GetAsSearchConditions = js.Any.fromFunction3(GetAsSearchConditions), ObjectTypeCondition = ObjectTypeCondition.asInstanceOf[js.Any], PredefinedSearchFilter = PredefinedSearchFilter.asInstanceOf[js.Any], PreviousBaseConditions = PreviousBaseConditions.asInstanceOf[js.Any], SearchFlags = SearchFlags.asInstanceOf[js.Any], SearchRefinement = SearchRefinement.asInstanceOf[js.Any], SearchWithinThisFolder = SearchWithinThisFolder.asInstanceOf[js.Any], SecondCondition = SecondCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchCriteria]
  }
  @scala.inline
  implicit class ISearchCriteriaOps[Self <: ISearchCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalConditions(value: ISearchConditionExs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalConditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => ISearchCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExpandUI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpandUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacetFilterAsJSON(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FacetFilterAsJSON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacetFilterStatusFlags(value: MFFacetFilterStatusFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FacetFilterStatusFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstCondition(value: ISearchConditionEx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullTextSearchFlags(value: MFFullTextSearchFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullTextSearchFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullTextSearchString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullTextSearchString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAsSearchConditions(value: (Boolean, Boolean, Boolean) => ISearchConditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAsSearchConditions")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withObjectTypeCondition(value: ISearchConditionEx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPredefinedSearchFilter(value: MFPredefinedSearchFilterType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredefinedSearchFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousBaseConditions(value: ISearchConditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousBaseConditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchFlags(value: MFSearchFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchRefinement(value: ISearchConditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchRefinement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchWithinThisFolder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchWithinThisFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondCondition(value: ISearchConditionEx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondCondition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

