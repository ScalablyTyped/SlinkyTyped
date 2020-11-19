package typingsSlinky.pinyin.mod

import typingsSlinky.pinyin.pinyinNumbers.`-1`
import typingsSlinky.pinyin.pinyinNumbers.`0`
import typingsSlinky.pinyin.pinyinNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pinyin", "compare")
@js.native
object compare extends js.Object {
  
  /**
    * 按拼音比较两个字符串 a 和 b 的顺序。
    * 如果返回 -1 表示 a 在 b 前
    * 如果返回  0 表示 a 和 b 顺序相同
    * 如果返回  1 表示 a 在 b 后
    */
  def apply(a: String, b: String): `-1` | `0` | `1` = js.native
}
