package typingsSlinky.autolinker

import typingsSlinky.autolinker.hashtagMatcherMod.HashtagMatcherConfig
import typingsSlinky.autolinker.matcherMatcherMod.MatcherConfig
import typingsSlinky.autolinker.mentionMatcherMod.MentionMatcherConfig
import typingsSlinky.autolinker.urlMatcherMod.UrlMatcherConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autolinker/dist/commonjs/matcher", JSImport.Namespace)
@js.native
object matcherMod extends js.Object {
  @js.native
  class EmailMatcher ()
    extends typingsSlinky.autolinker.emailMatcherMod.EmailMatcher
  
  @js.native
  class HashtagMatcher protected ()
    extends typingsSlinky.autolinker.hashtagMatcherMod.HashtagMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match instance,
      *   specified in an Object (map).
      */
    def this(cfg: HashtagMatcherConfig) = this()
  }
  
  @js.native
  abstract class Matcher protected ()
    extends typingsSlinky.autolinker.matcherMatcherMod.Matcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Matcher
      *   instance, specified in an Object (map).
      */
    def this(cfg: MatcherConfig) = this()
  }
  
  @js.native
  class MentionMatcher protected ()
    extends typingsSlinky.autolinker.mentionMatcherMod.MentionMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match instance,
      *   specified in an Object (map).
      */
    def this(cfg: MentionMatcherConfig) = this()
  }
  
  @js.native
  class PhoneMatcher ()
    extends typingsSlinky.autolinker.phoneMatcherMod.PhoneMatcher
  
  @js.native
  class UrlMatcher protected ()
    extends typingsSlinky.autolinker.urlMatcherMod.UrlMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match instance,
      *   specified in an Object (map).
      */
    def this(cfg: UrlMatcherConfig) = this()
  }
  
}

