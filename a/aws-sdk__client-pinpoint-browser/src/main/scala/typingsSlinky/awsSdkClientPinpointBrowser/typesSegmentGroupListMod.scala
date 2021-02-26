package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ALL
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ANY
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.NONE
import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentGroupMod.SegmentGroup
import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentGroupMod.UnmarshalledSegmentGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSegmentGroupListMod {
  
  @js.native
  trait SegmentGroupList extends StObject {
    
    /**
      * A set of segment criteria to evaluate.
      */
    var Groups: js.UndefOr[js.Array[SegmentGroup] | js.Iterable[SegmentGroup]] = js.native
    
    /**
      * Specify how to handle multiple segment groups. For example, if the segment includes three segment groups, should the resulting segment include endpoints that are matched by all, any, or none of the segment groups you created. Acceptable values: ALL, ANY, or NONE.
      */
    var Include: js.UndefOr[ALL | ANY | NONE | String] = js.native
  }
  object SegmentGroupList {
    
    @scala.inline
    def apply(): SegmentGroupList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentGroupList]
    }
    
    @scala.inline
    implicit class SegmentGroupListMutableBuilder[Self <: SegmentGroupList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroups(value: js.Array[SegmentGroup] | js.Iterable[SegmentGroup]): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsIterable(value: js.Iterable[SegmentGroup]): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
      
      @scala.inline
      def setGroupsVarargs(value: SegmentGroup*): Self = StObject.set(x, "Groups", js.Array(value :_*))
      
      @scala.inline
      def setInclude(value: ALL | ANY | NONE | String): Self = StObject.set(x, "Include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "Include", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledSegmentGroupList extends SegmentGroupList {
    
    /**
      * A set of segment criteria to evaluate.
      */
    @JSName("Groups")
    var Groups_UnmarshalledSegmentGroupList: js.UndefOr[js.Array[UnmarshalledSegmentGroup]] = js.native
  }
  object UnmarshalledSegmentGroupList {
    
    @scala.inline
    def apply(): UnmarshalledSegmentGroupList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSegmentGroupList]
    }
    
    @scala.inline
    implicit class UnmarshalledSegmentGroupListMutableBuilder[Self <: UnmarshalledSegmentGroupList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroups(value: js.Array[UnmarshalledSegmentGroup]): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
      
      @scala.inline
      def setGroupsVarargs(value: UnmarshalledSegmentGroup*): Self = StObject.set(x, "Groups", js.Array(value :_*))
    }
  }
}
