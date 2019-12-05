package typingsSlinky.autolinker

import typingsSlinky.autolinker.distCommonjsMatcherHashtagDashMatcherMod.HashtagMatcherConfig
import typingsSlinky.autolinker.distCommonjsMatcherMatcherMod.MatcherConfig
import typingsSlinky.autolinker.distCommonjsMatcherMentionDashMatcherMod.MentionMatcherConfig
import typingsSlinky.autolinker.distCommonjsMatcherUrlDashMatcherMod.UrlMatcherConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autolinker/dist/commonjs/matcher", JSImport.Namespace)
@js.native
object distCommonjsMatcherMod extends js.Object {
  @js.native
  class EmailMatcher ()
    extends typingsSlinky.autolinker.distCommonjsMatcherEmailDashMatcherMod.EmailMatcher
  
  @js.native
  class HashtagMatcher protected ()
    extends typingsSlinky.autolinker.distCommonjsMatcherHashtagDashMatcherMod.HashtagMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match instance,
      *   specified in an Object (map).
      */
    def this(cfg: HashtagMatcherConfig) = this()
  }
  
  @js.native
  abstract class Matcher protected ()
    extends typingsSlinky.autolinker.distCommonjsMatcherMatcherMod.Matcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Matcher
      *   instance, specified in an Object (map).
      */
    def this(cfg: MatcherConfig) = this()
  }
  
  @js.native
  class MentionMatcher protected ()
    extends typingsSlinky.autolinker.distCommonjsMatcherMentionDashMatcherMod.MentionMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match instance,
      *   specified in an Object (map).
      */
    def this(cfg: MentionMatcherConfig) = this()
  }
  
  @js.native
  class PhoneMatcher ()
    extends typingsSlinky.autolinker.distCommonjsMatcherPhoneDashMatcherMod.PhoneMatcher
  
  @js.native
  class UrlMatcher protected ()
    extends typingsSlinky.autolinker.distCommonjsMatcherUrlDashMatcherMod.UrlMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match instance,
      *   specified in an Object (map).
      */
    def this(cfg: UrlMatcherConfig) = this()
  }
  
}

