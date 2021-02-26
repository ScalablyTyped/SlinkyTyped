package typingsSlinky.podcast

import typingsSlinky.podcast.anon.FeedUrl_
import typingsSlinky.podcast.anon.Feedurl
import typingsSlinky.podcast.anon.ImageUrl_
import typingsSlinky.podcast.anon.Imageurl
import typingsSlinky.podcast.anon.SiteUrl_
import typingsSlinky.podcast.anon.Siteurl
import typingsSlinky.podcast.podcastStrings.bonus
import typingsSlinky.podcast.podcastStrings.episodic
import typingsSlinky.podcast.podcastStrings.full
import typingsSlinky.podcast.podcastStrings.serial
import typingsSlinky.podcast.podcastStrings.trailer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("podcast", JSImport.Namespace)
  @js.native
  class ^ () extends Podcast {
    def this(options: FeedOptions) = this()
    def this(options: js.UndefOr[scala.Nothing], items: js.Array[Item]) = this()
    def this(options: FeedOptions, items: js.Array[Item]) = this()
  }
  
  @js.native
  trait BaseFeedOptions extends StObject {
    
    var author: String = js.native
    
    var categories: js.UndefOr[js.Array[String]] = js.native
    
    var copyright: js.UndefOr[String] = js.native
    
    var customElements: js.UndefOr[js.Array[js.Object]] = js.native
    
    var customNamespaces: js.UndefOr[js.Object] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var docs: js.UndefOr[String] = js.native
    
    var generator: js.UndefOr[String] = js.native
    
    var itunesAuthor: js.UndefOr[String] = js.native
    
    var itunesCategory: js.UndefOr[js.Array[FeedItunesCategory]] = js.native
    
    var itunesExplicit: js.UndefOr[Boolean] = js.native
    
    var itunesImage: js.UndefOr[String] = js.native
    
    var itunesOwner: js.UndefOr[FeedItunesOwner] = js.native
    
    var itunesSubtitle: js.UndefOr[String] = js.native
    
    var itunesSummary: js.UndefOr[String] = js.native
    
    var itunesType: js.UndefOr[episodic | serial] = js.native
    
    var language: js.UndefOr[String] = js.native
    
    var managingEditor: js.UndefOr[String] = js.native
    
    var pubDate: js.UndefOr[js.Date | String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var ttl: js.UndefOr[Double] = js.native
    
    var webMaster: js.UndefOr[String] = js.native
  }
  object BaseFeedOptions {
    
    @scala.inline
    def apply(author: String): BaseFeedOptions = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseFeedOptions]
    }
    
    @scala.inline
    implicit class BaseFeedOptionsMutableBuilder[Self <: BaseFeedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
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
      def setCustomElements(value: js.Array[js.Object]): Self = StObject.set(x, "customElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomElementsUndefined: Self = StObject.set(x, "customElements", js.undefined)
      
      @scala.inline
      def setCustomElementsVarargs(value: js.Object*): Self = StObject.set(x, "customElements", js.Array(value :_*))
      
      @scala.inline
      def setCustomNamespaces(value: js.Object): Self = StObject.set(x, "customNamespaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomNamespacesUndefined: Self = StObject.set(x, "customNamespaces", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDocs(value: String): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
      
      @scala.inline
      def setGenerator(value: String): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
      
      @scala.inline
      def setItunesAuthor(value: String): Self = StObject.set(x, "itunesAuthor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesAuthorUndefined: Self = StObject.set(x, "itunesAuthor", js.undefined)
      
      @scala.inline
      def setItunesCategory(value: js.Array[FeedItunesCategory]): Self = StObject.set(x, "itunesCategory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesCategoryUndefined: Self = StObject.set(x, "itunesCategory", js.undefined)
      
      @scala.inline
      def setItunesCategoryVarargs(value: FeedItunesCategory*): Self = StObject.set(x, "itunesCategory", js.Array(value :_*))
      
      @scala.inline
      def setItunesExplicit(value: Boolean): Self = StObject.set(x, "itunesExplicit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesExplicitUndefined: Self = StObject.set(x, "itunesExplicit", js.undefined)
      
      @scala.inline
      def setItunesImage(value: String): Self = StObject.set(x, "itunesImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesImageUndefined: Self = StObject.set(x, "itunesImage", js.undefined)
      
      @scala.inline
      def setItunesOwner(value: FeedItunesOwner): Self = StObject.set(x, "itunesOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesOwnerUndefined: Self = StObject.set(x, "itunesOwner", js.undefined)
      
      @scala.inline
      def setItunesSubtitle(value: String): Self = StObject.set(x, "itunesSubtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesSubtitleUndefined: Self = StObject.set(x, "itunesSubtitle", js.undefined)
      
      @scala.inline
      def setItunesSummary(value: String): Self = StObject.set(x, "itunesSummary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesSummaryUndefined: Self = StObject.set(x, "itunesSummary", js.undefined)
      
      @scala.inline
      def setItunesType(value: episodic | serial): Self = StObject.set(x, "itunesType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesTypeUndefined: Self = StObject.set(x, "itunesType", js.undefined)
      
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
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
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
  trait FeedItunesCategory extends StObject {
    
    var subcats: js.UndefOr[js.Array[FeedItunesCategory]] = js.native
    
    var text: String = js.native
  }
  object FeedItunesCategory {
    
    @scala.inline
    def apply(text: String): FeedItunesCategory = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeedItunesCategory]
    }
    
    @scala.inline
    implicit class FeedItunesCategoryMutableBuilder[Self <: FeedItunesCategory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSubcats(value: js.Array[FeedItunesCategory]): Self = StObject.set(x, "subcats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubcatsUndefined: Self = StObject.set(x, "subcats", js.undefined)
      
      @scala.inline
      def setSubcatsVarargs(value: FeedItunesCategory*): Self = StObject.set(x, "subcats", js.Array(value :_*))
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FeedItunesOwner extends StObject {
    
    var email: String = js.native
    
    var name: String = js.native
  }
  object FeedItunesOwner {
    
    @scala.inline
    def apply(email: String, name: String): FeedItunesOwner = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeedItunesOwner]
    }
    
    @scala.inline
    implicit class FeedItunesOwnerMutableBuilder[Self <: FeedItunesOwner] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type FeedOptions = BaseFeedOptions with (FeedUrl_ | Feedurl) with (SiteUrl_ | Siteurl) with (ImageUrl_ | Imageurl)
  
  @js.native
  trait Item extends StObject {
    
    var author: js.UndefOr[String] = js.native
    
    var categories: js.UndefOr[js.Array[String]] = js.native
    
    var content: js.UndefOr[String] = js.native
    
    var customElements: js.UndefOr[js.Array[js.Object]] = js.native
    
    var date: js.Date | String = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var enclosure: js.UndefOr[ItemEnclosure] = js.native
    
    var guid: js.UndefOr[String] = js.native
    
    var itunesAuthor: js.UndefOr[String] = js.native
    
    var itunesDuration: js.UndefOr[Double | String] = js.native
    
    var itunesEpisode: js.UndefOr[Double] = js.native
    
    var itunesEpisodeType: js.UndefOr[full | trailer | bonus] = js.native
    
    var itunesExplicit: js.UndefOr[Boolean] = js.native
    
    var itunesImage: js.UndefOr[String] = js.native
    
    var itunesSeason: js.UndefOr[Double] = js.native
    
    var itunesSubtitle: js.UndefOr[String] = js.native
    
    var itunesSummary: js.UndefOr[String] = js.native
    
    var itunesTitle: js.UndefOr[String] = js.native
    
    var lat: js.UndefOr[Double] = js.native
    
    var long: js.UndefOr[Double] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var url: String = js.native
  }
  object Item {
    
    @scala.inline
    def apply(date: js.Date | String, url: String): Item = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
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
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setCustomElements(value: js.Array[js.Object]): Self = StObject.set(x, "customElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomElementsUndefined: Self = StObject.set(x, "customElements", js.undefined)
      
      @scala.inline
      def setCustomElementsVarargs(value: js.Object*): Self = StObject.set(x, "customElements", js.Array(value :_*))
      
      @scala.inline
      def setDate(value: js.Date | String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEnclosure(value: ItemEnclosure): Self = StObject.set(x, "enclosure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnclosureUndefined: Self = StObject.set(x, "enclosure", js.undefined)
      
      @scala.inline
      def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
      
      @scala.inline
      def setItunesAuthor(value: String): Self = StObject.set(x, "itunesAuthor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesAuthorUndefined: Self = StObject.set(x, "itunesAuthor", js.undefined)
      
      @scala.inline
      def setItunesDuration(value: Double | String): Self = StObject.set(x, "itunesDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesDurationUndefined: Self = StObject.set(x, "itunesDuration", js.undefined)
      
      @scala.inline
      def setItunesEpisode(value: Double): Self = StObject.set(x, "itunesEpisode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesEpisodeType(value: full | trailer | bonus): Self = StObject.set(x, "itunesEpisodeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesEpisodeTypeUndefined: Self = StObject.set(x, "itunesEpisodeType", js.undefined)
      
      @scala.inline
      def setItunesEpisodeUndefined: Self = StObject.set(x, "itunesEpisode", js.undefined)
      
      @scala.inline
      def setItunesExplicit(value: Boolean): Self = StObject.set(x, "itunesExplicit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesExplicitUndefined: Self = StObject.set(x, "itunesExplicit", js.undefined)
      
      @scala.inline
      def setItunesImage(value: String): Self = StObject.set(x, "itunesImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesImageUndefined: Self = StObject.set(x, "itunesImage", js.undefined)
      
      @scala.inline
      def setItunesSeason(value: Double): Self = StObject.set(x, "itunesSeason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesSeasonUndefined: Self = StObject.set(x, "itunesSeason", js.undefined)
      
      @scala.inline
      def setItunesSubtitle(value: String): Self = StObject.set(x, "itunesSubtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesSubtitleUndefined: Self = StObject.set(x, "itunesSubtitle", js.undefined)
      
      @scala.inline
      def setItunesSummary(value: String): Self = StObject.set(x, "itunesSummary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesSummaryUndefined: Self = StObject.set(x, "itunesSummary", js.undefined)
      
      @scala.inline
      def setItunesTitle(value: String): Self = StObject.set(x, "itunesTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItunesTitleUndefined: Self = StObject.set(x, "itunesTitle", js.undefined)
      
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
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ItemEnclosure extends StObject {
    
    var file: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var url: String = js.native
  }
  object ItemEnclosure {
    
    @scala.inline
    def apply(url: String): ItemEnclosure = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemEnclosure]
    }
    
    @scala.inline
    implicit class ItemEnclosureMutableBuilder[Self <: ItemEnclosure] (val x: Self) extends AnyVal {
      
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
  trait Podcast extends StObject {
    
    def addItem(item: Item): Unit = js.native
    
    def buildXml(): String = js.native
    def buildXml(indent: String): String = js.native
    def buildXml(indent: Boolean): String = js.native
  }
}
