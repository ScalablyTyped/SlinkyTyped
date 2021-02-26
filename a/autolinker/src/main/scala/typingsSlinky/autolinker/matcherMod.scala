package typingsSlinky.autolinker

import typingsSlinky.autolinker.hashtagMatcherMod.HashtagMatcherConfig
import typingsSlinky.autolinker.matcherMatcherMod.MatcherConfig
import typingsSlinky.autolinker.mentionMatcherMod.MentionMatcherConfig
import typingsSlinky.autolinker.urlMatcherMod.UrlMatcherConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matcherMod {
  
  @JSImport("autolinker/dist/commonjs/matcher", "EmailMatcher")
  @js.native
  class EmailMatcher protected ()
    extends typingsSlinky.autolinker.emailMatcherMod.EmailMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Matcher
      *   instance, specified in an Object (map).
      */
    def this(cfg: MatcherConfig) = this()
  }
  
  @JSImport("autolinker/dist/commonjs/matcher", "HashtagMatcher")
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
  
  @JSImport("autolinker/dist/commonjs/matcher", "Matcher")
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
  
  @JSImport("autolinker/dist/commonjs/matcher", "MentionMatcher")
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
  
  @JSImport("autolinker/dist/commonjs/matcher", "PhoneMatcher")
  @js.native
  class PhoneMatcher protected ()
    extends typingsSlinky.autolinker.phoneMatcherMod.PhoneMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Matcher
      *   instance, specified in an Object (map).
      */
    def this(cfg: MatcherConfig) = this()
  }
  
  @JSImport("autolinker/dist/commonjs/matcher", "UrlMatcher")
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
