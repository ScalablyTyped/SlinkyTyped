package typingsSlinky.libp2pGossipsub

import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageDeliveriesMod {
  
  @js.native
  sealed trait DeliveryRecordStatus extends StObject
  @JSImport("libp2p-gossipsub/src/score/message-deliveries", "DeliveryRecordStatus")
  @js.native
  object DeliveryRecordStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DeliveryRecordStatus with Double] = js.native
    
    /**
      * we were instructed by the validator to ignore the message
      */
    @js.native
    sealed trait ignored extends DeliveryRecordStatus
    /* 3 */ val ignored: typingsSlinky.libp2pGossipsub.messageDeliveriesMod.DeliveryRecordStatus.ignored with Double = js.native
    
    /**
      * we know the message is invalid
      */
    @js.native
    sealed trait invalid extends DeliveryRecordStatus
    /* 2 */ val invalid: typingsSlinky.libp2pGossipsub.messageDeliveriesMod.DeliveryRecordStatus.invalid with Double = js.native
    
    /**
      * we don't know (yet) if the message is valid
      */
    @js.native
    sealed trait unknown extends DeliveryRecordStatus
    /* 0 */ val unknown: typingsSlinky.libp2pGossipsub.messageDeliveriesMod.DeliveryRecordStatus.unknown with Double = js.native
    
    /**
      * we know the message is valid
      */
    @js.native
    sealed trait valid extends DeliveryRecordStatus
    /* 1 */ val valid: typingsSlinky.libp2pGossipsub.messageDeliveriesMod.DeliveryRecordStatus.valid with Double = js.native
  }
  
  @JSImport("libp2p-gossipsub/src/score/message-deliveries", "MessageDeliveries")
  @js.native
  class MessageDeliveries () extends StObject {
    
    def clear(): Unit = js.native
    
    def ensureRecord(msgId: js.typedarray.Uint8Array): DeliveryRecord = js.native
    
    def gc(): Unit = js.native
    
    var queue: js.Any = js.native
    
    var records: js.Any = js.native
  }
  
  @js.native
  trait DeliveryRecord extends StObject {
    
    var firstSeen: Double = js.native
    
    var peers: Set[String] = js.native
    
    var status: DeliveryRecordStatus = js.native
    
    var validated: Double = js.native
  }
  object DeliveryRecord {
    
    @scala.inline
    def apply(firstSeen: Double, peers: Set[String], status: DeliveryRecordStatus, validated: Double): DeliveryRecord = {
      val __obj = js.Dynamic.literal(firstSeen = firstSeen.asInstanceOf[js.Any], peers = peers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeliveryRecord]
    }
    
    @scala.inline
    implicit class DeliveryRecordMutableBuilder[Self <: DeliveryRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirstSeen(value: Double): Self = StObject.set(x, "firstSeen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeers(value: Set[String]): Self = StObject.set(x, "peers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: DeliveryRecordStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidated(value: Double): Self = StObject.set(x, "validated", value.asInstanceOf[js.Any])
    }
  }
}
