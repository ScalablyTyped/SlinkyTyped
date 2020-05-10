package typingsSlinky.c3

import typingsSlinky.c3.mod.Primitive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonName extends js.Object {
  /**
    * Set format for the name of each data in tooltip.
    * @param ratio Will be `undefined` if the chart is not donut/pie/gauge.
    */
  var name: js.UndefOr[
    js.Function4[
      /* name */ String, 
      /* ratio */ js.UndefOr[Double], 
      /* id */ String, 
      /* index */ Double, 
      String
    ]
  ] = js.native
  /**
    * Set format for the title of tooltip.
    * @param x Value of the data point to show.
    * @param index Index of the data point to show.
    */
  var title: js.UndefOr[js.Function2[/* x */ Primitive, /* index */ Double, String]] = js.native
  /**
    * Set format for the value of each data in tooltip.
    * @param ratio Will be `undefined` if the chart is not donut/pie/gauge.
    * @returns If `undefined` returned, the row of that value will be skipped.
    */
  var value: js.UndefOr[
    js.Function4[
      /* value */ Primitive, 
      /* ratio */ js.UndefOr[Double], 
      /* id */ String, 
      /* index */ Double, 
      js.UndefOr[String]
    ]
  ] = js.native
}

object AnonName {
  @scala.inline
  def apply(): AnonName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonName]
  }
  @scala.inline
  implicit class AnonNameOps[Self <: AnonName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(
      value: (/* name */ String, /* ratio */ js.UndefOr[Double], /* id */ String, /* index */ Double) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: (/* x */ Primitive, /* index */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(
      value: (/* value */ Primitive, /* ratio */ js.UndefOr[Double], /* id */ String, /* index */ Double) => js.UndefOr[String]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

