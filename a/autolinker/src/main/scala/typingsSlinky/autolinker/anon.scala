package typingsSlinky.autolinker

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.autolinker.emailMatchMod.EmailMatch
import typingsSlinky.autolinker.emailMatchMod.EmailMatchConfig
import typingsSlinky.autolinker.emailMatcherMod.EmailMatcher
import typingsSlinky.autolinker.hashtagMatchMod.HashtagMatch
import typingsSlinky.autolinker.hashtagMatchMod.HashtagMatchConfig
import typingsSlinky.autolinker.hashtagMatcherMod.HashtagMatcher
import typingsSlinky.autolinker.hashtagMatcherMod.HashtagMatcherConfig
import typingsSlinky.autolinker.matchMatchMod.Match
import typingsSlinky.autolinker.matchMatchMod.MatchConfig
import typingsSlinky.autolinker.matcherMatcherMod.Matcher
import typingsSlinky.autolinker.matcherMatcherMod.MatcherConfig
import typingsSlinky.autolinker.mentionMatchMod.MentionMatch
import typingsSlinky.autolinker.mentionMatchMod.MentionMatchConfig
import typingsSlinky.autolinker.mentionMatcherMod.MentionMatcher
import typingsSlinky.autolinker.mentionMatcherMod.MentionMatcherConfig
import typingsSlinky.autolinker.phoneMatchMod.PhoneMatch
import typingsSlinky.autolinker.phoneMatchMod.PhoneMatchConfig
import typingsSlinky.autolinker.phoneMatcherMod.PhoneMatcher
import typingsSlinky.autolinker.urlMatchMod.UrlMatch
import typingsSlinky.autolinker.urlMatchMod.UrlMatchConfig
import typingsSlinky.autolinker.urlMatcherMod.UrlMatcher
import typingsSlinky.autolinker.urlMatcherMod.UrlMatcherConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Email extends StObject {
    
    var Email: Instantiable0[EmailMatcher] = js.native
    
    var Hashtag: Instantiable1[/* cfg */ HashtagMatcherConfig, HashtagMatcher] = js.native
    
    var Matcher: Instantiable1[/* cfg */ MatcherConfig, typingsSlinky.autolinker.matcherMatcherMod.Matcher] = js.native
    
    var Mention: Instantiable1[/* cfg */ MentionMatcherConfig, MentionMatcher] = js.native
    
    var Phone: Instantiable0[PhoneMatcher] = js.native
    
    var Url: Instantiable1[/* cfg */ UrlMatcherConfig, UrlMatcher] = js.native
  }
  object Email {
    
    @scala.inline
    def apply(
      Email: Instantiable0[EmailMatcher],
      Hashtag: Instantiable1[/* cfg */ HashtagMatcherConfig, HashtagMatcher],
      Matcher: Instantiable1[/* cfg */ MatcherConfig, Matcher],
      Mention: Instantiable1[/* cfg */ MentionMatcherConfig, MentionMatcher],
      Phone: Instantiable0[PhoneMatcher],
      Url: Instantiable1[/* cfg */ UrlMatcherConfig, UrlMatcher]
    ): Email = {
      val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], Hashtag = Hashtag.asInstanceOf[js.Any], Matcher = Matcher.asInstanceOf[js.Any], Mention = Mention.asInstanceOf[js.Any], Phone = Phone.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Email]
    }
    
    @scala.inline
    implicit class EmailMutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: Instantiable0[EmailMatcher]): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashtag(value: Instantiable1[/* cfg */ HashtagMatcherConfig, HashtagMatcher]): Self = StObject.set(x, "Hashtag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatcher(value: Instantiable1[/* cfg */ MatcherConfig, Matcher]): Self = StObject.set(x, "Matcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMention(value: Instantiable1[/* cfg */ MentionMatcherConfig, MentionMatcher]): Self = StObject.set(x, "Mention", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone(value: Instantiable0[PhoneMatcher]): Self = StObject.set(x, "Phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: Instantiable1[/* cfg */ UrlMatcherConfig, UrlMatcher]): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Hashtag extends StObject {
    
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
    implicit class HashtagMutableBuilder[Self <: Hashtag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: Instantiable1[/* cfg */ EmailMatchConfig, EmailMatch]): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashtag(value: Instantiable1[/* cfg */ HashtagMatchConfig, HashtagMatch]): Self = StObject.set(x, "Hashtag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatch(value: Instantiable1[/* cfg */ MatchConfig, Match]): Self = StObject.set(x, "Match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMention(value: Instantiable1[/* cfg */ MentionMatchConfig, MentionMatch]): Self = StObject.set(x, "Mention", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone(value: Instantiable1[/* cfg */ PhoneMatchConfig, PhoneMatch]): Self = StObject.set(x, "Phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: Instantiable1[/* cfg */ UrlMatchConfig, UrlMatch]): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnCloseTag extends StObject {
    
    def onCloseTag(tagName: String, offset: Double): Unit = js.native
    
    def onComment(offset: Double): Unit = js.native
    
    def onDoctype(offset: Double): Unit = js.native
    
    def onOpenTag(tagName: String, offset: Double): Unit = js.native
    
    def onText(text: String, offset: Double): Unit = js.native
  }
  object OnCloseTag {
    
    @scala.inline
    def apply(
      onCloseTag: (String, Double) => Unit,
      onComment: Double => Unit,
      onDoctype: Double => Unit,
      onOpenTag: (String, Double) => Unit,
      onText: (String, Double) => Unit
    ): OnCloseTag = {
      val __obj = js.Dynamic.literal(onCloseTag = js.Any.fromFunction2(onCloseTag), onComment = js.Any.fromFunction1(onComment), onDoctype = js.Any.fromFunction1(onDoctype), onOpenTag = js.Any.fromFunction2(onOpenTag), onText = js.Any.fromFunction2(onText))
      __obj.asInstanceOf[OnCloseTag]
    }
    
    @scala.inline
    implicit class OnCloseTagMutableBuilder[Self <: OnCloseTag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnCloseTag(value: (String, Double) => Unit): Self = StObject.set(x, "onCloseTag", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnComment(value: Double => Unit): Self = StObject.set(x, "onComment", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoctype(value: Double => Unit): Self = StObject.set(x, "onDoctype", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenTag(value: (String, Double) => Unit): Self = StObject.set(x, "onOpenTag", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnText(value: (String, Double) => Unit): Self = StObject.set(x, "onText", js.Any.fromFunction2(value))
    }
  }
  
  /* Inlined std.Required<autolinker.autolinker/dist/commonjs/autolinker.StripPrefixConfigObj> */
  @js.native
  trait RequiredStripPrefixConfig extends StObject {
    
    var scheme: Boolean = js.native
    
    var www: Boolean = js.native
  }
  object RequiredStripPrefixConfig {
    
    @scala.inline
    def apply(scheme: Boolean, www: Boolean): RequiredStripPrefixConfig = {
      val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any], www = www.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredStripPrefixConfig]
    }
    
    @scala.inline
    implicit class RequiredStripPrefixConfigMutableBuilder[Self <: RequiredStripPrefixConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScheme(value: Boolean): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWww(value: Boolean): Self = StObject.set(x, "www", value.asInstanceOf[js.Any])
    }
  }
}
