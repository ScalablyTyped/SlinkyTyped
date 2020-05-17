package typingsSlinky.koaJson.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Param extends js.Object {
  /**
    * optional query-string param for pretty responses [none]
    */
  var param: js.UndefOr[String] = js.native
  /**
    * default to pretty response [true]
    */
  var pretty: js.UndefOr[Boolean] = js.native
  /**
    * JSON spaces [2]
    */
  var spaces: js.UndefOr[Double] = js.native
}

object Param {
  @scala.inline
  def apply(): Param = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Param]
  }
  @scala.inline
  implicit class ParamOps[Self <: Param] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("param")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("param")(js.undefined)
        ret
    }
    @scala.inline
    def withPretty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPretty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretty")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaces(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaces")(js.undefined)
        ret
    }
  }
  
}

