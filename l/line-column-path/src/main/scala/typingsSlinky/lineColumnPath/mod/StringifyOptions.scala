package typingsSlinky.lineColumnPath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringifyOptions extends js.Object {
  /**
  	Output the column.
  	Setting this to `false` will result in `unicorn.js:8` instead of `unicorn.js:8:14`.
  	@default true
  	*/
  var column: js.UndefOr[Boolean] = js.native
  /**
  	Output the file path.
  	Setting this to `false` will result in `8:18` instead of `unicorn.js:8:14`.
  	@default true
  	*/
  val file: js.UndefOr[Boolean] = js.native
}

object StringifyOptions {
  @scala.inline
  def apply(): StringifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringifyOptions]
  }
  @scala.inline
  implicit class StringifyOptionsOps[Self <: StringifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(js.undefined)
        ret
    }
    @scala.inline
    def withFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
  }
  
}

