package typingsSlinky.keyv.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.keyv.keyvStrings.mongo
import typingsSlinky.keyv.keyvStrings.mongodb
import typingsSlinky.keyv.keyvStrings.mysql
import typingsSlinky.keyv.keyvStrings.postgres
import typingsSlinky.keyv.keyvStrings.postgresql
import typingsSlinky.keyv.keyvStrings.redis
import typingsSlinky.keyv.keyvStrings.sqlite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[TValue]
  extends /* key */ StringDictionary[js.Any] {
  /** Specify an adapter to use. e.g `'redis'` or `'mongodb'`. */
  var adapter: js.UndefOr[redis | mongodb | mongo | sqlite | postgresql | postgres | mysql] = js.native
  /** A custom deserialization function. */
  var deserialize: js.UndefOr[js.Function1[/* data */ String, TValue]] = js.native
  /** Namespace for the current instance. */
  var namespace: js.UndefOr[String] = js.native
  /** A custom serialization function. */
  var serialize: js.UndefOr[js.Function1[/* data */ TValue, String]] = js.native
  /** The storage adapter instance to be used by Keyv. */
  var store: js.UndefOr[Store[TValue]] = js.native
  /** Default TTL. Can be overridden by specififying a TTL on `.set()`. */
  var ttl: js.UndefOr[Double] = js.native
  /** The connection string URI. */
  var uri: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply[TValue](): Options[TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[TValue]]
  }
  @scala.inline
  implicit class OptionsOps[Self[tvalue] <: Options[tvalue], TValue] (val x: Self[TValue]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TValue] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TValue]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TValue] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TValue] with Other]
    @scala.inline
    def withAdapter(value: redis | mongodb | mongo | sqlite | postgresql | postgres | mysql): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdapter: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(js.undefined)
        ret
    }
    @scala.inline
    def withDeserialize(value: /* data */ String => TValue): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDeserialize: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialize(value: /* data */ TValue => String): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSerialize: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: Store[TValue]): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
    @scala.inline
    def withTtl(value: Double): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: String): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
  }
  
}

