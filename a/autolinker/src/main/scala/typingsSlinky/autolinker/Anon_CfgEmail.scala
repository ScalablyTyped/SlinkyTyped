package typingsSlinky.autolinker

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.autolinker.distCommonjsMatchEmailDashMatchMod.EmailMatch
import typingsSlinky.autolinker.distCommonjsMatchEmailDashMatchMod.EmailMatchConfig
import typingsSlinky.autolinker.distCommonjsMatchHashtagDashMatchMod.HashtagMatch
import typingsSlinky.autolinker.distCommonjsMatchHashtagDashMatchMod.HashtagMatchConfig
import typingsSlinky.autolinker.distCommonjsMatchMatchMod.Match
import typingsSlinky.autolinker.distCommonjsMatchMatchMod.MatchConfig
import typingsSlinky.autolinker.distCommonjsMatchMentionDashMatchMod.MentionMatch
import typingsSlinky.autolinker.distCommonjsMatchMentionDashMatchMod.MentionMatchConfig
import typingsSlinky.autolinker.distCommonjsMatchPhoneDashMatchMod.PhoneMatch
import typingsSlinky.autolinker.distCommonjsMatchPhoneDashMatchMod.PhoneMatchConfig
import typingsSlinky.autolinker.distCommonjsMatchUrlDashMatchMod.UrlMatch
import typingsSlinky.autolinker.distCommonjsMatchUrlDashMatchMod.UrlMatchConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CfgEmail extends js.Object {
  var Email: Instantiable1[/* cfg */ EmailMatchConfig, EmailMatch]
  var Hashtag: Instantiable1[/* cfg */ HashtagMatchConfig, HashtagMatch]
  var Match: Instantiable1[/* cfg */ MatchConfig, typingsSlinky.autolinker.distCommonjsMatchMatchMod.Match]
  var Mention: Instantiable1[/* cfg */ MentionMatchConfig, MentionMatch]
  var Phone: Instantiable1[/* cfg */ PhoneMatchConfig, PhoneMatch]
  var Url: Instantiable1[/* cfg */ UrlMatchConfig, UrlMatch]
}

object Anon_CfgEmail {
  @scala.inline
  def apply(
    Email: Instantiable1[/* cfg */ EmailMatchConfig, EmailMatch],
    Hashtag: Instantiable1[/* cfg */ HashtagMatchConfig, HashtagMatch],
    Match: Instantiable1[/* cfg */ MatchConfig, Match],
    Mention: Instantiable1[/* cfg */ MentionMatchConfig, MentionMatch],
    Phone: Instantiable1[/* cfg */ PhoneMatchConfig, PhoneMatch],
    Url: Instantiable1[/* cfg */ UrlMatchConfig, UrlMatch]
  ): Anon_CfgEmail = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], Hashtag = Hashtag.asInstanceOf[js.Any], Match = Match.asInstanceOf[js.Any], Mention = Mention.asInstanceOf[js.Any], Phone = Phone.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CfgEmail]
  }
}

