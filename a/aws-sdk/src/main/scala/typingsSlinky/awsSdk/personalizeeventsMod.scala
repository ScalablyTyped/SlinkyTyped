package typingsSlinky.awsSdk

import typingsSlinky.awsSdk.configBaseMod.ConfigBase
import typingsSlinky.awsSdk.errorMod.AWSError
import typingsSlinky.awsSdk.requestMod.Request
import typingsSlinky.awsSdk.serviceMod.Service
import typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object personalizeeventsMod {
  
  @JSImport("aws-sdk/clients/personalizeevents", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ^ () extends PersonalizeEvents {
    def this(options: ClientConfiguration) = this()
  }
  
  type Arn = String
  
  @js.native
  trait Blob extends StObject
  
  @js.native
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typingsSlinky.awsSdk.personalizeeventsMod.apiVersion] = js.native
  }
  object ClientApiVersions {
    
    @scala.inline
    def apply(): ClientApiVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientApiVersions]
    }
    
    @scala.inline
    implicit class ClientApiVersionsMutableBuilder[Self <: ClientApiVersions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: apiVersion): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    }
  }
  
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  
  type Date = js.Date
  
  @js.native
  trait Event extends StObject {
    
    /**
      * An ID associated with the event. If an event ID is not provided, Amazon Personalize generates a unique ID for the event. An event ID is not used as an input to the model. Amazon Personalize uses the event ID to distinquish unique events. Any subsequent events after the first with the same event ID are not used in model training.
      */
    var eventId: js.UndefOr[StringType] = js.native
    
    /**
      * The type of event, such as click or download. This property corresponds to the EVENT_TYPE field of your Interactions schema and depends on the types of events you are tracking.
      */
    var eventType: StringType = js.native
    
    /**
      * The event value that corresponds to the EVENT_VALUE field of the Interactions schema.
      */
    var eventValue: js.UndefOr[FloatType] = js.native
    
    /**
      * A list of item IDs that represents the sequence of items you have shown the user. For example, ["itemId1", "itemId2", "itemId3"].
      */
    var impression: js.UndefOr[Impression] = js.native
    
    /**
      * The item ID key that corresponds to the ITEM_ID field of the Interactions schema.
      */
    var itemId: js.UndefOr[ItemId] = js.native
    
    /**
      * A string map of event-specific data that you might choose to record. For example, if a user rates a movie on your site, other than movie ID (itemId) and rating (eventValue) , you might also send the number of movie ratings made by the user. Each item in the map consists of a key-value pair. For example,  {"numberOfRatings": "12"}  The keys use camel case names that match the fields in the Interactions schema. In the above example, the numberOfRatings would match the 'NUMBER_OF_RATINGS' field defined in the Interactions schema.
      */
    var properties: js.UndefOr[EventPropertiesJSON] = js.native
    
    /**
      * The ID of the recommendation.
      */
    var recommendationId: js.UndefOr[RecommendationId] = js.native
    
    /**
      * The timestamp (in Unix time) on the client side when the event occurred.
      */
    var sentAt: js.Date = js.native
  }
  object Event {
    
    @scala.inline
    def apply(eventType: StringType, sentAt: js.Date): Event = {
      val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], sentAt = sentAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventId(value: StringType): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
      
      @scala.inline
      def setEventType(value: StringType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventValue(value: FloatType): Self = StObject.set(x, "eventValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventValueUndefined: Self = StObject.set(x, "eventValue", js.undefined)
      
      @scala.inline
      def setImpression(value: Impression): Self = StObject.set(x, "impression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImpressionUndefined: Self = StObject.set(x, "impression", js.undefined)
      
      @scala.inline
      def setImpressionVarargs(value: ItemId*): Self = StObject.set(x, "impression", js.Array(value :_*))
      
      @scala.inline
      def setItemId(value: ItemId): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      @scala.inline
      def setProperties(value: EventPropertiesJSON): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setRecommendationId(value: RecommendationId): Self = StObject.set(x, "recommendationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecommendationIdUndefined: Self = StObject.set(x, "recommendationId", js.undefined)
      
      @scala.inline
      def setSentAt(value: js.Date): Self = StObject.set(x, "sentAt", value.asInstanceOf[js.Any])
    }
  }
  
  type EventList = js.Array[Event]
  
  type EventPropertiesJSON = String
  
  type FloatType = Double
  
  type Impression = js.Array[ItemId]
  
  @js.native
  trait Item extends StObject {
    
    /**
      * The ID associated with the item.
      */
    var itemId: StringType = js.native
    
    /**
      * A string map of item-specific metadata. Each element in the map consists of a key-value pair. For example,   {"numberOfRatings": "12"}  The keys use camel case names that match the fields in the Items schema. In the above example, the numberOfRatings would match the 'NUMBER_OF_RATINGS' field defined in the Items schema.
      */
    var properties: js.UndefOr[ItemProperties] = js.native
  }
  object Item {
    
    @scala.inline
    def apply(itemId: StringType): Item = {
      val __obj = js.Dynamic.literal(itemId = itemId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItemId(value: StringType): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: ItemProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    }
  }
  
  type ItemId = String
  
  type ItemList = js.Array[Item]
  
  type ItemProperties = String
  
  @js.native
  trait PersonalizeEvents extends Service {
    
    @JSName("config")
    var config_PersonalizeEvents: ConfigBase with ClientConfiguration = js.native
    
    /**
      * Records user interaction event data. For more information see event-record-api.
      */
    def putEvents(): Request[js.Object, AWSError] = js.native
    def putEvents(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
    /**
      * Records user interaction event data. For more information see event-record-api.
      */
    def putEvents(params: PutEventsRequest): Request[js.Object, AWSError] = js.native
    def putEvents(params: PutEventsRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
    
    /**
      * Adds one or more items to an Items dataset. For more information see importing-items.
      */
    def putItems(): Request[js.Object, AWSError] = js.native
    def putItems(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
    /**
      * Adds one or more items to an Items dataset. For more information see importing-items.
      */
    def putItems(params: PutItemsRequest): Request[js.Object, AWSError] = js.native
    def putItems(params: PutItemsRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
    
    /**
      * Adds one or more users to a Users dataset. For more information see importing-users.
      */
    def putUsers(): Request[js.Object, AWSError] = js.native
    def putUsers(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
    /**
      * Adds one or more users to a Users dataset. For more information see importing-users.
      */
    def putUsers(params: PutUsersRequest): Request[js.Object, AWSError] = js.native
    def putUsers(params: PutUsersRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  }
  
  @js.native
  trait PutEventsRequest extends StObject {
    
    /**
      * A list of event data from the session.
      */
    var eventList: EventList = js.native
    
    /**
      * The session ID associated with the user's visit. Your application generates the sessionId when a user first visits your website or uses your application. Amazon Personalize uses the sessionId to associate events with the user before they log in. For more information see event-record-api.
      */
    var sessionId: StringType = js.native
    
    /**
      * The tracking ID for the event. The ID is generated by a call to the CreateEventTracker API.
      */
    var trackingId: StringType = js.native
    
    /**
      * The user associated with the event.
      */
    var userId: js.UndefOr[UserId] = js.native
  }
  object PutEventsRequest {
    
    @scala.inline
    def apply(eventList: EventList, sessionId: StringType, trackingId: StringType): PutEventsRequest = {
      val __obj = js.Dynamic.literal(eventList = eventList.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], trackingId = trackingId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutEventsRequest]
    }
    
    @scala.inline
    implicit class PutEventsRequestMutableBuilder[Self <: PutEventsRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventList(value: EventList): Self = StObject.set(x, "eventList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventListVarargs(value: Event*): Self = StObject.set(x, "eventList", js.Array(value :_*))
      
      @scala.inline
      def setSessionId(value: StringType): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackingId(value: StringType): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: UserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    }
  }
  
  @js.native
  trait PutItemsRequest extends StObject {
    
    /**
      * The Amazon Resource Number (ARN) of the Items dataset you are adding the item or items to.
      */
    var datasetArn: Arn = js.native
    
    /**
      * A list of item data.
      */
    var items: ItemList = js.native
  }
  object PutItemsRequest {
    
    @scala.inline
    def apply(datasetArn: Arn, items: ItemList): PutItemsRequest = {
      val __obj = js.Dynamic.literal(datasetArn = datasetArn.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutItemsRequest]
    }
    
    @scala.inline
    implicit class PutItemsRequestMutableBuilder[Self <: PutItemsRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatasetArn(value: Arn): Self = StObject.set(x, "datasetArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: ItemList): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PutUsersRequest extends StObject {
    
    /**
      * The Amazon Resource Number (ARN) of the Users dataset you are adding the user or users to.
      */
    var datasetArn: Arn = js.native
    
    /**
      * A list of user data.
      */
    var users: UserList = js.native
  }
  object PutUsersRequest {
    
    @scala.inline
    def apply(datasetArn: Arn, users: UserList): PutUsersRequest = {
      val __obj = js.Dynamic.literal(datasetArn = datasetArn.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutUsersRequest]
    }
    
    @scala.inline
    implicit class PutUsersRequestMutableBuilder[Self <: PutUsersRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatasetArn(value: Arn): Self = StObject.set(x, "datasetArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: UserList): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: User*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
  
  type RecommendationId = String
  
  type StringType = String
  
  @js.native
  trait User extends StObject {
    
    /**
      * A string map of user-specific metadata. Each element in the map consists of a key-value pair. For example,   {"numberOfVideosWatched": "45"}  The keys use camel case names that match the fields in the Users schema. In the above example, the numberOfVideosWatched would match the 'NUMBER_OF_VIDEOS_WATCHED' field defined in the Users schema.
      */
    var properties: js.UndefOr[UserProperties] = js.native
    
    /**
      * The ID associated with the user.
      */
    var userId: StringType = js.native
  }
  object User {
    
    @scala.inline
    def apply(userId: StringType): User = {
      val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[User]
    }
    
    @scala.inline
    implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProperties(value: UserProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setUserId(value: StringType): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  type UserId = String
  
  type UserList = js.Array[User]
  
  type UserProperties = String
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-03-22`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
