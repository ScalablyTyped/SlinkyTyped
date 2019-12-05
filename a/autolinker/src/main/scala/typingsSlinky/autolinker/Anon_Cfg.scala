package typingsSlinky.autolinker

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.autolinker.distCommonjsMatcherEmailDashMatcherMod.EmailMatcher
import typingsSlinky.autolinker.distCommonjsMatcherHashtagDashMatcherMod.HashtagMatcher
import typingsSlinky.autolinker.distCommonjsMatcherHashtagDashMatcherMod.HashtagMatcherConfig
import typingsSlinky.autolinker.distCommonjsMatcherMatcherMod.Matcher
import typingsSlinky.autolinker.distCommonjsMatcherMatcherMod.MatcherConfig
import typingsSlinky.autolinker.distCommonjsMatcherMentionDashMatcherMod.MentionMatcher
import typingsSlinky.autolinker.distCommonjsMatcherMentionDashMatcherMod.MentionMatcherConfig
import typingsSlinky.autolinker.distCommonjsMatcherPhoneDashMatcherMod.PhoneMatcher
import typingsSlinky.autolinker.distCommonjsMatcherUrlDashMatcherMod.UrlMatcher
import typingsSlinky.autolinker.distCommonjsMatcherUrlDashMatcherMod.UrlMatcherConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cfg extends js.Object {
  var Email: Instantiable0[EmailMatcher]
  var Hashtag: Instantiable1[/* cfg */ HashtagMatcherConfig, HashtagMatcher]
  var Matcher: Instantiable1[
    /* cfg */ MatcherConfig, 
    typingsSlinky.autolinker.distCommonjsMatcherMatcherMod.Matcher
  ]
  var Mention: Instantiable1[/* cfg */ MentionMatcherConfig, MentionMatcher]
  var Phone: Instantiable0[PhoneMatcher]
  var Url: Instantiable1[/* cfg */ UrlMatcherConfig, UrlMatcher]
}

object Anon_Cfg {
  @scala.inline
  def apply(
    Email: Instantiable0[EmailMatcher],
    Hashtag: Instantiable1[/* cfg */ HashtagMatcherConfig, HashtagMatcher],
    Matcher: Instantiable1[/* cfg */ MatcherConfig, Matcher],
    Mention: Instantiable1[/* cfg */ MentionMatcherConfig, MentionMatcher],
    Phone: Instantiable0[PhoneMatcher],
    Url: Instantiable1[/* cfg */ UrlMatcherConfig, UrlMatcher]
  ): Anon_Cfg = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], Hashtag = Hashtag.asInstanceOf[js.Any], Matcher = Matcher.asInstanceOf[js.Any], Mention = Mention.asInstanceOf[js.Any], Phone = Phone.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Cfg]
  }
}

