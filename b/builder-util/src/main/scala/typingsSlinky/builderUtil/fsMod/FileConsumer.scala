package typingsSlinky.builderUtil.fsMod

import typingsSlinky.fsExtra.mod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileConsumer extends js.Object {
  /**
    * @default false
    */
  var isIncludeDir: js.UndefOr[Boolean] = js.native
  def consume(file: String, fileStat: Stats, parent: String, siblingNames: js.Array[String]): js.Any = js.native
}

object FileConsumer {
  @scala.inline
  def apply(consume: (String, Stats, String, js.Array[String]) => js.Any): FileConsumer = {
    val __obj = js.Dynamic.literal(consume = js.Any.fromFunction4(consume))
    __obj.asInstanceOf[FileConsumer]
  }
  @scala.inline
  implicit class FileConsumerOps[Self <: FileConsumer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsume(value: (String, Stats, String, js.Array[String]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consume")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withIsIncludeDir(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIncludeDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIncludeDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIncludeDir")(js.undefined)
        ret
    }
  }
  
}

