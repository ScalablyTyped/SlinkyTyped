package typingsSlinky.autolinker

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.autolinker.autolinkerStrings.`3DOT11DOT1`
import typingsSlinky.autolinker.distCommonjsAnchorDashTagDashBuilderMod.AnchorTagBuilderCfg
import typingsSlinky.autolinker.distCommonjsAutolinkerMod.AutolinkerConfig
import typingsSlinky.autolinker.distCommonjsHtmlDashTagMod.HtmlTagCfg
import typingsSlinky.autolinker.distCommonjsMatchEmailDashMatchMod.EmailMatchConfig
import typingsSlinky.autolinker.distCommonjsMatchHashtagDashMatchMod.HashtagMatchConfig
import typingsSlinky.autolinker.distCommonjsMatchMatchMod.MatchConfig
import typingsSlinky.autolinker.distCommonjsMatchMentionDashMatchMod.MentionMatchConfig
import typingsSlinky.autolinker.distCommonjsMatchPhoneDashMatchMod.PhoneMatchConfig
import typingsSlinky.autolinker.distCommonjsMatchUrlDashMatchMod.UrlMatchConfig
import typingsSlinky.autolinker.distCommonjsMatcherHashtagDashMatcherMod.HashtagMatcherConfig
import typingsSlinky.autolinker.distCommonjsMatcherMatcherMod.MatcherConfig
import typingsSlinky.autolinker.distCommonjsMatcherMentionDashMatcherMod.MentionMatcherConfig
import typingsSlinky.autolinker.distCommonjsMatcherUrlDashMatcherMod.UrlMatcherConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autolinker", JSImport.Namespace)
@js.native
object autolinkerMod extends js.Object {
  @js.native
  /**
    * @method constructor
    * @param {Object} [cfg] The configuration options for the AnchorTagBuilder instance, specified in an Object (map).
    */
  class AnchorTagBuilder ()
    extends typingsSlinky.autolinker.distCommonjsAnchorDashTagDashBuilderMod.AnchorTagBuilder {
    def this(cfg: AnchorTagBuilderCfg) = this()
  }
  
  @js.native
  /**
    * @method constructor
    * @param {Object} [cfg] The configuration options for the Autolinker instance,
    *   specified in an Object (map).
    */
  class Autolinker ()
    extends typingsSlinky.autolinker.distCommonjsAutolinkerMod.default {
    def this(cfg: AutolinkerConfig) = this()
  }
  
  @js.native
  class EmailMatch protected ()
    extends typingsSlinky.autolinker.distCommonjsMatchMod.EmailMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: EmailMatchConfig) = this()
  }
  
  @js.native
  class EmailMatcher ()
    extends typingsSlinky.autolinker.distCommonjsMatcherEmailDashMatcherMod.EmailMatcher
  
  @js.native
  class HashtagMatch protected ()
    extends typingsSlinky.autolinker.distCommonjsMatchMod.HashtagMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: HashtagMatchConfig) = this()
  }
  
  @js.native
  class HashtagMatcher protected ()
    extends typingsSlinky.autolinker.distCommonjsMatcherMod.HashtagMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match instance,
      *   specified in an Object (map).
      */
    def this(cfg: HashtagMatcherConfig) = this()
  }
  
  @js.native
  /**
    * @method constructor
    * @param {Object} [cfg] The configuration properties for this class, in an Object (map)
    */
  class HtmlTag ()
    extends typingsSlinky.autolinker.distCommonjsHtmlDashTagMod.HtmlTag {
    def this(cfg: HtmlTagCfg) = this()
  }
  
  @js.native
  abstract class Match protected ()
    extends typingsSlinky.autolinker.distCommonjsMatchMod.Match {
    /**
      * @member Autolinker.match.Match
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: MatchConfig) = this()
  }
  
  @js.native
  abstract class Matcher protected ()
    extends typingsSlinky.autolinker.distCommonjsMatcherMod.Matcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Matcher
      *   instance, specified in an Object (map).
      */
    def this(cfg: MatcherConfig) = this()
  }
  
  @js.native
  class MentionMatch protected ()
    extends typingsSlinky.autolinker.distCommonjsMatchMod.MentionMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: MentionMatchConfig) = this()
  }
  
  @js.native
  class MentionMatcher protected ()
    extends typingsSlinky.autolinker.distCommonjsMatcherMod.MentionMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match instance,
      *   specified in an Object (map).
      */
    def this(cfg: MentionMatcherConfig) = this()
  }
  
  @js.native
  class PhoneMatch protected ()
    extends typingsSlinky.autolinker.distCommonjsMatchMod.PhoneMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: PhoneMatchConfig) = this()
  }
  
  @js.native
  class PhoneMatcher ()
    extends typingsSlinky.autolinker.distCommonjsMatcherPhoneDashMatcherMod.PhoneMatcher
  
  @js.native
  class UrlMatch protected ()
    extends typingsSlinky.autolinker.distCommonjsMatchMod.UrlMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: UrlMatchConfig) = this()
  }
  
  @js.native
  class UrlMatcher protected ()
    extends typingsSlinky.autolinker.distCommonjsMatcherMod.UrlMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match instance,
      *   specified in an Object (map).
      */
    def this(cfg: UrlMatcherConfig) = this()
  }
  
  @js.native
  /**
    * @method constructor
    * @param {Object} [cfg] The configuration options for the Autolinker instance,
    *   specified in an Object (map).
    */
  class default ()
    extends typingsSlinky.autolinker.distCommonjsAutolinkerMod.default {
    def this(cfg: AutolinkerConfig) = this()
  }
  
  /* static members */
  @js.native
  object Autolinker extends js.Object {
    /**
      * For backwards compatibility with Autolinker 1.x, the AnchorTagBuilder
      * class is provided as a static on the Autolinker class.
      */
    val AnchorTagBuilder: Instantiable1[
        js.UndefOr[/* cfg */ AnchorTagBuilderCfg], 
        typingsSlinky.autolinker.distCommonjsAnchorDashTagDashBuilderMod.AnchorTagBuilder
      ] = js.native
    /**
      * For backwards compatibility with Autolinker 1.x, the HtmlTag class is
      * provided as a static on the Autolinker class.
      */
    val HtmlTag: Instantiable1[
        js.UndefOr[/* cfg */ HtmlTagCfg], 
        typingsSlinky.autolinker.distCommonjsHtmlDashTagMod.HtmlTag
      ] = js.native
    /**
      * For backwards compatibility with Autolinker 1.x, the Match classes are
      * provided as statics on the Autolinker class.
      */
    val `match`: Anon_CfgEmail = js.native
    /**
      * For backwards compatibility with Autolinker 1.x, the Matcher classes are
      * provided as statics on the Autolinker class.
      */
    val matcher: Anon_Cfg = js.native
    /**
      * @static
      * @property {String} version
      *
      * The Autolinker version number in the form major.minor.patch
      *
      * Ex: 0.25.1
      */
    val version: `3DOT11DOT1` = js.native
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
    def link(textOrHtml: String): String = js.native
    def link(textOrHtml: String, options: AutolinkerConfig): String = js.native
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
    def parse(textOrHtml: String, options: AutolinkerConfig): js.Array[typingsSlinky.autolinker.distCommonjsMatchMatchMod.Match] = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    /**
      * For backwards compatibility with Autolinker 1.x, the AnchorTagBuilder
      * class is provided as a static on the Autolinker class.
      */
    val AnchorTagBuilder: Instantiable1[
        js.UndefOr[/* cfg */ AnchorTagBuilderCfg], 
        typingsSlinky.autolinker.distCommonjsAnchorDashTagDashBuilderMod.AnchorTagBuilder
      ] = js.native
    /**
      * For backwards compatibility with Autolinker 1.x, the HtmlTag class is
      * provided as a static on the Autolinker class.
      */
    val HtmlTag: Instantiable1[
        js.UndefOr[/* cfg */ HtmlTagCfg], 
        typingsSlinky.autolinker.distCommonjsHtmlDashTagMod.HtmlTag
      ] = js.native
    /**
      * For backwards compatibility with Autolinker 1.x, the Match classes are
      * provided as statics on the Autolinker class.
      */
    val `match`: Anon_CfgEmail = js.native
    /**
      * For backwards compatibility with Autolinker 1.x, the Matcher classes are
      * provided as statics on the Autolinker class.
      */
    val matcher: Anon_Cfg = js.native
    /**
      * @static
      * @property {String} version
      *
      * The Autolinker version number in the form major.minor.patch
      *
      * Ex: 0.25.1
      */
    val version: `3DOT11DOT1` = js.native
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
    def link(textOrHtml: String): String = js.native
    def link(textOrHtml: String, options: AutolinkerConfig): String = js.native
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
    def parse(textOrHtml: String, options: AutolinkerConfig): js.Array[typingsSlinky.autolinker.distCommonjsMatchMatchMod.Match] = js.native
  }
  
}

