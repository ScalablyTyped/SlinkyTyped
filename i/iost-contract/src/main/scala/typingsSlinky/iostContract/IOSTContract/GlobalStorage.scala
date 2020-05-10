package typingsSlinky.iostContract.IOSTContract

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalStorage extends js.Object {
  def globalGet(contract: String, key: String): String | Null = js.native
  def globalHas(contract: String, key: String): Boolean = js.native
  def globalMapGet(contract: String, key: String, field: String): String | Null = js.native
  def globalMapHas(contract: String, key: String, field: String): Boolean = js.native
  def globalMapKeys(contract: String, key: String): js.Array[String] = js.native
  def globalMapLen(contract: String, key: String): Double = js.native
}

object GlobalStorage {
  @scala.inline
  def apply(
    globalGet: (String, String) => String | Null,
    globalHas: (String, String) => Boolean,
    globalMapGet: (String, String, String) => String | Null,
    globalMapHas: (String, String, String) => Boolean,
    globalMapKeys: (String, String) => js.Array[String],
    globalMapLen: (String, String) => Double
  ): GlobalStorage = {
    val __obj = js.Dynamic.literal(globalGet = js.Any.fromFunction2(globalGet), globalHas = js.Any.fromFunction2(globalHas), globalMapGet = js.Any.fromFunction3(globalMapGet), globalMapHas = js.Any.fromFunction3(globalMapHas), globalMapKeys = js.Any.fromFunction2(globalMapKeys), globalMapLen = js.Any.fromFunction2(globalMapLen))
    __obj.asInstanceOf[GlobalStorage]
  }
  @scala.inline
  implicit class GlobalStorageOps[Self <: GlobalStorage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalGet(value: (String, String) => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalGet")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGlobalHas(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalHas")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGlobalMapGet(value: (String, String, String) => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalMapGet")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGlobalMapHas(value: (String, String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalMapHas")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGlobalMapKeys(value: (String, String) => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalMapKeys")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGlobalMapLen(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalMapLen")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

