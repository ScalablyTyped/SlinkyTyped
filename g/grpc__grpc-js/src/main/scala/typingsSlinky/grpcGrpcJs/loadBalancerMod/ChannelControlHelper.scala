package typingsSlinky.grpcGrpcJs.loadBalancerMod

import typingsSlinky.grpcGrpcJs.channelMod.ConnectivityState
import typingsSlinky.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typingsSlinky.grpcGrpcJs.pickerMod.Picker
import typingsSlinky.grpcGrpcJs.subchannelMod.Subchannel
import typingsSlinky.grpcGrpcJs.subchannelMod.SubchannelAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelControlHelper extends js.Object {
  /**
    * Returns a subchannel connected to the specified address.
    * @param subchannelAddress The address to connect to
    * @param subchannelArgs Extra channel arguments specified by the load balancer
    */
  def createSubchannel(subchannelAddress: SubchannelAddress, subchannelArgs: ChannelOptions): Subchannel = js.native
  /**
    * Request new data from the resolver.
    */
  def requestReresolution(): Unit = js.native
  /**
    * Passes a new subchannel picker up to the channel. This is called if either
    * the connectivity state changes or if a different picker is needed for any
    * other reason.
    * @param connectivityState New connectivity state
    * @param picker New picker
    */
  def updateState(connectivityState: ConnectivityState, picker: Picker): Unit = js.native
}

object ChannelControlHelper {
  @scala.inline
  def apply(
    createSubchannel: (SubchannelAddress, ChannelOptions) => Subchannel,
    requestReresolution: () => Unit,
    updateState: (ConnectivityState, Picker) => Unit
  ): ChannelControlHelper = {
    val __obj = js.Dynamic.literal(createSubchannel = js.Any.fromFunction2(createSubchannel), requestReresolution = js.Any.fromFunction0(requestReresolution), updateState = js.Any.fromFunction2(updateState))
    __obj.asInstanceOf[ChannelControlHelper]
  }
  @scala.inline
  implicit class ChannelControlHelperOps[Self <: ChannelControlHelper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateSubchannel(value: (SubchannelAddress, ChannelOptions) => Subchannel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSubchannel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRequestReresolution(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestReresolution")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateState(value: (ConnectivityState, Picker) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateState")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

