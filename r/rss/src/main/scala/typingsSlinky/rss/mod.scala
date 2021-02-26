package typingsSlinky.rss

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typingsSlinky.rss.mod.NodeRSS.FeedOptions
import typingsSlinky.rss.mod.NodeRSS.RSS
import typingsSlinky.rss.mod.NodeRSS.RSSFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rss", JSImport.Namespace)
  @js.native
  class ^ protected () extends RSS {
    /**
      * Create an RSS feed with options.
      * @param {FeedOptions} feedOptions - Options for the RSS feed.
      * @returns {RSS}
      */
    def this(feedOptions: FeedOptions) = this()
  }
  @JSImport("rss", JSImport.Namespace)
  @js.native
  val ^ : RSSFactory = js.native
  
  object NodeRSS {
    
    @js.native
    trait EnclosureObject extends StObject {
      
      /**
        * Path to binary file (or URL).
        */
      var file: js.UndefOr[String] = js.native
      
      /**
        * Size of the file.
        */
      var size: js.UndefOr[Double] = js.native
      
      /**
        * If not provided, the MIME Type will be guessed based
        * on the extension of the file or URL, passing type to
        * the enclosure will override the guessed type.
        */
      var `type`: js.UndefOr[String] = js.native
      
      /**
        * URL to file object (or file).
        */
      var url: String = js.native
    }
    object EnclosureObject {
      
      @scala.inline
      def apply(url: String): EnclosureObject = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[EnclosureObject]
      }
      
      @scala.inline
      implicit class EnclosureObjectMutableBuilder[Self <: EnclosureObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
        
        @scala.inline
        def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait FeedOptions extends StObject {
      
      /**
        * One or more categories this feed belongs to.
        */
      var categories: js.UndefOr[js.Array[String]] = js.native
      
      /**
        * Copyright information for this feed.
        */
      var copyright: js.UndefOr[String] = js.native
      
      /**
        * Put additional elements in the feed (node-xml syntax).
        */
      var custom_elements: js.UndefOr[js.Array[_]] = js.native
      
      /**
        * Put additional namespaces in element
        * (without 'xmlns:' prefix).
        */
      var custom_namespaces: js.UndefOr[js.Object] = js.native
      
      /**
        * A short description of the feed.
        */
      var description: js.UndefOr[String] = js.native
      
      /**
        * URL to documentation on this feed.
        */
      var docs: js.UndefOr[String] = js.native
      
      /**
        * URL to the rss feed.
        */
      var feed_url: String = js.native
      
      /**
        * Feed generator.
        */
      var generator: js.UndefOr[String] = js.native
      
      /**
        * Where is the PubSubHub hub located.
        */
      var hub: js.UndefOr[String] = js.native
      
      /**
        * Small image for feed readers to use.
        */
      var image_url: js.UndefOr[String] = js.native
      
      /**
        * The language of the content of this feed.
        */
      var language: js.UndefOr[String] = js.native
      
      /**
        * Who manages content in this feed.
        */
      var managingEditor: js.UndefOr[String] = js.native
      
      /**
        * The publication date for content in the feed.
        * Accepts Date object or string with any format
        * JS Date can parse.
        */
      var pubDate: js.UndefOr[js.Date | String] = js.native
      
      /**
        * URL to the site that the feed is for.
        */
      var site_url: String = js.native
      
      /**
        * Title of your site or feed.
        */
      var title: String = js.native
      
      /**
        * Number of minutes feed can be cached before refreshing
        * from source.
        */
      var ttl: js.UndefOr[Double] = js.native
      
      /**
        * Who manages feed availability and technical support.
        */
      var webMaster: js.UndefOr[String] = js.native
    }
    object FeedOptions {
      
      @scala.inline
      def apply(feed_url: String, site_url: String, title: String): FeedOptions = {
        val __obj = js.Dynamic.literal(feed_url = feed_url.asInstanceOf[js.Any], site_url = site_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[FeedOptions]
      }
      
      @scala.inline
      implicit class FeedOptionsMutableBuilder[Self <: FeedOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
        
        @scala.inline
        def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
        
        @scala.inline
        def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
        
        @scala.inline
        def setCustom_elements(value: js.Array[_]): Self = StObject.set(x, "custom_elements", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustom_elementsUndefined: Self = StObject.set(x, "custom_elements", js.undefined)
        
        @scala.inline
        def setCustom_elementsVarargs(value: js.Any*): Self = StObject.set(x, "custom_elements", js.Array(value :_*))
        
        @scala.inline
        def setCustom_namespaces(value: js.Object): Self = StObject.set(x, "custom_namespaces", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustom_namespacesUndefined: Self = StObject.set(x, "custom_namespaces", js.undefined)
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setDocs(value: String): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
        
        @scala.inline
        def setFeed_url(value: String): Self = StObject.set(x, "feed_url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGenerator(value: String): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
        
        @scala.inline
        def setHub(value: String): Self = StObject.set(x, "hub", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHubUndefined: Self = StObject.set(x, "hub", js.undefined)
        
        @scala.inline
        def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImage_urlUndefined: Self = StObject.set(x, "image_url", js.undefined)
        
        @scala.inline
        def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
        
        @scala.inline
        def setManagingEditor(value: String): Self = StObject.set(x, "managingEditor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setManagingEditorUndefined: Self = StObject.set(x, "managingEditor", js.undefined)
        
        @scala.inline
        def setPubDate(value: js.Date | String): Self = StObject.set(x, "pubDate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPubDateDate(value: js.Date): Self = StObject.set(x, "pubDate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPubDateUndefined: Self = StObject.set(x, "pubDate", js.undefined)
        
        @scala.inline
        def setSite_url(value: String): Self = StObject.set(x, "site_url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
        
        @scala.inline
        def setWebMaster(value: String): Self = StObject.set(x, "webMaster", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWebMasterUndefined: Self = StObject.set(x, "webMaster", js.undefined)
      }
    }
    
    @js.native
    trait ItemOptions extends StObject {
      
      /**
        * If included it is the name of the item's creator. If not
        * provided the item author will be the same as the feed author.
        * This is typical except on multi-author blogs.
        */
      var author: js.UndefOr[String] = js.native
      
      /**
        * If provided, each array item will be added as a category
        * element.
        */
      var categories: js.UndefOr[js.Array[String]] = js.native
      
      /**
        * Put additional elements in the item (node-xml syntax).
        */
      var custom_elements: js.UndefOr[js.Array[_]] = js.native
      
      /**
        * The date and time of when the item was created. Feed
        * readers use this to determine the sort order. Some readers
        * will also use it to determine if the content should be
        * presented as unread.
        * Accepts Date object or string with any format
        * JS Date can parse.
        */
      var date: js.Date | String = js.native
      
      /**
        * Content for the item. Can contain HTML but link and image
        * URLs must be absolute path including hostname.
        */
      var description: String = js.native
      
      /**
        * An enclosure object.
        */
      var enclosure: js.UndefOr[EnclosureObject] = js.native
      
      /**
        * A unique string feed readers use to know if an item is
        * new or has already been seen. If you use a guid never
        * change it. If you don't provide a guid then your item
        * urls must be unique.
        * Defaults to url.
        */
      var guid: js.UndefOr[String] = js.native
      
      /**
        * The latitude coordinate of the item for GeoRSS.
        */
      var lat: js.UndefOr[Double] = js.native
      
      /**
        * The longitude coordinate of the item for GeoRSS.
        */
      var long: js.UndefOr[Double] = js.native
      
      /**
        * Title of this particular item.
        */
      var title: String = js.native
      
      /**
        * URL to the item. This could be a blog entry.
        */
      var url: String = js.native
    }
    object ItemOptions {
      
      @scala.inline
      def apply(date: js.Date | String, description: String, title: String, url: String): ItemOptions = {
        val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[ItemOptions]
      }
      
      @scala.inline
      implicit class ItemOptionsMutableBuilder[Self <: ItemOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
        
        @scala.inline
        def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
        
        @scala.inline
        def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
        
        @scala.inline
        def setCustom_elements(value: js.Array[_]): Self = StObject.set(x, "custom_elements", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustom_elementsUndefined: Self = StObject.set(x, "custom_elements", js.undefined)
        
        @scala.inline
        def setCustom_elementsVarargs(value: js.Any*): Self = StObject.set(x, "custom_elements", js.Array(value :_*))
        
        @scala.inline
        def setDate(value: js.Date | String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDateDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnclosure(value: EnclosureObject): Self = StObject.set(x, "enclosure", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnclosureUndefined: Self = StObject.set(x, "enclosure", js.undefined)
        
        @scala.inline
        def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
        
        @scala.inline
        def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLatUndefined: Self = StObject.set(x, "lat", js.undefined)
        
        @scala.inline
        def setLong(value: Double): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLongUndefined: Self = StObject.set(x, "long", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait RSS extends StObject {
      
      /**
        * Add an item to a feed. An item can be used for a blog
        * entry, project update, log entry, etc.
        * @param {ItemOptions} itemOptions
        * @returns {RSS}
        */
      def item(itemOptions: ItemOptions): RSS = js.native
      
      /**
        * Generate XML and return as a string for this feed.
        * @returns {string}
        */
      def xml(): String = js.native
      /**
        * Generate XML and return as a string for this feed.
        *
        * @param {XmlOptions} xmlOptions - You can use indent
        * option to specify the tab character to use.
        * @returns {string}
        */
      def xml(xmlOptions: XmlOptions): String = js.native
    }
    
    @js.native
    trait RSSFactory
      extends /**
      * Create an RSS feed with options.
      * @param {FeedOptions} feedOptions - Options for the RSS feed.
      * @returns {RSS}
      */
    Instantiable1[/* feedOptions */ FeedOptions, RSS]
    
    @js.native
    trait XmlOptions extends StObject {
      
      /**
        * What to use as a tab. Defaults to no tabs (compressed).
        * For example you can use '\t' for tab character, or ' '
        * for two-space tabs. If you set it to true it will use
        * four spaces.
        */
      var indent: js.UndefOr[Boolean | String] = js.native
    }
    object XmlOptions {
      
      @scala.inline
      def apply(): XmlOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[XmlOptions]
      }
      
      @scala.inline
      implicit class XmlOptionsMutableBuilder[Self <: XmlOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIndent(value: Boolean | String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      }
    }
  }
  
  type _To = RSSFactory
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RSSFactory = ^
}
