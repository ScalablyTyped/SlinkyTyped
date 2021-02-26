package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.all
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.createReference
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.deleteReference
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.updateReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRepositoryTriggerMod {
  
  @js.native
  trait RepositoryTrigger extends StObject {
    
    /**
      * <p>The branches that will be included in the trigger configuration. If you specify an empty array, the trigger will apply to all branches.</p> <note> <p>While no content is required in the array, you must include the array itself.</p> </note>
      */
    var branches: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
    
    /**
      * <p>Any custom data associated with the trigger that will be included in the information sent to the target of the trigger.</p>
      */
    var customData: js.UndefOr[String] = js.native
    
    /**
      * <p>The ARN of the resource that is the target for a trigger. For example, the ARN of a topic in Amazon Simple Notification Service (SNS).</p>
      */
    var destinationArn: String = js.native
    
    /**
      * <p>The repository events that will cause the trigger to run actions in another service, such as sending a notification through Amazon Simple Notification Service (SNS). </p> <note> <p>The valid value "all" cannot be used with any other values.</p> </note>
      */
    var events: (js.Array[all | updateReference | createReference | deleteReference | String]) | (js.Iterable[all | updateReference | createReference | deleteReference | String]) = js.native
    
    /**
      * <p>The name of the trigger.</p>
      */
    var name: String = js.native
  }
  object RepositoryTrigger {
    
    @scala.inline
    def apply(
      destinationArn: String,
      events: (js.Array[all | updateReference | createReference | deleteReference | String]) | (js.Iterable[all | updateReference | createReference | deleteReference | String]),
      name: String
    ): RepositoryTrigger = {
      val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryTrigger]
    }
    
    @scala.inline
    implicit class RepositoryTriggerMutableBuilder[Self <: RepositoryTrigger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBranches(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchesIterable(value: js.Iterable[String]): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchesUndefined: Self = StObject.set(x, "branches", js.undefined)
      
      @scala.inline
      def setBranchesVarargs(value: String*): Self = StObject.set(x, "branches", js.Array(value :_*))
      
      @scala.inline
      def setCustomData(value: String): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      @scala.inline
      def setDestinationArn(value: String): Self = StObject.set(x, "destinationArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvents(
        value: (js.Array[all | updateReference | createReference | deleteReference | String]) | (js.Iterable[all | updateReference | createReference | deleteReference | String])
      ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsIterable(value: js.Iterable[all | updateReference | createReference | deleteReference | String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsVarargs(value: (all | updateReference | createReference | deleteReference | String)*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnmarshalledRepositoryTrigger extends RepositoryTrigger {
    
    /**
      * <p>The branches that will be included in the trigger configuration. If you specify an empty array, the trigger will apply to all branches.</p> <note> <p>While no content is required in the array, you must include the array itself.</p> </note>
      */
    @JSName("branches")
    var branches_UnmarshalledRepositoryTrigger: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * <p>The repository events that will cause the trigger to run actions in another service, such as sending a notification through Amazon Simple Notification Service (SNS). </p> <note> <p>The valid value "all" cannot be used with any other values.</p> </note>
      */
    @JSName("events")
    var events_UnmarshalledRepositoryTrigger: js.Array[all | updateReference | createReference | deleteReference | String] = js.native
  }
  object UnmarshalledRepositoryTrigger {
    
    @scala.inline
    def apply(
      destinationArn: String,
      events: js.Array[all | updateReference | createReference | deleteReference | String],
      name: String
    ): UnmarshalledRepositoryTrigger = {
      val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledRepositoryTrigger]
    }
    
    @scala.inline
    implicit class UnmarshalledRepositoryTriggerMutableBuilder[Self <: UnmarshalledRepositoryTrigger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBranches(value: js.Array[String]): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchesUndefined: Self = StObject.set(x, "branches", js.undefined)
      
      @scala.inline
      def setBranchesVarargs(value: String*): Self = StObject.set(x, "branches", js.Array(value :_*))
      
      @scala.inline
      def setEvents(value: js.Array[all | updateReference | createReference | deleteReference | String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsVarargs(value: (all | updateReference | createReference | deleteReference | String)*): Self = StObject.set(x, "events", js.Array(value :_*))
    }
  }
}
