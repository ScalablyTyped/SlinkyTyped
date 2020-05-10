package typingsSlinky.levelTtl.mod

import typingsSlinky.abstractLeveldown.mod.AbstractIterator
import typingsSlinky.abstractLeveldown.mod.AbstractLevelDOWN
import typingsSlinky.levelup.mod.LevelUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LevelTTLOptions extends js.Object {
  /**
    * A number specifying the frequency of internal scans for checking for expired keys.
    * @default 10000
    */
  var checkFrequency: js.UndefOr[Double] = js.native
  /**
    * A number specifying the default time-to-live for new or updated values.
    * This can be overridden by explicitly setting the ttl value.
    * @default 0
    */
  var defaultTTL: js.UndefOr[Double] = js.native
  /**
    * Character specifying the key namespace for expiration values.
    * @default 'x'
    */
  var expiryNamespace: js.UndefOr[String] = js.native
  /**
    * A string for prefixing the modified database methods (i.e., put, del, batch, ttl, stop).
    */
  var methodPrefix: js.UndefOr[String] = js.native
  /**
    * Character specifying the key namespace for ttl values.
    * @default 'ttl'
    */
  var namespace: js.UndefOr[String] = js.native
  /**
    * Character for separating sublevel prefixes from user keys and each other. Should be outside the character (or byte) range of user keys.
    * @default ''
    */
  var separator: js.UndefOr[String] = js.native
  /**
    * A custom storage database for the meta data.
    * If it's set, that storage will contain all the ttl meta data.
    * A use case for this would be to avoid mixing data and meta data in the same keyspace, since if it's not set, all data will be sharing the same keyspace.
    */
  var sub: js.UndefOr[LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]]] = js.native
}

object LevelTTLOptions {
  @scala.inline
  def apply(): LevelTTLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LevelTTLOptions]
  }
  @scala.inline
  implicit class LevelTTLOptionsOps[Self <: LevelTTLOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckFrequency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkFrequency")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultTTL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTTL")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiryNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiryNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiryNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiryNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withMethodPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethodPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withSub(value: LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSub: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sub")(js.undefined)
        ret
    }
  }
  
}

