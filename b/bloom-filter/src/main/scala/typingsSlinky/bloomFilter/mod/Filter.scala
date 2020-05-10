package typingsSlinky.bloomFilter.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  var BLOOM_UPDATE_ALL: Double = js.native
  var BLOOM_UPDATE_NONE: Double = js.native
  var BLOOM_UPDATE_P2PUBKEY_ONLY: Double = js.native
  var LN2: Double = js.native
  var LN2SQUARED: Double = js.native
  var MAX_BLOOM_FILTER_SIZE: Double = js.native
  var MAX_HASH_FUNCS: Double = js.native
  var MIN_HASH_FUNCS: Double = js.native
  def clear(): Unit = js.native
  def contains(data: Buffer): Boolean = js.native
  def hash(nHashNum: Double, vDataToHash: Buffer): Double = js.native
  def insert(data: Buffer): Unit = js.native
  def inspect(): String = js.native
  def toObject(): FilterOptions = js.native
}

object Filter {
  @scala.inline
  def apply(
    BLOOM_UPDATE_ALL: Double,
    BLOOM_UPDATE_NONE: Double,
    BLOOM_UPDATE_P2PUBKEY_ONLY: Double,
    LN2: Double,
    LN2SQUARED: Double,
    MAX_BLOOM_FILTER_SIZE: Double,
    MAX_HASH_FUNCS: Double,
    MIN_HASH_FUNCS: Double,
    clear: () => Unit,
    contains: Buffer => Boolean,
    hash: (Double, Buffer) => Double,
    insert: Buffer => Unit,
    inspect: () => String,
    toObject: () => FilterOptions
  ): Filter = {
    val __obj = js.Dynamic.literal(BLOOM_UPDATE_ALL = BLOOM_UPDATE_ALL.asInstanceOf[js.Any], BLOOM_UPDATE_NONE = BLOOM_UPDATE_NONE.asInstanceOf[js.Any], BLOOM_UPDATE_P2PUBKEY_ONLY = BLOOM_UPDATE_P2PUBKEY_ONLY.asInstanceOf[js.Any], LN2 = LN2.asInstanceOf[js.Any], LN2SQUARED = LN2SQUARED.asInstanceOf[js.Any], MAX_BLOOM_FILTER_SIZE = MAX_BLOOM_FILTER_SIZE.asInstanceOf[js.Any], MAX_HASH_FUNCS = MAX_HASH_FUNCS.asInstanceOf[js.Any], MIN_HASH_FUNCS = MIN_HASH_FUNCS.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), contains = js.Any.fromFunction1(contains), hash = js.Any.fromFunction2(hash), insert = js.Any.fromFunction1(insert), inspect = js.Any.fromFunction0(inspect), toObject = js.Any.fromFunction0(toObject))
    __obj.asInstanceOf[Filter]
  }
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBLOOM_UPDATE_ALL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BLOOM_UPDATE_ALL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBLOOM_UPDATE_NONE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BLOOM_UPDATE_NONE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBLOOM_UPDATE_P2PUBKEY_ONLY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BLOOM_UPDATE_P2PUBKEY_ONLY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLN2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LN2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLN2SQUARED(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LN2SQUARED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMAX_BLOOM_FILTER_SIZE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAX_BLOOM_FILTER_SIZE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMAX_HASH_FUNCS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAX_HASH_FUNCS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIN_HASH_FUNCS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MIN_HASH_FUNCS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContains(value: Buffer => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHash(value: (Double, Buffer) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInsert(value: Buffer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInspect(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToObject(value: () => FilterOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toObject")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

