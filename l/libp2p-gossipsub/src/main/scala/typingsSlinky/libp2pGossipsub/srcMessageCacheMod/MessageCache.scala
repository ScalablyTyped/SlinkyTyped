package typingsSlinky.libp2pGossipsub.srcMessageCacheMod

import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-gossipsub/src/messageCache", "MessageCache")
@js.native
class MessageCache protected () extends js.Object {
  /**
    * @param {Number} gossip
    * @param {Number} history
    * @param {msgIdFn} msgIdFn a function that returns message id from a message
    *
    * @constructor
    */
  def this(
    gossip: Double,
    history: Double,
    msgIdFn: js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InMessage */ /* msg */ js.Any, 
        String
      ]
  ) = this()
  
  /**
    * Retrieves a message from the cache by its ID, if it is still present
    *
    * @param {String} msgID
    * @returns {Message}
    */
  def get(msgID: String): js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InMessage */ js.Any
  ] = js.native
  
  /**
    * Retrieves a list of message IDs for a given topic
    *
    * @param {String} topic
    *
    * @returns {Array<String>}
    */
  def getGossipIDs(topic: String): js.Array[String] = js.native
  
  /**
    * Get message id of message.
    * @param {RPC.Message} msg
    * @returns {string}
    */
  def getMsgId(
    msg: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InMessage */ js.Any
  ): String = js.native
  
  var gossip: Double = js.native
  
  var history: js.Array[js.Array[CacheEntry]] = js.native
  
  def msgIdFn(
    msg: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InMessage */ js.Any
  ): String = js.native
  
  var msgs: Map[
    String, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InMessage */ _
  ] = js.native
  
  /**
    * Adds a message to the current window and the cache
    *
    * @param {RPC.Message} msg
    * @returns {void}
    */
  def put(
    msg: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InMessage */ js.Any
  ): Unit = js.native
  
  /**
    * Shifts the current window, discarding messages older than this.history.length of the cache
    *
    * @returns {void}
    */
  def shift(): Unit = js.native
}
