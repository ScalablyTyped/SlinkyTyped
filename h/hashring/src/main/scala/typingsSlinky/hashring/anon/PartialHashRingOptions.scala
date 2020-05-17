package typingsSlinky.hashring.anon

import typingsSlinky.hashring.hashringStrings.hash_ring
import typingsSlinky.hashring.hashringStrings.ketama
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<hashring.hashring.HashRingOptions> */
@js.native
trait PartialHashRingOptions extends js.Object {
  var compatibility: js.UndefOr[hash_ring | ketama] = js.native
  var `default port`: js.UndefOr[Double] = js.native
  var `max cache size`: js.UndefOr[Double] = js.native
  var replicas: js.UndefOr[Double] = js.native
  var `vnode count`: js.UndefOr[Double] = js.native
}

object PartialHashRingOptions {
  @scala.inline
  def apply(): PartialHashRingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHashRingOptions]
  }
  @scala.inline
  implicit class PartialHashRingOptionsOps[Self <: PartialHashRingOptions] (val x: Self) extends AnyVal {
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
    def withoutCompatibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatibility")(js.undefined)
        ret
    }
    @scala.inline
    def `withDefault port`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDefault port`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default port")(js.undefined)
        ret
    }
    @scala.inline
    def `withMax cache size`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max cache size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax cache size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max cache size")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicas(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicas")(js.undefined)
        ret
    }
    @scala.inline
    def `withVnode count`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vnode count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutVnode count`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vnode count")(js.undefined)
        ret
    }
  }
  
}

