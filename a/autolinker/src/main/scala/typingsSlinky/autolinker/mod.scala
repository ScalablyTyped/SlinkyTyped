package typingsSlinky.autolinker

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.autolinker.anchorTagBuilderMod.AnchorTagBuilderCfg
import typingsSlinky.autolinker.anon.Email
import typingsSlinky.autolinker.anon.Hashtag
import typingsSlinky.autolinker.autolinkerMod.AutolinkerConfig
import typingsSlinky.autolinker.emailMatchMod.EmailMatchConfig
import typingsSlinky.autolinker.hashtagMatchMod.HashtagMatchConfig
import typingsSlinky.autolinker.hashtagMatcherMod.HashtagMatcherConfig
import typingsSlinky.autolinker.htmlTagMod.HtmlTagCfg
import typingsSlinky.autolinker.matchMatchMod.MatchConfig
import typingsSlinky.autolinker.matcherMatcherMod.MatcherConfig
import typingsSlinky.autolinker.mentionMatchMod.MentionMatchConfig
import typingsSlinky.autolinker.mentionMatcherMod.MentionMatcherConfig
import typingsSlinky.autolinker.phoneMatchMod.PhoneMatchConfig
import typingsSlinky.autolinker.urlMatchMod.UrlMatchConfig
import typingsSlinky.autolinker.urlMatcherMod.UrlMatcherConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("autolinker", JSImport.Default)
  @js.native
  /**
    * @method constructor
    * @param {Object} [cfg] The configuration options for the Autolinker instance,
    *   specified in an Object (map).
    */
  class default ()
    extends typingsSlinky.autolinker.autolinkerMod.default {
    def this(cfg: AutolinkerConfig) = this()
  }
  /* static members */
  object default {
    
    /**
      * For backwards compatibility with Autolinker 1.x, the AnchorTagBuilder
      * class is provided as a static on the Autolinker class.
      */
    @JSImport("autolinker", "default.AnchorTagBuilder")
    @js.native
    val AnchorTagBuilder: Instantiable1[
        /* cfg */ js.UndefOr[AnchorTagBuilderCfg], 
        typingsSlinky.autolinker.anchorTagBuilderMod.AnchorTagBuilder
      ] = js.native
    
    /**
      * For backwards compatibility with Autolinker 1.x, the HtmlTag class is
      * provided as a static on the Autolinker class.
      */
    @JSImport("autolinker", "default.HtmlTag")
    @js.native
    val HtmlTag: Instantiable1[/* cfg */ js.UndefOr[HtmlTagCfg], typingsSlinky.autolinker.htmlTagMod.HtmlTag] = js.native
    
    /**
      * Automatically links URLs, Email addresses, Phone Numbers, Twitter handles,
      * Hashtags, and Mentions found in the given chunk of HTML. Does not link URLs
      * found within HTML tags.
      *
      * For instance, if given the text: `You should go to http://www.yahoo.com`,
      * then the result will be `You should go to &lt;a href="http://www.yahoo.com"&gt;http://www.yahoo.com&lt;/a&gt;`
      *
      * Example:
      *
      *     var linkedText = Autolinker.link( "Go to google.com", { newWindow: false } );
      *     // Produces: "Go to <a href="http://google.com">google.com</a>"
      *
      * @static
      * @param {String} textOrHtml The HTML or text to find matches within (depending
      *   on if the {@link #urls}, {@link #email}, {@link #phone}, {@link #mention},
      *   {@link #hashtag}, and {@link #mention} options are enabled).
      * @param {Object} [options] Any of the configuration options for the Autolinker
      *   class, specified in an Object (map). See the class description for an
      *   example call.
      * @return {String} The HTML text, with matches automatically linked.
      */
    @JSImport("autolinker", "default.link")
    @js.native
    def link(textOrHtml: String): String = js.native
    @JSImport("autolinker", "default.link")
    @js.native
    def link(textOrHtml: String, options: AutolinkerConfig): String = js.native
    
    /**
      * For backwards compatibility with Autolinker 1.x, the Matcher classes are
      * provided as statics on the Autolinker class.
      */
    @JSImport("autolinker", "default.matcher")
    @js.native
    val matcher: Email = js.native
    
    /**
      * Parses the input `textOrHtml` looking for URLs, email addresses, phone
      * numbers, username handles, and hashtags (depending on the configuration
      * of the Autolinker instance), and returns an array of {@link Autolinker.match.Match}
      * objects describing those matches (without making any replacements).
      *
      * Note that if parsing multiple pieces of text, it is slightly more efficient
      * to create an Autolinker instance, and use the instance-level {@link #parse}
      * method.
      *
      * Example:
      *
      *     var matches = Autolinker.parse( "Hello google.com, I am asdf@asdf.com", {
      *         urls: true,
      *         email: true
      *     } );
      *
      *     console.log( matches.length );           // 2
      *     console.log( matches[ 0 ].getType() );   // 'url'
      *     console.log( matches[ 0 ].getUrl() );    // 'google.com'
      *     console.log( matches[ 1 ].getType() );   // 'email'
      *     console.log( matches[ 1 ].getEmail() );  // 'asdf@asdf.com'
      *
      * @static
      * @param {String} textOrHtml The HTML or text to find matches within
      *   (depending on if the {@link #urls}, {@link #email}, {@link #phone},
      *   {@link #hashtag}, and {@link #mention} options are enabled).
      * @param {Object} [options] Any of the configuration options for the Autolinker
      *   class, specified in an Object (map). See the class description for an
      *   example call.
      * @return {Autolinker.match.Match[]} The array of Matches found in the
      *   given input `textOrHtml`.
      */
    @JSImport("autolinker", "default.parse")
    @js.native
    def parse(textOrHtml: String, options: AutolinkerConfig): js.Array[typingsSlinky.autolinker.matchMatchMod.Match] = js.native
    
    /**
      * @static
      * @property {String} version
      *
      * The Autolinker version number in the form major.minor.patch
      *
      * Ex: 0.25.1
      */
    @JSImport("autolinker", "default.version")
    @js.native
    val version: /* "3.14.2" */ String = js.native
    
    /**
      * For backwards compatibility with Autolinker 1.x, the Match classes are
      * provided as statics on the Autolinker class.
      */
    @JSImport("autolinker", "default.match")
    @js.native
    val `match`: Hashtag = js.native
  }
  
  @JSImport("autolinker", "AnchorTagBuilder")
  @js.native
  /**
    * @method constructor
    * @param {Object} [cfg] The configuration options for the AnchorTagBuilder instance, specified in an Object (map).
    */
  class AnchorTagBuilder ()
    extends typingsSlinky.autolinker.anchorTagBuilderMod.AnchorTagBuilder {
    def this(cfg: AnchorTagBuilderCfg) = this()
  }
  
  @JSImport("autolinker", "Autolinker")
  @js.native
  /**
    * @method constructor
    * @param {Object} [cfg] The configuration options for the Autolinker instance,
    *   specified in an Object (map).
    */
  class Autolinker ()
    extends typingsSlinky.autolinker.autolinkerMod.default {
    def this(cfg: AutolinkerConfig) = this()
  }
  /* static members */
  object Autolinker {
    
    /**
      * For backwards compatibility with Autolinker 1.x, the AnchorTagBuilder
      * class is provided as a static on the Autolinker class.
      */
    @JSImport("autolinker", "Autolinker.AnchorTagBuilder")
    @js.native
    val AnchorTagBuilder: Instantiable1[
        /* cfg */ js.UndefOr[AnchorTagBuilderCfg], 
        typingsSlinky.autolinker.anchorTagBuilderMod.AnchorTagBuilder
      ] = js.native
    
    /**
      * For backwards compatibility with Autolinker 1.x, the HtmlTag class is
      * provided as a static on the Autolinker class.
      */
    @JSImport("autolinker", "Autolinker.HtmlTag")
    @js.native
    val HtmlTag: Instantiable1[/* cfg */ js.UndefOr[HtmlTagCfg], typingsSlinky.autolinker.htmlTagMod.HtmlTag] = js.native
    
    /**
      * Automatically links URLs, Email addresses, Phone Numbers, Twitter handles,
      * Hashtags, and Mentions found in the given chunk of HTML. Does not link URLs
      * found within HTML tags.
      *
      * For instance, if given the text: `You should go to http://www.yahoo.com`,
      * then the result will be `You should go to &lt;a href="http://www.yahoo.com"&gt;http://www.yahoo.com&lt;/a&gt;`
      *
      * Example:
      *
      *     var linkedText = Autolinker.link( "Go to google.com", { newWindow: false } );
      *     // Produces: "Go to <a href="http://google.com">google.com</a>"
      *
      * @static
      * @param {String} textOrHtml The HTML or text to find matches within (depending
      *   on if the {@link #urls}, {@link #email}, {@link #phone}, {@link #mention},
      *   {@link #hashtag}, and {@link #mention} options are enabled).
      * @param {Object} [options] Any of the configuration options for the Autolinker
      *   class, specified in an Object (map). See the class description for an
      *   example call.
      * @return {String} The HTML text, with matches automatically linked.
      */
    @JSImport("autolinker", "Autolinker.link")
    @js.native
    def link(textOrHtml: String): String = js.native
    @JSImport("autolinker", "Autolinker.link")
    @js.native
    def link(textOrHtml: String, options: AutolinkerConfig): String = js.native
    
    /**
      * For backwards compatibility with Autolinker 1.x, the Matcher classes are
      * provided as statics on the Autolinker class.
      */
    @JSImport("autolinker", "Autolinker.matcher")
    @js.native
    val matcher: Email = js.native
    
    /**
      * Parses the input `textOrHtml` looking for URLs, email addresses, phone
      * numbers, username handles, and hashtags (depending on the configuration
      * of the Autolinker instance), and returns an array of {@link Autolinker.match.Match}
      * objects describing those matches (without making any replacements).
      *
      * Note that if parsing multiple pieces of text, it is slightly more efficient
      * to create an Autolinker instance, and use the instance-level {@link #parse}
      * method.
      *
      * Example:
      *
      *     var matches = Autolinker.parse( "Hello google.com, I am asdf@asdf.com", {
      *         urls: true,
      *         email: true
      *     } );
      *
      *     console.log( matches.length );           // 2
      *     console.log( matches[ 0 ].getType() );   // 'url'
      *     console.log( matches[ 0 ].getUrl() );    // 'google.com'
      *     console.log( matches[ 1 ].getType() );   // 'email'
      *     console.log( matches[ 1 ].getEmail() );  // 'asdf@asdf.com'
      *
      * @static
      * @param {String} textOrHtml The HTML or text to find matches within
      *   (depending on if the {@link #urls}, {@link #email}, {@link #phone},
      *   {@link #hashtag}, and {@link #mention} options are enabled).
      * @param {Object} [options] Any of the configuration options for the Autolinker
      *   class, specified in an Object (map). See the class description for an
      *   example call.
      * @return {Autolinker.match.Match[]} The array of Matches found in the
      *   given input `textOrHtml`.
      */
    @JSImport("autolinker", "Autolinker.parse")
    @js.native
    def parse(textOrHtml: String, options: AutolinkerConfig): js.Array[typingsSlinky.autolinker.matchMatchMod.Match] = js.native
    
    /**
      * @static
      * @property {String} version
      *
      * The Autolinker version number in the form major.minor.patch
      *
      * Ex: 0.25.1
      */
    @JSImport("autolinker", "Autolinker.version")
    @js.native
    val version: /* "3.14.2" */ String = js.native
    
    /**
      * For backwards compatibility with Autolinker 1.x, the Match classes are
      * provided as statics on the Autolinker class.
      */
    @JSImport("autolinker", "Autolinker.match")
    @js.native
    val `match`: Hashtag = js.native
  }
  
  @JSImport("autolinker", "EmailMatch")
  @js.native
  class EmailMatch protected ()
    extends typingsSlinky.autolinker.matchMod.EmailMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: EmailMatchConfig) = this()
  }
  
  @JSImport("autolinker", "EmailMatcher")
  @js.native
  class EmailMatcher protected ()
    extends typingsSlinky.autolinker.matcherMod.EmailMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Matcher
      *   instance, specified in an Object (map).
      */
    def this(cfg: MatcherConfig) = this()
  }
  
  @JSImport("autolinker", "HashtagMatch")
  @js.native
  class HashtagMatch protected ()
    extends typingsSlinky.autolinker.matchMod.HashtagMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: HashtagMatchConfig) = this()
  }
  
  @JSImport("autolinker", "HashtagMatcher")
  @js.native
  class HashtagMatcher protected ()
    extends typingsSlinky.autolinker.matcherMod.HashtagMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match instance,
      *   specified in an Object (map).
      */
    def this(cfg: HashtagMatcherConfig) = this()
  }
  
  @JSImport("autolinker", "HtmlTag")
  @js.native
  /**
    * @method constructor
    * @param {Object} [cfg] The configuration properties for this class, in an Object (map)
    */
  class HtmlTag ()
    extends typingsSlinky.autolinker.htmlTagMod.HtmlTag {
    def this(cfg: HtmlTagCfg) = this()
  }
  
  @JSImport("autolinker", "Match")
  @js.native
  abstract class Match protected ()
    extends typingsSlinky.autolinker.matchMod.Match {
    /**
      * @member Autolinker.match.Match
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: MatchConfig) = this()
  }
  
  @JSImport("autolinker", "Matcher")
  @js.native
  abstract class Matcher protected ()
    extends typingsSlinky.autolinker.matcherMod.Matcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Matcher
      *   instance, specified in an Object (map).
      */
    def this(cfg: MatcherConfig) = this()
  }
  
  @JSImport("autolinker", "MentionMatch")
  @js.native
  class MentionMatch protected ()
    extends typingsSlinky.autolinker.matchMod.MentionMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: MentionMatchConfig) = this()
  }
  
  @JSImport("autolinker", "MentionMatcher")
  @js.native
  class MentionMatcher protected ()
    extends typingsSlinky.autolinker.matcherMod.MentionMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match instance,
      *   specified in an Object (map).
      */
    def this(cfg: MentionMatcherConfig) = this()
  }
  
  @JSImport("autolinker", "PhoneMatch")
  @js.native
  class PhoneMatch protected ()
    extends typingsSlinky.autolinker.matchMod.PhoneMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: PhoneMatchConfig) = this()
  }
  
  @JSImport("autolinker", "PhoneMatcher")
  @js.native
  class PhoneMatcher protected ()
    extends typingsSlinky.autolinker.matcherMod.PhoneMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Matcher
      *   instance, specified in an Object (map).
      */
    def this(cfg: MatcherConfig) = this()
  }
  
  @JSImport("autolinker", "UrlMatch")
  @js.native
  class UrlMatch protected ()
    extends typingsSlinky.autolinker.matchMod.UrlMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: UrlMatchConfig) = this()
  }
  
  @JSImport("autolinker", "UrlMatcher")
  @js.native
  class UrlMatcher protected ()
    extends typingsSlinky.autolinker.matcherMod.UrlMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match instance,
      *   specified in an Object (map).
      */
    def this(cfg: UrlMatcherConfig) = this()
  }
}
