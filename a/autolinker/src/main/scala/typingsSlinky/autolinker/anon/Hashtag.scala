package typingsSlinky.autolinker.anon

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.autolinker.emailMatchMod.EmailMatch
import typingsSlinky.autolinker.emailMatchMod.EmailMatchConfig
import typingsSlinky.autolinker.hashtagMatchMod.HashtagMatch
import typingsSlinky.autolinker.hashtagMatchMod.HashtagMatchConfig
import typingsSlinky.autolinker.matchMatchMod.Match
import typingsSlinky.autolinker.matchMatchMod.MatchConfig
import typingsSlinky.autolinker.mentionMatchMod.MentionMatch
import typingsSlinky.autolinker.mentionMatchMod.MentionMatchConfig
import typingsSlinky.autolinker.phoneMatchMod.PhoneMatch
import typingsSlinky.autolinker.phoneMatchMod.PhoneMatchConfig
import typingsSlinky.autolinker.urlMatchMod.UrlMatch
import typingsSlinky.autolinker.urlMatchMod.UrlMatchConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hashtag extends js.Object {
  var Email: Instantiable1[/* cfg */ EmailMatchConfig, EmailMatch]
  var Hashtag: Instantiable1[/* cfg */ HashtagMatchConfig, HashtagMatch]
  var Match: Instantiable1[/* cfg */ MatchConfig, typingsSlinky.autolinker.matchMatchMod.Match]
  var Mention: Instantiable1[/* cfg */ MentionMatchConfig, MentionMatch]
  var Phone: Instantiable1[/* cfg */ PhoneMatchConfig, PhoneMatch]
  var Url: Instantiable1[/* cfg */ UrlMatchConfig, UrlMatch]
}

object Hashtag {
  @scala.inline
  def apply(
    Email: Instantiable1[/* cfg */ EmailMatchConfig, EmailMatch],
    Hashtag: Instantiable1[/* cfg */ HashtagMatchConfig, HashtagMatch],
    Match: Instantiable1[/* cfg */ MatchConfig, Match],
    Mention: Instantiable1[/* cfg */ MentionMatchConfig, MentionMatch],
    Phone: Instantiable1[/* cfg */ PhoneMatchConfig, PhoneMatch],
    Url: Instantiable1[/* cfg */ UrlMatchConfig, UrlMatch]
  ): Hashtag = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], Hashtag = Hashtag.asInstanceOf[js.Any], Match = Match.asInstanceOf[js.Any], Mention = Mention.asInstanceOf[js.Any], Phone = Phone.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hashtag]
  }
}

