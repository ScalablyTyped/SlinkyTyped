package typingsSlinky.reactRelay.useLoadMoreFunctionMod

import typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment
import typingsSlinky.relayRuntime.readerNodeMod.ReaderPaginationMetadata
import typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typingsSlinky.relayRuntime.relayObservableMod.Observer
import typingsSlinky.relayRuntime.relayStoreTypesMod.RequestDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseLoadMoreFunctionArgs extends js.Object {
  var componentDisplayName: String = js.native
  var connectionPathInFragmentData: js.Array[String | Double] = js.native
  var direction: Direction = js.native
  var fragmentData: js.Any = js.native
  var fragmentIdentifier: String = js.native
  var fragmentNode: ReaderFragment = js.native
  var fragmentOwner: RequestDescriptor | (js.Array[RequestDescriptor | Null]) | Null = js.native
  var fragmentRefPathInResponse: js.Array[String | Double] = js.native
  var observer: Observer[GraphQLResponse] = js.native
  var paginationMetadata: ReaderPaginationMetadata = js.native
  var paginationRequest: ConcreteRequest = js.native
  def onReset(): Unit = js.native
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
    paginationRequest: ConcreteRequest
  ): UseLoadMoreFunctionArgs = {
    val __obj = js.Dynamic.literal(componentDisplayName = componentDisplayName.asInstanceOf[js.Any], connectionPathInFragmentData = connectionPathInFragmentData.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], fragmentData = fragmentData.asInstanceOf[js.Any], fragmentIdentifier = fragmentIdentifier.asInstanceOf[js.Any], fragmentNode = fragmentNode.asInstanceOf[js.Any], fragmentRefPathInResponse = fragmentRefPathInResponse.asInstanceOf[js.Any], observer = observer.asInstanceOf[js.Any], onReset = js.Any.fromFunction0(onReset), paginationMetadata = paginationMetadata.asInstanceOf[js.Any], paginationRequest = paginationRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseLoadMoreFunctionArgs]
  }
  @scala.inline
  implicit class UseLoadMoreFunctionArgsOps[Self <: UseLoadMoreFunctionArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionPathInFragmentData(value: js.Array[String | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionPathInFragmentData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: Direction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragmentData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragmentIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragmentNode(value: ReaderFragment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragmentRefPathInResponse(value: js.Array[String | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentRefPathInResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObserver(value: Observer[GraphQLResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPaginationMetadata(value: ReaderPaginationMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaginationRequest(value: ConcreteRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragmentOwner(value: RequestDescriptor | (js.Array[RequestDescriptor | Null])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragmentOwnerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentOwner")(null)
        ret
    }
  }
  
}

