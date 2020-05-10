package typingsSlinky.parseColumns.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[ValuesType /* <: js.Any */] extends js.Object {
  /**
  		Headers to use instead of the existing ones.
  		*/
  val headers: js.UndefOr[js.Array[String]] = js.native
  /**
  		Separator to split columns on.
  		@default ' '
  		*/
  val separator: js.UndefOr[String] = js.native
  /**
  		Transform elements.
  		Useful for being able to cleanup or change the type of elements.
  		*/
  val transform: js.UndefOr[
    js.Function4[
      /* element */ String, 
      /* header */ String, 
      /* columnIndex */ Double, 
      /* rowIndex */ Double, 
      ValuesType
    ]
  ] = js.native
}

object Options {
  @scala.inline
  def apply[ValuesType](): Options[ValuesType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[ValuesType]]
  }
  @scala.inline
  implicit class OptionsOps[Self[valuestype] <: Options[valuestype], ValuesType] (val x: Self[ValuesType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ValuesType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ValuesType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ValuesType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ValuesType] with Other]
    @scala.inline
    def withHeaders(value: js.Array[String]): Self[ValuesType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self[ValuesType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self[ValuesType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self[ValuesType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(
      value: (/* element */ String, /* header */ String, /* columnIndex */ Double, /* rowIndex */ Double) => ValuesType
    ): Self[ValuesType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self[ValuesType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
  }
  
}

