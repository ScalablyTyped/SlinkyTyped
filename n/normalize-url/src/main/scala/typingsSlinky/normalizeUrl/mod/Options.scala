package typingsSlinky.normalizeUrl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		@default 'http:'
  		*/
  val defaultProtocol: js.UndefOr[String] = js.native
  /**
  		Normalizes `https:` URLs to `http:`.
  		@default false
  		@example
  		```
  		normalizeUrl('https://sindresorhus.com:80/');
  		//=> 'https://sindresorhus.com'
  		normalizeUrl('https://sindresorhus.com:80/', {forceHttp: true});
  		//=> 'http://sindresorhus.com'
  		```
  		*/
  val forceHttp: js.UndefOr[Boolean] = js.native
  /**
  		Normalizes `http:` URLs to `https:`.
  		This option can't be used with the `forceHttp` option at the same time.
  		@default false
  		@example
  		```
  		normalizeUrl('https://sindresorhus.com:80/');
  		//=> 'https://sindresorhus.com'
  		normalizeUrl('http://sindresorhus.com:80/', {forceHttps: true});
  		//=> 'https://sindresorhus.com'
  		```
  		*/
  val forceHttps: js.UndefOr[Boolean] = js.native
  /**
  		Prepends `defaultProtocol` to the URL if it's protocol-relative.
  		@default true
  		@example
  		```
  		normalizeUrl('//sindresorhus.com:80/');
  		//=> 'http://sindresorhus.com'
  		normalizeUrl('//sindresorhus.com:80/', {normalizeProtocol: false});
  		//=> '//sindresorhus.com'
  		```
  		*/
  val normalizeProtocol: js.UndefOr[Boolean] = js.native
  /**
  		Removes the default directory index file from path that matches any of the provided strings or regexes.
  		When `true`, the regex `/^index\.[a-z]+$/` is used.
  		@default false
  		@example
  		```
  		normalizeUrl('www.sindresorhus.com/foo/default.php', {
  			removeDirectoryIndex: [/^default\.[a-z]+$/]
  		});
  		//=> 'http://sindresorhus.com/foo'
  		```
  		*/
  val removeDirectoryIndex: js.UndefOr[js.Array[js.RegExp | String]] = js.native
  /**
  		Removes query parameters that matches any of the provided strings or regexes.
  		@default [/^utm_\w+/i]
  		@example
  		```
  		normalizeUrl('www.sindresorhus.com?foo=bar&ref=test_ref', {
  			removeQueryParameters: ['ref']
  		});
  		//=> 'http://sindresorhus.com/?foo=bar'
  		```
  		*/
  val removeQueryParameters: js.UndefOr[js.Array[js.RegExp | String]] = js.native
  /**
  		Removes trailing slash.
  		__Note__: Trailing slash is always removed if the URL doesn't have a pathname.
  		@default true
  		@example
  		```
  		normalizeUrl('http://sindresorhus.com/redirect/');
  		//=> 'http://sindresorhus.com/redirect'
  		normalizeUrl('http://sindresorhus.com/redirect/', {removeTrailingSlash: false});
  		//=> 'http://sindresorhus.com/redirect/'
  		normalizeUrl('http://sindresorhus.com/', {removeTrailingSlash: false});
  		//=> 'http://sindresorhus.com'
  		```
  		*/
  val removeTrailingSlash: js.UndefOr[Boolean] = js.native
  /**
  		Sorts the query parameters alphabetically by key.
  		@default true
  		@example
  		```
  		normalizeUrl('www.sindresorhus.com?b=two&a=one&c=three', {
  			sortQueryParameters: false
  		});
  		//=> 'http://sindresorhus.com/?b=two&a=one&c=three'
  		```
  		*/
  val sortQueryParameters: js.UndefOr[Boolean] = js.native
  /**
  		Strip the [authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) part of a URL.
  		@default true
  		@example
  		```
  		normalizeUrl('user:password@sindresorhus.com');
  		//=> 'https://sindresorhus.com'
  		normalizeUrl('user:password@sindresorhus.com', {stripAuthentication: false});
  		//=> 'https://user:password@sindresorhus.com'
  		```
  		*/
  val stripAuthentication: js.UndefOr[Boolean] = js.native
  /**
  		Removes hash from the URL.
  		@default false
  		@example
  		```
  		normalizeUrl('sindresorhus.com/about.html#contact');
  		//=> 'http://sindresorhus.com/about.html#contact'
  		normalizeUrl('sindresorhus.com/about.html#contact', {stripHash: true});
  		//=> 'http://sindresorhus.com/about.html'
  		```
  		*/
  val stripHash: js.UndefOr[Boolean] = js.native
  /**
  		Removes HTTP(S) protocol from an URL `http://sindresorhus.com` → `sindresorhus.com`.
  		@default false
  		@example
  		```
  		normalizeUrl('https://sindresorhus.com');
  		//=> 'https://sindresorhus.com'
  		normalizeUrl('sindresorhus.com', {stripProtocol: true});
  		//=> 'sindresorhus.com'
  		```
  		*/
  val stripProtocol: js.UndefOr[Boolean] = js.native
  /**
  		Removes `www.` from the URL.
  		@default true
  		@example
  		```
  		normalizeUrl('http://www.sindresorhus.com');
  		//=> 'http://sindresorhus.com'
  		normalizeUrl('http://www.sindresorhus.com', {stripWWW: false});
  		//=> 'http://www.sindresorhus.com'
  		```
  		*/
  val stripWWW: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withForceHttp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceHttp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceHttp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceHttp")(js.undefined)
        ret
    }
    @scala.inline
    def withForceHttps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceHttps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceHttps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceHttps")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalizeProtocol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalizeProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveDirectoryIndex(value: js.Array[js.RegExp | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDirectoryIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveDirectoryIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDirectoryIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveQueryParameters(value: js.Array[js.RegExp | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeQueryParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveQueryParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeQueryParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveTrailingSlash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeTrailingSlash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveTrailingSlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeTrailingSlash")(js.undefined)
        ret
    }
    @scala.inline
    def withSortQueryParameters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortQueryParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortQueryParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortQueryParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withStripAuthentication(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripAuthentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripAuthentication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripAuthentication")(js.undefined)
        ret
    }
    @scala.inline
    def withStripHash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripHash")(js.undefined)
        ret
    }
    @scala.inline
    def withStripProtocol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withStripWWW(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripWWW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripWWW: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripWWW")(js.undefined)
        ret
    }
  }
  
}

