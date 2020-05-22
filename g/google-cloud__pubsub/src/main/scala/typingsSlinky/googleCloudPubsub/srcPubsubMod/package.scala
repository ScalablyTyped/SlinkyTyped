package typingsSlinky.googleCloudPubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcPubsubMod {
  type EmptyCallback = typingsSlinky.googleCloudPubsub.srcPubsubMod.RequestCallback[typingsSlinky.googleCloudPubsub.pubsubMod.google.protobuf.IEmpty, scala.Unit]
  type EmptyResponse = js.Array[typingsSlinky.googleCloudPubsub.pubsubMod.google.protobuf.IEmpty]
  type ExistsCallback = typingsSlinky.googleCloudPubsub.srcPubsubMod.RequestCallback[scala.Boolean, scala.Unit]
  type ExistsResponse = js.Array[scala.Boolean]
  type GetAllSubscriptionsCallback = typingsSlinky.googleCloudPubsub.srcPubsubMod.RequestCallback[
    typingsSlinky.googleCloudPubsub.subscriptionMod.Subscription, 
    typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1.IListSubscriptionsResponse
  ]
  type GetAllSubscriptionsResponse = typingsSlinky.googleCloudPubsub.srcPubsubMod.PagedResponse[
    typingsSlinky.googleCloudPubsub.subscriptionMod.Subscription, 
    typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1.IListSubscriptionsResponse
  ]
  type GetClientCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* gaxClient */ js.UndefOr[typingsSlinky.googleGax.mod.ClientStub], 
    scala.Unit
  ]
  type GetSnapshotsCallback = typingsSlinky.googleCloudPubsub.srcPubsubMod.RequestCallback[
    typingsSlinky.googleCloudPubsub.snapshotMod.Snapshot, 
    typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1.IListSnapshotsResponse
  ]
  type GetSnapshotsResponse = typingsSlinky.googleCloudPubsub.srcPubsubMod.PagedResponse[
    typingsSlinky.googleCloudPubsub.snapshotMod.Snapshot, 
    typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1.IListSnapshotsResponse
  ]
  type GetSubscriptionsCallback = typingsSlinky.googleCloudPubsub.srcPubsubMod.GetAllSubscriptionsCallback | typingsSlinky.googleCloudPubsub.topicMod.GetTopicSubscriptionsCallback
  type GetSubscriptionsResponse = typingsSlinky.googleCloudPubsub.srcPubsubMod.GetAllSubscriptionsResponse | typingsSlinky.googleCloudPubsub.topicMod.GetTopicSubscriptionsResponse
  type GetTopicsCallback = typingsSlinky.googleCloudPubsub.srcPubsubMod.RequestCallback[
    typingsSlinky.googleCloudPubsub.topicMod.Topic, 
    typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1.IListTopicsResponse
  ]
  type GetTopicsResponse = typingsSlinky.googleCloudPubsub.srcPubsubMod.PagedResponse[
    typingsSlinky.googleCloudPubsub.topicMod.Topic, 
    typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1.IListTopicsResponse
  ]
  type NormalCallback[TResponse] = js.Function2[
    /* err */ typingsSlinky.grpcGrpcJs.callMod.ServiceError | scala.Null, 
    /* res */ js.UndefOr[TResponse | scala.Null], 
    scala.Unit
  ]
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  type PagedCallback[Item, Response] = js.Function4[
    /* err */ typingsSlinky.grpcGrpcJs.callMod.ServiceError | scala.Null, 
    /* results */ js.UndefOr[js.Array[Item] | scala.Null], 
    /* nextQuery */ js.UndefOr[js.Object | scala.Null], 
    /* response */ js.UndefOr[Response | scala.Null], 
    scala.Unit
  ]
  type PagedResponse[Item, Response] = js.Array[js.Array[Item]] | (js.Tuple3[js.Array[Item], js.Object | scala.Null, Response])
  type RequestCallback[T, R] = (typingsSlinky.googleCloudPubsub.srcPubsubMod.PagedCallback[T, R]) | typingsSlinky.googleCloudPubsub.srcPubsubMod.NormalCallback[T]
  type ResourceCallback[Resource, Response] = js.Function3[
    /* err */ typingsSlinky.grpcGrpcJs.callMod.ServiceError | scala.Null, 
    /* resource */ js.UndefOr[Resource | scala.Null], 
    /* response */ js.UndefOr[Response | scala.Null], 
    scala.Unit
  ]
}
