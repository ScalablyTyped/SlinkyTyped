package typingsSlinky.gulpCache.mod.gc

import typingsSlinky.vinyl.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGulpCacheOptions extends js.Object {
  /**
    * The cache instance to use for caching.
    */
  var fileCache: js.UndefOr[IGulpCache] = js.native
  /**
    * The hash generator to use.
    */
  var key: js.UndefOr[
    js.Function2[
      /* file */ File, 
      /* callback */ js.UndefOr[js.Function2[/* err */ js.Any, /* result */ String, Unit]], 
      String | js.Promise[String]
    ]
  ] = js.native
  /**
    * The name of the bucket which stores the cached objects.
    * Default value = 'default'
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Value representing the success of a task.
    */
  var success: js.UndefOr[Boolean | Predicate[_]] = js.native
  /**
    * Content that is to be cached.
    */
  var value: js.UndefOr[js.Function1[/* result */ js.Any, js.Object | js.Promise[js.Object] | String]] = js.native
}

object IGulpCacheOptions {
  @scala.inline
  def apply(): IGulpCacheOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGulpCacheOptions]
  }
  @scala.inline
  implicit class IGulpCacheOptionsOps[Self <: IGulpCacheOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileCache(value: IGulpCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileCache")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(
      value: (/* file */ File, /* callback */ js.UndefOr[js.Function2[/* err */ js.Any, /* result */ String, Unit]]) => String | js.Promise[String]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessFunction1(value: _ => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean | Predicate[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: /* result */ js.Any => js.Object | js.Promise[js.Object] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

