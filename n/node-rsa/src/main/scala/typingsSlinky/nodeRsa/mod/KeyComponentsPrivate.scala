package typingsSlinky.nodeRsa.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyComponentsPrivate extends Key {
  var coeff: Buffer = js.native
  var d: Buffer = js.native
  var dmp1: Buffer = js.native
  var dmq1: Buffer = js.native
  var e: Buffer | Double = js.native
  var n: Buffer = js.native
  var p: Buffer = js.native
  var q: Buffer = js.native
}

object KeyComponentsPrivate {
  @scala.inline
  def apply(
    coeff: Buffer,
    d: Buffer,
    dmp1: Buffer,
    dmq1: Buffer,
    e: Buffer | Double,
    n: Buffer,
    p: Buffer,
    q: Buffer
  ): KeyComponentsPrivate = {
    val __obj = js.Dynamic.literal(coeff = coeff.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], dmp1 = dmp1.asInstanceOf[js.Any], dmq1 = dmq1.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyComponentsPrivate]
  }
  @scala.inline
  implicit class KeyComponentsPrivateOps[Self <: KeyComponentsPrivate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoeff(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coeff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withD(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDmp1(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dmp1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDmq1(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dmq1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withE(value: Buffer | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withN(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQ(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

