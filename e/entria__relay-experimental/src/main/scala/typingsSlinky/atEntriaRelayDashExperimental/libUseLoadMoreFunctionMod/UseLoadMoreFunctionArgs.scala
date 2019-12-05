package typingsSlinky.atEntriaRelayDashExperimental.libUseLoadMoreFunctionMod

import typingsSlinky.relayDashRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typingsSlinky.relayDashRuntime.libNetworkRelayObservableMod.Observer
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.RequestDescriptor
import typingsSlinky.relayDashRuntime.libUtilReaderNodeMod.ReaderFragment
import typingsSlinky.relayDashRuntime.libUtilReaderNodeMod.ReaderPaginationMetadata
import typingsSlinky.relayDashRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseLoadMoreFunctionArgs extends js.Object {
  var componentDisplayName: String
  var connectionPathInFragmentData: js.Array[String | Double]
  var direction: Direction
  var fragmentData: js.Any
  var fragmentIdentifier: String
  var fragmentNode: ReaderFragment
  var fragmentOwner: RequestDescriptor | (js.Array[RequestDescriptor | Null]) | Null
  var fragmentRefPathInResponse: js.Array[String | Double]
  var observer: Observer[GraphQLResponse]
  var paginationMetadata: ReaderPaginationMetadata
  var paginationRequest: ConcreteRequest
  def onReset(): Unit
}

object UseLoadMoreFunctionArgs {
  @scala.inline
  def apply(
    componentDisplayName: String,
    connectionPathInFragmentData: js.Array[String | Double],
    direction: Direction,
    fragmentData: js.Any,
    fragmentIdentifier: String,
    fragmentNode: ReaderFragment,
    fragmentRefPathInResponse: js.Array[String | Double],
    observer: Observer[GraphQLResponse],
    onReset: () => Unit,
    paginationMetadata: ReaderPaginationMetadata,
    paginationRequest: ConcreteRequest,
    fragmentOwner: RequestDescriptor | (js.Array[RequestDescriptor | Null]) = null
  ): UseLoadMoreFunctionArgs = {
    val __obj = js.Dynamic.literal(componentDisplayName = componentDisplayName.asInstanceOf[js.Any], connectionPathInFragmentData = connectionPathInFragmentData.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], fragmentData = fragmentData.asInstanceOf[js.Any], fragmentIdentifier = fragmentIdentifier.asInstanceOf[js.Any], fragmentNode = fragmentNode.asInstanceOf[js.Any], fragmentRefPathInResponse = fragmentRefPathInResponse.asInstanceOf[js.Any], observer = observer.asInstanceOf[js.Any], onReset = js.Any.fromFunction0(onReset), paginationMetadata = paginationMetadata.asInstanceOf[js.Any], paginationRequest = paginationRequest.asInstanceOf[js.Any])
    if (fragmentOwner != null) __obj.updateDynamic("fragmentOwner")(fragmentOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseLoadMoreFunctionArgs]
  }
}

