package typingsSlinky.hashring.mod

import typingsSlinky.hashring.hashringStrings.hash_ring
import typingsSlinky.hashring.hashringStrings.ketama
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashRingOptions extends js.Object {
  /**
    * Allows you to force a compatibility mode of the HashRing.
    * It default to ketama hash rings but if you are coming from
    * a python world you might want compatibility with the hash_ring module.
    *
    * There's a small diff between
    * `hash_ring` and `ketama` and that's the amount of replica's of a server.
    * `Ketama` uses 4 and `hash_ring` uses 3.
    *
    * Set this to `hash_ring` if you want to use 3.
    */
  var compatibility: hash_ring | ketama = js.native
  /**
    * The default port number which will removed from the server address
    * to provide ketama compatibility.
    */
  var `default port`: Double = js.native
  /**
    * We use a simple LRU cache
    * inside the module to speed up frequent key lookups,
    * you can customize the amount of keys that need to be cached.
    *
    * It defaults to 5000.
    */
  var `max cache size`: Double = js.native
  /**
    * The amount of replicas per server.
    * Defaults to 4.
    */
  var replicas: Double = js.native
  /**
    * The amount of virtual nodes per server,
    * defaults to 40 as this generates 160 points per server
    * as used by ketama hashing.
    */
  var `vnode count`: Double = js.native
}

object HashRingOptions {
  @scala.inline
  def apply(
    compatibility: hash_ring | ketama,
    `default port`: Double,
    `max cache size`: Double,
    replicas: Double,
    `vnode count`: Double
  ): HashRingOptions = {
    val __obj = js.Dynamic.literal(compatibility = compatibility.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any])
    __obj.updateDynamic("default port")((`default port`).asInstanceOf[js.Any])
    __obj.updateDynamic("max cache size")((`max cache size`).asInstanceOf[js.Any])
    __obj.updateDynamic("vnode count")((`vnode count`).asInstanceOf[js.Any])
    __obj.asInstanceOf[HashRingOptions]
  }
  @scala.inline
  implicit class HashRingOptionsOps[Self <: HashRingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompatibility(value: hash_ring | ketama): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDefault port`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMax cache size`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max cache size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicas(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withVnode count`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vnode count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

