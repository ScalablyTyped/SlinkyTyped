package typingsSlinky.googleAppsScript.GoogleAppsScript

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cache {
  
  /**
    * A reference to a particular cache.
    *
    * This class allows you to insert, retrieve, and remove items from a cache. This can be
    * particularly useful when you want frequent access to an expensive or slow resource. For example,
    * say you have an RSS feed at example.com that takes 20 seconds to fetch, but you want to speed up
    * access on an average request.
    *
    *     function getRssFeed() {
    *       var cache = CacheService.getScriptCache();
    *       var cached = cache.get("rss-feed-contents");
    *       if (cached != null) {
    *         return cached;
    *       }
    *       var result = UrlFetchApp.fetch("http://example.com/my-slow-rss-feed.xml"); // takes 20 seconds
    *       var contents = result.getContentText();
    *       cache.put("rss-feed-contents", contents, 1500); // cache for 25 minutes
    *       return contents;
    *     }
    */
  @js.native
  trait Cache extends StObject {
    
    def get(key: String): String | Null = js.native
    
    def getAll(keys: js.Array[String]): StringDictionary[js.Any] = js.native
    
    def put(key: String, value: String): Unit = js.native
    def put(key: String, value: String, expirationInSeconds: Integer): Unit = js.native
    
    def putAll(values: StringDictionary[js.Any]): Unit = js.native
    def putAll(values: StringDictionary[js.Any], expirationInSeconds: Integer): Unit = js.native
    
    def remove(key: String): Unit = js.native
    
    def removeAll(keys: js.Array[String]): Unit = js.native
  }
  
  /**
    * CacheService allows you to access a cache for short term storage of data.
    *
    * This class lets you get a specific cache instance. Public caches are for things that are not
    * dependent on which user is accessing your script. Private caches are for things which are
    * user-specific, like settings or recent activity.
    *
    * The data you write to the cache is not guaranteed to persist until its expiration time. You
    * must be prepared to get back null from all reads.
    */
  @js.native
  trait CacheService extends StObject {
    
    def getDocumentCache(): typingsSlinky.googleAppsScript.GoogleAppsScript.Cache.Cache | Null = js.native
    
    def getScriptCache(): typingsSlinky.googleAppsScript.GoogleAppsScript.Cache.Cache | Null = js.native
    
    def getUserCache(): typingsSlinky.googleAppsScript.GoogleAppsScript.Cache.Cache | Null = js.native
  }
  object CacheService {
    
    @scala.inline
    def apply(
      getDocumentCache: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Cache.Cache | Null,
      getScriptCache: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Cache.Cache | Null,
      getUserCache: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Cache.Cache | Null
    ): CacheService = {
      val __obj = js.Dynamic.literal(getDocumentCache = js.Any.fromFunction0(getDocumentCache), getScriptCache = js.Any.fromFunction0(getScriptCache), getUserCache = js.Any.fromFunction0(getUserCache))
      __obj.asInstanceOf[CacheService]
    }
    
    @scala.inline
    implicit class CacheServiceMutableBuilder[Self <: CacheService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDocumentCache(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Cache.Cache | Null): Self = StObject.set(x, "getDocumentCache", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetScriptCache(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Cache.Cache | Null): Self = StObject.set(x, "getScriptCache", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUserCache(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Cache.Cache | Null): Self = StObject.set(x, "getUserCache", js.Any.fromFunction0(value))
    }
  }
}
