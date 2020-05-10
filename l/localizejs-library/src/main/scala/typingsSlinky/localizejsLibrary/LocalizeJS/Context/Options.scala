package typingsSlinky.localizejsLibrary.LocalizeJS.Context

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Defaults to true. Automatically default the page language to the user's preferred language. The first path segment
    * in the URL is used to check to detect the language, ie. www.localize.com/fr. If no language dictionary exists for that
    * segment then the language setting in their browser is used.
    */
  var autodetectLanguage: Boolean = js.native
  /**
    * The base path will be stripped from the URL of the phrase as seen in the "Filter by pages" feature.
    */
  var basePath: String = js.native
  /**
    * Array of class names for which Localize will ignore.
    */
  var blockedClasses: js.Array[String] = js.native
  /**
    * The default language your website will be in when no language has been selected. Defaults to the source language of your website.
    */
  var defaultLanguage: String = js.native
  /**
    * Defaults to false. If true, the Localize library will not send additional metadata to our servers.
    * This metadata includes the surrounding HTML of the phrases detected on your website.
    */
  var enhancedContentSecurity: Boolean = js.native
  /**
    * Defaults to true. If true, translations will be fetched from Localize if not bootstrapped.
    */
  var fetchTranslations: Boolean = js.native
  /**
    * Required. Your project key.
    */
  var key: String = js.native
  /**
    * Defaults to false. Set to true to prefetch all active languages, or pass a language code or an array of codes to.
    */
  var prefetch: Boolean = js.native
  /**
    * Defaults to false. If true, Localize will translate your website to the last selected language on subsequent page views.
    */
  var rememberLanguage: Boolean = js.native
  /**
    * Defaults to false. Automatically translate content that is added dynamically to your webpage.
    * For example, if your webpage dynamically adds html into the source of the page, our library
    * will translate it once the translations have been generated. Behind the scenes this means the
    * dictionary file with all your translated content is available for use with Localize.translate().
    * However, translations are not generated instantly, so use with our library event updatedDictionary is recommended.
    */
  var retranslateOnNewPhrases: Boolean = js.native
  /**
    * Defaults to true. If true, unrecognized phrases will be added to your Localize account. Disable this in development.
    */
  var saveNewPhrases: Boolean = js.native
  /**
    * Defaults to false. If true, Localize will detect phrases only when the page is not translated.
    * Please contact support@localizejs.com prior to updating this option.
    */
  var saveNewPhrasesFromSource: Boolean = js.native
  /**
    * Language to translate your website to.
    */
  var targetLanguage: String = js.native
  /**
    * Defaults to true. If true, "alt" attributes will be translated.
    */
  var translateAlt: Boolean = js.native
  /**
    * Defaults to false. When true, Localize will attempt to translate the entire body of the page.
    * If false, Localize will only translate content contained with a "localizejs" class name.
    */
  var translateBody: Boolean = js.native
  /**
    * Array of class names for which Localize will translate. If you use this option, Localize will only translate content
    * contained in these classes and will ignore all other content in the body of the page.
    */
  var translateClasses: js.Array[String] = js.native
  /**
    * Defaults to false. Allows users to turn on meta tag translation. This optimizes your site for SEO.
    */
  var translateMetaTags: Boolean = js.native
  /**
    * Defaults to false. If true, the Localize library will pick up numbers as phrases.
    */
  var translateNumbers: Boolean = js.native
  /**
    * Defaults to false. If true, the Localize library will pick up phrases in the <time> elements.
    */
  var translateTimeElement: Boolean = js.native
  /**
    * Defaults to true. If true, the <title> of the page will translate.
    */
  var translateTitle: Boolean = js.native
}

object Options {
  @scala.inline
  def apply(
    autodetectLanguage: Boolean,
    basePath: String,
    blockedClasses: js.Array[String],
    defaultLanguage: String,
    enhancedContentSecurity: Boolean,
    fetchTranslations: Boolean,
    key: String,
    prefetch: Boolean,
    rememberLanguage: Boolean,
    retranslateOnNewPhrases: Boolean,
    saveNewPhrases: Boolean,
    saveNewPhrasesFromSource: Boolean,
    targetLanguage: String,
    translateAlt: Boolean,
    translateBody: Boolean,
    translateClasses: js.Array[String],
    translateMetaTags: Boolean,
    translateNumbers: Boolean,
    translateTimeElement: Boolean,
    translateTitle: Boolean
  ): Options = {
    val __obj = js.Dynamic.literal(autodetectLanguage = autodetectLanguage.asInstanceOf[js.Any], basePath = basePath.asInstanceOf[js.Any], blockedClasses = blockedClasses.asInstanceOf[js.Any], defaultLanguage = defaultLanguage.asInstanceOf[js.Any], enhancedContentSecurity = enhancedContentSecurity.asInstanceOf[js.Any], fetchTranslations = fetchTranslations.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], prefetch = prefetch.asInstanceOf[js.Any], rememberLanguage = rememberLanguage.asInstanceOf[js.Any], retranslateOnNewPhrases = retranslateOnNewPhrases.asInstanceOf[js.Any], saveNewPhrases = saveNewPhrases.asInstanceOf[js.Any], saveNewPhrasesFromSource = saveNewPhrasesFromSource.asInstanceOf[js.Any], targetLanguage = targetLanguage.asInstanceOf[js.Any], translateAlt = translateAlt.asInstanceOf[js.Any], translateBody = translateBody.asInstanceOf[js.Any], translateClasses = translateClasses.asInstanceOf[js.Any], translateMetaTags = translateMetaTags.asInstanceOf[js.Any], translateNumbers = translateNumbers.asInstanceOf[js.Any], translateTimeElement = translateTimeElement.asInstanceOf[js.Any], translateTitle = translateTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutodetectLanguage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autodetectLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockedClasses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockedClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnhancedContentSecurity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhancedContentSecurity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFetchTranslations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchTranslations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefetch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRememberLanguage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rememberLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetranslateOnNewPhrases(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retranslateOnNewPhrases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaveNewPhrases(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveNewPhrases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaveNewPhrasesFromSource(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveNewPhrasesFromSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslateAlt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateAlt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslateBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslateClasses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslateMetaTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateMetaTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslateNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslateTimeElement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateTimeElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslateTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateTitle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

