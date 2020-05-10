package typingsSlinky.hapiCatboxRedis.mod

import typingsSlinky.hapiCatbox.mod.ClientOptions
import typingsSlinky.hapiCatboxRedis.AnonHost
import typingsSlinky.ioredis.mod.Redis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatboxRedisOptions extends ClientOptions {
  /**
    * Raw client.
    */
  var client: js.UndefOr[Redis] = js.native
  /**
    * the Redis database.
    */
  var database: js.UndefOr[String] = js.native
  /**
    * the Redis server hostname.
    * Defaults to '127.0.0.1'.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * the Redis authentication password when required.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * the Redis server port or unix domain socket path.
    * Defaults to 6379.
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * the name of the sentinel master.
    * (Only needed when sentinels is specified)
    */
  var sentinelName: js.UndefOr[String] = js.native
  /**
    * an array of redis sentinel addresses to connect to.
    */
  var sentinels: js.UndefOr[js.Array[AnonHost]] = js.native
  /**
    * the unix socket string to connect to (if socket is provided, host and port are ignored)
    */
  var socket: js.UndefOr[String] = js.native
  /**
    * the Redis server URL (if url is provided, host, port, and socket are ignored)
    */
  var url: js.UndefOr[String] = js.native
}

object CatboxRedisOptions {
  @scala.inline
  def apply(): CatboxRedisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatboxRedisOptions]
  }
  @scala.inline
  implicit class CatboxRedisOptionsOps[Self <: CatboxRedisOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: Redis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withSentinelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentinelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentinelName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentinelName")(js.undefined)
        ret
    }
    @scala.inline
    def withSentinels(value: js.Array[AnonHost]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentinels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentinels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentinels")(js.undefined)
        ret
    }
    @scala.inline
    def withSocket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

