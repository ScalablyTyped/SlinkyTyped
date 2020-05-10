package typingsSlinky.googleAppsScript.GoogleAppsScript.Cache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait CacheService extends js.Object {
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
  implicit class CacheServiceOps[Self <: CacheService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDocumentCache(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Cache.Cache | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDocumentCache")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScriptCache(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Cache.Cache | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScriptCache")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUserCache(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Cache.Cache | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserCache")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

