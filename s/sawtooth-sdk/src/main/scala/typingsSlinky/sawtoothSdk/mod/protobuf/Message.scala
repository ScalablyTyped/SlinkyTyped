package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.Message")
@js.native
/**
  * Constructs a new Message.
  * @param [properties] Properties to set
  */
class Message ()
  extends typingsSlinky.sawtoothSdk.protobufMod.Message {
  def this(properties: IMessage) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.Message")
@js.native
object Message extends js.Object {
  
  /**
    * Creates a new Message instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Message instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.Message = js.native
  def create(properties: IMessage): typingsSlinky.sawtoothSdk.protobufMod.Message = js.native
  
  /**
    * Decodes a Message message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Message
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.Message = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.Message = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.Message = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.Message = js.native
  
  /**
    * Decodes a Message message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Message
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.Message = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.Message = js.native
  
  /**
    * Encodes the specified Message message. Does not implicitly {@link Message.verify|verify} messages.
    * @param message Message message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IMessage): Writer = js.native
  def encode(message: IMessage, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Message message, length delimited. Does not implicitly {@link Message.verify|verify} messages.
    * @param message Message message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IMessage): Writer = js.native
  def encodeDelimited(message: IMessage, writer: Writer): Writer = js.native
  
  /**
    * Creates a Message message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Message
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.Message = js.native
  
  /**
    * Creates a plain object from a Message message. Also converts values to other types if specified.
    * @param message Message
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.Message): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.Message, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Message message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** MessageType enum. */
  @js.native
  object MessageType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType with Double] = js.native
    
    /* 604 */ val AUTHORIZATION_CHALLENGE_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.AUTHORIZATION_CHALLENGE_REQUEST with Double = js.native
    
    /* 605 */ val AUTHORIZATION_CHALLENGE_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.AUTHORIZATION_CHALLENGE_RESPONSE with Double = js.native
    
    /* 607 */ val AUTHORIZATION_CHALLENGE_RESULT: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.AUTHORIZATION_CHALLENGE_RESULT with Double = js.native
    
    /* 606 */ val AUTHORIZATION_CHALLENGE_SUBMIT: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.AUTHORIZATION_CHALLENGE_SUBMIT with Double = js.native
    
    /* 600 */ val AUTHORIZATION_CONNECTION_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.AUTHORIZATION_CONNECTION_RESPONSE with Double = js.native
    
    /* 602 */ val AUTHORIZATION_TRUST_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.AUTHORIZATION_TRUST_REQUEST with Double = js.native
    
    /* 603 */ val AUTHORIZATION_TRUST_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.AUTHORIZATION_TRUST_RESPONSE with Double = js.native
    
    /* 601 */ val AUTHORIZATION_VIOLATION: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.AUTHORIZATION_VIOLATION with Double = js.native
    
    /* 108 */ val CLIENT_BATCH_GET_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BATCH_GET_REQUEST with Double = js.native
    
    /* 109 */ val CLIENT_BATCH_GET_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BATCH_GET_RESPONSE with Double = js.native
    
    /* 106 */ val CLIENT_BATCH_LIST_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BATCH_LIST_REQUEST with Double = js.native
    
    /* 107 */ val CLIENT_BATCH_LIST_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BATCH_LIST_RESPONSE with Double = js.native
    
    /* 120 */ val CLIENT_BATCH_STATUS_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BATCH_STATUS_REQUEST with Double = js.native
    
    /* 121 */ val CLIENT_BATCH_STATUS_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BATCH_STATUS_RESPONSE with Double = js.native
    
    /* 100 */ val CLIENT_BATCH_SUBMIT_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BATCH_SUBMIT_REQUEST with Double = js.native
    
    /* 101 */ val CLIENT_BATCH_SUBMIT_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BATCH_SUBMIT_RESPONSE with Double = js.native
    
    /* 128 */ val CLIENT_BLOCK_GET_BY_BATCH_ID_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BLOCK_GET_BY_BATCH_ID_REQUEST with Double = js.native
    
    /* 104 */ val CLIENT_BLOCK_GET_BY_ID_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BLOCK_GET_BY_ID_REQUEST with Double = js.native
    
    /* 124 */ val CLIENT_BLOCK_GET_BY_NUM_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BLOCK_GET_BY_NUM_REQUEST with Double = js.native
    
    /* 127 */ val CLIENT_BLOCK_GET_BY_TRANSACTION_ID_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BLOCK_GET_BY_TRANSACTION_ID_REQUEST with Double = js.native
    
    /* 105 */ val CLIENT_BLOCK_GET_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BLOCK_GET_RESPONSE with Double = js.native
    
    /* 102 */ val CLIENT_BLOCK_LIST_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BLOCK_LIST_REQUEST with Double = js.native
    
    /* 103 */ val CLIENT_BLOCK_LIST_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_BLOCK_LIST_RESPONSE with Double = js.native
    
    /* 504 */ val CLIENT_EVENTS: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_EVENTS with Double = js.native
    
    /* 505 */ val CLIENT_EVENTS_GET_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_EVENTS_GET_REQUEST with Double = js.native
    
    /* 506 */ val CLIENT_EVENTS_GET_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_EVENTS_GET_RESPONSE with Double = js.native
    
    /* 500 */ val CLIENT_EVENTS_SUBSCRIBE_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_EVENTS_SUBSCRIBE_REQUEST with Double = js.native
    
    /* 501 */ val CLIENT_EVENTS_SUBSCRIBE_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_EVENTS_SUBSCRIBE_RESPONSE with Double = js.native
    
    /* 502 */ val CLIENT_EVENTS_UNSUBSCRIBE_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_EVENTS_UNSUBSCRIBE_REQUEST with Double = js.native
    
    /* 503 */ val CLIENT_EVENTS_UNSUBSCRIBE_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_EVENTS_UNSUBSCRIBE_RESPONSE with Double = js.native
    
    /* 125 */ val CLIENT_PEERS_GET_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_PEERS_GET_REQUEST with Double = js.native
    
    /* 126 */ val CLIENT_PEERS_GET_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_PEERS_GET_RESPONSE with Double = js.native
    
    /* 122 */ val CLIENT_RECEIPT_GET_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_RECEIPT_GET_REQUEST with Double = js.native
    
    /* 123 */ val CLIENT_RECEIPT_GET_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_RECEIPT_GET_RESPONSE with Double = js.native
    
    /* 114 */ val CLIENT_STATE_CURRENT_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_STATE_CURRENT_REQUEST with Double = js.native
    
    /* 115 */ val CLIENT_STATE_CURRENT_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_STATE_CURRENT_RESPONSE with Double = js.native
    
    /* 118 */ val CLIENT_STATE_GET_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_STATE_GET_REQUEST with Double = js.native
    
    /* 119 */ val CLIENT_STATE_GET_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_STATE_GET_RESPONSE with Double = js.native
    
    /* 116 */ val CLIENT_STATE_LIST_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_STATE_LIST_REQUEST with Double = js.native
    
    /* 117 */ val CLIENT_STATE_LIST_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_STATE_LIST_RESPONSE with Double = js.native
    
    /* 129 */ val CLIENT_STATUS_GET_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_STATUS_GET_REQUEST with Double = js.native
    
    /* 130 */ val CLIENT_STATUS_GET_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_STATUS_GET_RESPONSE with Double = js.native
    
    /* 112 */ val CLIENT_TRANSACTION_GET_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_TRANSACTION_GET_REQUEST with Double = js.native
    
    /* 113 */ val CLIENT_TRANSACTION_GET_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_TRANSACTION_GET_RESPONSE with Double = js.native
    
    /* 110 */ val CLIENT_TRANSACTION_LIST_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_TRANSACTION_LIST_REQUEST with Double = js.native
    
    /* 111 */ val CLIENT_TRANSACTION_LIST_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CLIENT_TRANSACTION_LIST_RESPONSE with Double = js.native
    
    /* 824 */ val CONSENSUS_BLOCKS_GET_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_BLOCKS_GET_REQUEST with Double = js.native
    
    /* 825 */ val CONSENSUS_BLOCKS_GET_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_BLOCKS_GET_RESPONSE with Double = js.native
    
    /* 804 */ val CONSENSUS_BROADCAST_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_BROADCAST_REQUEST with Double = js.native
    
    /* 805 */ val CONSENSUS_BROADCAST_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_BROADCAST_RESPONSE with Double = js.native
    
    /* 810 */ val CONSENSUS_CANCEL_BLOCK_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_CANCEL_BLOCK_REQUEST with Double = js.native
    
    /* 811 */ val CONSENSUS_CANCEL_BLOCK_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_CANCEL_BLOCK_RESPONSE with Double = js.native
    
    /* 826 */ val CONSENSUS_CHAIN_HEAD_GET_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_CHAIN_HEAD_GET_REQUEST with Double = js.native
    
    /* 827 */ val CONSENSUS_CHAIN_HEAD_GET_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_CHAIN_HEAD_GET_RESPONSE with Double = js.native
    
    /* 812 */ val CONSENSUS_CHECK_BLOCKS_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_CHECK_BLOCKS_REQUEST with Double = js.native
    
    /* 813 */ val CONSENSUS_CHECK_BLOCKS_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_CHECK_BLOCKS_RESPONSE with Double = js.native
    
    /* 814 */ val CONSENSUS_COMMIT_BLOCK_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_COMMIT_BLOCK_REQUEST with Double = js.native
    
    /* 815 */ val CONSENSUS_COMMIT_BLOCK_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_COMMIT_BLOCK_RESPONSE with Double = js.native
    
    /* 818 */ val CONSENSUS_FAIL_BLOCK_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_FAIL_BLOCK_REQUEST with Double = js.native
    
    /* 819 */ val CONSENSUS_FAIL_BLOCK_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_FAIL_BLOCK_RESPONSE with Double = js.native
    
    /* 808 */ val CONSENSUS_FINALIZE_BLOCK_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_FINALIZE_BLOCK_REQUEST with Double = js.native
    
    /* 809 */ val CONSENSUS_FINALIZE_BLOCK_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_FINALIZE_BLOCK_RESPONSE with Double = js.native
    
    /* 816 */ val CONSENSUS_IGNORE_BLOCK_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_IGNORE_BLOCK_REQUEST with Double = js.native
    
    /* 817 */ val CONSENSUS_IGNORE_BLOCK_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_IGNORE_BLOCK_RESPONSE with Double = js.native
    
    /* 806 */ val CONSENSUS_INITIALIZE_BLOCK_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_INITIALIZE_BLOCK_REQUEST with Double = js.native
    
    /* 807 */ val CONSENSUS_INITIALIZE_BLOCK_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_INITIALIZE_BLOCK_RESPONSE with Double = js.native
    
    /* 999 */ val CONSENSUS_NOTIFY_ACK: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_NOTIFY_ACK with Double = js.native
    
    /* 906 */ val CONSENSUS_NOTIFY_BLOCK_COMMIT: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_NOTIFY_BLOCK_COMMIT with Double = js.native
    
    /* 905 */ val CONSENSUS_NOTIFY_BLOCK_INVALID: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_NOTIFY_BLOCK_INVALID with Double = js.native
    
    /* 903 */ val CONSENSUS_NOTIFY_BLOCK_NEW: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_NOTIFY_BLOCK_NEW with Double = js.native
    
    /* 904 */ val CONSENSUS_NOTIFY_BLOCK_VALID: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_NOTIFY_BLOCK_VALID with Double = js.native
    
    /* 900 */ val CONSENSUS_NOTIFY_PEER_CONNECTED: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_NOTIFY_PEER_CONNECTED with Double = js.native
    
    /* 901 */ val CONSENSUS_NOTIFY_PEER_DISCONNECTED: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_NOTIFY_PEER_DISCONNECTED with Double = js.native
    
    /* 902 */ val CONSENSUS_NOTIFY_PEER_MESSAGE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_NOTIFY_PEER_MESSAGE with Double = js.native
    
    /* 800 */ val CONSENSUS_REGISTER_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_REGISTER_REQUEST with Double = js.native
    
    /* 801 */ val CONSENSUS_REGISTER_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_REGISTER_RESPONSE with Double = js.native
    
    /* 802 */ val CONSENSUS_SEND_TO_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_SEND_TO_REQUEST with Double = js.native
    
    /* 803 */ val CONSENSUS_SEND_TO_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_SEND_TO_RESPONSE with Double = js.native
    
    /* 820 */ val CONSENSUS_SETTINGS_GET_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_SETTINGS_GET_REQUEST with Double = js.native
    
    /* 821 */ val CONSENSUS_SETTINGS_GET_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_SETTINGS_GET_RESPONSE with Double = js.native
    
    /* 822 */ val CONSENSUS_STATE_GET_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_STATE_GET_REQUEST with Double = js.native
    
    /* 823 */ val CONSENSUS_STATE_GET_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_STATE_GET_RESPONSE with Double = js.native
    
    /* 828 */ val CONSENSUS_SUMMARIZE_BLOCK_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_SUMMARIZE_BLOCK_REQUEST with Double = js.native
    
    /* 829 */ val CONSENSUS_SUMMARIZE_BLOCK_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.CONSENSUS_SUMMARIZE_BLOCK_RESPONSE with Double = js.native
    
    /* 0 */ val DEFAULT: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.DEFAULT with Double = js.native
    
    /* 207 */ val GOSSIP_BATCH_BY_BATCH_ID_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.GOSSIP_BATCH_BY_BATCH_ID_REQUEST with Double = js.native
    
    /* 208 */ val GOSSIP_BATCH_BY_TRANSACTION_ID_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.GOSSIP_BATCH_BY_TRANSACTION_ID_REQUEST with Double = js.native
    
    /* 209 */ val GOSSIP_BATCH_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.GOSSIP_BATCH_RESPONSE with Double = js.native
    
    /* 205 */ val GOSSIP_BLOCK_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.GOSSIP_BLOCK_REQUEST with Double = js.native
    
    /* 206 */ val GOSSIP_BLOCK_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.GOSSIP_BLOCK_RESPONSE with Double = js.native
    
    /* 212 */ val GOSSIP_CONSENSUS_MESSAGE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.GOSSIP_CONSENSUS_MESSAGE with Double = js.native
    
    /* 210 */ val GOSSIP_GET_PEERS_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.GOSSIP_GET_PEERS_REQUEST with Double = js.native
    
    /* 211 */ val GOSSIP_GET_PEERS_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.GOSSIP_GET_PEERS_RESPONSE with Double = js.native
    
    /* 200 */ val GOSSIP_MESSAGE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.GOSSIP_MESSAGE with Double = js.native
    
    /* 201 */ val GOSSIP_REGISTER: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.GOSSIP_REGISTER with Double = js.native
    
    /* 202 */ val GOSSIP_UNREGISTER: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.GOSSIP_UNREGISTER with Double = js.native
    
    /* 300 */ val NETWORK_ACK: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.NETWORK_ACK with Double = js.native
    
    /* 301 */ val NETWORK_CONNECT: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.NETWORK_CONNECT with Double = js.native
    
    /* 302 */ val NETWORK_DISCONNECT: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.NETWORK_DISCONNECT with Double = js.native
    
    /* 700 */ val PING_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.PING_REQUEST with Double = js.native
    
    /* 701 */ val PING_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.PING_RESPONSE with Double = js.native
    
    /* 15 */ val TP_EVENT_ADD_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.TP_EVENT_ADD_REQUEST with Double = js.native
    
    /* 16 */ val TP_EVENT_ADD_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.TP_EVENT_ADD_RESPONSE with Double = js.native
    
    /* 5 */ val TP_PROCESS_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.TP_PROCESS_REQUEST with Double = js.native
    
    /* 6 */ val TP_PROCESS_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.TP_PROCESS_RESPONSE with Double = js.native
    
    /* 13 */ val TP_RECEIPT_ADD_DATA_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.TP_RECEIPT_ADD_DATA_REQUEST with Double = js.native
    
    /* 14 */ val TP_RECEIPT_ADD_DATA_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.TP_RECEIPT_ADD_DATA_RESPONSE with Double = js.native
    
    /* 1 */ val TP_REGISTER_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.TP_REGISTER_REQUEST with Double = js.native
    
    /* 2 */ val TP_REGISTER_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.TP_REGISTER_RESPONSE with Double = js.native
    
    /* 11 */ val TP_STATE_DELETE_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.TP_STATE_DELETE_REQUEST with Double = js.native
    
    /* 12 */ val TP_STATE_DELETE_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.TP_STATE_DELETE_RESPONSE with Double = js.native
    
    /* 7 */ val TP_STATE_GET_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.TP_STATE_GET_REQUEST with Double = js.native
    
    /* 8 */ val TP_STATE_GET_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.TP_STATE_GET_RESPONSE with Double = js.native
    
    /* 9 */ val TP_STATE_SET_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.TP_STATE_SET_REQUEST with Double = js.native
    
    /* 10 */ val TP_STATE_SET_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.TP_STATE_SET_RESPONSE with Double = js.native
    
    /* 3 */ val TP_UNREGISTER_REQUEST: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.TP_UNREGISTER_REQUEST with Double = js.native
    
    /* 4 */ val TP_UNREGISTER_RESPONSE: typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType.TP_UNREGISTER_RESPONSE with Double = js.native
  }
}
