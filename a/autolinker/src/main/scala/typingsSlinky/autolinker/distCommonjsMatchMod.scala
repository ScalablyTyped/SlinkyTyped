package typingsSlinky.autolinker

import typingsSlinky.autolinker.distCommonjsMatchEmailDashMatchMod.EmailMatchConfig
import typingsSlinky.autolinker.distCommonjsMatchHashtagDashMatchMod.HashtagMatchConfig
import typingsSlinky.autolinker.distCommonjsMatchMatchMod.MatchConfig
import typingsSlinky.autolinker.distCommonjsMatchMentionDashMatchMod.MentionMatchConfig
import typingsSlinky.autolinker.distCommonjsMatchPhoneDashMatchMod.PhoneMatchConfig
import typingsSlinky.autolinker.distCommonjsMatchUrlDashMatchMod.UrlMatchConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autolinker/dist/commonjs/match", JSImport.Namespace)
@js.native
object distCommonjsMatchMod extends js.Object {
  @js.native
  class EmailMatch protected ()
    extends typingsSlinky.autolinker.distCommonjsMatchEmailDashMatchMod.EmailMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: EmailMatchConfig) = this()
  }
  
  @js.native
  class HashtagMatch protected ()
    extends typingsSlinky.autolinker.distCommonjsMatchHashtagDashMatchMod.HashtagMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: HashtagMatchConfig) = this()
  }
  
  @js.native
  abstract class Match protected ()
    extends typingsSlinky.autolinker.distCommonjsMatchMatchMod.Match {
    /**
      * @member Autolinker.match.Match
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: MatchConfig) = this()
  }
  
  @js.native
  class MentionMatch protected ()
    extends typingsSlinky.autolinker.distCommonjsMatchMentionDashMatchMod.MentionMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: MentionMatchConfig) = this()
  }
  
  @js.native
  class PhoneMatch protected ()
    extends typingsSlinky.autolinker.distCommonjsMatchPhoneDashMatchMod.PhoneMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: PhoneMatchConfig) = this()
  }
  
  @js.native
  class UrlMatch protected ()
    extends typingsSlinky.autolinker.distCommonjsMatchUrlDashMatchMod.UrlMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: UrlMatchConfig) = this()
  }
  
}

