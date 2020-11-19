package typingsSlinky.autolinker.mentionMatchMod

import typingsSlinky.autolinker.autolinkerMod.MentionServices
import typingsSlinky.autolinker.matchMatchMod.Match
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("autolinker/dist/commonjs/match/mention-match", "MentionMatch")
@js.native
class MentionMatch protected () extends Match {
  /**
    * @method constructor
    * @param {Object} cfg The configuration properties for the Match
    *   instance, specified in an Object (map).
    */
  def this(cfg: MentionMatchConfig) = this()
  
  /**
    * Returns the mention, without the '@' character.
    *
    * @return {String}
    */
  def getMention(): String = js.native
  
  /**
    * Returns the configured {@link #serviceName} to point the mention to.
    * Ex: 'instagram', 'twitter', 'soundcloud'.
    *
    * @return {String}
    */
  def getServiceName(): MentionServices = js.native
  
  /**
    * @cfg {String} mention (required)
    *
    * The Mention that was matched, without the '@' character.
    */
  val mention: js.Any = js.native
  
  /**
    * @cfg {String} serviceName
    *
    * The service to point mention matches to. See {@link Autolinker#mention}
    * for available values.
    */
  val serviceName: js.Any = js.native
}
