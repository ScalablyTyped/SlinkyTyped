package typingsSlinky.jupyterlabDocumentsearch.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchMatch extends js.Object {
  /**
    * Column location of match
    */
  var column: Double = js.native
  /**
    * Fragment containing match
    */
  val fragment: String = js.native
  /**
    * Index among the other matches
    */
  var index: Double = js.native
  /**
    * Line number of match
    */
  var line: Double = js.native
  /**
    * Text of the exact match itself
    */
  val text: String = js.native
}

object ISearchMatch {
  @scala.inline
  def apply(column: Double, fragment: String, index: Double, line: Double, text: String): ISearchMatch = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchMatch]
  }
  @scala.inline
  implicit class ISearchMatchOps[Self <: ISearchMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

