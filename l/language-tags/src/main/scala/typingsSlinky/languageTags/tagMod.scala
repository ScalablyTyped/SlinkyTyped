package typingsSlinky.languageTags

import typingsSlinky.languageTags.languageTagsStrings.grandfathered
import typingsSlinky.languageTags.languageTagsStrings.redundant
import typingsSlinky.languageTags.languageTagsStrings.tag
import typingsSlinky.languageTags.tagMod.ErrorCode.ERR_DEPRECATED
import typingsSlinky.languageTags.tagMod.ErrorCode.ERR_DUPLICATE_VARIANT
import typingsSlinky.languageTags.tagMod.ErrorCode.ERR_EXTRA_EXTLANG
import typingsSlinky.languageTags.tagMod.ErrorCode.ERR_EXTRA_LANGUAGE
import typingsSlinky.languageTags.tagMod.ErrorCode.ERR_EXTRA_REGION
import typingsSlinky.languageTags.tagMod.ErrorCode.ERR_EXTRA_SCRIPT
import typingsSlinky.languageTags.tagMod.ErrorCode.ERR_NO_LANGUAGE
import typingsSlinky.languageTags.tagMod.ErrorCode.ERR_SUBTAG_DEPRECATED
import typingsSlinky.languageTags.tagMod.ErrorCode.ERR_SUPPRESS_SCRIPT
import typingsSlinky.languageTags.tagMod.ErrorCode.ERR_TOO_LONG
import typingsSlinky.languageTags.tagMod.ErrorCode.ERR_UNKNOWN
import typingsSlinky.languageTags.tagMod.ErrorCode.ERR_WRONG_ORDER
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagMod {
  
  @JSImport("language-tags/Tag", JSImport.Namespace)
  @js.native
  class ^ () extends Tag
  @JSImport("language-tags/Tag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("language-tags/Tag", "ERR_DEPRECATED")
  @js.native
  def ERR_DEPRECATED: typingsSlinky.languageTags.tagMod.ErrorCode.ERR_DEPRECATED = js.native
  @scala.inline
  def ERR_DEPRECATED_=(x: ERR_DEPRECATED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_DEPRECATED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("language-tags/Tag", "ERR_DUPLICATE_VARIANT")
  @js.native
  def ERR_DUPLICATE_VARIANT: typingsSlinky.languageTags.tagMod.ErrorCode.ERR_DUPLICATE_VARIANT = js.native
  @scala.inline
  def ERR_DUPLICATE_VARIANT_=(x: ERR_DUPLICATE_VARIANT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_DUPLICATE_VARIANT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("language-tags/Tag", "ERR_EXTRA_EXTLANG")
  @js.native
  def ERR_EXTRA_EXTLANG: typingsSlinky.languageTags.tagMod.ErrorCode.ERR_EXTRA_EXTLANG = js.native
  @scala.inline
  def ERR_EXTRA_EXTLANG_=(x: ERR_EXTRA_EXTLANG): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_EXTRA_EXTLANG")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("language-tags/Tag", "ERR_EXTRA_LANGUAGE")
  @js.native
  def ERR_EXTRA_LANGUAGE: typingsSlinky.languageTags.tagMod.ErrorCode.ERR_EXTRA_LANGUAGE = js.native
  @scala.inline
  def ERR_EXTRA_LANGUAGE_=(x: ERR_EXTRA_LANGUAGE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_EXTRA_LANGUAGE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("language-tags/Tag", "ERR_EXTRA_REGION")
  @js.native
  def ERR_EXTRA_REGION: typingsSlinky.languageTags.tagMod.ErrorCode.ERR_EXTRA_REGION = js.native
  @scala.inline
  def ERR_EXTRA_REGION_=(x: ERR_EXTRA_REGION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_EXTRA_REGION")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("language-tags/Tag", "ERR_EXTRA_SCRIPT")
  @js.native
  def ERR_EXTRA_SCRIPT: typingsSlinky.languageTags.tagMod.ErrorCode.ERR_EXTRA_SCRIPT = js.native
  @scala.inline
  def ERR_EXTRA_SCRIPT_=(x: ERR_EXTRA_SCRIPT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_EXTRA_SCRIPT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("language-tags/Tag", "ERR_NO_LANGUAGE")
  @js.native
  def ERR_NO_LANGUAGE: typingsSlinky.languageTags.tagMod.ErrorCode.ERR_NO_LANGUAGE = js.native
  @scala.inline
  def ERR_NO_LANGUAGE_=(x: ERR_NO_LANGUAGE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_NO_LANGUAGE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("language-tags/Tag", "ERR_SUBTAG_DEPRECATED")
  @js.native
  def ERR_SUBTAG_DEPRECATED: typingsSlinky.languageTags.tagMod.ErrorCode.ERR_SUBTAG_DEPRECATED = js.native
  @scala.inline
  def ERR_SUBTAG_DEPRECATED_=(x: ERR_SUBTAG_DEPRECATED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_SUBTAG_DEPRECATED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("language-tags/Tag", "ERR_SUPPRESS_SCRIPT")
  @js.native
  def ERR_SUPPRESS_SCRIPT: typingsSlinky.languageTags.tagMod.ErrorCode.ERR_SUPPRESS_SCRIPT = js.native
  @scala.inline
  def ERR_SUPPRESS_SCRIPT_=(x: ERR_SUPPRESS_SCRIPT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_SUPPRESS_SCRIPT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("language-tags/Tag", "ERR_TOO_LONG")
  @js.native
  def ERR_TOO_LONG: typingsSlinky.languageTags.tagMod.ErrorCode.ERR_TOO_LONG = js.native
  @scala.inline
  def ERR_TOO_LONG_=(x: ERR_TOO_LONG): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_TOO_LONG")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("language-tags/Tag", "ERR_UNKNOWN")
  @js.native
  def ERR_UNKNOWN: typingsSlinky.languageTags.tagMod.ErrorCode.ERR_UNKNOWN = js.native
  @scala.inline
  def ERR_UNKNOWN_=(x: ERR_UNKNOWN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_UNKNOWN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("language-tags/Tag", "ERR_WRONG_ORDER")
  @js.native
  def ERR_WRONG_ORDER: typingsSlinky.languageTags.tagMod.ErrorCode.ERR_WRONG_ORDER = js.native
  @scala.inline
  def ERR_WRONG_ORDER_=(x: ERR_WRONG_ORDER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_WRONG_ORDER")(x.asInstanceOf[js.Any])
  
  @js.native
  sealed trait ErrorCode extends StObject
  // These are really static integers assigned to Tag.
  @JSImport("language-tags/Tag", "ErrorCode")
  @js.native
  object ErrorCode extends StObject {
    
    @js.native
    sealed trait ERR_DEPRECATED extends ErrorCode
    
    @js.native
    sealed trait ERR_DUPLICATE_VARIANT extends ErrorCode
    
    @js.native
    sealed trait ERR_EXTRA_EXTLANG extends ErrorCode
    
    @js.native
    sealed trait ERR_EXTRA_LANGUAGE extends ErrorCode
    
    @js.native
    sealed trait ERR_EXTRA_REGION extends ErrorCode
    
    @js.native
    sealed trait ERR_EXTRA_SCRIPT extends ErrorCode
    
    @js.native
    sealed trait ERR_NO_LANGUAGE extends ErrorCode
    
    @js.native
    sealed trait ERR_SUBTAG_DEPRECATED extends ErrorCode
    
    @js.native
    sealed trait ERR_SUPPRESS_SCRIPT extends ErrorCode
    
    @js.native
    sealed trait ERR_TOO_LONG extends ErrorCode
    
    @js.native
    sealed trait ERR_UNKNOWN extends ErrorCode
    
    @js.native
    sealed trait ERR_WRONG_ORDER extends ErrorCode
  }
  
  // This class isn’t exposed. It’s an error instance that has additional properties.
  @js.native
  trait LanguageTagsError extends Error {
    
    var code: ErrorCode = js.native
    
    var subtag: typingsSlinky.languageTags.subtagMod.^ = js.native
    
    var tag: Tag = js.native
  }
  object LanguageTagsError {
    
    @scala.inline
    def apply(
      code: ErrorCode,
      message: String,
      name: String,
      subtag: typingsSlinky.languageTags.subtagMod.^,
      tag: Tag
    ): LanguageTagsError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtag = subtag.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[LanguageTagsError]
    }
    
    @scala.inline
    implicit class LanguageTagsErrorMutableBuilder[Self <: LanguageTagsError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: ErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtag(value: typingsSlinky.languageTags.subtagMod.^): Self = StObject.set(x, "subtag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tag extends StObject {
    
    /**
      * For grandfathered or redundant tags, returns a date string reflecting the date the tag was added to the registry.
      */
    def added(): String = js.native
    
    /**
      * For grandfathered or redundant tags, returns a date string reflecting the deprecation date if the tag is
      * deprecated.
      *
      * ```
      * > tags('zh-cmn-Hant').deprecated();
      * '2009-07-29'
      * ```
      */
    def deprecated(): String | Null = js.native
    
    /**
      * Returns an array of tag descriptions for grandfathered or redundant tags, otherwise returns an empty array.
      */
    def descriptions(): js.Array[String] = js.native
    
    /**
      * Returns an array of `Error` objects if the tag is invalid. The `message` property of each is readable and helpful
      * enough for UI output. The `code` property can be checked against the `Tag.ERR_*` constants. Each error will also
      * have either a `subtag` or `tag` property with the code of the offending tag.
      */
    def errors(): js.Array[LanguageTagsError] = js.native
    
    /**
      * Find a subtag of the given type from those making up the tag.
      */
    def find(`type`: String): typingsSlinky.languageTags.subtagMod.^ = js.native
    
    /**
      * Format a tag according to the case conventions defined in
      * [RFC 5646 section 2.1.1](http://tools.ietf.org/html/rfc5646#section-2.1.1).
      *
      * ```
      * > tags('en-gb').format();
      * 'en-GB'
      * ```
      */
    def format(): String = js.native
    
    /**
      * Shortcut for `tag.find('language')`.
      */
    def language(): typingsSlinky.languageTags.subtagMod.^ = js.native
    
    /**
      * If the tag is listed as 'deprecated' or 'redundant' it might have a preferred value. This method returns a `Tag`
      * object if so.
      *
      * ```
      * > tags('zh-cmn-Hant').preferred();
      * Tag
      * ```
      */
    def preferred(): Tag = js.native
    
    /**
      * Shortcut for `tag.find('region')`.
      */
    def region(): typingsSlinky.languageTags.subtagMod.^ = js.native
    
    /**
      * Shortcut for `tag.find('script')`.
      */
    def script(): typingsSlinky.languageTags.subtagMod.^ = js.native
    
    /**
      * Returns an array of subtags making up the tag, as `Subtag` objects.
      */
    def subtags(): js.Array[typingsSlinky.languageTags.subtagMod.^] = js.native
    
    /**
      * Returns `grandfathered` if the tag is grandfathered, `redundant` if the tag is redundant, and `tag` if neither.
      * For a definition of grandfathered and redundant tags, see
      * [RFC 5646 section 2.2.8](http://tools.ietf.org/html/rfc5646#section-2.2.8).
      */
    def `type`(): grandfathered | redundant | tag = js.native
    
    /**
      * Returns `true` if the tag is valid, `false` otherwise.
      */
    def valid(): Boolean = js.native
  }
  object Tag {
    
    @scala.inline
    def apply(
      added: () => String,
      deprecated: () => String | Null,
      descriptions: () => js.Array[String],
      errors: () => js.Array[LanguageTagsError],
      find: String => typingsSlinky.languageTags.subtagMod.^,
      format: () => String,
      language: () => typingsSlinky.languageTags.subtagMod.^,
      preferred: () => Tag,
      region: () => typingsSlinky.languageTags.subtagMod.^,
      script: () => typingsSlinky.languageTags.subtagMod.^,
      subtags: () => js.Array[typingsSlinky.languageTags.subtagMod.^],
      `type`: () => grandfathered | redundant | tag,
      valid: () => Boolean
    ): Tag = {
      val __obj = js.Dynamic.literal(added = js.Any.fromFunction0(added), deprecated = js.Any.fromFunction0(deprecated), descriptions = js.Any.fromFunction0(descriptions), errors = js.Any.fromFunction0(errors), find = js.Any.fromFunction1(find), format = js.Any.fromFunction0(format), language = js.Any.fromFunction0(language), preferred = js.Any.fromFunction0(preferred), region = js.Any.fromFunction0(region), script = js.Any.fromFunction0(script), subtags = js.Any.fromFunction0(subtags), valid = js.Any.fromFunction0(valid))
      __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
      __obj.asInstanceOf[Tag]
    }
    
    @scala.inline
    implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdded(value: () => String): Self = StObject.set(x, "added", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDeprecated(value: () => String | Null): Self = StObject.set(x, "deprecated", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDescriptions(value: () => js.Array[String]): Self = StObject.set(x, "descriptions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setErrors(value: () => js.Array[LanguageTagsError]): Self = StObject.set(x, "errors", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFind(value: String => typingsSlinky.languageTags.subtagMod.^): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormat(value: () => String): Self = StObject.set(x, "format", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLanguage(value: () => typingsSlinky.languageTags.subtagMod.^): Self = StObject.set(x, "language", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreferred(value: () => Tag): Self = StObject.set(x, "preferred", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegion(value: () => typingsSlinky.languageTags.subtagMod.^): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      @scala.inline
      def setScript(value: () => typingsSlinky.languageTags.subtagMod.^): Self = StObject.set(x, "script", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSubtags(value: () => js.Array[typingsSlinky.languageTags.subtagMod.^]): Self = StObject.set(x, "subtags", js.Any.fromFunction0(value))
      
      @scala.inline
      def setType(value: () => grandfathered | redundant | tag): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValid(value: () => Boolean): Self = StObject.set(x, "valid", js.Any.fromFunction0(value))
    }
  }
}
