package typingsSlinky.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trie extends js.Object {
  def addString(text: String): Boolean = js.native
  def addStrings(strings: js.Array[String]): Unit = js.native
  def contains(token: String): Boolean = js.native
  def findMatchesOnPath(text: String): js.Array[String] = js.native
  def findPrefix(text: String): js.Array[String] = js.native
  def keysWithPrefix(text: String): js.Array[String] = js.native
}

object Trie {
  @scala.inline
  def apply(
    addString: String => Boolean,
    addStrings: js.Array[String] => Unit,
    contains: String => Boolean,
    findMatchesOnPath: String => js.Array[String],
    findPrefix: String => js.Array[String],
    keysWithPrefix: String => js.Array[String]
  ): Trie = {
    val __obj = js.Dynamic.literal(addString = js.Any.fromFunction1(addString), addStrings = js.Any.fromFunction1(addStrings), contains = js.Any.fromFunction1(contains), findMatchesOnPath = js.Any.fromFunction1(findMatchesOnPath), findPrefix = js.Any.fromFunction1(findPrefix), keysWithPrefix = js.Any.fromFunction1(keysWithPrefix))
    __obj.asInstanceOf[Trie]
  }
  @scala.inline
  implicit class TrieOps[Self <: Trie] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddString(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddStrings(value: js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addStrings")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContains(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindMatchesOnPath(value: String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findMatchesOnPath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindPrefix(value: String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findPrefix")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeysWithPrefix(value: String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keysWithPrefix")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

