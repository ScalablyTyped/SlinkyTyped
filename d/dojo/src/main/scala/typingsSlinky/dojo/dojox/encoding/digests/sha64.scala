package typingsSlinky.dojo.dojox.encoding.digests

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/digests/_sha-64.html
  *
  *
  */
@js.native
trait sha64 extends js.Object {
  /**
    *
    */
  var outputTypes: js.Object = js.native
  /**
    *
    * @param msg
    * @param length
    * @param hash
    * @param depth
    */
  def digest(msg: js.Any, length: js.Any, hash: js.Any, depth: js.Any): js.Array[_] = js.native
  /**
    *
    * @param s
    */
  def stringToUtf8(s: js.Any): js.Any = js.native
  /**
    *
    * @param wa
    */
  def toBase64(wa: js.Any): js.Any = js.native
  /**
    *
    * @param wa
    */
  def toHex(wa: js.Any): js.Any = js.native
  /**
    *
    * @param s
    */
  def toWord(s: js.Any): js.Any = js.native
}

object sha64 {
  @scala.inline
  def apply(
    digest: (js.Any, js.Any, js.Any, js.Any) => js.Array[_],
    outputTypes: js.Object,
    stringToUtf8: js.Any => js.Any,
    toBase64: js.Any => js.Any,
    toHex: js.Any => js.Any,
    toWord: js.Any => js.Any
  ): sha64 = {
    val __obj = js.Dynamic.literal(digest = js.Any.fromFunction4(digest), outputTypes = outputTypes.asInstanceOf[js.Any], stringToUtf8 = js.Any.fromFunction1(stringToUtf8), toBase64 = js.Any.fromFunction1(toBase64), toHex = js.Any.fromFunction1(toHex), toWord = js.Any.fromFunction1(toWord))
    __obj.asInstanceOf[sha64]
  }
  @scala.inline
  implicit class sha64Ops[Self <: sha64] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDigest(value: (js.Any, js.Any, js.Any, js.Any) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digest")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withOutputTypes(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringToUtf8(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringToUtf8")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToBase64(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBase64")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToHex(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toHex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToWord(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toWord")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

