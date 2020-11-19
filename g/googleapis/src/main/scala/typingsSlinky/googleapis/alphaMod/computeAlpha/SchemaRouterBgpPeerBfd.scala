package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRouterBgpPeerBfd extends js.Object {
  
  /**
    * The minimum interval, in milliseconds, between BFD packets received from
    * the peer router. The actual value is negotiated between the two routers
    * and is equal to the greater of this value and the transmit interval of
    * the other router. If BFD echo mode is enabled on this router and the peer
    * router, this value is used to negotiate the interval between BFD echo
    * packets transmitted by the peer router. Otherwise, it will be used to
    * determine the interval between BFD control packets. If set, this value
    * must be between 33 and 30000. The default is 300.
    */
  var minReceiveInterval: js.UndefOr[Double] = js.native
  
  /**
    * The minimum interval, in milliseconds, between BFD packets transmitted to
    * the peer router. The actual value is negotiated between the two routers
    * and is equal to the greater of this value and the corresponding receive
    * interval of the other router. If BFD echo mode is enabled on this router
    * and the peer router, this value is used to negotiate the interval between
    * BFD echo packets transmitted by this router. Otherwise, it will be used
    * to determine the interval between BFD control packets. If set, this value
    * must be between 33 and 30000. The default is 300.
    */
  var minTransmitInterval: js.UndefOr[Double] = js.native
  
  /**
    * The BFD session initiation mode for this BGP peer. If set to ACTIVE, the
    * Cloud Router will initiate the BFD session for this BGP peer. If set to
    * PASSIVE, the Cloud Router will wait for the peer router to initiate the
    * BFD session for this BGP peer. If set to DISABLED, BFD is disabled for
    * this BGP peer. The default is PASSIVE.
    */
  var mode: js.UndefOr[String] = js.native
  
  /**
    * The number of consecutive BFD packets that must be missed before BFD
    * declares that a peer is unavailable. If set, the value must be a value
    * between 2 and 16. The default is 3.
    */
  var multiplier: js.UndefOr[Double] = js.native
  
  /**
    * The BFD packet mode for this BGP peer. If set to CONTROL_AND_ECHO, BFD
    * echo mode is enabled for this BGP peer. In this mode, if the peer router
    * also has BFD echo mode enabled, BFD echo packets will be sent to the
    * other router. If the peer router does not have BFD echo mode enabled,
    * only control packets will be sent. If set to CONTROL_ONLY, BFD echo mode
    * is disabled for this BGP peer. If this router and the peer router have a
    * multihop connection, this should be set to CONTROL_ONLY as BFD echo mode
    * is only supported on singlehop connections. The default is
    * CONTROL_AND_ECHO.
    */
  var packetMode: js.UndefOr[String] = js.native
  
  /**
    * The minimum interval, in milliseconds, between BFD control packets
    * transmitted to and received from the peer router when BFD echo mode is
    * enabled on both routers. The actual transmit and receive intervals are
    * negotiated between the two routers and are equal to the greater of this
    * value and the corresponding interval on the other router. If set, this
    * value must be between 1000 and 30000. The default is 5000.
    */
  var slowTimerInterval: js.UndefOr[Double] = js.native
}
object SchemaRouterBgpPeerBfd {
  
  @scala.inline
  def apply(): SchemaRouterBgpPeerBfd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterBgpPeerBfd]
  }
  
  @scala.inline
  implicit class SchemaRouterBgpPeerBfdOps[Self <: SchemaRouterBgpPeerBfd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMinReceiveInterval(value: Double): Self = this.set("minReceiveInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinReceiveInterval: Self = this.set("minReceiveInterval", js.undefined)
    
    @scala.inline
    def setMinTransmitInterval(value: Double): Self = this.set("minTransmitInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinTransmitInterval: Self = this.set("minTransmitInterval", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setMultiplier(value: Double): Self = this.set("multiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiplier: Self = this.set("multiplier", js.undefined)
    
    @scala.inline
    def setPacketMode(value: String): Self = this.set("packetMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePacketMode: Self = this.set("packetMode", js.undefined)
    
    @scala.inline
    def setSlowTimerInterval(value: Double): Self = this.set("slowTimerInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlowTimerInterval: Self = this.set("slowTimerInterval", js.undefined)
  }
}
