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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hashtag extends js.Object {
  
  var Email: Instantiable1[/* cfg */ EmailMatchConfig, EmailMatch] = js.native
  
  var Hashtag: Instantiable1[/* cfg */ HashtagMatchConfig, HashtagMatch] = js.native
  
  var Match: Instantiable1[/* cfg */ MatchConfig, typingsSlinky.autolinker.matchMatchMod.Match] = js.native
  
  var Mention: Instantiable1[/* cfg */ MentionMatchConfig, MentionMatch] = js.native
  
  var Phone: Instantiable1[/* cfg */ PhoneMatchConfig, PhoneMatch] = js.native
  
  var Url: Instantiable1[/* cfg */ UrlMatchConfig, UrlMatch] = js.native
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
  
  @scala.inline
  implicit class HashtagOps[Self <: Hashtag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEmail(value: Instantiable1[/* cfg */ EmailMatchConfig, EmailMatch]): Self = this.set("Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashtag(value: Instantiable1[/* cfg */ HashtagMatchConfig, HashtagMatch]): Self = this.set("Hashtag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: Instantiable1[/* cfg */ MatchConfig, Match]): Self = this.set("Match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMention(value: Instantiable1[/* cfg */ MentionMatchConfig, MentionMatch]): Self = this.set("Mention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone(value: Instantiable1[/* cfg */ PhoneMatchConfig, PhoneMatch]): Self = this.set("Phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: Instantiable1[/* cfg */ UrlMatchConfig, UrlMatch]): Self = this.set("Url", value.asInstanceOf[js.Any])
  }
}
