package typingsSlinky.autolinker

import typingsSlinky.autolinker.emailMatchMod.EmailMatchConfig
import typingsSlinky.autolinker.hashtagMatchMod.HashtagMatchConfig
import typingsSlinky.autolinker.matchMatchMod.MatchConfig
import typingsSlinky.autolinker.mentionMatchMod.MentionMatchConfig
import typingsSlinky.autolinker.phoneMatchMod.PhoneMatchConfig
import typingsSlinky.autolinker.urlMatchMod.UrlMatchConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchMod {
  
  @JSImport("autolinker/dist/commonjs/match", "EmailMatch")
  @js.native
  class EmailMatch protected ()
    extends typingsSlinky.autolinker.emailMatchMod.EmailMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: EmailMatchConfig) = this()
  }
  
  @JSImport("autolinker/dist/commonjs/match", "HashtagMatch")
  @js.native
  class HashtagMatch protected ()
    extends typingsSlinky.autolinker.hashtagMatchMod.HashtagMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: HashtagMatchConfig) = this()
  }
  
  @JSImport("autolinker/dist/commonjs/match", "Match")
  @js.native
  abstract class Match protected ()
    extends typingsSlinky.autolinker.matchMatchMod.Match {
    /**
      * @member Autolinker.match.Match
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: MatchConfig) = this()
  }
  
  @JSImport("autolinker/dist/commonjs/match", "MentionMatch")
  @js.native
  class MentionMatch protected ()
    extends typingsSlinky.autolinker.mentionMatchMod.MentionMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: MentionMatchConfig) = this()
  }
  
  @JSImport("autolinker/dist/commonjs/match", "PhoneMatch")
  @js.native
  class PhoneMatch protected ()
    extends typingsSlinky.autolinker.phoneMatchMod.PhoneMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: PhoneMatchConfig) = this()
  }
  
  @JSImport("autolinker/dist/commonjs/match", "UrlMatch")
  @js.native
  class UrlMatch protected ()
    extends typingsSlinky.autolinker.urlMatchMod.UrlMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: UrlMatchConfig) = this()
  }
}
